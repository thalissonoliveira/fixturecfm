package fixture.owl.model.rule;

import fixture.owl.model.element.Attribute;
import fixture.owl.model.enumeration.ValueType;

public class Designate extends Action {
	
	private Attribute attribute;
	
	private ValueType valueType;
	
	private String value;
	
	public Designate() {
		super();
	}

	public Designate(String id, String name) {
		super(id, name);
	}
	
	public void setValueType(int valueType) {
		this.valueType = ValueType.get(valueType);
	}

	public Attribute getAttribute() {
		return attribute;
	}

	public void setAttribute(Attribute attribute) {
		this.attribute = attribute;
	}

	public ValueType getValueType() {
		return valueType;
	}

	public void setValueType(ValueType valueType) {
		this.valueType = valueType;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}
	
	
	public boolean isActionLiteral() {
		return false;
	}

	
	public boolean isDesignate() {
		return true;
	}

	
	public boolean isLogicalAction() {
		return false;
	}


} // Designar
