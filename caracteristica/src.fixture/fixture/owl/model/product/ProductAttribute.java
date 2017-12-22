package fixture.owl.model.product;

import fixture.owl.model.enumeration.ValueType;
import fixture.owl.model.intefaces.Element;

//TODO Verificar mistura de português com inglês.
public class ProductAttribute implements ProductElement {

	private String name;
	
	private String id;
	
	private Element originalElement;

	private String value;
	
	private ValueType valueType;
	
	private ProductFeature fatherProductFeature;
	
	
	public ProductAttribute() {
		super();
	}
	
	public ProductAttribute(String id, String name) {
		this();
		this.id = id;
		this.name = name;
	}
	
	
	public void setValueType(int tv) {
		ValueType type = ValueType.get(tv);
		setValueType(type);
	}

	//G 'n S
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
	
	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public ValueType getValueType() {
		return valueType;
	}

	public void setValueType(ValueType valueType) {
		this.valueType = valueType;
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
		return true;
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

} // AtributoProduto
