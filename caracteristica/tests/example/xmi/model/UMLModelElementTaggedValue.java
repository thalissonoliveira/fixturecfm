package example.xmi.model;

import java.util.HashSet;
import java.util.Set;

public class UMLModelElementTaggedValue implements XMIModel {

	private Set<UMLTaggedValue> taggedValues;

	public UMLModelElementTaggedValue() {
		taggedValues = new HashSet<UMLTaggedValue>();
	}

	public Set<UMLTaggedValue> getTaggedValues() {
		return taggedValues;
	}

	public void setTaggedValues(Set<UMLTaggedValue> taggedValues) {
		this.taggedValues = taggedValues;
	}

	
	public boolean isUmlModelElementTaggedValue() {
		return true;
	}

	
	public boolean isUmlNode() {
		return false;
	}

	
	public boolean isUmlTaggedValue() {
		return false;
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
