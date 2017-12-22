package fixture.owl.model.element;

import fixture.owl.model.enumeration.ValueType;

public class Attribute extends ElementImpl {
	
	private Feature fatherFeature;
	private ValueType valueType;

	public Attribute() {
		super();
	}
	
	public Attribute(String id, String name) {
		super.setId(id);
		super.setName(name);
	}

	public boolean isMandatoryFeature() {
		return false;
	}
	
	public boolean isOptionalFeature() {
		return false;
	}

	public boolean isVariatioTwoFeature() {
		return false;
	}

	public boolean isRootFeature() {
		return false;
	}
	
	public boolean isAttribute() {
		return true;
	}
	
	public boolean isContextRoot() {
		return false;
	}

	public boolean isGroupedFeature() {
		return false;
	}
	
	public Feature getFatherFeature() {
		return fatherFeature;
	}

	public void setFatherFeature(Feature fatherFeature) {
		this.fatherFeature = fatherFeature;
	}

	public ValueType getValueType() {
		return valueType;
	}

	public void setValueType(ValueType valueType) {
		this.valueType = valueType;
	}
	
	
} // Atributo
