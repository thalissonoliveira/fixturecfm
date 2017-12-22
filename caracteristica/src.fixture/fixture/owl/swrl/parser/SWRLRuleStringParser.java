package fixture.owl.swrl.parser;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.semanticweb.owlapi.model.IRI;
import org.semanticweb.owlapi.model.OWLClass;
import org.semanticweb.owlapi.model.OWLClassExpression;
import org.semanticweb.owlapi.model.OWLDataProperty;
import org.semanticweb.owlapi.model.OWLObjectProperty;
import org.semanticweb.owlapi.model.SWRLAtom;
import org.semanticweb.owlapi.model.SWRLBuiltInAtom;
import org.semanticweb.owlapi.model.SWRLClassAtom;
import org.semanticweb.owlapi.model.SWRLDArgument;
import org.semanticweb.owlapi.model.SWRLRule;
import org.semanticweb.owlapi.model.SWRLVariable;

import fixture.owl.enumeration.FixtureSWRLBuiltinEnum;
import fixture.owl.factory.OWLClassFactory;
import fixture.owl.factory.OWLDataPropertyFactory;
import fixture.owl.factory.OWLObjectPropertyFactory;
import fixture.owl.swrl.parser.SWRLRuleString.AtomString;
import fixture.owl.utils.OntoHelper;
import fixture.owl.utils.Utils;

public class SWRLRuleStringParser {
	
	private Map<String, OWLClass> owlClassOracle;
	private Map<String, SWRLVariable> swrlVariableOracle;
	private OntoHelper ontoHelper;
	
	public SWRLRuleStringParser(OntoHelper ontoHelper) {
		this.ontoHelper = ontoHelper;
		this.owlClassOracle = new HashMap<String, OWLClass>();
		this.swrlVariableOracle = new HashMap<String, SWRLVariable>();
		
	}
	
	public SWRLRule parse(String rule) {
		SWRLRuleString swrlRuleString = new SWRLRuleString(rule);
		List<AtomString> antecedentAtoms = swrlRuleString.getAntecedentAtoms();
		List<AtomString> consequentAtoms = swrlRuleString.getConsequentAtoms();
		
		Set<SWRLAtom> body = new HashSet<SWRLAtom>();
		Set<SWRLAtom> head = new HashSet<SWRLAtom>();
		
		for (AtomString atomString : antecedentAtoms) {
			SWRLAtom atom = getAtom(atomString);
			body.add(atom);
		}
		
		for (AtomString atomString : consequentAtoms) {
			SWRLAtom atom = getAtom(atomString);
			head.add(atom);
		}
		
		SWRLRule swrlRule = ontoHelper.getDataFactory().getSWRLRule(body, head);
		return swrlRule;
	}

	private SWRLAtom getAtom(AtomString atomString) {
		String atomTypeBaseUrl = Utils.META_ONTOLOGY_BASE_URL_SHARP + atomString.getAtomType();
		String atomType = atomString.getAtomType();
		String[] variables = atomString.getVariables();
		
		boolean isDataPropertyAtom = ontoHelper.getMetaOntology().containsDataPropertyInSignature(IRI.create(atomTypeBaseUrl)); 
		boolean isObjectPropertyAtom = ontoHelper.getMetaOntology().containsObjectPropertyInSignature(IRI.create(atomTypeBaseUrl));
		boolean isCardinality = atomString.getStringCardinality() != null;
		boolean isClassAtom = ontoHelper.getMetaOntology().containsClassInSignature(IRI.create(atomTypeBaseUrl)) && !isCardinality;
		
		boolean isFixtureBuiltIn = atomType.startsWith(Utils.BUILT_IN_PREFIX);
		
		SWRLVariable[] swrlVariables = getSWRLVariables(variables);
		
		if (isClassAtom) {
			if (variables.length != 1) {
				throw new RuntimeException("Problema no SWRL. Ver log.");
			}
			OWLClass owlClass = getOWLClass(atomType);
			return ontoHelper.getDataFactory().getSWRLClassAtom(owlClass, swrlVariables[0]);
		} else if (isCardinality) {
			OWLObjectProperty property = OWLObjectPropertyFactory.getInstance(ontoHelper).get(atomString.getStringCardinality().getAtomType());
			OWLClass classExpression = OWLClassFactory.getInstance(ontoHelper).get(atomType);
			
			OWLClassExpression owlObjectCardinality = null;
			
			if ("max".equals(atomString.getStringCardinality().getCardinality())) {
				owlObjectCardinality = ontoHelper.getDataFactory().getOWLObjectMaxCardinality(Integer.valueOf(atomString.getStringCardinality().getValue()), property, classExpression);
			} else {
				owlObjectCardinality = ontoHelper.getDataFactory().getOWLObjectMinCardinality(Integer.valueOf(atomString.getStringCardinality().getValue()), property, classExpression);
			}
			
			SWRLClassAtom swrlClassAtom = ontoHelper.getDataFactory().getSWRLClassAtom(owlObjectCardinality, swrlVariables[0]);
			
			return swrlClassAtom;
		} else {

			if (isFixtureBuiltIn) {
				
				List<SWRLDArgument> arguments =  new ArrayList<SWRLDArgument>();
				for (SWRLVariable swrlVariable : swrlVariables) {
					arguments.add(swrlVariable);
				}
				
				FixtureSWRLBuiltinEnum byBuitinName = FixtureSWRLBuiltinEnum.getByBuitinName(atomType);
				SWRLBuiltInAtom builtInAtom = ontoHelper.getDataFactory().getSWRLBuiltInAtom(byBuitinName.getIri(), arguments);
				return builtInAtom;
			} else {
				if (variables.length != 2) {
					System.out.println(atomType);
					System.out.println(variables.length);
					for (String variable : variables) {
						System.out.println(variable);
					}
					
					throw new RuntimeException("Problema no SWRL. Ver log.");
				}
				
				if (isDataPropertyAtom) {
					OWLDataProperty owlDataProperty = OWLDataPropertyFactory.getInstance(ontoHelper).get(atomType);
					return ontoHelper.getDataFactory().getSWRLDataPropertyAtom(owlDataProperty, swrlVariables[0], swrlVariables[1]);
				} else if (isObjectPropertyAtom) {
					OWLObjectProperty owlDataProperty = OWLObjectPropertyFactory.getInstance(ontoHelper).get(atomType);
					return ontoHelper.getDataFactory().getSWRLObjectPropertyAtom(owlDataProperty, swrlVariables[0], swrlVariables[1]);
				} else {
					throw new RuntimeException("Nao eh class, object prop, data prop nem builtin:  " + atomType + ".. :/");
				}
			}
		}
	}

	private SWRLVariable[] getSWRLVariables(String[] variables) {
		SWRLVariable[] swrlVariables = new SWRLVariable[variables.length];
		
		int i = 0;
		for (String variable : variables) {
			variable = variable.replace("?", "");
			if (!swrlVariableOracle.containsKey(variable)) {
				swrlVariableOracle.put(variable, ontoHelper.getDataFactory().getSWRLVariable(IRI.create(variable)));
			}
			swrlVariables[i] = swrlVariableOracle.get(variable);
			i++;
		}
		
		if (variables.length != swrlVariables.length) {
			throw new RuntimeException("Ver Log nessa l�gica aqui.");
		}
		
		return swrlVariables;
	}

	private OWLClass getOWLClass(String atomType) {
		if (!owlClassOracle.containsKey(atomType)) {
			owlClassOracle.put(atomType, OWLClassFactory.getInstance(ontoHelper).get(atomType));
		} 
		return owlClassOracle.get(atomType);
	}
	
}
