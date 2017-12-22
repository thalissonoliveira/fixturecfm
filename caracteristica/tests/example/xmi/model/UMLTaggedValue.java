package example.xmi.model;

public class UMLTaggedValue implements XMIModel {
	
	private String xmiId;
	private String name;
	private boolean isSpecification;

	private UMLTaggedValueDataValue dataValue;
	
	public String getXmiId() {
		return xmiId;
	}

	public void setXmiId(String xmiId) {
		this.xmiId = xmiId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean isSpecification() {
		return isSpecification;
	}

	public void setSpecification(boolean isSpecification) {
		this.isSpecification = isSpecification;
	}

	public UMLTaggedValueDataValue getDataValue() {
		return dataValue;
	}

	public void setDataValue(UMLTaggedValueDataValue dataValue) {
		this.dataValue = dataValue;
	}
	
	
	public boolean isUmlModelElementTaggedValue() {
		return false;
	}

	
	public boolean isUmlNode() {
		return false;
	}

	
	public boolean isUmlTaggedValue() {
		return true;
	}

	
	public boolean isUmlTaggedValueDataValue() {
		return false;
	}

	
	public boolean isXmi() {
		return false;
	}

	
	public boolean isXmiContent() {
		return false;
	}

}
