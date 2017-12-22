package fixture.owl.enumeration;

import fixture.owl.enumeration.interfaces.FixtureOWLConceptEnumInterface;
import fixture.owl.utils.Utils;

public enum OWLObjectPropertyTypeEnum implements FixtureOWLConceptEnumInterface {
	
	HAS_FATHER_FEATURE (1, "Has Father Feature", "hasFatherFeature"),
	HAS_CHILD_FEATURE (2, "Has Child Feature", "hasChildFeature"),
	
	HAS_PARENTAL_INCONSISTENCY (3, "Has Parental Inconsistency", "hasParentalInconsistency"),
	
	HAS_CONTEXT_ENTITY (4, "Has Context Entity", "hasContextEntity"),
	HAS_CONTEXT_INFO (5, "Has Context Information", "hasContextInfo"),
	HAS_FATHER_CONTEXT_ROOT (6, "Has Father Context Root", "hasFatherContextRoot"),
	HAS_FATHER_CONTEXT_ENTITY (7, "Has Father Context Entitt", "hasFatherContextEntity"),
	
	HAS_ATTRIBUTE (8, "Has Attribute", "hasAttribute"),
	
	HAS_ANTECEDENT (9, "Has Antecedent", "hasAntecedent"),
	HAS_CONSEQUENT (10, "Has Consequent", "hasConsequent"),
	HAS_FEAUTURED_ELEMENT (11, "Has Featured Element", "hasFeaturedElement"),
	
	HAS_LEFT_SIDE_ACTION (12, "Has Left Side Action", "hasLeftSideAction"),
	HAS_RIGHT_SIDE_ACTION (13, "Has Right Side Action", "hasRightSideAction"),
	HAS_LEFT_SIDE_COMPOSITION (14, "Has Left Side Composition", "hasLeftSideComposition"),
	HAS_RIGHT_SIDE_COMPOSITION (15, "Has Right Side Composition", "hasRightSideComposition"),
	HAS_EXPRESSION_VARIABLE (16, "Has Expression Variable", "hasExpressionVariable"),
	HAS_CONTEXT_VARIABLE (17, "Has Context Variable", "hasContextVariable"),
	
	HAS_EVENT (18, "Has Event", "hasEvent"),
	HAS_ACTION (19, "Has Action", "hasAction"),
	
	HAS_LEFT_SIDE_EVENT (20, "Has Left Side Event", "hasLeftSideEvent"),
	HAS_RIGHT_SIDE_EVENT (21, "Has Right Side Event", "hasRightSideEvent"),
	
	HAS_EQUAL_NAME (22, "Has Equal Name", "hasEqualName"),
	HAS_CICLE (22, "Has Cicle", "hasCicle"),
	
	HAS_CHILD_PRODUCT_FEATURE (23, "Has Child Product Feature", "hasChildProductFeature"),
	HAS_FATHER_PRODUCT_FEATURE (24, "Has Father Product Feature", "hasFatherProductFeature"),
	HAS_FATHER_PRODUCT_VARIATION (25, "Has Father Product Variation", "hasFatherProductVariation"),
	HAS_ORIGINAL_ELEMENT (26, "Has Original Elemento", "hasOriginalElement"),
	HAS_PRODUCT_ATTRIBUTE (27, "Has Product Attribute", "hasProductAttribute"),
	HAS_PRODUCT_VARIATIONS (28, "Has Product Variations", "hasProductVariations"),
	
	HAS_TEST_CASE (29, "Has Test Case", "hasTestCase"),
	IMPLEMENTS_USE_CASE (30, "Implements Use Case", "implementsUseCase");
	
	
	
	private int code;
	private String description;
	private String label;
	
		
	private OWLObjectPropertyTypeEnum(int code, String description, String label) {
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
