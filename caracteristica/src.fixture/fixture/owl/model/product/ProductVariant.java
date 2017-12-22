package fixture.owl.model.product;

import fixture.owl.model.intefaces.Element;


public class ProductVariant implements ProductElement {
	
	private String name;
	
	private String id;

	private Element originalElement;

	private ProductVariation fatherProductVariation;
	
	private boolean selected;
	
	public ProductVariant() {
		super();
	}
	
	public ProductVariant(String id, String name) {
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

	public ProductVariation getFatherProductVariation() {
		return fatherProductVariation;
	}

	public void setFatherProductVariation(ProductVariation fatherProductVariation) {
		this.fatherProductVariation = fatherProductVariation;
	}
	
	public boolean isSelected() {
		return selected;
	}

	public void setSelected(boolean selected) {
		this.selected = selected;
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
		return true;
	}

	
	public boolean isProductVariation() {
		return false;
	}
	
	
	public boolean isProductGroupedFeature() {
		return false;
	}
	
} // VarianteProduto
