package fixture.owl.model.product;

import java.util.HashSet;
import java.util.Set;

import fixture.owl.model.intefaces.Element;


public class ProductVariation implements ProductElement {
	
	private String name;
	private String id;
	private Element originalElement;
	private int minimumCardinality;
	private int maximalCardinality;
	private Set<ProductVariation> productVariations;
	private ProductFeature fatherProductFeature;
	
	public ProductVariation() {
		super();
		productVariations = new  HashSet<ProductVariation>();
	}
	
	public ProductVariation(String id, String name) {
		this();
		this.id = id;
		this.name = name;
	}
	
	//
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Element getOriginalElement() {
		return originalElement;
	}

	public void setOriginalElement(Element originalElement) {
		this.originalElement = originalElement;
	}

	public int getMinimumCardinality() {
		return minimumCardinality;
	}

	public void setMinimumCardinality(int minimumCardinality) {
		this.minimumCardinality = minimumCardinality;
	}

	public int getMaximalCardinality() {
		return maximalCardinality;
	}

	public void setMaximalCardinality(int maximalCardinality) {
		this.maximalCardinality = maximalCardinality;
	}

	public Set<ProductVariation> getProductVariations() {
		return productVariations;
	}

	public void setProductVariations(Set<ProductVariation> productVariations) {
		this.productVariations = productVariations;
	}

	public ProductFeature getFatherProductFeature() {
		return fatherProductFeature;
	}

	public void setFatherProductFeature(ProductFeature fatherProductFeature) {
		this.fatherProductFeature = fatherProductFeature;
	}
	
	
	public boolean isProduct() {
		return false;
	}

	
	public boolean isProductAttribute() {
		return false;
	}

	
	public boolean isProductMandatoryFeature() {
		return false;
	}

	
	public boolean isProductOptionalFeature() {
		return false;
	}

	
	public boolean isProductVariationTwoFeature() {
		return false;
	}

	
	public boolean isProductVariant() {
		return false;
	}

	
	public boolean isProductVariation() {
		return true;
	}
	
	
	public boolean isProductGroupedFeature() {
		return false;
	}
	
} // VariacaoProduto
