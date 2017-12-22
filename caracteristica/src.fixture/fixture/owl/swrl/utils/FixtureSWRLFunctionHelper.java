package fixture.owl.swrl.utils;

import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Map;

import org.mindswap.pellet.Individual;
import org.mindswap.pellet.Literal;
import org.mindswap.pellet.Node;
import org.mindswap.pellet.exceptions.InternalReasonerException;

import com.clarkparsia.pellet.rules.BindingHelper;
import com.clarkparsia.pellet.rules.VariableBinding;
import com.clarkparsia.pellet.rules.VariableUtils;
import com.clarkparsia.pellet.rules.model.AtomDConstant;
import com.clarkparsia.pellet.rules.model.AtomDObject;
import com.clarkparsia.pellet.rules.model.AtomDVariable;
import com.clarkparsia.pellet.rules.model.AtomIObject;
import com.clarkparsia.pellet.rules.model.AtomIVariable;
import com.clarkparsia.pellet.rules.model.AtomVariable;
import com.clarkparsia.pellet.rules.model.BuiltInAtom;

import fixture.owl.swrl.interfaces.FixtureSWRLFunction;

public class FixtureSWRLFunctionHelper implements BindingHelper {
	
	private FixtureSWRLFunction function;
    private BuiltInAtom atom;
    private VariableBinding partial;
    private boolean used;

    /**
     * Constructor. BuiltInAtom describes the SWRL atom as predicate and its arguments, which are variables and constants.
     * A problem is that all variables are of type AtomDVariable i.e. variables for data, no variables for individuals.
     *
     * @param atom the SWRL atom as written in the rule, like my:func(?x,?y,"m"^^xsd:string,"n"^^xsd:string,)
     * @see AtomDVariable
     */
    public FixtureSWRLFunctionHelper(BuiltInAtom atom, FixtureSWRLFunction function) {
        this.atom = atom;
        this.function = function;
    }

    /**
     * Returns a set of variables which this binding helper can additionally bind if the variables in the argument are already bound.
     *
     * @param bound variables that are bound to values
     * @return variables from the atom that the build would additionally bind
     */
    
    public Collection<? extends AtomVariable> getBindableVars(Collection<AtomVariable> bound) {
        if (!isApplicable(bound)) {
        	return Collections.emptySet();
        } else {
        	Collection<AtomVariable> vars = VariableUtils.getVars(atom);
        	vars.removeAll(bound);
        	return vars;
        }
    }

    /**
     * Returns a set of variables which must be bound before this helper can generate bindings.
     * Please note that constants are taken as bound arguments so they are not reported.
     * @param bound variables that are bound to values
     * @return variables that must be also bound before the builtin can be invoked
     */
    
    public Collection<? extends AtomVariable> getPrerequisiteVars(Collection<AtomVariable> bound) {
        Collection<AtomVariable> vars = VariableUtils.getVars(atom);
        vars.removeAll(getBindableVars(bound));
        return vars;
    }

    private AtomIVariable d2i(AtomDVariable atomDVariable) {
        return new AtomIVariable((atomDVariable.getName()));
    }

    /**
     * Decides for all atom arguments whether they are bound to values, and asks the built-in implementation
     * whether this is an acceptable input. Adds constants to the list of bound arguments.
     * @param bound binding of variables to values, may contain both AtomDVariable and AtomIVariable
     * @return boolean value indicating whether the built-in can be invoked
     */
    private boolean isApplicable(Collection<AtomVariable> bound) {
        boolean[] boundPositions = new boolean[atom.getAllArguments().size()];
        for (int i = 0; i < boundPositions.length; i++) {
            AtomDObject atomDObject = atom.getAllArguments().get(i);
            if (atomDObject instanceof AtomDVariable) {
                AtomDVariable atomDVariable = (AtomDVariable) atomDObject;
                boolean b = bound.contains(atomDVariable);
                if (!b) {
                	b = bound.contains(d2i(atomDVariable));
                }
                boundPositions[i] = b;
            } else if (atomDObject instanceof AtomDConstant) {
                boundPositions[i] = true;
            }
        }
        
        return function.isApplicable(boundPositions);
    }

    
    public void rebind(VariableBinding newBinding) {
    	System.out.println("rebind");

        List<AtomDObject> atomArguments = atom.getAllArguments();
        Node[] arguments = new Node[atomArguments.size()];
        for (int i = 0; i < arguments.length; i++) {
            arguments[i] = getValueFromVariableBinding(atomArguments.get(i), newBinding);
        }
        if (function.apply(newBinding.getABox(), arguments)) {
            VariableBinding newPartial = new VariableBinding(newBinding.getABox());
            for (int i = 0; i < arguments.length; i++) {
                AtomDObject arg = atomArguments.get(i);
                Node result = arguments[i];
                Node current = getValueFromVariableBinding(arg, newBinding);
                if (current != null && !current.equals(result)) {
                    // Oops, we overwrote an argument.
                    throw new InternalReasonerException("Function implementation overwrote argument " + i);
                }
                if (current == null) {
                    if (result.isLiteral()) {
                        newBinding.set(arg, (Literal) result);
                    } else if (result.isIndividual()) {
                        newBinding.set(d2i((AtomDVariable)arg), (Individual) result);
                    } else {
                        throw new InternalReasonerException("unknown result node type :" + result);
                    }
                }
            }
            used = false;
            partial = newPartial;
        } else {
//            System.out.println("Function failure: " + atom);
//            System.out.println("Arguments: " + Arrays.toString(arguments));
        }
    }

    private Node getValueFromVariableBinding(AtomDObject key, VariableBinding binding) {
        if (key instanceof AtomDVariable) {
            AtomDVariable atomDVariable = (AtomDVariable) key;
            Literal literal = binding.get(atomDVariable);
            return (literal != null) ? literal : binding.get(d2i(atomDVariable));
        } else if (key instanceof AtomDConstant) {
            return binding.get(key);
        } else {
            throw new InternalReasonerException("The argument " + key+" of SWRL atom "+atom+" is neither a constant nor a variable.");
        }
    }

    
    public boolean selectNextBinding() {
        if (partial != null && !used) {
            used = true;
            return true;
        }
        return false;
    }


    
    public void setCurrentBinding(VariableBinding currentBinding) {
        for (Map.Entry<? extends AtomVariable, ? extends Node> entry : partial.entrySet()) {
            AtomVariable atomVariable = entry.getKey();
            Node node = entry.getValue();
            if (atomVariable instanceof AtomIObject && node.isIndividual()) {
                currentBinding.set((AtomIObject) atomVariable, (Individual) node);
            } else if (atomVariable instanceof AtomDObject && node.isLiteral()) {
                currentBinding.set((AtomDObject) atomVariable, (Literal) node);
            } else {
                throw new InternalReasonerException("Unknown atomVariable=" + atomVariable + " node=" + node);
            }
        }
    }
}