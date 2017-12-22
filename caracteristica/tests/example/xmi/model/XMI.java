package example.xmi.model;

import java.util.HashSet;
import java.util.Set;

public class XMI implements XMIModel {

	private Set<XMIContent> xmiContents;

	public XMI() {
		xmiContents = new HashSet<XMIContent>();
	}

	public Set<XMIContent> getXmiContents() {
		return xmiContents;
	}

	public void setXmiContents(Set<XMIContent> xmiContents) {
		this.xmiContents = xmiContents;
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
		return true;
	}

	
	public boolean isXmiContent() {
		return false;
	}

}
