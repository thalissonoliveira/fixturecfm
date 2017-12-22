package example.xmi;

public enum XMIFeatureModelTags {

	UML_TAGGED_VALUE_DATA_VALUE("UML:TaggedValue.dataValue", null, null, "example.xmi.model.UMLTaggedValueDataValue"),
	UML_TAGGED_VALUE("UML:TaggedValue", new XMIFeatureModelTags[]{UML_TAGGED_VALUE_DATA_VALUE}, new XMIAttributesFixture[]{XMIAttributesFixture.XMI_ID, XMIAttributesFixture.NAME, XMIAttributesFixture.IS_SPECIFICATION}, "example.xmi.model.UMLTaggedValue"),
	UML_MODEL_ELEMENT_TAGGED_VALUE("UML:ModelElement.taggedValue", new XMIFeatureModelTags[]{UML_TAGGED_VALUE}, null, "example.xmi.model.UMLModelElementTaggedValue"),
	UML_NODE("UML:Node", new XMIFeatureModelTags[]{UML_MODEL_ELEMENT_TAGGED_VALUE}, new XMIAttributesFixture[]{XMIAttributesFixture.XMI_ID, XMIAttributesFixture.NAME, XMIAttributesFixture.IS_SPECIFICATION, XMIAttributesFixture.IS_ROOT, XMIAttributesFixture.IS_LEAF, XMIAttributesFixture.IS_ABSTRACT}, "example.xmi.model.UMLNode"),
	XMI_CONTENT("XMI.content", new XMIFeatureModelTags[]{UML_NODE}, null, "example.xmi.model.XMIContent");
	
	private String tagName;
	private XMIFeatureModelTags[] childrenTags;
	private XMIAttributesFixture[] attributes;
	private String className;
	
	private XMIFeatureModelTags(String tagName, XMIFeatureModelTags[] childrenTags, XMIAttributesFixture[] attributes, String className) {
		this.tagName = tagName;
		this.childrenTags = childrenTags;
		this.attributes = attributes;
		this.className = className;
	}
	
	public String getTagName() {
		return tagName;
	}

	public XMIFeatureModelTags[] getChildrenTags() {
		return childrenTags;
	}

	public XMIAttributesFixture[] getAttributes() {
		return attributes;
	}

	public String getClassName() {
		return className;
	}
	
}
