package example.xmi;

public enum XMIAttributesFixture {

	XMI_ID("xmi.id"),
	XMI_ID_REF("xmi.idref"),
	NAME("name"),
	IS_SPECIFICATION("isSpecification"),
	IS_ROOT("isRoot"),
	IS_LEAF("isLeaf"),
	IS_ABSTRACT("isAbstract");
	
	private String attribute;
	
	private XMIAttributesFixture(String attribute) {
		this.attribute = attribute;
	}

	public String getAttribute() {
		return attribute;
	}
	
}
