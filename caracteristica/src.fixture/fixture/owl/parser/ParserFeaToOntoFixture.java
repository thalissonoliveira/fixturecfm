package fixture.owl.parser;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import org.semanticweb.owlapi.model.OWLClass;
import org.semanticweb.owlapi.model.OWLIndividual;

import fixture.owl.enumeration.OWLObjectPropertyTypeEnum;
import fixture.owl.enumeration.ObjectRestrictionType;
import fixture.owl.factory.OWLObjectPropertyFactory;
import fixture.owl.model.element.Attribute;
import fixture.owl.model.element.Feature;
import fixture.owl.model.intefaces.ExternalElement;
import fixture.owl.model.intefaces.Nameable;
import fixture.owl.model.rule.Action;
import fixture.owl.model.rule.ActionLiteral;
import fixture.owl.model.rule.Antecedent;
import fixture.owl.model.rule.CompositionLiteral;
import fixture.owl.model.rule.Designate;
import fixture.owl.model.rule.LogicalAction;
import fixture.owl.model.rule.LogicalExpression;
import fixture.owl.model.rule.RelationalExpression;

/**
 * 
 * 
 * 
 * @author thalissonoliveira
 *
 */
public class ParserFeaToOntoFixture extends AbstractFeaToOntoFixture {
	
	
	private Map<String, OWLClass> owlClassOracle;
	
	

	public ParserFeaToOntoFixture() {
		super();
		owlClassOracle = new HashMap<String, OWLClass>();
	}

	protected void buildOntology(Action action, OWLIndividual currentActionOWL) {
		if (action.isActionLiteral()) {
			ActionLiteral actionLiteral = (ActionLiteral) action;
			feaToOntoFixtureUtils.addPresenceActionLiteralRelation(currentActionOWL, actionLiteral.getPresence().getValue());
			//TODO Nesse momento não há indivíduos de features
			
			String actionLiteralFeaturedElementName = actionLiteral.getFeaturedElement().getName();
			feaToOntoFixtureUtils.addEntityClassificationRestrictionToOntology(currentActionOWL, OWLObjectPropertyFactory.getInstance(ontoHelper).get(OWLObjectPropertyTypeEnum.HAS_FEAUTURED_ELEMENT), ObjectRestrictionType.ONLY_UNIVERSAL,  owlClassOracle.get(actionLiteralFeaturedElementName));
		} else if (action.isDesignate()) {
			Designate designate = (Designate) action;
			feaToOntoFixtureUtils.addRelationBetweenDesignateAndAttribute(currentActionOWL, owlOracle.get(designate.getAttribute().getId()));
			feaToOntoFixtureUtils.addValueDesignateRelation(currentActionOWL, designate.getValue());
			feaToOntoFixtureUtils.addValueTypeDesignateRelation(currentActionOWL, designate.getValueType().getValue());
			
		} else if (action.isLogicalAction()) {
			LogicalAction logicalAction = (LogicalAction) action;
			
			Action leftSideAction = logicalAction.getLeftSideAction();
			OWLIndividual currentLeftSideAction = feaToOntoFixtureUtils.createNewOWLNamedIndividual(leftSideAction, owlOracle);
			feaToOntoFixtureUtils.addParentalRelationBetweenActionAndLeftSideAction(currentActionOWL, currentLeftSideAction);
			
			Action rightSideAction = logicalAction.getRightSideAction();
			OWLIndividual currentRightSideAction = feaToOntoFixtureUtils.createNewOWLNamedIndividual(rightSideAction, owlOracle);
			feaToOntoFixtureUtils.addParentalRelationBetweenActionAndRightSideAction(currentActionOWL, currentRightSideAction);
			buildOntology(leftSideAction, currentLeftSideAction);
			buildOntology(rightSideAction, currentRightSideAction);
			
			feaToOntoFixtureUtils.addLogicalActionOperatorLogicalActionRelation(currentActionOWL, logicalAction.getLogicalActionOperator().getValue());
			
		} else {
			throw new RuntimeException("Action Error.");
		}
	}

	protected void buildOntology(Antecedent antecedent, OWLIndividual currentAntecedentRuleOWL) {
		
		if (antecedent.isCompositionLiteral()) {
			CompositionLiteral compositionLiteral = (CompositionLiteral) antecedent;
			feaToOntoFixtureUtils.addPresenceCompositionLiteralRelation(currentAntecedentRuleOWL, compositionLiteral.getPresence().getValue());
			
			
			String compositionLiteralFeaturedElementName = compositionLiteral.getFeaturedElement().getName();
			
			feaToOntoFixtureUtils.addEntityClassificationRestrictionToOntology(currentAntecedentRuleOWL, OWLObjectPropertyFactory.getInstance(ontoHelper).get(OWLObjectPropertyTypeEnum.HAS_FEAUTURED_ELEMENT), ObjectRestrictionType.ONLY_UNIVERSAL,  owlClassOracle.get(compositionLiteralFeaturedElementName));
		} else if (antecedent.isLogicalExpression()) {
			LogicalExpression logicalExpression = (LogicalExpression) antecedent;

			Antecedent leftSideComposition = logicalExpression.getLeftSideComposition();
			OWLIndividual currentLeftSideComposition = feaToOntoFixtureUtils.createNewOWLNamedIndividual(leftSideComposition, owlOracle);
			feaToOntoFixtureUtils.addParentalRelationBetweenAntecedentAndLeftSideComposition(currentAntecedentRuleOWL, currentLeftSideComposition);
			
			Antecedent rightSideComposition = logicalExpression.getRightSideComposition();
			OWLIndividual currentRightSideComposition = feaToOntoFixtureUtils.createNewOWLNamedIndividual(rightSideComposition, owlOracle);
			feaToOntoFixtureUtils.addParentalRelationBetweenAntecedentAndRightSideComposition(currentAntecedentRuleOWL, currentRightSideComposition);
			
			buildOntology(leftSideComposition, currentLeftSideComposition);
			buildOntology(rightSideComposition, currentRightSideComposition);
			
			feaToOntoFixtureUtils.addLogicalOperatorLogicalExpressionRelation(currentAntecedentRuleOWL, logicalExpression.getLogicalOperator().getValue());
		} else if (antecedent.isRelationalExpression()) {
			RelationalExpression relationalExpression = (RelationalExpression) antecedent;
			
			feaToOntoFixtureUtils.addRelationBetweenRelationalExpressionAndExpressionVariable(currentAntecedentRuleOWL, owlOracle.get(relationalExpression.getExpressionVariable().getId()));
			feaToOntoFixtureUtils.addRelationalOperatorRelationalExpressionRelation(currentAntecedentRuleOWL, relationalExpression.getRelationalOperator().getValue());
			feaToOntoFixtureUtils.addValueRelationalExpressionRelation(currentAntecedentRuleOWL, relationalExpression.getValue());
		} else {
			throw new RuntimeException("SEE EXAMPLE OF FEATURE.");
		}
		
	}


	protected void buildOntology(Feature feature) {
		
		System.out.println("### " + feature.getId() + " - " + feature.getName()); 
		
		OWLClass createNewOLWClass = feaToOntoFixtureUtils.createNewOLWClass(feature, owlClassOracle);
		feaToOntoFixtureUtils.addSubClassOfClassification(feature, createNewOLWClass);

		Feature fatherFeature = feature.getFatherFeature();
		if (fatherFeature != null) {
			
			OWLClass currentFatherFeatureOwl = null;
			String fatherId = fatherFeature.getId();
			
			if (owlClassOracle.containsKey(fatherId)) {
				currentFatherFeatureOwl = owlClassOracle.get(fatherId);
			} else {
				currentFatherFeatureOwl = feaToOntoFixtureUtils.createNewOLWClass(fatherFeature, owlClassOracle);
			}
			
			feaToOntoFixtureUtils.addParentalRelationBetweenFeatures(createNewOLWClass, currentFatherFeatureOwl);
		}
		
		Set<ExternalElement> externalElements = feature.getExternalElements();

		OWLIndividual currentExternaElementOwl;
		for (ExternalElement externalElement : externalElements) {
			currentExternaElementOwl = feaToOntoFixtureUtils.createNewOWLNamedIndividual(externalElement, owlOracle);
			feaToOntoFixtureUtils.addExternalElementClassification(currentExternaElementOwl, externalElement);
			//TODO Ver como fazer a restrição aqui. Ver se tem como restringir associação de elementos de uma classes a indivíduos específicos. Se não der, que triste.
		}
		
		Set<Attribute> attributes = feature.getAttributes();
		
		OWLIndividual currentAttributeOwl;
		for (Attribute attribute : attributes) {
			currentAttributeOwl = feaToOntoFixtureUtils.createNewOWLNamedIndividual(attribute, owlOracle);
			feaToOntoFixtureUtils.addAttributeClassification(currentAttributeOwl);
			//TODO Continuar (Vide TODO de external elements)
//			feaToOntoFixtureUtils.addParentalRelationBetweenFeatureAndAttribute(currentFeatureOwl, currentAttributeOwl);
		}
		
		Set<Feature> childrenFeatures = feature.getChildrenFeatures();
		if (!childrenFeatures.isEmpty()) {
			for (Feature childFeature : childrenFeatures) {
				buildOntology(childFeature);
			}
		} else {
			return;
		}
		
	}
	
	
	public Feature getFeatureByName(String name) {
		for (Nameable nameable : getOracle().values()) {
			if (nameable.getName().equals(name) && nameable instanceof Feature) {
				return (Feature) nameable;
			}
		}
		return null;
	}
	
	
	protected boolean addDisjuctionBetweenFeatureOWLClasses() {
		return true;
	}
	
}

