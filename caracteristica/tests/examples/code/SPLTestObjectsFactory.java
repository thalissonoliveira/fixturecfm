package examples.code;

import fixture.owl.model.SPL;
import fixture.owl.model.element.Attribute;
import fixture.owl.model.element.ContextEntity;
import fixture.owl.model.element.ContextInfo;
import fixture.owl.model.element.ContextRoot;
import fixture.owl.model.element.Feature;
import fixture.owl.model.element.GroupedFeature;
import fixture.owl.model.element.MandatoryFeature;
import fixture.owl.model.element.OptionalFeature;
import fixture.owl.model.element.RootFeature;
import fixture.owl.model.element.VariationTwo;
import fixture.owl.model.enumeration.MaximalCardinality;
import fixture.owl.model.enumeration.Presence;
import fixture.owl.model.enumeration.RelationalOperator;
import fixture.owl.model.enumeration.ValueType;
import fixture.owl.model.product.Product;
import fixture.owl.model.product.ProductMandatoryFeature;
import fixture.owl.model.product.ProductOptionalFeature;
import fixture.owl.model.product.ProductVariationTwo;
import fixture.owl.model.rule.ActionLiteral;
import fixture.owl.model.rule.CompositionLiteral;
import fixture.owl.model.rule.CompositionRule;
import fixture.owl.model.rule.ContextRule;
import fixture.owl.model.rule.RelationalEvent;
import fixture.owl.parser.ParserFeaToOntoFixture;
import fixture.owl.utils.Utils;

public class SPLTestObjectsFactory {

	
	public static void inserirFeaturesAndCompositionRuleNaLPS(SPL spl) {
		
		
		Attribute attribute = new Attribute("1","ATT1");
		attribute.setValueType(ValueType.TBOOLEAN);
		
		Attribute attribute2 = new Attribute("2","ATT1");
		attribute2.setValueType(ValueType.TINTEGER);
		
		Attribute attribute3 = new Attribute("3","ATT2");
		attribute3.setValueType(ValueType.TINTEGER);
		
		Attribute attribute4 = new Attribute("4","ATT2");
		attribute4.setValueType(ValueType.TINTEGER);
		
		Feature f1 = new RootFeature("5","RF");
		
		Feature f2 = new VariationTwo("6","VT1");
		f2.addAttribute(attribute);
//		f2.addAttribute(attribute2);
		
		Feature f3 = new MandatoryFeature("@elementos.0","MF");
//		f3.addAttribute(attribute3);
//		f3.addAttribute(attribute4);
		
		Feature f4 = new OptionalFeature("@elementos.0.8","OF1");
		Feature f5 = new OptionalFeature("9","OF2");
		Feature f6 = new OptionalFeature("@elementos.010","OF3");
		Feature f7 = new OptionalFeature("11","OF3");
		
		Feature f8 = new VariationTwo("12","VT2");
		Feature f9 = new GroupedFeature("13","GF1");
		Feature f10 = new GroupedFeature("14","GF2");
		Feature f11 = new GroupedFeature("15","GF3");
		
		Feature f12 = new MandatoryFeature("16","MF10");
		
		f1.addChild(f3);
		f1.addChild(f2);
		
		f3.addChild(f6);
		
		f2.addChild(f4);
		f2.addChild(f5);
		
		f4.addChild(f7);
		
		f7.addChild(f8);
		
		f8.addChild(f9);
		f8.addChild(f10);
		f8.addChild(f11);
		
		f4.addChild(f12);
		
		spl.setSystem((RootFeature) f1);
		spl.addElement(f1);
		spl.addElement(f2);
		spl.addElement(f3);
		spl.addElement(f4);
		spl.addElement(f5);
		spl.addElement(f6);
		spl.addElement(f7);
		spl.addElement(f8);
		spl.addElement(f9);
		spl.addElement(f10);
		spl.addElement(f11);
		spl.addElement(f12);
		
		
		CompositionLiteral antecedent = new CompositionLiteral("21","Literal Composição");
		antecedent.setPresence(Presence.PRESENTE);
		antecedent.setFeaturedElement(f4);
		
		CompositionLiteral consequent = new CompositionLiteral("22","Literal Composiçao 2");
		consequent.setPresence(Presence.AUSENTE);
		consequent.setFeaturedElement(f11);
		
		CompositionRule compositionRule = new CompositionRule("23","Regra de Composicao 1");
		
		compositionRule.setAntecedent(antecedent);
		compositionRule.setConsequent(consequent);
		
		spl.getRules().add(compositionRule);
		
	}
	
	public static void inserirFeaturesAndCompositionRuleNaLPSNewParser(SPL spl, ParserFeaToOntoFixture parserFeaToOntoFixture) {
		
		//####################### FEATURES ########################################
		
		Feature f1 = new RootFeature("@elementos.1","RF");
		
		Feature f2 = new MandatoryFeature("@elementos.2","MF1");
		
		Feature f3 = new OptionalFeature("@elementos.3","OF1");
		
		Feature f4 = new VariationTwo("@elementos.4","VT1");
		Feature f5 = new VariationTwo("@elementos.5","VT2");
		
		Feature f6 = new OptionalFeature("@elementos.6","OF2");
		
		Feature f7 = new GroupedFeature("@elementos.7","GF1");
		Feature f8 = new GroupedFeature("@elementos.8","GF2");
		Feature f9 = new GroupedFeature("@elementos.9","GF3");
		Feature f10 = new GroupedFeature("@elementos.10","GF4");
		Feature f11 = new GroupedFeature("@elementos.11","GF5");
		
		((VariationTwo) f4).setOrMininalCardinality(1);
		((VariationTwo) f4).setOrMaximalCardinality(1);
		
		((VariationTwo) f5).setOrMininalCardinality(1);
		((VariationTwo) f5).setOrMaximalCardinality(1);
		
		
		f1.addChild(f2);
		f1.addChild(f3);
		
		f3.addChild(f6);
		
		f2.addChild(f4);
		f2.addChild(f5);
		
		f4.addChild(f7);
		f4.addChild(f8);
		
		f5.addChild(f9);
		f5.addChild(f10);
		f5.addChild(f11);
		
		
		spl.setSystem((RootFeature) f1);
		spl.addElement(f1);
		spl.addElement(f2);
		spl.addElement(f3);
		spl.addElement(f4);
		spl.addElement(f5);
		spl.addElement(f6);
		spl.addElement(f7);
		spl.addElement(f8);
		spl.addElement(f9);
		spl.addElement(f10);
		spl.addElement(f11);
		

		//####################### CONTEXT ROOT ####################################
		
		ContextRoot contextRoot = new ContextRoot("@contextroot","Context Root");
		
		ContextEntity contextEntity = new ContextEntity("@entity", "Context Entity");
		contextEntity.setFatherContextRoot(contextRoot);
		contextRoot.getContextEntities().add(contextEntity);
		
		ContextInfo contextInfo = new ContextInfo("@info", "Context Info");
		contextInfo.setFatherContextEntity(contextEntity);
		contextEntity.getContextInfos().add(contextInfo);
		
		spl.addElement(contextRoot);
		spl.addElement(contextEntity);
		spl.addElement(contextInfo);
		
		//######################## COMPOSITION RULE ################################
		
		CompositionLiteral antecedent = new CompositionLiteral("@elementos.21","Literal Composição");
		antecedent.setPresence(Presence.PRESENTE);
		antecedent.setFeaturedElement(f4);
		
		CompositionLiteral consequent = new CompositionLiteral("@elementos.22","Literal Composiçao 2");
		consequent.setPresence(Presence.AUSENTE);
		consequent.setFeaturedElement(f11);
		
		CompositionRule compositionRule = new CompositionRule("@elementos.23","Regra de Composicao 1");
		compositionRule.setAntecedent(antecedent);
		compositionRule.setConsequent(consequent);
		
		//######################## CONTEXT RULE #####################################
		
		ActionLiteral actionLiteral = new ActionLiteral("@action1", "Action 1");
		actionLiteral.setFeaturedElement((GroupedFeature)f11);
		actionLiteral.setPresence(Presence.AUSENTE);
		
		RelationalEvent relationalEvent = new RelationalEvent("@event", "Event");
		relationalEvent.setContextVariable(contextInfo);
		relationalEvent.setRelationalOperator(RelationalOperator.IGUAL);
		relationalEvent.setValue("2");
		
		ContextRule contextRule = new ContextRule("@rule.2", "Context Rule");
		contextRule.setEvent(relationalEvent);
		contextRule.setAction(actionLiteral);
		
		spl.addRule(compositionRule);
		spl.addRule(contextRule);
		
		//###############################  PRODUCTS ####################################
		
		Product p = new Product("@prod.1", "RF");
		
		ProductMandatoryFeature m = new ProductMandatoryFeature("@prodele.1", "MF1");
		ProductOptionalFeature m1 = new ProductOptionalFeature("@prodele.2", "OF1");
		ProductVariationTwo m2 = new ProductVariationTwo("@prodele.3", "VT1");
		ProductVariationTwo m3 = new ProductVariationTwo("@prodele.4", "VT2");
		ProductOptionalFeature m4 = new ProductOptionalFeature("@prodele.5", "OF2");
		
		
		p.setOriginalElement(f1);
		m.setOriginalElement(f2);
		m1.setOriginalElement(f3);
		m2.setOriginalElement(f4);
		m2.setMaximalCardinality(MaximalCardinality.OR);
		m3.setOriginalElement(f5);
		m3.setMaximalCardinality(MaximalCardinality.OR);
		m4.setOriginalElement(f6);
		

		
		p.addChild(m);
		p.addChild(m1);
		
		m1.addChild(m2);
		m1.addChild(m3);
		
		m2.addChild(m4);
		
		spl.addProduct(p);
		spl.addProductElement(m);
		spl.addProductElement(m1);
		spl.addProductElement(m2);
		spl.addProductElement(m3);
		
		//###########################################################################
		
		parserFeaToOntoFixture.addToFixtureOracle(f1);
		parserFeaToOntoFixture.addToFixtureOracle(f2);
		parserFeaToOntoFixture.addToFixtureOracle(f3);
		parserFeaToOntoFixture.addToFixtureOracle(f4);
		parserFeaToOntoFixture.addToFixtureOracle(f5);
		parserFeaToOntoFixture.addToFixtureOracle(f6);
		parserFeaToOntoFixture.addToFixtureOracle(f7);
		parserFeaToOntoFixture.addToFixtureOracle(f8);
		parserFeaToOntoFixture.addToFixtureOracle(f9);
		parserFeaToOntoFixture.addToFixtureOracle(f10);
		parserFeaToOntoFixture.addToFixtureOracle(f11);
		
		parserFeaToOntoFixture.addToFixtureOracle(contextRoot);
		parserFeaToOntoFixture.addToFixtureOracle(contextEntity);
		parserFeaToOntoFixture.addToFixtureOracle(contextInfo);
		parserFeaToOntoFixture.addToFixtureOracle(antecedent);
		parserFeaToOntoFixture.addToFixtureOracle(consequent);
		parserFeaToOntoFixture.addToFixtureOracle(compositionRule);
		parserFeaToOntoFixture.addToFixtureOracle(actionLiteral);
		parserFeaToOntoFixture.addToFixtureOracle(relationalEvent);
		parserFeaToOntoFixture.addToFixtureOracle(contextRule);
		
		parserFeaToOntoFixture.addToFixtureOracle(p);
		parserFeaToOntoFixture.addToFixtureOracle(m);
		parserFeaToOntoFixture.addToFixtureOracle(m1);
		parserFeaToOntoFixture.addToFixtureOracle(m2);
		parserFeaToOntoFixture.addToFixtureOracle(m3);
		parserFeaToOntoFixture.addToFixtureOracle(m4);
		
		
	}
	
	public static void main(String[] args) {
		
		SPL spl = new SPL("SPL", "SPL");
		spl.setSystem(new RootFeature("HAH", "HIEHISAF"));
		
		Product p = new Product("2", "Produto");
		
		ProductMandatoryFeature m = new ProductMandatoryFeature("3", "m");
		ProductMandatoryFeature m1 = new ProductMandatoryFeature("4", "m1");
		ProductMandatoryFeature m2 = new ProductMandatoryFeature("5", "m2");
		ProductMandatoryFeature m3 = new ProductMandatoryFeature("6", "m3");
		ProductMandatoryFeature m4 = new ProductMandatoryFeature("7", "m4");
		
		p.addChild(m);
		p.addChild(m1);
		
		m1.addChild(m2);
		m1.addChild(m3);
		
		m2.addChild(m4);
		
		spl.addProduct(p);
		spl.addProductElement(m);
		spl.addProductElement(m1);
		spl.addProductElement(m2);
		spl.addProductElement(m3);
		
		Utils.printSPLInfo(spl);
		
	}

}
