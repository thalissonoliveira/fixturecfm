package fixture.owl.factory;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

import org.semanticweb.owlapi.model.OWLClass;

import fixture.owl.enumeration.interfaces.FixtureOWLClassTypeEnumInterface;
import fixture.owl.utils.OntoHelper;
import fixture.owl.utils.Utils;


public class OWLClassFactory {
	
	private Map<FixtureOWLClassTypeEnumInterface, OWLClass> map;
	private Map<String, OWLClass> mapFeatureSubclass;
	private OntoHelper ontoHelper;
	
	private static OWLClassFactory owlClassFactory;
	
	private OWLClassFactory() {}

	public synchronized static OWLClassFactory  getInstance(OntoHelper ontoHelper) {
		if (owlClassFactory == null) {
			owlClassFactory = new OWLClassFactory();
			owlClassFactory.ontoHelper = ontoHelper;
			populateMap();
		} else {
			if (!owlClassFactory.ontoHelper.equals(ontoHelper)) {
				owlClassFactory.ontoHelper = ontoHelper;
				populateMap();
			}
		}
		return owlClassFactory;
	}
	
	//TODO No futuro refatorar isso pra ficar na classe EnumHelper
	@SuppressWarnings({ "unchecked", "rawtypes" })
	private static void populateMap() {
		owlClassFactory.map = new HashMap<FixtureOWLClassTypeEnumInterface, OWLClass>();
		
		Set<Class<? extends FixtureOWLClassTypeEnumInterface>> subclassesOf = Utils.getSubclassesOf(FixtureOWLClassTypeEnumInterface.class);
		
		for (Class<? extends FixtureOWLClassTypeEnumInterface> klass : subclassesOf) {
			FixtureOWLClassTypeEnumInterface[] enumConstants = klass.getEnumConstants();
			for (FixtureOWLClassTypeEnumInterface fixtureOWLClassTypeEnumInterface : enumConstants) {
				try {
					Enum enumReflection = Enum.valueOf((Class<? extends Enum>) Class.forName(klass.getName()), fixtureOWLClassTypeEnumInterface.toString());
					FixtureOWLClassTypeEnumInterface owlClassTypeEnum = (FixtureOWLClassTypeEnumInterface) enumReflection;
					owlClassFactory.map.put(owlClassTypeEnum, owlClassFactory.ontoHelper.getDataFactory().getOWLClass(owlClassTypeEnum.getLabel(), owlClassFactory.ontoHelper.getPrefixOWLOntologyFormat()));
				} catch (ClassNotFoundException e) {
					e.printStackTrace();
				}
			}
		}
	}
	
	public OWLClass get(FixtureOWLClassTypeEnumInterface owlClassTypeEnum) {
		OWLClass owlClass = map.get(owlClassTypeEnum);
		if (owlClass == null) {
			throw new RuntimeException("Cannot create a OWL Class for " + owlClassTypeEnum.getDescription());
		}
		return owlClass;
	}
	
	public OWLClass get(String owlClassType) {
		OWLClass owlClass = null;
		for (FixtureOWLClassTypeEnumInterface element : map.keySet()) {
			boolean isEqualKey = element.getLabel().equals(owlClassType);
			if (isEqualKey) {
				owlClass = map.get(element);
				break;
			}
		}
		
		if (owlClass == null) {
			throw new RuntimeException("Cannot create a OWL Class for " + owlClassType);
		}
		return owlClass;
	}
	
	public OWLClass getFeatureSubclass(String owlClassType) {
		OWLClass owlClass = map.get(owlClassType);
		
		if (owlClass == null) {
			throw new RuntimeException("Cannot create a OWL Class (Feature) for " + owlClassType);
		}
		return owlClass;
	}
	
	public void putFeatureSubclass(String className, OWLClass owlClass) {
		if (mapFeatureSubclass == null) {
			mapFeatureSubclass = new TreeMap<String, OWLClass>();
		}
		
		if (!map.containsKey(className)) {
			mapFeatureSubclass.put(className, owlClass);
		} else {
			throw new RuntimeException("Class  " + className + " is alread inserted");
		}
	}
	
}
