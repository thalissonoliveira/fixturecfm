package example.xmi;

import java.io.File;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import example.xmi.model.XMI;
import example.xmi.model.XMIContent;

public class Reader {
	
	private XMI xmi;
	
	public static void main(String[] args) throws Exception {
		new Reader().read(XMIUtils.FEATURE_MODEL_PATH);
	}

	public void read(String fileAddress) throws Exception {
		
		DocumentBuilderFactory docBuilderFactory = DocumentBuilderFactory.newInstance();
		DocumentBuilder docBuilder = docBuilderFactory.newDocumentBuilder();
		Document doc = docBuilder.parse(new File(fileAddress));

		// normalize text representation
		doc.getDocumentElement().normalize();
		System.out.println("==============================");
		System.out.println("Root element of the doc is " + doc.getDocumentElement().getNodeName());
		
		NodeList elementsXMIContext = doc.getElementsByTagName(XMIFeatureModelTags.XMI_CONTENT.getTagName());
		NodeList elementsByTagName2 = doc.getElementsByTagName(XMIFeatureModelTags.UML_NODE.getTagName());
		NodeList elementsByTagName3 = doc.getElementsByTagName(XMIFeatureModelTags.UML_TAGGED_VALUE.getTagName());
		NodeList elementsByTagName4 = doc.getElementsByTagName(XMIFeatureModelTags.UML_MODEL_ELEMENT_TAGGED_VALUE.getTagName());
		NodeList elementsByTagName5 = doc.getElementsByTagName(XMIFeatureModelTags.UML_TAGGED_VALUE_DATA_VALUE.getTagName());
		
		
//		processarNodeList(elementsByTagName2);
		processarDataValue(elementsByTagName5);
		
		System.out.println(elementsXMIContext.getLength());
		System.out.println(elementsByTagName2.getLength());
		System.out.println(elementsByTagName3.getLength());
		System.out.println(elementsByTagName4.getLength());
		System.out.println(elementsByTagName5.getLength());
		
		NodeList childFromDocumentElements = doc.getDocumentElement().getElementsByTagName(XMIFeatureModelTags.XMI_CONTENT.getTagName());
		
		
		XMIContent xmiContent = new XMIContent();
//		NodeList childNodes = doc.getChildNodes();
//		
//		for (int i = 0; i < childNodes.getLength(); i++) {
//			Node item = childNodes.item(i);
//			NodeList childNodes2 = item.getChildNodes();
//			for (int j = 0; j < childNodes2.getLength(); j++) {
//				System.out.println(childNodes2.item(j));
//			}
//		}
		
		NodeList listClass = elementsXMIContext;
		
		int totalClass = listClass.getLength();
		System.out.println("Total Class : " + totalClass);
		
		Node item = listClass.item(0);
		
		System.out.println();
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
		
		xmi = new XMI();
		xmi.getXmiContents().add(xmiContent);
	}

	private void processarDataValue(NodeList nodeList) {
		
		for (int i = 0; i < nodeList.getLength(); i++) {
			Node item = nodeList.item(i);
			Node parentNode = item.getParentNode();
			String nodeName = parentNode.getLocalName();
			System.out.println();
			System.out.println("%%% " + item.getNodeName() + " " + item.getTextContent() + " - pai: " + parentNode.getAttributes());
			NamedNodeMap attributes = item.getAttributes();
			for (int j = 0; j < attributes.getLength(); j++) {
				System.out.println("### " + attributes.item(j));
			}
		}
		
	}

	private void processarNodeList(NodeList elementsXMIContext) {
		
		for (int i = 0; i < elementsXMIContext.getLength(); i++) {
			Node item = elementsXMIContext.item(i);
			System.out.println("%%% " + item.getNodeName() + " " + item.getTextContent());
			NamedNodeMap attributes = item.getAttributes();
			for (int j = 0; j < attributes.getLength(); j++) {
				System.out.println("### " + attributes.item(j));
			}
		}
	}
}
