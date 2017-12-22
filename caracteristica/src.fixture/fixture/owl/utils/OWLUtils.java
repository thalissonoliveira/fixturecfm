package fixture.owl.utils;

import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.semanticweb.owlapi.MakeClassesMutuallyDisjoint;
import org.semanticweb.owlapi.model.AddAxiom;
import org.semanticweb.owlapi.model.IRI;
import org.semanticweb.owlapi.model.OWLClass;
import org.semanticweb.owlapi.model.OWLClassAssertionAxiom;
import org.semanticweb.owlapi.model.OWLClassExpression;
import org.semanticweb.owlapi.model.OWLDataFactory;
import org.semanticweb.owlapi.model.OWLDataProperty;
import org.semanticweb.owlapi.model.OWLDataPropertyAssertionAxiom;
import org.semanticweb.owlapi.model.OWLDataPropertyExpression;
import org.semanticweb.owlapi.model.OWLEntity;
import org.semanticweb.owlapi.model.OWLIndividual;
import org.semanticweb.owlapi.model.OWLLiteral;
import org.semanticweb.owlapi.model.OWLNamedIndividual;
import org.semanticweb.owlapi.model.OWLObjectAllValuesFrom;
import org.semanticweb.owlapi.model.OWLObjectMaxCardinality;
import org.semanticweb.owlapi.model.OWLObjectProperty;
import org.semanticweb.owlapi.model.OWLObjectPropertyAssertionAxiom;
import org.semanticweb.owlapi.model.OWLOntology;
import org.semanticweb.owlapi.model.OWLOntologyChange;
import org.semanticweb.owlapi.model.OWLSubClassOfAxiom;

import fixture.owl.enumeration.ModelOWLClassTypeEnum;
import fixture.owl.enumeration.OWLDataPropertyTypeEnum;
import fixture.owl.enumeration.OWLObjectPropertyTypeEnum;
import fixture.owl.enumeration.ObjectRestrictionType;
import fixture.owl.enumeration.interfaces.FixtureOWLClassTypeEnumInterface;
import fixture.owl.factory.OWLClassFactory;
import fixture.owl.factory.OWLDataPropertyFactory;
import fixture.owl.factory.OWLObjectPropertyFactory;
import fixture.owl.model.element.Feature;
import fixture.owl.model.element.VariationTwo;
import fixture.owl.model.intefaces.ExternalElement;
import fixture.owl.model.intefaces.Nameable;
import fixture.owl.model.product.ProductFeature;
import fixture.owl.model.rule.Action;
import fixture.owl.model.rule.Antecedent;
import fixture.owl.model.rule.Event;

public class OWLUtils {
	
	private static OWLUtils owlUtils;
	private OntoHelper ontoHelper;
	private static OWLObjectPropertyFactory owlObjetcPropertyFactory;
	private static OWLClassFactory owlClassFactory;
	
	private OWLUtils() {}
	
	public synchronized static OWLUtils getInstance(OntoHelper ontoHelper) {
		if (owlUtils == null) {
			owlUtils = new OWLUtils();
			owlUtils.ontoHelper = ontoHelper;
			initializeAttributes();
		} else {
			if (!owlUtils.ontoHelper.equals(ontoHelper)) {
				owlUtils.ontoHelper = ontoHelper;
				initializeAttributes();
			}
		}
		return owlUtils;
	}
	
	public void addParentalRelationBetweenEventAndLeftSideEvent(OWLIndividual currentEventOWL, OWLIndividual currentLeftSideEvent) {
		OWLObjectProperty hasLeftSideCompositionProperty = owlObjetcPropertyFactory.get(OWLObjectPropertyTypeEnum.HAS_LEFT_SIDE_EVENT);
		addUnilateralRelationToOntology(currentEventOWL, currentLeftSideEvent, hasLeftSideCompositionProperty);
	}
	
	public void addParentalRelationBetweenEventAndRightSideEvent(OWLIndividual currentEventOWL, OWLIndividual currentRightSideEvent) {
		OWLObjectProperty hasRightSideCompositionProperty = owlObjetcPropertyFactory.get(OWLObjectPropertyTypeEnum.HAS_RIGHT_SIDE_EVENT);
		addUnilateralRelationToOntology(currentEventOWL, currentRightSideEvent, hasRightSideCompositionProperty);
	}
	
	public void addParentalRelationBetweenActionAndLeftSideAction(OWLIndividual currentActionOWL, OWLIndividual currentLeftSideAction) {
		OWLObjectProperty hasLeftSideCompositionProperty = owlObjetcPropertyFactory.get(OWLObjectPropertyTypeEnum.HAS_LEFT_SIDE_ACTION);
		addUnilateralRelationToOntology(currentActionOWL, currentLeftSideAction, hasLeftSideCompositionProperty);
	}
	
	public void addParentalRelationBetweenActionAndRightSideAction(OWLIndividual currentActionOWL, OWLIndividual currentRightSideAction) {
		OWLObjectProperty hasRightSideCompositionProperty = owlObjetcPropertyFactory.get(OWLObjectPropertyTypeEnum.HAS_RIGHT_SIDE_ACTION);
		addUnilateralRelationToOntology(currentActionOWL, currentRightSideAction, hasRightSideCompositionProperty);
	}
	
	public void addParentalRelationBetweenAntecedentAndLeftSideComposition(OWLIndividual currentAntecedentRuleOWL, OWLIndividual currentLeftSideComposition) {
		OWLObjectProperty hasLeftSideCompositionProperty = owlObjetcPropertyFactory.get(OWLObjectPropertyTypeEnum.HAS_LEFT_SIDE_COMPOSITION);
		addUnilateralRelationToOntology(currentAntecedentRuleOWL, currentLeftSideComposition, hasLeftSideCompositionProperty);
	}
	
	public void addParentalRelationBetweenAntecedentAndRightSideComposition(OWLIndividual currentAntecedentRuleOWL, OWLIndividual currentRightSideComposition) {
		OWLObjectProperty hasRightSideCompositionProperty = owlObjetcPropertyFactory.get(OWLObjectPropertyTypeEnum.HAS_RIGHT_SIDE_COMPOSITION);
		addUnilateralRelationToOntology(currentAntecedentRuleOWL, currentRightSideComposition, hasRightSideCompositionProperty);
	}

	public void addParentalRelationBetweenCompositionRuleAndAntecedent(OWLIndividual currentCompositionRuleOWL, OWLIndividual currentAntecedentRuleOWL) {
		OWLObjectProperty hasAntecedentProperty = owlObjetcPropertyFactory.get(OWLObjectPropertyTypeEnum.HAS_ANTECEDENT);
		addUnilateralRelationToOntology(currentCompositionRuleOWL, currentAntecedentRuleOWL, hasAntecedentProperty);
	}
	
	public void addParentalRelationBetweenCompositionRuleAndConsequent(OWLIndividual currentCompositionRuleOWL, OWLIndividual currentConsequentRuleOWL) {
		OWLObjectProperty hasConsequentProperty = owlObjetcPropertyFactory.get(OWLObjectPropertyTypeEnum.HAS_CONSEQUENT);
		addUnilateralRelationToOntology(currentCompositionRuleOWL, currentConsequentRuleOWL, hasConsequentProperty);
	}
	
	public void addParentalRelationBetweenContextRuleAndEvent(OWLIndividual currentContextRuleOWL, OWLIndividual currentEventOWL) {
		OWLObjectProperty hasConsequentProperty = owlObjetcPropertyFactory.get(OWLObjectPropertyTypeEnum.HAS_EVENT);
		addUnilateralRelationToOntology(currentContextRuleOWL, currentEventOWL, hasConsequentProperty);
	}
	
	public void addParentalRelationBetweenContextRuleAndAction(OWLIndividual currentContextRuleOWL, OWLIndividual currentActionOWL) {
		OWLObjectProperty hasConsequentProperty = owlObjetcPropertyFactory.get(OWLObjectPropertyTypeEnum.HAS_ACTION);
		addUnilateralRelationToOntology(currentContextRuleOWL, currentActionOWL, hasConsequentProperty);
	}

	
	public void addRelationBetweenCompositionLiteralAndFeaturedElement(OWLIndividual currentAntecedentRuleOWL, OWLIndividual currentFeaturedElementOwl) {
		OWLObjectProperty hasFeaturedElement = owlObjetcPropertyFactory.get(OWLObjectPropertyTypeEnum.HAS_FEAUTURED_ELEMENT);
		addUnilateralRelationToOntology(currentAntecedentRuleOWL, currentFeaturedElementOwl, hasFeaturedElement);
	}
	
	public void addRelationBetweenActionLiteralAndFeaturedElement(OWLIndividual currentActionOWL, OWLIndividual currentFeaturedElementOwl) {
		OWLObjectProperty hasFeaturedElement = owlObjetcPropertyFactory.get(OWLObjectPropertyTypeEnum.HAS_FEAUTURED_ELEMENT);
		addUnilateralRelationToOntology(currentActionOWL, currentFeaturedElementOwl, hasFeaturedElement);
	}
	
	public void addRelationBetweenDesignateAndAttribute(OWLIndividual currentActionOWL, OWLIndividual currentAttribute) {
		OWLObjectProperty hasAttribute = owlObjetcPropertyFactory.get(OWLObjectPropertyTypeEnum.HAS_ATTRIBUTE);
		addUnilateralRelationToOntology(currentActionOWL, currentAttribute, hasAttribute);
	}

	public void addRelationBetweenRelationalExpressionAndExpressionVariable(OWLIndividual currentAntecedentRuleOWL, OWLIndividual currentExpressionVariable) {
	}
	
	public void addRelationBetweenRelationalEventAndContextVariable(OWLIndividual currentEventOWL, OWLIndividual currentContextVariable) {
		OWLObjectProperty hasContextVariable = owlObjetcPropertyFactory.get(OWLObjectPropertyTypeEnum.HAS_CONTEXT_VARIABLE);
		addUnilateralRelationToOntology(currentEventOWL, currentContextVariable, hasContextVariable);
	}

	public void addParentalRelationBetweenFeatures(OWLIndividual currentFeatureOwl, OWLIndividual currentFatherFeatureOwl) {
		OWLObjectProperty hasFatherFeatureProperty = owlObjetcPropertyFactory.get(OWLObjectPropertyTypeEnum.HAS_FATHER_FEATURE);
		OWLObjectProperty hasChildFeatureProperty = owlObjetcPropertyFactory.get(OWLObjectPropertyTypeEnum.HAS_CHILD_FEATURE);
		addBilateralRelationToOntology(currentFeatureOwl, currentFatherFeatureOwl, hasFatherFeatureProperty, hasChildFeatureProperty);
	}
	
	public void addParentalRelationBetweenProductFeatures(OWLIndividual currentFeatureOwl, OWLIndividual currentFatherFeatureOwl) {
		OWLObjectProperty hasFatherFeatureProperty = owlObjetcPropertyFactory.get(OWLObjectPropertyTypeEnum.HAS_FATHER_PRODUCT_FEATURE);
		OWLObjectProperty hasChildFeatureProperty = owlObjetcPropertyFactory.get(OWLObjectPropertyTypeEnum.HAS_CHILD_PRODUCT_FEATURE);
		addBilateralRelationToOntology(currentFeatureOwl, currentFatherFeatureOwl, hasFatherFeatureProperty, hasChildFeatureProperty);
	}
	
	
	/**
	 * 
	 * Restricts object creation.
	 * 
	 * <strong>Info</strong> </br> OWLObjectAllValuesFrom = restriction type: only (universal)
	 * 
	 * @param createNewOLWClass
	 * @param currentFatherFeatureOwl
	 */
	public void addParentalRelationBetweenFeatures(OWLClass createNewOLWClass, OWLClass currentFatherFeatureOwl) {
		OWLObjectProperty hasFatherFeatureProperty = owlObjetcPropertyFactory.get(OWLObjectPropertyTypeEnum.HAS_FATHER_FEATURE);
		OWLObjectAllValuesFrom hasFatherFeatureOwlObjectAllValuesFrom = ontoHelper.getDataFactory().getOWLObjectAllValuesFrom(hasFatherFeatureProperty, currentFatherFeatureOwl);
		OWLSubClassOfAxiom owlSubClassOfAxiom = ontoHelper.getDataFactory().getOWLSubClassOfAxiom(createNewOLWClass, hasFatherFeatureOwlObjectAllValuesFrom);
		
		AddAxiom addParentalRelationBetweenFeaturesAxiom = new AddAxiom(ontoHelper.getMetaOntology(), owlSubClassOfAxiom);
		ontoHelper.getManager().applyChange(addParentalRelationBetweenFeaturesAxiom);

	}
	
	public void addIndividualClassification(OWLIndividual owlIndividual, FixtureOWLClassTypeEnumInterface fixtureOWLClassTypeEnumInterface) {
		OWLClass owlClass = owlClassFactory.get(fixtureOWLClassTypeEnumInterface);
		addEntityClassificationToOntology(owlIndividual, owlClass);
	}
	
	public void addAntecedentClassification(Antecedent antecedent, OWLIndividual currentAntecedentRuleOWL) {
		if (antecedent.isCompositionLiteral()) {
			addIndividualClassification(currentAntecedentRuleOWL, ModelOWLClassTypeEnum.COMPOSITION_LITERAL);
		} else if (antecedent.isLogicalExpression()) {
			addIndividualClassification(currentAntecedentRuleOWL, ModelOWLClassTypeEnum.LOGICAL_EXPRESSION);
		} else if (antecedent.isRelationalExpression()) {
			addIndividualClassification(currentAntecedentRuleOWL, ModelOWLClassTypeEnum.RELATIONAL_EXPRESSION);
		} else {
			throw new RuntimeException("SEE EXAMPLE OF FEATURE.");
		}
	}

	
	public void addContextRootClassification(OWLIndividual currentContextRootOwl) {
		addIndividualClassification(currentContextRootOwl, ModelOWLClassTypeEnum.CONTEXT_ROOT);
	}
	
	public void addContextEntityClassification(OWLIndividual currentContextEntityOWL) {
		addIndividualClassification(currentContextEntityOWL, ModelOWLClassTypeEnum.CONTEXT_ENTITY);
	}
	
	public void addContextInfoClassification(OWLIndividual currentContextInfoOWL) {
		addIndividualClassification(currentContextInfoOWL, ModelOWLClassTypeEnum.CONTEXT_INFO);
	}
	
	public void addAttributeClassification(OWLIndividual currentAttributeOWL) {
		addIndividualClassification(currentAttributeOWL, ModelOWLClassTypeEnum.ATTRIBUTE);
	}
	
	public void addExternalElementClassification(OWLIndividual currentExternalElementOWL, ExternalElement externalElement) {
		if (externalElement.isTestCase()) {
			addIndividualClassification(currentExternalElementOWL, ModelOWLClassTypeEnum.TEST_CASE);
		} else if (externalElement.isUseCase()) {
			addIndividualClassification(currentExternalElementOWL, ModelOWLClassTypeEnum.USE_CASE);
		} else {
			throw new RuntimeException("Classifying external element error. Element: " + externalElement.getName());
		}
		
	}
	
	public void addProductAttributeClassification(OWLIndividual currentAttributeOWL) {
		addIndividualClassification(currentAttributeOWL, ModelOWLClassTypeEnum.PRODUCT_ATTRIBUTE);
	}

	public void addCompositionRuleClassification(OWLIndividual currentCompotionRuleOWL) {
		addIndividualClassification(currentCompotionRuleOWL, ModelOWLClassTypeEnum.COMPOSITION_RULE);
	}
	
	public void addContextRuleClassification(OWLIndividual currentCompotionRuleOWL) {
		addIndividualClassification(currentCompotionRuleOWL, ModelOWLClassTypeEnum.CONTEXT_RULE);
	}
	
	public void addEventClassification(Event event, OWLIndividual currentEventOWL) {
		if (event.isLogicalEvent()) {
			addIndividualClassification(currentEventOWL, ModelOWLClassTypeEnum.LOGICAL_EVENT);
		} else if (event.isRelationalEvent()) {
			addIndividualClassification(currentEventOWL, ModelOWLClassTypeEnum.RELATIONAL_EVENT);
		} else {
			throw new RuntimeException("Problem with OWL class Event.");
		}
	}
	
	public void addActionClassification(Action action, OWLIndividual currentActionOWL) {
		if (action.isActionLiteral()) {
			addIndividualClassification(currentActionOWL, ModelOWLClassTypeEnum.ACTION_LITERAL);
		} else if (action.isDesignate()) {
			addIndividualClassification(currentActionOWL, ModelOWLClassTypeEnum.DESIGNATE);
		} else if (action.isLogicalAction()) {
			addIndividualClassification(currentActionOWL, ModelOWLClassTypeEnum.LOGICAL_ACTION);
		} else {
			throw new RuntimeException("Action Error.");
		}
		
	}
	
	public int getCountFromOntology() {
		OWLEntity[] individualCount = ontoHelper.getMetaOntology().getEntitiesInSignature(IRI.create(Utils.META_ONTOLOGY_BASE_URL_SHARP + "count")).toArray(new OWLEntity[1]);
		Set<OWLEntity> entitiesInSignature = ontoHelper.getMetaOntology().getEntitiesInSignature(IRI.create(Utils.META_ONTOLOGY_BASE_URL_SHARP + "hasMaxId"));
		OWLDataProperty[] dataProperthasMaxId = entitiesInSignature.toArray(new OWLDataProperty[1]);
		Map<OWLDataPropertyExpression, Set<OWLLiteral>> dataPropertyValues = ((OWLIndividual) individualCount[0]).getDataPropertyValues(ontoHelper.getMetaOntology());
		Set<OWLLiteral> set = dataPropertyValues.get((OWLDataProperty) dataProperthasMaxId[0]);
		if (set == null || set.isEmpty()) {
			return -1;
		}
		return Integer.valueOf(set.toArray(new OWLLiteral[1])[0].getLiteral());
	}
	
	public void addFeatureClassification(Feature feature, OWLIndividual currentFeatureOwl) {
		if (feature.isMandatoryFeature()) {
			addEntityClassificationToOntology(currentFeatureOwl, owlClassFactory.get(ModelOWLClassTypeEnum.MANDATORY_FEATURE));
		} else if (feature.isOptionalFeature()) {
			addEntityClassificationToOntology(currentFeatureOwl, owlClassFactory.get(ModelOWLClassTypeEnum.OPTIONAL_FEATURE));
		} else if (feature.isRootFeature()) {
			addEntityClassificationToOntology(currentFeatureOwl, owlClassFactory.get(ModelOWLClassTypeEnum.ROOT_FEATURE));
		} else if (feature.isVariatioTwoFeature()) {
			addEntityClassificationToOntology(currentFeatureOwl, owlClassFactory.get(ModelOWLClassTypeEnum.VARIATION_TWO));
		} else if (feature.isGroupedFeature()) {
			addEntityClassificationToOntology(currentFeatureOwl, owlClassFactory.get(ModelOWLClassTypeEnum.GROUPED_FEATURE));
		} else {
			throw new RuntimeException("Error translating a feature to OWL. Invalid Feature Type.");
		}
	}
	
	public void addProductFeatureClassification(ProductFeature productFeature, OWLIndividual currentFeatureOwl) {
		if (productFeature.isProduct()) {
			addEntityClassificationToOntology(currentFeatureOwl, owlClassFactory.get(ModelOWLClassTypeEnum.PRODUCT));
		} else if (productFeature.isProductMandatoryFeature()) {
			addEntityClassificationToOntology(currentFeatureOwl, owlClassFactory.get(ModelOWLClassTypeEnum.PRODUCT_MANDATORY_FEATURE));
		} else if (productFeature.isProductOptionalFeature()) {
			addEntityClassificationToOntology(currentFeatureOwl, owlClassFactory.get(ModelOWLClassTypeEnum.PRODUCT_OPTIONAL_FEATURE));
		} else if (productFeature.isProductVariant()) {
			addEntityClassificationToOntology(currentFeatureOwl, owlClassFactory.get(ModelOWLClassTypeEnum.PRODUCT_VARIANT));
		} else if (productFeature.isProductVariation()) {
			addEntityClassificationToOntology(currentFeatureOwl, owlClassFactory.get(ModelOWLClassTypeEnum.PRODUCT_VARIATION));
		} else if (productFeature.isProductVariationTwoFeature()) {
			addEntityClassificationToOntology(currentFeatureOwl, owlClassFactory.get(ModelOWLClassTypeEnum.PRODUCT_VARIATION_TWO));
		} else if (productFeature.isProductGroupedFeature()) {
			addEntityClassificationToOntology(currentFeatureOwl, owlClassFactory.get(ModelOWLClassTypeEnum.PRODUCT_GROUPED_FEATURE));
		} else {
			throw new RuntimeException("Error translating a feature to OWL. Invalid Feature Type.");
		}
	}
	
	public void addSubClassOfClassification(Feature feature, OWLClass owlClassFeature) {
		if (feature.isGroupedFeature()) {
			addSubClassOfClassification(owlClassFeature, OWLClassFactory.getInstance(ontoHelper).get(ModelOWLClassTypeEnum.GROUPED_FEATURE));
		} else if (feature.isOptionalFeature()) {
			addSubClassOfClassification(owlClassFeature, OWLClassFactory.getInstance(ontoHelper).get(ModelOWLClassTypeEnum.OPTIONAL_FEATURE));
		} else if (feature.isRootFeature()) {
			addSubClassOfClassification(owlClassFeature, OWLClassFactory.getInstance(ontoHelper).get(ModelOWLClassTypeEnum.ROOT_FEATURE));
		} else if (feature.isVariatioTwoFeature()) {
			addSubClassOfClassification(owlClassFeature, OWLClassFactory.getInstance(ontoHelper).get(ModelOWLClassTypeEnum.VARIATION_TWO));
			addMaxCardinalityOfVariationTwo((VariationTwo) feature, owlClassFeature);
		} else if (feature.isMandatoryFeature()) {
			addSubClassOfClassification(owlClassFeature, OWLClassFactory.getInstance(ontoHelper).get(ModelOWLClassTypeEnum.MANDATORY_FEATURE));
		} else {
			throw new RuntimeException("Error translating a feature to OWL. Invalid Feature Type.");
		}
	}

	private void addMaxCardinalityOfVariationTwo(VariationTwo variationTwoFeature, OWLClass owlClassFeature) {
		OWLObjectProperty hasChildFeatureProperty = owlObjetcPropertyFactory.get(OWLObjectPropertyTypeEnum.HAS_CHILD_FEATURE);
		OWLObjectMaxCardinality hasChildFeatureOwlObjectMaxCardinality = ontoHelper.getDataFactory().getOWLObjectMaxCardinality(variationTwoFeature.getOrMaximalCardinality(), hasChildFeatureProperty, OWLClassFactory.getInstance(ontoHelper).get(ModelOWLClassTypeEnum.GROUPED_FEATURE));
		OWLSubClassOfAxiom owlSubClassOfAxiom = ontoHelper.getDataFactory().getOWLSubClassOfAxiom(owlClassFeature, hasChildFeatureOwlObjectMaxCardinality);
		
		AddAxiom owlSubClassMaximalCardinalityAxiom = new AddAxiom(ontoHelper.getMetaOntology(), owlSubClassOfAxiom);
		ontoHelper.getManager().applyChange(owlSubClassMaximalCardinalityAxiom);
	}

	public void addParentalRelationBetweenContextRootAndEntity(OWLIndividual currentContextRootOWL, OWLIndividual currentContextEntityOWL) {
		OWLObjectProperty hasContextEntityProperty = owlObjetcPropertyFactory.get(OWLObjectPropertyTypeEnum.HAS_CONTEXT_ENTITY);
		OWLObjectProperty hasFatherContextRootProperty = owlObjetcPropertyFactory.get(OWLObjectPropertyTypeEnum.HAS_FATHER_CONTEXT_ROOT);
		addBilateralRelationToOntology(currentContextRootOWL, currentContextEntityOWL, hasContextEntityProperty, hasFatherContextRootProperty);
	}
	
	public void addParentalRelationBetweenContextEntityAndInfo(OWLIndividual currentContextEntityOWL, OWLIndividual currentContextInfoOWL) {
		OWLObjectProperty hasContextInfoProperty = owlObjetcPropertyFactory.get(OWLObjectPropertyTypeEnum.HAS_CONTEXT_INFO);
		OWLObjectProperty hasFatherContextEntityProperty = owlObjetcPropertyFactory.get(OWLObjectPropertyTypeEnum.HAS_FATHER_CONTEXT_ENTITY);
		addBilateralRelationToOntology(currentContextEntityOWL, currentContextInfoOWL, hasContextInfoProperty, hasFatherContextEntityProperty);
	}

	public void addParentalRelationBetweenFeatureAndAttribute(OWLIndividual currentFeatureOwl, OWLIndividual currentAttributeOwl) {
		OWLObjectProperty hasAttribute = owlObjetcPropertyFactory.get(OWLObjectPropertyTypeEnum.HAS_ATTRIBUTE);
		addUnilateralRelationToOntology(currentFeatureOwl, currentAttributeOwl, hasAttribute);
	}
	
	public void addParentalRelationBetweenFeatureAndExternalElement(OWLIndividual currentFeatureOwl, OWLIndividual currentExternalElementOwl, ExternalElement externalElement) {
		OWLObjectProperty external = null;
		if (externalElement.isTestCase()) {
			external = owlObjetcPropertyFactory.get(OWLObjectPropertyTypeEnum.HAS_TEST_CASE);
		} else if (externalElement.isUseCase()) {
			external = owlObjetcPropertyFactory.get(OWLObjectPropertyTypeEnum.IMPLEMENTS_USE_CASE);
		} else {
			throw new RuntimeException("Relating Feature and External Element error. External: " + externalElement.getName());
		}
		
		addUnilateralRelationToOntology(currentFeatureOwl, currentExternalElementOwl, external);
	}

	
	public void addParentalRelationBetweenProductFeatureAndProductAttribute(OWLIndividual currentFeatureOwl, OWLIndividual currentAttributeOwl) {
		OWLObjectProperty hasAttribute = owlObjetcPropertyFactory.get(OWLObjectPropertyTypeEnum.HAS_PRODUCT_ATTRIBUTE);
		addUnilateralRelationToOntology(currentFeatureOwl, currentAttributeOwl, hasAttribute);
	}
	
	
	public void addPresenceCompositionLiteralRelation(OWLIndividual currentAntecedentRuleOWL, int value) {
		addDataPropertyAssertionToOntology(currentAntecedentRuleOWL, OWLDataPropertyFactory.getInstance(ontoHelper).get(OWLDataPropertyTypeEnum.HAS_PRESENCE), value);
	}
	
	public void addPresenceActionLiteralRelation(OWLIndividual currentActionOWL, int value) {
		addDataPropertyAssertionToOntology(currentActionOWL, OWLDataPropertyFactory.getInstance(ontoHelper).get(OWLDataPropertyTypeEnum.HAS_PRESENCE), value);
	}
	
	public void addLogicalOperatorLogicalExpressionRelation(OWLIndividual currentAntecedentRuleOWL, int value) {
		addDataPropertyAssertionToOntology(currentAntecedentRuleOWL, OWLDataPropertyFactory.getInstance(ontoHelper).get(OWLDataPropertyTypeEnum.HAS_LOGICAL_OPERATOR), value);
	}
	
	public void addLogicalActionOperatorLogicalActionRelation(OWLIndividual currentActionOWL, int value) {
		addDataPropertyAssertionToOntology(currentActionOWL, OWLDataPropertyFactory.getInstance(ontoHelper).get(OWLDataPropertyTypeEnum.HAS_LOGICAL_ACTION_OPERATOR), value);
	}

	
	public void addLogicalOperatorLogicalEventRelation(OWLIndividual currentEventOWL, int value) {
		addDataPropertyAssertionToOntology(currentEventOWL, OWLDataPropertyFactory.getInstance(ontoHelper).get(OWLDataPropertyTypeEnum.HAS_LOGICAL_OPERATOR), value);
	}

	
	public void addRelationalOperatorRelationalExpressionRelation(OWLIndividual currentAntecedentRuleOWL, int value) {
		addDataPropertyAssertionToOntology(currentAntecedentRuleOWL, OWLDataPropertyFactory.getInstance(ontoHelper).get(OWLDataPropertyTypeEnum.HAS_RELATIONAL_OPERATOR), value);
	}
	
	public void addRelationalOperatorRelationalEventRelation(OWLIndividual currentAntecedentRuleOWL, int value) {
		addDataPropertyAssertionToOntology(currentAntecedentRuleOWL, OWLDataPropertyFactory.getInstance(ontoHelper).get(OWLDataPropertyTypeEnum.HAS_RELATIONAL_OPERATOR), value);
	}
	

	public void addValueRelationalExpressionRelation(OWLIndividual currentAntecedentRuleOWL, String value) {
		addDataPropertyAssertionToOntology(currentAntecedentRuleOWL, OWLDataPropertyFactory.getInstance(ontoHelper).get(OWLDataPropertyTypeEnum.HAS_VALUE), value);
	}
	
	public void addValueDesignateRelation(OWLIndividual currentActionOWL, String value) {
		addDataPropertyAssertionToOntology(currentActionOWL, OWLDataPropertyFactory.getInstance(ontoHelper).get(OWLDataPropertyTypeEnum.HAS_VALUE), value);
	}
	
	public void addValueTypeDesignateRelation(OWLIndividual currentEventOWL, int value) {
		addDataPropertyAssertionToOntology(currentEventOWL, OWLDataPropertyFactory.getInstance(ontoHelper).get(OWLDataPropertyTypeEnum.HAS_RELATIONAL_OPERATOR), value);
	}
	
	public void addValueRelationalEventRelation(OWLIndividual currentEventOWL, String value) {
		addDataPropertyAssertionToOntology(currentEventOWL, OWLDataPropertyFactory.getInstance(ontoHelper).get(OWLDataPropertyTypeEnum.HAS_VALUE), value);
	}
	
	public OWLIndividual createOWLNamedIndividualFatherFeature(Feature feature, Map<String, OWLNamedIndividual> oracle) {
		if (feature != null && feature.getFatherFeature() != null) {
			return createNewOWLNamedIndividual(feature.getFatherFeature(), oracle);
		}
		return null;
	}
	
	public OWLIndividual createNewOWLNamedIndividual(Nameable element, Map<String, OWLNamedIndividual> oracle) {
		if (element != null) {
			String id = element.getId();
			
			if (!oracle.containsKey(id)) {
				String name = element.getName();
				OWLNamedIndividual owlNamedIndividual = ontoHelper.getDataFactory().getOWLNamedIndividual(IRI.create(Utils.META_ONTOLOGY_BASE_URL_SHARP + element.getId()));
				addDataPropertyAssertionToOntology(owlNamedIndividual, OWLDataPropertyFactory.getInstance(ontoHelper).get(OWLDataPropertyTypeEnum.HAS_NAME), name);
				oracle.put(id, owlNamedIndividual);
			}
			
			return oracle.get(id);
		}
		return null;
	}
	
	public void addSubClassOfClassification(OWLClass owlClass, OWLClass owlClass2) {
		OWLSubClassOfAxiom owlSubClassOfAxiom = ontoHelper.getDataFactory().getOWLSubClassOfAxiom(owlClass, owlClass2);
		ontoHelper.getManager().addAxiom(ontoHelper.getMetaOntology(), owlSubClassOfAxiom);
	}

	@SuppressWarnings("static-access")
	public OWLClass createNewOLWClass(Feature feature, Map<String, OWLClass> owlClassOracle) {
		if (feature != null) {
			String name = feature.getName();
			if (!owlClassOracle.containsKey(name)) {
				OWLClass owlClass = ontoHelper.getDataFactory().getOWLClass(feature.getName(), ontoHelper.getPrefixOWLOntologyFormat());
				owlClassOracle.put(name, owlClass);
				owlClassFactory.getInstance(ontoHelper).putFeatureSubclass(name, owlClass);
			}
			
			return owlClassOracle.get(name);
		}
		
		return null;
				
	}
	
	
//	public OWLIndividual createNewOWLNamedIndividual(Nameable element, Map<String, Set<OWLNamedIndividual>> oracle) {
//		if (element != null) {
//			count++;
//			String name = element.getName();
//			String klassName = element.getClass().getSimpleName();
//			OWLNamedIndividual owlNamedIndividual = ontoHelper.getDataFactory().getOWLNamedIndividual(IRI.create(Utils.META_ONTOLOGY_BASE_URL_SHARP + klassName + "_" + count));
//			addDataPropertyAssertionToOntology(owlNamedIndividual, OWLDataPropertyFactory.getInstance(ontoHelper).get(OWLDataPropertyTypeEnum.HAS_NAME), name);
//			
//			if (!oracle.containsKey(name)) {
//				oracle.put(name, new HashSet<OWLNamedIndividual>());
//			}
//			oracle.get(name).add(owlNamedIndividual);
//			
//			return owlNamedIndividual;
//		}
//		return null;
//	}

//	@SuppressWarnings("static-access")
//	public void addMaxIdCountToOntology() {
//		
//		OWLIndividual countIndividual = (OWLIndividual) ontoHelper.getMetaOntology().getEntitiesInSignature(IRI.create(Utils.META_ONTOLOGY_BASE_URL_SHARP + "count")).toArray(new OWLEntity[1])[0];
//		OWLDataProperty hasMaxId = (OWLDataProperty) ontoHelper.getMetaOntology().getEntitiesInSignature(IRI.create(Utils.META_ONTOLOGY_BASE_URL_SHARP + "hasMaxId")).toArray(new OWLDataProperty[1])[0];
//		
//		Map<OWLDataPropertyExpression, Set<OWLLiteral>> dataPropertyValues = countIndividual.getDataPropertyValues(ontoHelper.getMetaOntology());
//		Set<OWLLiteral> collectionLiteralCount = dataPropertyValues.get(hasMaxId);
//		
////		if (collectionLiteralCount != null) {
//			int literalValue = Integer.valueOf(collectionLiteralCount.toArray(new OWLLiteral[1])[0].getLiteral());
//			removeDataPropertyFromOntology(countIndividual, hasMaxId, literalValue);
////		}
//		
//		addDataPropertyAssertionToOntology(countIndividual, hasMaxId, this.count);
//	}
	

//	private void removeDataPropertyFromOntology(OWLIndividual countIndividual, OWLDataProperty hasMaxId, int literalValue) {
//		OWLDataPropertyAssertionAxiom ax = ontoHelper.getDataFactory().getOWLDataPropertyAssertionAxiom(hasMaxId, countIndividual, literalValue);
//		ontoHelper.getManager().removeAxiom(ontoHelper.getMetaOntology(), ax);
//	}

	private void addDataPropertyAssertionToOntology(OWLIndividual individual, OWLDataProperty dataProperty, int value) {
		OWLDataPropertyAssertionAxiom ax = ontoHelper.getDataFactory().getOWLDataPropertyAssertionAxiom(dataProperty, individual, value);
		AddAxiom addAx = new AddAxiom(ontoHelper.getMetaOntology(), ax);
		ontoHelper.getManager().applyChange(addAx);
	}

	private void addDataPropertyAssertionToOntology(OWLIndividual individual, OWLDataProperty dataProperty, String value) {
		OWLDataPropertyAssertionAxiom ax = ontoHelper.getDataFactory().getOWLDataPropertyAssertionAxiom(dataProperty, individual, value);
		AddAxiom addAx = new AddAxiom(ontoHelper.getMetaOntology(), ax);
		ontoHelper.getManager().applyChange(addAx);
	}

	public void addEntityClassificationRestrictionToOntology(OWLIndividual OWLIndividual, OWLObjectProperty owlObjectProperty, ObjectRestrictionType objectRestrictionType, OWLClass owlClass) {
		
		if (objectRestrictionType.equals(ObjectRestrictionType.ONLY_UNIVERSAL)) {
			OWLObjectAllValuesFrom hasFatherFeatureOwlObjectAllValuesFrom = ontoHelper.getDataFactory().getOWLObjectAllValuesFrom(owlObjectProperty, owlClass);
			OWLClassAssertionAxiom featureClassificationAxiom = ontoHelper.getDataFactory().getOWLClassAssertionAxiom(hasFatherFeatureOwlObjectAllValuesFrom, OWLIndividual);
			ontoHelper.getManager().addAxiom(ontoHelper.getMetaOntology(), featureClassificationAxiom);
		}
		
	}
	
	//###### PRIVATE UTILS METHODS CALLED BY PROXIES METHODS #########//
	private static void initializeAttributes() {
		owlClassFactory = OWLClassFactory.getInstance(owlUtils.ontoHelper);
		owlObjetcPropertyFactory = OWLObjectPropertyFactory.getInstance(owlUtils.ontoHelper);
	}
	
	private void addEntityClassificationToOntology(OWLIndividual OWLIndividual, OWLClass OWLClass) {
		OWLClassAssertionAxiom featureClassificationAxiom = ontoHelper.getDataFactory().getOWLClassAssertionAxiom(OWLClass, OWLIndividual);
		ontoHelper.getManager().addAxiom(ontoHelper.getMetaOntology(), featureClassificationAxiom);
	}
	
	
	
	/**
	 * 
	 * This method relates the parameters p1, p2, p3 following the formula p1[p3]p2
	 * 
	 * @param individualOWL1
	 * @param individualOWL2
	 * @param objectPropertyOWL
	 */
	private void addUnilateralRelationToOntology(OWLIndividual individualOWL1, OWLIndividual individualOWL2, OWLObjectProperty objectPropertyOWL) {
		OWLObjectPropertyAssertionAxiom relationAssertion;
		AddAxiom addRelationAxiom;
		relationAssertion = ontoHelper.getDataFactory().getOWLObjectPropertyAssertionAxiom(objectPropertyOWL, individualOWL1, individualOWL2);
		addRelationAxiom = new AddAxiom(ontoHelper.getMetaOntology(), relationAssertion);
		ontoHelper.getManager().applyChange(addRelationAxiom);
	}

	/**
	 * 
	 * This method relates the parameters p1, p2, p3, p4 following the formulas p1[p3]p2 and p2[p4]p1
	 * 
	 * @param individualOWL1
	 * @param individualOWL2
	 * @param objectPropertyOWL1
	 * @param objectPropertyOWL2
	 */
	private void addBilateralRelationToOntology(OWLIndividual individualOWL1, OWLIndividual individualOWL2, OWLObjectProperty objectPropertyOWL1, OWLObjectProperty objectPropertyOWL2) {
		
		OWLObjectPropertyAssertionAxiom parentalRelationBetweenFeaturesAssertion;
		AddAxiom addParentalRelationBetweenFeaturesAxiom;
		
		parentalRelationBetweenFeaturesAssertion = ontoHelper.getDataFactory().getOWLObjectPropertyAssertionAxiom(objectPropertyOWL1, individualOWL1, individualOWL2);
		addParentalRelationBetweenFeaturesAxiom = new AddAxiom(ontoHelper.getMetaOntology(), parentalRelationBetweenFeaturesAssertion);
		ontoHelper.getManager().applyChange(addParentalRelationBetweenFeaturesAxiom);
		
		parentalRelationBetweenFeaturesAssertion = ontoHelper.getDataFactory().getOWLObjectPropertyAssertionAxiom(objectPropertyOWL2, individualOWL2, individualOWL1);
		addParentalRelationBetweenFeaturesAxiom = new AddAxiom(ontoHelper.getMetaOntology(), parentalRelationBetweenFeaturesAssertion);
		ontoHelper.getManager().applyChange(addParentalRelationBetweenFeaturesAxiom);
	}

	public void addDisjuctionBetweenFeatureOWLClasses()  {
//		if (feature.isGroupedFeature()) {
//			addSubClassOfClassification(owlClassFeature, );
//		} else if (feature.isOptionalFeature()) {
//			addSubClassOfClassification(owlClassFeature, );
//		} else if (feature.isRootFeature()) {
//			addSubClassOfClassification(owlClassFeature, );
//		} else if (feature.isVariatioTwoFeature()) {
//			addSubClassOfClassification(owlClassFeature, );
//			addMaxCardinalityOfVariationTwo((VariationTwo) feature, owlClassFeature);
//		} else if (feature.isMandatoryFeature()) {
//			addSubClassOfClassification(owlClassFeature, );
		
		
		OWLOntology targetOntology = ontoHelper.getMetaOntology();
		OWLDataFactory dataFactory = ontoHelper.getDataFactory();
		
		OWLClass[] parentClasses = {
				OWLClassFactory.getInstance(ontoHelper).get(ModelOWLClassTypeEnum.GROUPED_FEATURE),
				OWLClassFactory.getInstance(ontoHelper).get(ModelOWLClassTypeEnum.OPTIONAL_FEATURE),
				OWLClassFactory.getInstance(ontoHelper).get(ModelOWLClassTypeEnum.ROOT_FEATURE),
				OWLClassFactory.getInstance(ontoHelper).get(ModelOWLClassTypeEnum.VARIATION_TWO),
				OWLClassFactory.getInstance(ontoHelper).get(ModelOWLClassTypeEnum.MANDATORY_FEATURE)
				};
		
		Set<OWLClassExpression> classExpressions = new HashSet<OWLClassExpression>();
		
		for (OWLClass owlClass : parentClasses) {
			Set<OWLClassExpression> subClasses = owlClass.getSubClasses(targetOntology);
			classExpressions.addAll(subClasses);
		}
		
		
		MakeClassesMutuallyDisjoint makeClassesMutuallyDisjoint = new MakeClassesMutuallyDisjoint(dataFactory, classExpressions, true, targetOntology);
		List<OWLOntologyChange> changes = makeClassesMutuallyDisjoint.getChanges();
		
		for (OWLOntologyChange owlOntologyChange : changes) {
			ontoHelper.getManager().applyChange(owlOntologyChange);
		}
		
	}

	public void addFeatureFromProductClassification(Feature feature, OWLIndividual currentFeatureOwl) {
		String name = feature.getName();
		OWLClass owlClass = ontoHelper.getDataFactory().getOWLClass(name, ontoHelper.getPrefixOWLOntologyFormat());
		addEntityClassificationToOntology(currentFeatureOwl, owlClass);
	}

}
