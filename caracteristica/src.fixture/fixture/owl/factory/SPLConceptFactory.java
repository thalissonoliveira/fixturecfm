package fixture.owl.factory;

import fixture.owl.model.SPL;
import fixture.owl.model.element.Attribute;
import fixture.owl.model.element.ContextEntity;
import fixture.owl.model.element.ContextInfo;
import fixture.owl.model.element.ContextRoot;
import fixture.owl.model.element.GroupedFeature;
import fixture.owl.model.element.MandatoryFeature;
import fixture.owl.model.element.OptionalFeature;
import fixture.owl.model.element.RootFeature;
import fixture.owl.model.element.VariationTwo;
import fixture.owl.model.externalelement.TestCase;
import fixture.owl.model.externalelement.UseCase;
import fixture.owl.model.product.Product;
import fixture.owl.model.product.ProductAttribute;
import fixture.owl.model.product.ProductGroupedFeature;
import fixture.owl.model.product.ProductMandatoryFeature;
import fixture.owl.model.product.ProductOptionalFeature;
import fixture.owl.model.product.ProductVariant;
import fixture.owl.model.product.ProductVariation;
import fixture.owl.model.product.ProductVariationTwo;
import fixture.owl.model.rule.ActionLiteral;
import fixture.owl.model.rule.CompositionLiteral;
import fixture.owl.model.rule.CompositionRule;
import fixture.owl.model.rule.ContextRule;
import fixture.owl.model.rule.Designate;
import fixture.owl.model.rule.LogicalAction;
import fixture.owl.model.rule.LogicalEvent;
import fixture.owl.model.rule.LogicalExpression;
import fixture.owl.model.rule.RelationalEvent;
import fixture.owl.model.rule.RelationalExpression;

/**
 * 
 * Singleton class to instantiate elements related to SPL, including SPL itself. 
 * 
 * @author thalissonoliveira
 *
 */
public class SPLConceptFactory {
	
	private static SPLConceptFactory factory;
	
	
	
	private SPLConceptFactory() {}
	
	public static SPLConceptFactory getFactory() {
		if (factory == null) {
			factory = new SPLConceptFactory();
		}
		return factory;
	}

	public SPL createSpl(String id, String name) {
		return new SPL(id, name);
	}
	
	public MandatoryFeature createMandatoryFeature(String id, String name) {
		return new MandatoryFeature(id, name);
	}
	
	public OptionalFeature createOptionalFeature(String id, String name) {
		return new OptionalFeature(id, name);
	}
	
	public RootFeature createRootFeature(String id, String name) {
		return new RootFeature(id, name);
	}
	
	public VariationTwo createVariationTwo(String id, String name) {
		return new VariationTwo(id, name);
	}
	
	
	public VariationTwo createVariationTwo(String id, String name, Integer maximalCardinality, Integer minimalCardinalityOr, Integer maximalCardinalityOr) {
		return new VariationTwo(id, name, maximalCardinality, minimalCardinalityOr, maximalCardinalityOr);
	}
	
	public GroupedFeature createGroupedFeature(String id, String name) {
		return new GroupedFeature(id, name);
	}
	
	public Attribute createAttribute(String id, String name) {
		return new Attribute(id, name);
	}
	
	public ContextRoot createContextRoot(String id, String name) {
		return new ContextRoot(id, name);
	}
	
	public ContextEntity createContextEntity(String id, String name) {
		return new ContextEntity(id, name);
	}
	
	public ContextInfo createContextInfo(String id, String name) {
		return new ContextInfo(id, name);
	}
	
	public CompositionRule createCompositionRule(String id, String name) {
		return new CompositionRule(id, name);
	}
	
	public ContextRule createContextRule(String id, String name) {
		return new ContextRule(id, name);
	}
	
	public LogicalExpression createLogicalExpression(String id, String name) {
		return new LogicalExpression(id, name);
	}
	
	
	public CompositionLiteral createCompositionLiteral(String id, String name) {
		return new CompositionLiteral(id, name);
	}
	
	public RelationalExpression createRelationalExpression(String id, String name) {
		return new RelationalExpression(id, name);
	}
	
	public LogicalEvent createLogicalEvent(String id, String name) {
		return new LogicalEvent(id, name);
	}
	
	public RelationalEvent createRelationalEvent(String id, String name) {
		return new RelationalEvent(id, name);
	}
	
	public LogicalAction createLogicalAction(String id, String name) {
		return new LogicalAction(id, name);
	}
	
	public ActionLiteral createActionLiteral(String id, String name) {
		return new ActionLiteral(id, name);
	}
	
	public Designate createDesignate(String id, String name) {
		return new Designate(id, name);
	}
	

	public Product createProduct(String id, String name) {
		return new Product(id, name);
	}
	
	public ProductMandatoryFeature createProductMandatoryFeature(String id, String name) {
		return new ProductMandatoryFeature(id, name);
	}
	
	public ProductOptionalFeature createProductOptionalFeature(String id, String name) {
		return new ProductOptionalFeature(id, name);
	}
	
	public ProductVariationTwo createProductVariationTwo(String id, String name) {
		return new ProductVariationTwo(id, name);
	}
	
	public ProductGroupedFeature createProductGroupedFeature(String id, String name) {
		return new ProductGroupedFeature(id, name);
	}
	
	public ProductVariation createProductVariation(String id, String name) {
		return new ProductVariation(id, name);
	}
	
	public ProductVariant createProductVariant(String id, String name) {
		return new ProductVariant(id, name);
	}
	
	public ProductAttribute createProductAttribute(String id, String name) {
		return new ProductAttribute(id, name);
	}
	
	public UseCase createUseCase(String id, String name) {
		return new UseCase(id, name);
	}
	
	public TestCase createTestCase(String id, String name) {
		return new TestCase(id, name);
	}
	
}

