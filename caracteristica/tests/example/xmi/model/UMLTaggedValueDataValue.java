package example.xmi.model;

public class UMLTaggedValueDataValue implements XMIModel {
	
	private String value;

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}
	
	
	public boolean isUmlModelElementTaggedValue() {
		return false;
	}

	
	public boolean isUmlNode() {
		return false;
	}

	
	public boolean isUmlTaggedValue() {
		return false;
	}

	
	public boolean isUmlTaggedValueDataValue() {
		return true;
	}

	
	public boolean isXmi() {
		return false;
	}

	
	public boolean isXmiContent() {
		return false;
	}

}
