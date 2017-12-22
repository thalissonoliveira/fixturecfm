package example.xmi;

public enum XMIContextModelTags {

	UML_TAGGED_VALUE_DATA_VALUE("UML:TaggedValue.dataValue", null, null),
	UML_TAG_DEFINITION_II("UML:TagDefinition", null, new XMIAttributesFixture[]{XMIAttributesFixture.XMI_ID_REF}),
	UML_TAGGED_VALUE_TYPE("UML:TaggedValue.type", new XMIContextModelTags[]{UML_TAG_DEFINITION_II}, null),
	UML_TAGGED_VALUE_II("UML:TaggedValue", new XMIContextModelTags[]{UML_TAGGED_VALUE_DATA_VALUE, UML_TAGGED_VALUE_TYPE}, new XMIAttributesFixture[]{XMIAttributesFixture.XMI_ID, XMIAttributesFixture.IS_SPECIFICATION}),
	UML_MODEL_ELEMENT_TAGGED_VALUE_II("UML:ModelElement.taggedValue", new XMIContextModelTags[]{UML_TAGGED_VALUE_II}, null),
	UML_TAGGED_VALUE("UML:TaggedValue", new XMIContextModelTags[]{UML_TAGGED_VALUE_DATA_VALUE, UML_MODEL_ELEMENT_TAGGED_VALUE_II}, new XMIAttributesFixture[]{XMIAttributesFixture.XMI_ID, XMIAttributesFixture.NAME, XMIAttributesFixture.IS_SPECIFICATION}),
	UML_MODEL_ELEMENT_TAGGED_VALUE("UML:ModelElement.taggedValue", new XMIContextModelTags[]{UML_TAGGED_VALUE}, null),
	UML_NODE("UML:Node", new XMIContextModelTags[]{UML_MODEL_ELEMENT_TAGGED_VALUE}, new XMIAttributesFixture[]{XMIAttributesFixture.XMI_ID, XMIAttributesFixture.NAME, XMIAttributesFixture.IS_SPECIFICATION, XMIAttributesFixture.IS_ROOT, XMIAttributesFixture.IS_LEAF, XMIAttributesFixture.IS_ABSTRACT}),
	UML_TAG_DEFINITION("UML:TagDefinition", null, new XMIAttributesFixture[]{XMIAttributesFixture.XMI_ID, XMIAttributesFixture.NAME, XMIAttributesFixture.IS_SPECIFICATION}),
	XMI_CONTENT("XMI.content", new XMIContextModelTags[]{UML_TAG_DEFINITION, UML_NODE}, null);
	
	private String tag;
	private XMIContextModelTags[] childrenTags;
	private XMIAttributesFixture[] attributes;
	
	private XMIContextModelTags(String tag, XMIContextModelTags[] childrenTags, XMIAttributesFixture[] attributes) {
		this.tag = tag;
		this.childrenTags = childrenTags;
		this.attributes = attributes;
	}
	
	public String getTag() {
		return this.tag;
	}

	public XMIContextModelTags[] getChildrenTags() {
		return childrenTags;
	}

	public XMIAttributesFixture[] getAttributes() {
		return attributes;
	}
	
}
