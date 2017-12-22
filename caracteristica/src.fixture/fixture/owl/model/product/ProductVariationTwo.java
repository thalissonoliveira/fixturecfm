package fixture.owl.model.product;

import fixture.owl.model.enumeration.MaximalCardinality;
import fixture.owl.model.intefaces.Element;

public class ProductVariationTwo extends ProductFeature {

	private Element originalElement;
	
	private MaximalCardinality maximalCardinality;
	
	public ProductVariationTwo() {
		super();
	}

	public ProductVariationTwo(String id, String name) {
		super(id, name);
	}

	//
	public Element getOriginalElement() {
		return originalElement;
	}

	public void setOriginalElement(Element originalElement) {
		this.originalElement = originalElement;
	}

	public MaximalCardinality getMaximalCardinality() {
		return maximalCardinality;
	}

	public void setMaximalCardinality(MaximalCardinality maximalCardinality) {
		this.maximalCardinality = maximalCardinality;
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
		return true;
	}

	
	public boolean isProductVariant() {
		return false;
	}

	
	public boolean isProductVariation() {
		return false;
	}
	
	
	public boolean isProductGroupedFeature() {
		return false;
	}

} // VariacaoDoisProduto
