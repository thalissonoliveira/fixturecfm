package fixture.owl.factory;

import java.util.HashMap;
import java.util.Map;

import org.semanticweb.owlapi.model.OWLObjectProperty;

import fixture.owl.enumeration.OWLObjectPropertyTypeEnum;
import fixture.owl.utils.OntoHelper;


public class OWLObjectPropertyFactory {
	
	private Map<OWLObjectPropertyTypeEnum, OWLObjectProperty> map;
	private static OWLObjectPropertyFactory owlClassFactory;
	
	
	private OWLObjectPropertyFactory() {}

	public static OWLObjectPropertyFactory getInstance(OntoHelper ontoHelper) {
		if (owlClassFactory == null) {
			owlClassFactory = new OWLObjectPropertyFactory(); 
			populateMap(ontoHelper);
		}
		return owlClassFactory;
	}

	private static void populateMap(OntoHelper ontoHelper) {
		owlClassFactory.map = new HashMap<OWLObjectPropertyTypeEnum, OWLObjectProperty>();
		
		OWLObjectPropertyTypeEnum[] values = OWLObjectPropertyTypeEnum.values();
		
		for (OWLObjectPropertyTypeEnum owlObjectPropertyTypeEnum : values) {
			owlClassFactory.map.put(owlObjectPropertyTypeEnum, ontoHelper.getDataFactory().getOWLObjectProperty(owlObjectPropertyTypeEnum.getLabel(), ontoHelper.getPrefixOWLOntologyFormat()));
		}
	}
	
	public OWLObjectProperty get(OWLObjectPropertyTypeEnum owlObjectPropertyTypeEnum) {
		OWLObjectProperty owlObjectProperty = map.get(owlObjectPropertyTypeEnum);
		if (owlObjectProperty == null) {
			throw new RuntimeException("Cannot create a OWL Object Property for " + owlObjectPropertyTypeEnum.getDescription());
		}
		return owlObjectProperty;
	}

	public OWLObjectProperty get(String owlObjectPropertyType) {
		OWLObjectProperty owlObjectProperty = null;
		for (OWLObjectPropertyTypeEnum element : map.keySet()) {
			if (element.getLabel().equals(owlObjectPropertyType)) {
				owlObjectProperty = map.get(element);
			}
		}
		
		if (owlObjectProperty == null) {
		}
		return owlObjectProperty;
	}


		
}
