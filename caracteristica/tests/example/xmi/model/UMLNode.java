package example.xmi.model;

import java.util.HashSet;
import java.util.Set;

public class UMLNode implements XMIModel {
	
	private String xmiId;
	private String name;
	private boolean isSpecification;
	private boolean isRoot;
	private boolean isLeaf;
	private boolean isAbstract;
	
	private Set<UMLModelElementTaggedValue> elementTaggedValues;
	
	public UMLNode() {
		elementTaggedValues = new HashSet<UMLModelElementTaggedValue>();
	}

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

	public boolean isRoot() {
		return isRoot;
	}

	public void setRoot(boolean isRoot) {
		this.isRoot = isRoot;
	}

	public boolean isLeaf() {
		return isLeaf;
	}

	public void setLeaf(boolean isLeaf) {
		this.isLeaf = isLeaf;
	}

	public boolean isAbstract() {
		return isAbstract;
	}

	public void setAbstract(boolean isAbstract) {
		this.isAbstract = isAbstract;
	}

	public Set<UMLModelElementTaggedValue> getElementTaggedValues() {
		return elementTaggedValues;
	}

	public void setElementTaggedValues(Set<UMLModelElementTaggedValue> elementTaggedValues) {
		this.elementTaggedValues = elementTaggedValues;
	}
	
	
	public boolean isUmlModelElementTaggedValue() {
		return false;
	}

	
	public boolean isUmlNode() {
		return true;
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
