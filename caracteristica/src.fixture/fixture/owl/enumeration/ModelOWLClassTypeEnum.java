package fixture.owl.enumeration;

import fixture.owl.enumeration.interfaces.FixtureOWLClassTypeEnumInterface;
import fixture.owl.utils.Utils;

public enum ModelOWLClassTypeEnum implements FixtureOWLClassTypeEnumInterface {
	
	FEATURE (0, "Feature", "Feature"),
	MANDATORY_FEATURE (1, "Mandatory Feature", "MandatoryFeature"),
	OPTIONAL_FEATURE (2, "Optional Feature", "OptionalFeature"),
	ROOT_FEATURE (3, "Root Feature", "RootFeature"),
	VARIATION_TWO (4, "Variation Two", "VariationTwo"),
	GROUPED_FEATURE (5, "Grouped Feature", "GroupedFeature"),
	
	CONTEXT_ROOT (6, "Context Root", "ContextRoot"),
	CONTEXT_ENTITY (7, "Context Entity", "ContextEntity"),
	CONTEXT_INFO (8, "Context Info", "ContextInfo"),
	
	ATTRIBUTE (9, "Attribute", "Attribute"),
	COUNT(10, "count", "count"),

	COMPOSITION_RULE (11, "Compositin Rule", "CompositionRule"),
	CONTEXT_RULE (12, "Adaptatin Rule", "ContextRule"),
	
	ANTECEDENT(13, "Antecedent", "Antecedent"),
	COMPOSITION_LITERAL(14, "Composition Literal", "CompositionLiteral"),
	LOGICAL_EXPRESSION(15, "Logical Expression", "LogicalExpression"),
	RELATIONAL_EXPRESSION(16, "Relational Expression", "RelationalExpression"),

	ACTION (17, "Action", "Action"),
	ACTION_LITERAL(18, "Action Literal", "ActionLiteral"),
	DESIGNATE(19, "Designate", "Designate"),
	LOGICAL_ACTION(20, "Logical Action", "LogicalAction"),
	
	EVENT(21, "Event", "Event"),
	LOGICAL_EVENT(22, "LogicalEvent", "LogicalEvent"),
	RELATIONAL_EVENT(23, "Relational Event", "RelationalEvent"),
	
	PRODUCT(24, "Product", "Product"),
	PRODUCT_ELEMENT(25, "Product Elemnt", "ProductElemnt" ),
	PRODUCT_FEATURE(26, "Product Feature", "ProductFeature" ),
	PRODUCT_ATTRIBUTE(27, "Product Attribute", "ProductAttribute"),
	PRODUCT_MANDATORY_FEATURE(28, "Product Mandatory Feature", "ProductMandatoryFeature"),
	PRODUCT_OPTIONAL_FEATURE(29, "Product Optional Feature", "ProductOptionalFeature"),
	PRODUCT_VARIATION_TWO(30, "Product Variation Two", "ProductVariationTwo"),
	PRODUCT_VARIATION(31, "Product Variation", "ProductVariation" ),
	PRODUCT_VARIANT(32, "Product Variat", "ProductVariat" ), 
	PRODUCT_GROUPED_FEATURE(33, "Product Grouped Feature", "ProductGroupedFeature" ),
	
	EXTERNAL_CONCEPT(34, "External Concept", "ExternalConcept" ),
	TEST_CASE(35, "Test Case", "TestCase" ),
	USE_CASE(36, "Use Case", "UseCase" );
	
	
	private int code;
	private String description;
	private String label;
	
	private ModelOWLClassTypeEnum(int code, String description, String label) {
		this.code = code;
		this.description = description;
		this.label = label;
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

}
