package fixture.owl.model.product;


public class ProductOptionalFeature extends ProductFeature {
	
	public ProductOptionalFeature() {
		super();
	}

	public ProductOptionalFeature(String id, String name) {
		super(id, name);
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
		return true;
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
	
} // CaracteristicaOpcionalProduto
