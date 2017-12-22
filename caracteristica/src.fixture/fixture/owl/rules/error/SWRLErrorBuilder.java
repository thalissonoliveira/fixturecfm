package fixture.owl.rules.error;

import org.semanticweb.owlapi.model.OWLClass;
import org.semanticweb.owlapi.model.OWLNamedIndividual;
import org.semanticweb.owlapi.model.OWLObjectProperty;
import org.semanticweb.owlapi.reasoner.Node;
import org.semanticweb.owlapi.reasoner.NodeSet;

import com.clarkparsia.pellet.owlapiv3.PelletReasoner;

import fixture.owl.enumeration.RulesConstraintsOWLClassTypeEnum;
import fixture.owl.utils.OntoHelper;
import fixture.owl.utils.OntoUtils;

public class SWRLErrorBuilder {
	
	public static SWRLError build(RulesConstraintsOWLClassTypeEnum rulesConstraintsOWLClassTypeEnum, PelletReasoner pelletReasoner, OWLClass owlClass, OntoHelper ontoHelper) {
		NodeSet<OWLNamedIndividual> individualsError = pelletReasoner.getInstances(owlClass, false);
		boolean hasError = individualsError != null && !individualsError.isEmpty();
		
		if (hasError) {
			SWRLError error = new SWRLError();
			error.setDescription(rulesConstraintsOWLClassTypeEnum.getPtExceptionMsg());
			StringBuilder sb = new StringBuilder();
			sb.append("[BROKEN RULE]<" + error.getDescription() + ">: \n");
			for (Node<OWLNamedIndividual> node : individualsError) {
				OWLNamedIndividual individual = node.getRepresentativeElement();
//				IRI iri = individual.getIRI();
//				String individualName = iri.toString().split("#")[1];
				String individualRelatedName = OntoUtils.getRelatedName(pelletReasoner, individual, ontoHelper);
				sb.append("   [INDIVIDUAL]:<" + individualRelatedName + ">\n      [NODES]:");
				NodeSet<OWLClass> types = pelletReasoner.getTypes(individual, true);
				for (Node<OWLClass> classNode : types) {
					sb.append("<" + classNode.getRepresentativeElement().getIRI().getFragment() + ">");
				}
				sb.append("\n");
			}
			error.setDescription(sb.toString());
			error.setRulesConstraintsOWLClassTypeEnum(rulesConstraintsOWLClassTypeEnum);
			return error;
		}
		
		return null;
	}
	
	public static SWRLError build(RulesConstraintsOWLClassTypeEnum rulesConstraintsOWLClassTypeEnum, PelletReasoner pelletReasoner, OWLClass owlClass, OWLObjectProperty owlObjectProperty, OntoHelper ontoHelper) {
		NodeSet<OWLNamedIndividual> individualsError = pelletReasoner.getInstances(owlClass, false);
		boolean hasError = individualsError != null && !individualsError.isEmpty();
		if (hasError) {
			SWRLError error = new SWRLError();
			error.setDescription(rulesConstraintsOWLClassTypeEnum.getPtExceptionMsg());
			StringBuilder sb = new StringBuilder();
			sb.append("[BROKEN RULE]<" + error.getDescription() + ">: \n");
			for (Node<OWLNamedIndividual> node : individualsError) {
				OWLNamedIndividual individual = node.getRepresentativeElement();
				
				String individualRelatedName = OntoUtils.getRelatedName(pelletReasoner, individual, ontoHelper);
//				String individualName = individual.getIRI().toString().split("#")[1];
				sb.append("   [INDIVIDUAL]:<" + individualRelatedName + ">\n      [NODES]:");
				NodeSet<OWLClass> types = pelletReasoner.getTypes(individual, true);
				for (Node<OWLClass> classNode : types) {
					sb.append("<" + classNode.getRepresentativeElement().getIRI().getFragment() + ">");
				}
				sb.append("\n");
				NodeSet<OWLNamedIndividual> objectPropertyValues = pelletReasoner.getObjectPropertyValues(individual, owlObjectProperty);
				sb.append("      [OPASSERTION]:<" + owlObjectProperty.getIRI().getFragment() + ">");
				for (Node<OWLNamedIndividual> subIndividual : objectPropertyValues) {
//					String fragment = subIndividual.getRepresentativeElement().getIRI().getFragment();
					String subIndividualRelatedName = OntoUtils.getRelatedName(pelletReasoner, subIndividual.getRepresentativeElement(), ontoHelper);
					sb.append("<" + subIndividualRelatedName + ">");
				}
				sb.append("\n");
			}
			error.setDescription(sb.toString());
			error.setRulesConstraintsOWLClassTypeEnum(rulesConstraintsOWLClassTypeEnum);
			return error;
		}
		return null;
	}
	
}
