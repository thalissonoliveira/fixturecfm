package fixture.owl.utils;

import java.util.ArrayList;
import java.util.Set;

import org.semanticweb.owlapi.model.OWLDataProperty;
import org.semanticweb.owlapi.model.OWLLiteral;
import org.semanticweb.owlapi.model.OWLNamedIndividual;

import com.clarkparsia.pellet.owlapiv3.PelletReasoner;

import fixture.owl.enumeration.OWLDataPropertyTypeEnum;
import fixture.owl.factory.OWLDataPropertyFactory;

public class OntoUtils {
	
	private OntoUtils() {}

	public static String getRelatedName(PelletReasoner pelletReasoner, OWLNamedIndividual individual, OntoHelper ontoHelper) {
		OWLDataProperty owlDataProperty = OWLDataPropertyFactory.getInstance(ontoHelper).get(OWLDataPropertyTypeEnum.HAS_NAME);
		Set<OWLLiteral> nameDataProperty = pelletReasoner.getDataPropertyValues(individual, owlDataProperty);
		String relatedName = new ArrayList<OWLLiteral>(nameDataProperty).get(0).getLiteral();
		return relatedName;
	}

}
