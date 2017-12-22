package fixture.owl.model.product;

import fixture.owl.model.element.RootFeature;


public class Product extends ProductFeature {
	
	private RootFeature productLine;
	
	public Product() {
		super();
	}

	public Product(String id, String name) {
		super(id, name);
	}

	public RootFeature getProductLine() {
		return productLine;
	}

	public void setProductLine(RootFeature productLine) {
		this.productLine = productLine;
	}

	
	public boolean isProduct() {
		return true;
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
		return false;
	}
	
	
	public boolean isProductGroupedFeature() {
		return false;
	}
	
} // Produto
