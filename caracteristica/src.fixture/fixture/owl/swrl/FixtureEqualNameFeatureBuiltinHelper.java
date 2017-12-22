package fixture.owl.swrl;

import java.util.Collection;
import java.util.List;
import java.util.Map;

import org.mindswap.pellet.ABox;
import org.mindswap.pellet.Individual;
import org.mindswap.pellet.Literal;
import org.mindswap.pellet.Node;
import org.mindswap.pellet.exceptions.InternalReasonerException;
import org.mindswap.pellet.utils.ATermUtils;

import com.clarkparsia.pellet.rules.VariableBinding;
import com.clarkparsia.pellet.rules.VariableUtils;
import com.clarkparsia.pellet.rules.model.AtomDConstant;
import com.clarkparsia.pellet.rules.model.AtomDObject;
import com.clarkparsia.pellet.rules.model.AtomDVariable;
import com.clarkparsia.pellet.rules.model.AtomIObject;
import com.clarkparsia.pellet.rules.model.AtomIVariable;
import com.clarkparsia.pellet.rules.model.AtomVariable;

public class FixtureEqualNameFeatureBuiltinHelper extends FixtureBuiltinHelper {
	
    private VariableBinding partial;
    private boolean used;
	
	
	public Collection<? extends AtomVariable> getBindableVars(Collection<AtomVariable> atomVariables) {
        Collection<AtomVariable> vars = VariableUtils.getVars(getAtom());
        vars.removeAll(vars);
        return vars;
//		return Collections.emptySet();
	}

	
	public Collection<? extends AtomVariable> getPrerequisiteVars(Collection<AtomVariable> atomVariables) {
		Collection<AtomVariable> vars = VariableUtils.getVars(getAtom());
		vars.removeAll(vars);
		return vars;
//		return Collections.emptySet();
	}

	
	public void rebind(VariableBinding newBinding) {
        List<AtomDObject> atomArguments = getAtom().getAllArguments();
        Node[] arguments = new Node[atomArguments.size()];
        for (int i = 0; i < arguments.length; i++) {
            arguments[i] = getValueFromVariableBinding(atomArguments.get(i), newBinding);
        }
        if (apply(newBinding.getABox(), arguments)) {
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
                        newBinding.set(d2i(arg), (Individual) result);
                    } else {
                        throw new InternalReasonerException("unknown result node type :" + result);
                    }
                }
            }
            used = false;
            partial = newPartial;
        } else {
//            System.out.println("Function failure: " + atom + " | Arguments: " + Arrays.toString(arguments));
        }
    }

	private AtomIVariable d2i(AtomDObject arg) {
		return new AtomIVariable(((AtomDVariable)arg).getName());
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
                throw new InternalReasonerException("Unknown atomVariable = " + atomVariable + ", node = " + node);
            }
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
			throw new InternalReasonerException("The argument " + key + " of SWRL atom " + getAtom() + " is neither a constant nor a variable.");
        }
    }
    
    public boolean apply(ABox abox, Node[] args) { 
        if (!args[0].isIndividual() || !args[1].isIndividual() || args[2] == null || args[3] == null) {
        	return false; 
        }
        
        String individualOneName = args[0].getNameStr().split("#")[1]; 
        String individualTwoName = args[1].getNameStr().split("#")[1];
        
        String hasNameOne = ATermUtils.getLiteralValue(args[2].getTerm());
        String hasNameTwo = ATermUtils.getLiteralValue(args[3].getTerm());
        
        if (individualOneName.equalsIgnoreCase(individualTwoName)) {
        	return false;
        } else {
        	if (!hasNameOne.equalsIgnoreCase(hasNameTwo)) {
        		return false; 
        	} else {
        		System.err.println("[ERROR][" + individualOneName + ", " + individualTwoName + ", " + hasNameOne  + ", " + hasNameTwo + "]");
        		return true; 
        	}
        }
    } 

}
