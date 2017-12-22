package fixture.owl.parser;

import java.net.URISyntaxException;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import org.semanticweb.owlapi.model.OWLIndividual;
import org.semanticweb.owlapi.model.OWLNamedIndividual;
import org.semanticweb.owlapi.model.OWLOntologyCreationException;

import fixture.owl.factory.SPLConceptFactory;
import fixture.owl.model.SPL;
import fixture.owl.model.element.Attribute;
import fixture.owl.model.element.ContextEntity;
import fixture.owl.model.element.ContextInfo;
import fixture.owl.model.element.ContextRoot;
import fixture.owl.model.element.Feature;
import fixture.owl.model.element.RootFeature;
import fixture.owl.model.enumeration.LogicalOperator;
import fixture.owl.model.intefaces.Element;
import fixture.owl.model.intefaces.Nameable;
import fixture.owl.model.product.Product;
import fixture.owl.model.product.ProductAttribute;
import fixture.owl.model.product.ProductFeature;
import fixture.owl.model.rule.Action;
import fixture.owl.model.rule.Antecedent;
import fixture.owl.model.rule.CompositionRule;
import fixture.owl.model.rule.ContextRule;
import fixture.owl.model.rule.Event;
import fixture.owl.model.rule.LogicalEvent;
import fixture.owl.model.rule.RelationalEvent;
import fixture.owl.model.rule.Rule;
import fixture.owl.utils.OWLUtils;
import fixture.owl.utils.OntoHelper;
import fixture.owl.utils.Utils;

/**
 * 
 * 
 * 
 * @author thalissonoliveira
 *
 */
public abstract class AbstractFeaToOntoFixture {
	
	protected OntoHelper ontoHelper;
	protected OWLUtils feaToOntoFixtureUtils;
	protected Map<String, OWLNamedIndividual> owlOracle;
	protected Map<String, Nameable> fixtureOracle;
		
	public AbstractFeaToOntoFixture() {
		ontoHelper = new OntoHelper();
		owlOracle = new HashMap<String, OWLNamedIndividual>();
		fixtureOracle = new HashMap<String, Nameable>();
	}
	
	public void run(SPL spl) {
		//LOAD META-ONTOLOGY
		try {
			ontoHelper.loadMetaOntology();
			feaToOntoFixtureUtils = OWLUtils.getInstance(ontoHelper);
//			Utils.printSPLInfo(spl);
			populateOWL(spl);
			instatiateProducts(spl.getProducts());
			ontoHelper.saveAndRemoveOntology();
			ontoHelper.deleteTempDir();
		} catch (OWLOntologyCreationException e) {
			e.printStackTrace();
			throw new RuntimeException("FIXTURE2[ERROR] - Parse error! See log.");
		} catch (URISyntaxException e) {
			e.printStackTrace();
			throw new RuntimeException("FIXTURE2[ERROR] - Parse error! See log.");
		}
	}
	
	private void populateOWL(SPL spl) {
		//Declarar todos os conceitos (classes) que vou construir a ontologia
		//TODO é necessário representar a associação da LPS com os conceitos? (e.g elementos externos e atributos)
		RootFeature feature = Utils.getRootFeatureOf(spl.getSystem());;
		
		ContextRoot contextRoot;
		CompositionRule compositionRule;
		ContextRule contextRule;
		
		buildOntology(feature);
		if (addDisjuctionBetweenFeatureOWLClasses()) {
			feaToOntoFixtureUtils.addDisjuctionBetweenFeatureOWLClasses();
		}
		
		for (Element element : spl.getElements()) {
			if (element.isContextRoot()) {
				contextRoot = Utils.getContextRootOf(element);
				buildOntology(contextRoot);
			}
		}
		
		for (Rule rule : spl.getRules()) {
			if (rule.isCompositionRule()) {
				compositionRule = Utils.getCompositionRuleOf(rule);
				buildOntology(compositionRule);
			} else if(rule.isContextRule()) {
				contextRule = Utils.getContextRuleOf(rule);
				buildOntology(contextRule);
			}
		}
		
		for (Product product : spl.getProducts()) {
			buildOntology(product);
		}
		
	}
	
	private void buildOntologyFromProduct(ProductFeature product) {
		
		Feature feature = (Feature) getElementById(product.getOriginalElement().getId());

		OWLIndividual currentFeatureOwl = feaToOntoFixtureUtils.createNewOWLNamedIndividual(feature, owlOracle);
		feaToOntoFixtureUtils.addFeatureFromProductClassification(feature, currentFeatureOwl);
		
		
		ProductFeature fatherProductFeature = product.getFatherProductFeature();
		Feature fatherFeature = fatherProductFeature != null ? feature.getFatherFeature() : null;
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
		
		Set<Attribute> attributes = feature.getAttributes();

		OWLIndividual currentAttributeOwl;
		for (Attribute attribute : attributes) {
			currentAttributeOwl = feaToOntoFixtureUtils.createNewOWLNamedIndividual(attribute, owlOracle);
			feaToOntoFixtureUtils.addAttributeClassification(currentAttributeOwl);
			feaToOntoFixtureUtils.addParentalRelationBetweenFeatureAndAttribute(currentFeatureOwl, currentAttributeOwl);
		}
		
		
		Set<ProductFeature> childrenFeatures = product.getChildProductFeature();
		if (!childrenFeatures.isEmpty()) {
			for (ProductFeature childProductFeature : childrenFeatures) {
				buildOntologyFromProduct(childProductFeature);
			}
		} else {
			return;
		}
		
	}
	
	private void instatiateProducts(Set<Product> products) {
		if (addDisjuctionBetweenFeatureOWLClasses()) {
			for (Product product : products) {
				buildOntologyFromProduct(product);
			}
		} else {
			System.out.println("////TODO: Ainda tenho que implementar a verificação de produto como subconjunto de indivíduos.");
		}
		
		
	}
	
	private void buildOntology(ProductFeature productFeature) {

		OWLIndividual currentFeatureOwl = feaToOntoFixtureUtils.createNewOWLNamedIndividual(productFeature, owlOracle);
		feaToOntoFixtureUtils.addProductFeatureClassification(productFeature, currentFeatureOwl);
		
		ProductFeature fatherProductFeature = productFeature.getFatherProductFeature();
		if (fatherProductFeature != null) {
			OWLIndividual currentFatherFeatureOwl = null;
			String fatherId = fatherProductFeature.getId();
			
			if (owlOracle.containsKey(fatherId)) {
				currentFatherFeatureOwl = owlOracle.get(fatherId);
			} else {
				//TODO Acho que esse código está errado, pois não há classificação da feature nesse ponto. Verificar se esse pedaço de código é chamado. Se for, ver o comportamento.
				currentFatherFeatureOwl = feaToOntoFixtureUtils.createNewOWLNamedIndividual(fatherProductFeature, owlOracle);
			}
			feaToOntoFixtureUtils.addParentalRelationBetweenProductFeatures(currentFeatureOwl, currentFatherFeatureOwl);
		}
		
		Set<ProductAttribute> attributes = productFeature.getProductAttribute();

		OWLIndividual currentAttributeOwl;
		for (ProductAttribute attribute : attributes) {
			currentAttributeOwl = feaToOntoFixtureUtils.createNewOWLNamedIndividual(attribute, owlOracle);
			feaToOntoFixtureUtils.addProductAttributeClassification(currentAttributeOwl);
			feaToOntoFixtureUtils.addParentalRelationBetweenProductFeatureAndProductAttribute(currentFeatureOwl, currentAttributeOwl);
		}
		
		Set<ProductFeature> childrenFeatures = productFeature.getChildProductFeature();
		if (!childrenFeatures.isEmpty()) {
			for (ProductFeature childFeature : childrenFeatures) {
				buildOntology(childFeature);
			}
		} else {
			return;
		}
		
	}

	private void buildOntology(ContextRule contextRule) {
	
		OWLIndividual currentContextRuleOWL = feaToOntoFixtureUtils.createNewOWLNamedIndividual(contextRule, owlOracle);
		feaToOntoFixtureUtils.addContextRuleClassification(currentContextRuleOWL);
		
		Event event = contextRule.getEvent();
		OWLIndividual currentEventOWL = feaToOntoFixtureUtils.createNewOWLNamedIndividual(event, owlOracle);
		feaToOntoFixtureUtils.addEventClassification(event, currentEventOWL);
		buildOntology(event, currentEventOWL);
		feaToOntoFixtureUtils.addParentalRelationBetweenContextRuleAndEvent(currentContextRuleOWL, currentEventOWL);
		
		
		Action action = contextRule.getAction();
		OWLIndividual currentActionOWL = feaToOntoFixtureUtils.createNewOWLNamedIndividual(action, owlOracle);
		feaToOntoFixtureUtils.addActionClassification(action, currentActionOWL);
		buildOntology(action, currentActionOWL);
		feaToOntoFixtureUtils.addParentalRelationBetweenContextRuleAndAction(currentContextRuleOWL, currentActionOWL);
		
	}

	protected abstract void buildOntology(Action action, OWLIndividual currentActionOWL);

	private void buildOntology(Event event, OWLIndividual currentEventOWL) {
		if (event.isLogicalEvent()) {
			LogicalEvent logicalEvent = (LogicalEvent) event;
			
			Event leftSideEvent = logicalEvent.getLeftSideEvent();
			OWLIndividual currentLeftSideEvent = feaToOntoFixtureUtils.createNewOWLNamedIndividual(leftSideEvent, owlOracle);
			feaToOntoFixtureUtils.addParentalRelationBetweenEventAndLeftSideEvent(currentEventOWL, currentLeftSideEvent);
			
			Event rightSideEvent = logicalEvent.getRightSideEvent();
			OWLIndividual currentRightSideEvent = feaToOntoFixtureUtils.createNewOWLNamedIndividual(rightSideEvent, owlOracle);
			feaToOntoFixtureUtils.addParentalRelationBetweenEventAndRightSideEvent(currentEventOWL, currentRightSideEvent);
			
			buildOntology(leftSideEvent, currentLeftSideEvent);
			buildOntology(rightSideEvent, currentRightSideEvent);
			
			LogicalOperator logicalOperator = logicalEvent.getLogicalOperator();
			feaToOntoFixtureUtils.addLogicalOperatorLogicalEventRelation(currentEventOWL, logicalOperator.getValue());
		} else if (event.isRelationalEvent()) {
			RelationalEvent relationalEvent = (RelationalEvent) event;
			
			feaToOntoFixtureUtils.addRelationBetweenRelationalEventAndContextVariable(currentEventOWL, owlOracle.get(relationalEvent.getContextVariable().getId()));
			feaToOntoFixtureUtils.addRelationalOperatorRelationalEventRelation(currentEventOWL, relationalEvent.getRelationalOperator().getValue());
			feaToOntoFixtureUtils.addValueRelationalEventRelation(currentEventOWL, relationalEvent.getValue());
		} else {
			throw new RuntimeException("Event error");
		}
	}

	private void buildOntology(CompositionRule compositionRule) {
		OWLIndividual currentCompositionRuleOWL = feaToOntoFixtureUtils.createNewOWLNamedIndividual(compositionRule, owlOracle);
		feaToOntoFixtureUtils.addCompositionRuleClassification(currentCompositionRuleOWL);
		
		Antecedent antecedent = compositionRule.getAntecedent();
		OWLIndividual currentAntecedentRuleOWL = feaToOntoFixtureUtils.createNewOWLNamedIndividual(antecedent, owlOracle);
		feaToOntoFixtureUtils.addAntecedentClassification(antecedent, currentAntecedentRuleOWL);
		buildOntology(antecedent, currentAntecedentRuleOWL);
		feaToOntoFixtureUtils.addParentalRelationBetweenCompositionRuleAndAntecedent(currentCompositionRuleOWL, currentAntecedentRuleOWL);
		
		
		Antecedent consequent = compositionRule.getConsequent();
		OWLIndividual currentConsequentRuleOWL = feaToOntoFixtureUtils.createNewOWLNamedIndividual(consequent, owlOracle);
		feaToOntoFixtureUtils.addAntecedentClassification(consequent, currentConsequentRuleOWL);
		buildOntology(consequent, currentAntecedentRuleOWL);
		feaToOntoFixtureUtils.addParentalRelationBetweenCompositionRuleAndConsequent(currentCompositionRuleOWL, currentConsequentRuleOWL);
	}

	protected abstract void buildOntology(Antecedent antecedent, OWLIndividual currentAntecedentRuleOWL);

	private void buildOntology(ContextRoot contextRoot) {
		OWLIndividual currentContextRootOWL = feaToOntoFixtureUtils.createNewOWLNamedIndividual(contextRoot, owlOracle);
		feaToOntoFixtureUtils.addContextRootClassification(currentContextRootOWL);
		
		OWLIndividual currentContextEntityOWL;
		OWLIndividual currentContextInfoOWL;
		for (ContextEntity contextEntity : contextRoot.getContextEntities()) {
			currentContextEntityOWL = feaToOntoFixtureUtils.createNewOWLNamedIndividual(contextEntity, owlOracle);
			feaToOntoFixtureUtils.addContextEntityClassification(currentContextEntityOWL);
			feaToOntoFixtureUtils.addParentalRelationBetweenContextRootAndEntity(currentContextRootOWL, currentContextEntityOWL);
			
			for (ContextInfo contextInfo : contextEntity.getContextInfos()) {
				currentContextInfoOWL = feaToOntoFixtureUtils.createNewOWLNamedIndividual(contextInfo, owlOracle);
				feaToOntoFixtureUtils.addContextInfoClassification(currentContextInfoOWL);
				feaToOntoFixtureUtils.addParentalRelationBetweenContextEntityAndInfo(currentContextEntityOWL, currentContextInfoOWL);
			}
			
		}
		
	}

	protected abstract void buildOntology(Feature feature);
	
	/**
	 *
	 * This element is for plugin use
	 * 
	 * @return
	 */
	public SPLConceptFactory getSplConceptFactory() {
		return SPLConceptFactory.getFactory();
	}

	public Map<String, Nameable> getOracle() {
		return fixtureOracle;
	}
	
	public Nameable getElementById(String id) {
		Nameable element = getOracle().get(id);
		return element;
	}
	
	public void addToFixtureOracle(Nameable nameable) {
		String id = nameable.getId();
		if (!fixtureOracle.containsKey(id)) {
			fixtureOracle.put(id, nameable);
		} else {
			throw new RuntimeException("Problema ao adicionar um elemento ao oráculo.");
		}
	}

	protected abstract boolean addDisjuctionBetweenFeatureOWLClasses();
	
}

