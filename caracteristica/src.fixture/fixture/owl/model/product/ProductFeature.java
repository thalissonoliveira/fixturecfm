package fixture.owl.model.product;

import java.util.HashSet;
import java.util.Set;

import fixture.owl.model.intefaces.Element;

public abstract class ProductFeature implements ProductElement {
	
	private String name;
	
	private String id;
	
	private Element originalElement;

	private ProductFeature fatherProductFeature;
	
	private Set<ProductFeature> childProductFeature;
	
	private Set<ProductAttribute> productAttribute;
	
	//
	public ProductFeature() {
		childProductFeature = new HashSet<ProductFeature>();
		productAttribute = new HashSet<ProductAttribute>();
	}
	
	
	public ProductFeature(String id, String name) {
		this();
		this.id = id;
		this.name = name;
	}
	
	public void addChild(ProductFeature productFeature) {
		this.getChildProductFeature().add(productFeature);
		productFeature.setFatherProductFeature(this);
	}
	
	public void addAttribute(ProductAttribute productAttribute) {
		this.getProductAttribute().add(productAttribute);
		productAttribute.setFatherProductFeature(this);
	}
	
	//Gets e Sets
	
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

	public ProductFeature getFatherProductFeature() {
		return fatherProductFeature;
	}

	public void setFatherProductFeature(ProductFeature fatherProductFeature) {
		this.fatherProductFeature = fatherProductFeature;
	}


	public Set<ProductFeature> getChildProductFeature() {
		return childProductFeature;
	}

	public void setChildProductFeature(Set<ProductFeature> childProductFeature) {
		this.childProductFeature = childProductFeature;
	}


	public Set<ProductAttribute> getProductAttribute() {
		return productAttribute;
	}


	public void setProductAttribute(Set<ProductAttribute> productAttribute) {
		this.productAttribute = productAttribute;
	}
	
} // CaracteristicaProduto
