package fixture.owl.model.product;


public class ProductGroupedFeature extends ProductFeature {

	
	public ProductGroupedFeature() {
		super();
	}

	public ProductGroupedFeature(String id, String name) {
		super(id, name);
	}

	//
	
	
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
		return false;
	}
	
	
	public boolean isProductGroupedFeature() {
		return true;
	}

} // VariacaoDoisProduto
