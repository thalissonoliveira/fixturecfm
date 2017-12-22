package fixture.owl.parser;

import java.util.Set;

import org.semanticweb.owlapi.model.OWLIndividual;
import org.semanticweb.owlapi.model.OWLNamedIndividual;

import fixture.owl.model.element.Attribute;
import fixture.owl.model.element.Feature;
import fixture.owl.model.intefaces.ExternalElement;
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
public class FeaToOntoFixture extends AbstractFeaToOntoFixture {
	
	protected void buildOntology(Action action, OWLIndividual currentActionOWL) {
		if (action.isActionLiteral()) {
			ActionLiteral actionLiteral = (ActionLiteral) action;
			feaToOntoFixtureUtils.addPresenceActionLiteralRelation(currentActionOWL, actionLiteral.getPresence().getValue());
			OWLNamedIndividual currentFeaturedElementOwl = owlOracle.get(actionLiteral.getFeaturedElement().getId());
			feaToOntoFixtureUtils.addRelationBetweenActionLiteralAndFeaturedElement(currentActionOWL, currentFeaturedElementOwl);
			
		} else if (action.isDesignate()) {
			Designate designate = (Designate) action;
			feaToOntoFixtureUtils.addRelationBetweenDesignateAndAttribute(currentActionOWL, owlOracle.get(designate.getAttribute().getId()));
			feaToOntoFixtureUtils.addValueDesignateRelation(currentActionOWL, designate.getValue());
			feaToOntoFixtureUtils.addValueTypeDesignateRelation(currentActionOWL, designate.getValueType().getValue());
			
		} else if (action.isLogicalAction()) {
			LogicalAction logicalAction = (LogicalAction) action;
			
			Action leftSideAction = logicalAction.getLeftSideAction();
			OWLIndividual currentLeftSideAction = feaToOntoFixtureUtils.createNewOWLNamedIndividual(leftSideAction, owlOracle);
			feaToOntoFixtureUtils.addActionClassification(leftSideAction, currentLeftSideAction);
			feaToOntoFixtureUtils.addParentalRelationBetweenActionAndLeftSideAction(currentActionOWL, currentLeftSideAction);
			
			Action rightSideAction = logicalAction.getRightSideAction();
			OWLIndividual currentRightSideAction = feaToOntoFixtureUtils.createNewOWLNamedIndividual(rightSideAction, owlOracle);
			feaToOntoFixtureUtils.addActionClassification(rightSideAction, currentRightSideAction);
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
			
			String id = compositionLiteral.getFeaturedElement().getId();
			OWLNamedIndividual currentFeaturedElementOwl = owlOracle.get(id);
			feaToOntoFixtureUtils.addRelationBetweenCompositionLiteralAndFeaturedElement(currentAntecedentRuleOWL, currentFeaturedElementOwl);
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

		OWLIndividual currentFeatureOwl = feaToOntoFixtureUtils.createNewOWLNamedIndividual(feature, owlOracle);
		feaToOntoFixtureUtils.addFeatureClassification(feature, currentFeatureOwl);
		
		Feature fatherFeature = feature.getFatherFeature();
		if (fatherFeature != null) {
			OWLIndividual currentFatherFeatureOwl = null;
			String fatherId = fatherFeature.getId();
			
			if (owlOracle.containsKey(fatherId)) {
				currentFatherFeatureOwl = owlOracle.get(fatherId);
			} else {
				//TODO Acho que esse código está errado, pois não há classificação da feature nesse ponto. Verificar se esse pedaço de código é chamado. Se for, ver o comportamento.
				currentFatherFeatureOwl = feaToOntoFixtureUtils.createNewOWLNamedIndividual(fatherFeature, owlOracle);
			}
			feaToOntoFixtureUtils.addParentalRelationBetweenFeatures(currentFeatureOwl, currentFatherFeatureOwl);
		}
		
		Set<ExternalElement> externalElements = feature.getExternalElements();

		OWLIndividual currentExternalElementOwl;
		for (ExternalElement externalElement : externalElements) {
			currentExternalElementOwl = feaToOntoFixtureUtils.createNewOWLNamedIndividual(externalElement, owlOracle);
			feaToOntoFixtureUtils.addExternalElementClassification(currentExternalElementOwl, externalElement);
			feaToOntoFixtureUtils.addParentalRelationBetweenFeatureAndExternalElement(currentFeatureOwl, currentExternalElementOwl, externalElement);
		}
		
		Set<Attribute> attributes = feature.getAttributes();
		
		OWLIndividual currentAttributeOwl;
		for (Attribute attribute : attributes) {
			currentAttributeOwl = feaToOntoFixtureUtils.createNewOWLNamedIndividual(attribute, owlOracle);
			feaToOntoFixtureUtils.addAttributeClassification(currentAttributeOwl);
			feaToOntoFixtureUtils.addParentalRelationBetweenFeatureAndAttribute(currentFeatureOwl, currentAttributeOwl);
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
	
	
	protected boolean addDisjuctionBetweenFeatureOWLClasses() {
		return false;
	}


}

