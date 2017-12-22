package fixture.owl.enumeration;

import fixture.owl.enumeration.interfaces.FixtureOWLClassTypeEnumInterface;
import fixture.owl.utils.Utils;

public enum RulesConstraintsOWLClassTypeEnum implements FixtureOWLClassTypeEnumInterface {
	
	EQUAL_NAME_FEATURE (1, "'Features with same name' Rule",  "WFSMR1", "Caracteristicas diferentes nao podem ter o mesmo nome", ""),
	EQUAL_NAME_ATTRIBUTE (2, "'Attributes with same name' Rule",  "WFSMR2", "Atributos diferentes nao podem ter o mesmo nome.", ""),
	PARENTAL_INCONSISTENCY (3, "'Parental Inconsistency' Rule",  "WFSMR3", "Uma caracteristica nao pode ser filha dela mesma.", "A feature can't be child of itself."),
	CYCLICAL_FEATURE_RELATION (4, "Cyclical relation between features",  "WFSMR4", "Ciclo detectado.", "Cicle detected."),
	UNIQUE_ROOT (5, "Unique root.",  "WFSMR5", "Uma caracteristica so pode ter uma raiz", ""),
	ATTRIBULES_WITH_DESCENDANT (6, "Attributes with descendant",  "WFSMR6", "", ""),
	MANDATORY_ELEMENT_PRECEDENT (7, "Mandatory element with no mandatory precedent",  "WFSMR7", "", ""),
	OPTIONAL_DESCENDANT (8, "",  "WFSMR8", "", ""),
	TEST_ERROR (9, "",  "GFR8", "", ""),
	COMPOSITION_RULE_ (10, 
			"Features referenced in a CR should be\n either an optional feature or an attribute feature.",  
			"WFCR1", 
			"Features referenced in a CR should be\n either an optional feature or an attribute feature.", 
			"Features referenced in a CR should be\n either an optional feature or an attribute feature."),
	ADAPTATIOM_RULE_ (11, 
			"Features referenced in the SE should be\n either an optional feature or an attribute feature\n and should be owned by the SM",  
			"WFAR1", 
			"Features referenced in the SE should be\n either an optional feature or an attribute feature\n and should be owned by the SM", 
			"Features referenced in the SE should be\n either an optional feature or an attribute feature\n and should be owned by the SM");

	
	private int code;
	private String description;
	private String label;
	private String ptExceptionMsg;
	private String enExceptionMsg;
	
	private RulesConstraintsOWLClassTypeEnum(int code, String description, String label, String ptExceptionMsg, String enExceptionMsg) {
		this.code = code;
		this.description = description;
		this.label = label;
		this.ptExceptionMsg = ptExceptionMsg;
		this.enExceptionMsg = enExceptionMsg;
	}
	
	public String getIRI() {
		return Utils.META_ONTOLOGY_BASE_URL_SHARP + this.getLabel();
	}
	
	//G'n S
	public int getCode() {
		return code;
	}

	public String getDescription() {
		return description;
	}

	public String getLabel() {
		return label;
	}
	
	public String getPtExceptionMsg() {
		return ptExceptionMsg;
	}

	public String getEnExceptionMsg() {
		return enExceptionMsg;
	}

}