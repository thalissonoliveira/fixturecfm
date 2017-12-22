package example.xmi.model;

import java.util.HashSet;
import java.util.Set;

public class XMIContent implements XMIModel {

	private Set<UMLNode> umlNodes;
	
	public XMIContent() {
		umlNodes = new HashSet<UMLNode>();
	}

	public Set<UMLNode> getUmlNodes() {
		return umlNodes;
	}

	public void setUmlNodes(Set<UMLNode> umlNodes) {
		this.umlNodes = umlNodes;
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
		return false;
	}

	
	public boolean isXmi() {
		return false;
	}

	
	public boolean isXmiContent() {
		return true;
	}

}
