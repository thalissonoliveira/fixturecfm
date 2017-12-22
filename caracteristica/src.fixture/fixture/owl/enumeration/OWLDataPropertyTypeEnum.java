package fixture.owl.enumeration;

import fixture.owl.utils.Utils;

public enum OWLDataPropertyTypeEnum {
	
	HAS_NAME (1, "Has Name", "hasName"),
	HAS_MAX_ID (2, "Has Max Id", "hasMaxId"),
	
	HAS_CONTEXT (3, "Has Context", "hasContext"),
	HAS_LOGICAL_OPERATOR (4, "Has Logical Operator", "hasLogicalOperator"),
	HAS_RELATIONAL_OPERATOR (5, "Has Relational Operator", "hasRelationalOperator"),
	HAS_VALUE (6, "Has Value", "hasValue"),
	HAS_VALUE_TYPE (7, "Has Value Type", "hasValueType"),
	
	HAS_PRESENCE (8, "Has Presence", "hasPresence"),
	
	HAS_LOGICAL_ACTION_OPERATOR (9, "Has Logical Action Operator", "hasLogicalActionOperator"),
	
	IS_SELECTED (10, "Is Selected", "isSelected");
	
	
	
	
	
	private int code;
	private String description;
	private String label;
	
		
	private OWLDataPropertyTypeEnum(int code, String description, String label) {
		this.code = code;
		this.description = description;
		this.label = label;
	}
	
	public int getCode() {
		return code;
	}

	public String getDescription() {
		return description;
	}

	public String getIRI() {
		return Utils.META_ONTOLOGY_BASE_URL_SHARP + this.getLabel();
	}
	
	public String getLabel() {
		return label;
	}
	
}
