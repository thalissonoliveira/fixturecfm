package example.xmi;

import java.io.File;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import example.xmi.factory.XMIModelFactory;
import example.xmi.model.UMLModelElementTaggedValue;
import example.xmi.model.UMLNode;
import example.xmi.model.UMLTaggedValue;
import example.xmi.model.UMLTaggedValueDataValue;
import example.xmi.model.XMI;
import example.xmi.model.XMIContent;
import example.xmi.model.XMIModel;

public class UbifexXMIReader {
	
	private Map<XMI, Map<XMIContent, Map<UMLNode, Map<UMLModelElementTaggedValue, Map<UMLTaggedValue, Set<UMLTaggedValueDataValue>>>>>> xmiMap; 
	
	private XMI xmi;
	
	public UbifexXMIReader() {
		TreeMap<UMLModelElementTaggedValue, Map<UMLTaggedValue, Set<UMLTaggedValueDataValue>>> treeMap3 = new TreeMap<UMLModelElementTaggedValue, Map<UMLTaggedValue, Set<UMLTaggedValueDataValue>>>();
		TreeMap<UMLTaggedValue, Set<UMLTaggedValueDataValue>> treeMap4 = new TreeMap<UMLTaggedValue, Set<UMLTaggedValueDataValue>>();
		LinkedHashSet<UMLTaggedValueDataValue> linkedHashSet = new LinkedHashSet<UMLTaggedValueDataValue>();
		
		xmiMap = new TreeMap<XMI, Map<XMIContent, Map<UMLNode, Map<UMLModelElementTaggedValue, Map<UMLTaggedValue, Set<UMLTaggedValueDataValue>>>>>>();
	}

	private void processUmlTaggedValudeDataValue(Node umlTaggedValudeDataValueNode) {
		Node umlTaggedValueNode = umlTaggedValudeDataValueNode.getParentNode();
		Node umLModelElementTaggedValueNode = umlTaggedValueNode.getParentNode();
		Node umLNode = umLModelElementTaggedValueNode.getParentNode();
		Node xmiContentNode = umLNode.getParentNode();
		Node xmiNode = xmiContentNode.getParentNode();
		
//		refreshMap(xmiModel);
		
	}

//	private void refreshMap(XMIModel xmiModel) {
//		
//		if (xmiModel.isXmi()) {
//			xmi = (XMI) xmiModel;
//			if (!xmiMap.containsKey(xmi)) {
//				xmiMap.put(xmi, new TreeMap<XMIContent, Map<UMLNode, Map<UMLModelElementTaggedValue, Map<UMLTaggedValue, Set<UMLTaggedValueDataValue>>>>>());
//			} else {
//				throw new RuntimeException();
//			}
//		} else if (xmiModel.isXmiContent()) {
//			XMIContent xmiContext = (XMIContent) xmiModel;
//			boolean containsXmi = xmiMap.containsKey(xmiContext.getParent());
//			if (containsXmi) {
//				boolean containsXmiContext = xmiMap.get(xmiContext.getParent()).containsKey(xmiContext);
//				if (!containsXmiContext) {
//					xmiMap.get(xmiContext.getParent()).put(xmiContext, new TreeMap<UMLNode, Map<UMLModelElementTaggedValue, Map<UMLTaggedValue, Set<UMLTaggedValueDataValue>>>>());
//				} else {
//					throw new RuntimeException();
//				}
//			} else {
//				throw new RuntimeException();
//			}
//		} else if (xmiModel.isUmlNode()) {
//			UMLNode xmiContext = (UMLNode) xmiModel;
//			boolean containsXmi = xmiMap.containsKey(xmiContext.getParent());
//			if (containsXmi) {
//				boolean containsXmiContext = xmiMap.get(xmiContext.getParent()).containsKey(xmiContext);
//				if (!containsXmiContext) {
//					xmiMap.get(xmiContext.getParent()).put(xmiContext, new TreeMap<UMLNode, Map<UMLModelElementTaggedValue, Map<UMLTaggedValue, Set<UMLTaggedValueDataValue>>>>());
//				} else {
//					throw new RuntimeException();
//				}
//			} else {
//				throw new RuntimeException();
//			}
//		}
//	}

	public void read(String fileAddress) throws Exception {
		DocumentBuilderFactory docBuilderFactory = DocumentBuilderFactory.newInstance();
		DocumentBuilder docBuilder = docBuilderFactory.newDocumentBuilder();
		Document doc = docBuilder.parse(new File(fileAddress));
		
		Element documentElement = doc.getDocumentElement();
		documentElement.normalize();
		
		
		NodeList elementsUMLTaggedValueDataValue = doc.getElementsByTagName(XMIFeatureModelTags.UML_TAGGED_VALUE_DATA_VALUE.getTagName());
		for (int i = 0; i < elementsUMLTaggedValueDataValue.getLength(); i++) {
			processUmlTaggedValudeDataValue(elementsUMLTaggedValueDataValue.item(i));
		}
		
		
		
		//Build Node
//		NodeList elementsUMLNode = doc.getElementsByTagName(XMIFeatureModelTags.UML_NODE.getTagName());
//		NodeList elementsXMIContent = doc.getElementsByTagName(XMIFeatureModelTags.XMI_CONTENT.getTagName());
//		NodeList elementsUMLTaggedValue = doc.getElementsByTagName(XMIFeatureModelTags.UML_TAGGED_VALUE.getTagName());
//		NodeList elementsUMLModelElementTaggedValue = doc.getElementsByTagName(XMIFeatureModelTags.UML_MODEL_ELEMENT_TAGGED_VALUE.getTagName());
//		
//		Set<UMLTaggedValueDataValue> processDataValue = processDataValue(elementsUMLTaggedValueDataValue);
		
//		System.out.println(elementsXMIContent.getLength());
//		System.out.println(elementsUMLNode.getLength());
//		System.out.println(elementsUMLTaggedValue.getLength());
//		System.out.println(elementsUMLModelElementTaggedValue.getLength());
//		System.out.println(elementsUMLTaggedValueDataValue.getLength());
		
//		NodeList childFromDocumentElements = doc.getDocumentElement().getElementsByTagName(XMIFeatureModelTags.XMI_CONTENT.getTagName());
		
//		NodeList childNodes = doc.getChildNodes();
//		
//		for (int i = 0; i < childNodes.getLength(); i++) {
//			Node item = childNodes.item(i);
//			NodeList childNodes2 = item.getChildNodes();
//			for (int j = 0; j < childNodes2.getLength(); j++) {
//				System.out.println(childNodes2.item(j));
//			}
//		}
		
//		NodeList listAttributes = item.getElementsByTagName(XMIAttributesFixture.XMI_ID.getAttribute());
//		int totalAttributes = listAttributes.getLength();
//		System.out.println("Total Attribute : " + totalAttributes);
//
//		NodeList linksAtributesHiding = doc
//				.getElementsByTagName(ATTRIBUTES);
//		for (int i = 0; i < linksAtributesHiding.getLength(); i++) {
//
//			Element link = (Element) linksAtributesHiding.item(i);
//
//			System.out.println("attribute value = "
//					+ link.getAttribute("visibility"));
//
//		}
//
//	} catch (SAXParseException err) {
//		System.out.println("** Parsing error" + ", line "
//				+ err.getLineNumber() + ", uri " + err.getSystemId());
//		System.out.println(" " + err.getMessage());
//
//	} catch (SAXException e) {
//		Exception x = e.getException();
//		((x == null) ? e : x).printStackTrace();
//
//	} catch (Throwable t) {
//		t.printStackTrace();
//	}
		
		
	}

//	private Set<UMLTaggedValueDataValue> processDataValue(NodeList nodeList) {
//		
//		int nodeListLength = nodeList.getLength();
//		
//		if (nodeListLength == 0) {
//			return null;
//		}
//		
//		Set<UMLTaggedValueDataValue> values = new LinkedHashSet<UMLTaggedValueDataValue>();
//		
//		UMLTaggedValueDataValue value;
//		for (int i = 0; i < nodeListLength; i++) {
//			value = new UMLTaggedValueDataValue();
//
//		}
//		
//		return values;
//		
//	}
//
//	private void processarNodeList(NodeList elementsXMIContext) {
//		for (int i = 0; i < elementsXMIContext.getLength(); i++) {
//			Node item = elementsXMIContext.item(i);
//			System.out.println("%%% " + item.getNodeName() + " " + item.getTextContent());
//			NamedNodeMap attributes = item.getAttributes();
//			for (int j = 0; j < attributes.getLength(); j++) {
//				System.out.println("### " + attributes.item(j));
//			}
//		}
//	}
}
