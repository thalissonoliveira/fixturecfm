package fixture.owl.model.product;

public class ProductMandatoryFeature extends ProductFeature {
	
	
	public ProductMandatoryFeature() {
		super();
	}

	public ProductMandatoryFeature(String id, String name) {
		super(id, name);
	}

	
	public boolean isProduct() {
		return false;
	}

	
	public boolean isProductAttribute() {
		return false;
	}

	
	public boolean isProductMandatoryFeature() {
		return true;
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
	
} // CaracteristicaMandatoriaProduto
