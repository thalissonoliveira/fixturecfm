package fixture.owl.factory;

import java.util.HashMap;
import java.util.Map;

import org.semanticweb.owlapi.model.OWLDataProperty;

import fixture.owl.enumeration.OWLDataPropertyTypeEnum;
import fixture.owl.utils.OntoHelper;


public class OWLDataPropertyFactory {
	
	private Map<OWLDataPropertyTypeEnum, OWLDataProperty> map;
	private static OWLDataPropertyFactory owlDataPropertyFactory;
	
	
	private OWLDataPropertyFactory() {}

	public static OWLDataPropertyFactory getInstance(OntoHelper ontoHelper) {
		if (owlDataPropertyFactory == null) {
			owlDataPropertyFactory = new OWLDataPropertyFactory(); 
			populateMap(ontoHelper);
		}
		return owlDataPropertyFactory;
	}

	private static void populateMap(OntoHelper ontoHelper) {
		owlDataPropertyFactory.map = new HashMap<OWLDataPropertyTypeEnum, OWLDataProperty>();
		
		OWLDataPropertyTypeEnum[] values = OWLDataPropertyTypeEnum.values();
		
		for (OWLDataPropertyTypeEnum owlDataPropertyTypeEnum : values) {
			owlDataPropertyFactory.map.put(owlDataPropertyTypeEnum, ontoHelper.getDataFactory().getOWLDataProperty(owlDataPropertyTypeEnum.getLabel(), ontoHelper.getPrefixOWLOntologyFormat()));
		}
	}
	
	public OWLDataProperty get(OWLDataPropertyTypeEnum owlDataPropertyTypeEnum) {
		OWLDataProperty owlDataProperty = map.get(owlDataPropertyTypeEnum);
		if (owlDataProperty == null) {
			throw new RuntimeException("Cannot create a OWL Data Property for " + owlDataPropertyTypeEnum.getDescription());
		}
		return owlDataProperty;
	}

	public OWLDataProperty get(String owlDataPropertyType) {
		OWLDataProperty owlDataProperty = null;
		for (OWLDataPropertyTypeEnum element : map.keySet()) {
			if (element.getLabel().equals(owlDataPropertyType)) {
				owlDataProperty = map.get(element);
			}
		}
		
		if (owlDataProperty == null) {
		}
		return owlDataProperty;
	}
	
}
