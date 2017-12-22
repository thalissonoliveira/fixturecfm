package examples.code;
import java.io.File;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;
import org.xml.sax.SAXParseException;


public class ExampleXMI {
	
	
	
	
	final static String XMI_CONTENT = "XMI.content";
	final static String XMI_EXPORTER = "XMI.exporter";
	
	final static String ATTRIBUTES = "UML:Attribute";
	final static String METHODS = "UML:Operation";
	final static String CLASSES = "UML:Classifier.feature"; //masih salah
	final static String COUPLINGS = "UML:AssociationEnd";
	final static String CLASS_INHERITANCES = "UML:GeneralizableElement.generalization";
//	final static String FILE_ADDRESS = "test.xmi";
	public final static String FILE_ADDRESS = "C:\\Users\\thalissonoliveira\\Dropbox\\Thalisson Mestrado\\2014.2\\CTQS\\Ubstructure\\context_definition.xmi";
	public final static String FILE_ADDRESS_2 = "file:///C:/Users/thalissonoliveira/Dropbox/Thalisson Mestrado/2014.2/CTQS/Ubstructure/context_definition.xmi";

	public static void main(String args[]) throws Exception {
//		exampleByInternet();
		exampleByMe();
	}
	
	
	
	
	private static void exampleByMe() throws Exception {
		
		DocumentBuilderFactory docBuilderFactory = DocumentBuilderFactory.newInstance();
		DocumentBuilder docBuilder = docBuilderFactory.newDocumentBuilder();
		Document doc = docBuilder.parse(new File(FILE_ADDRESS));
		doc.getDocumentElement().normalize();
		System.out.println("==============================");
		System.out.println("Root element of the doc is " + doc.getDocumentElement().getNodeName());
		
		
		NodeList listClass = doc.getElementsByTagName(XMI_CONTENT);
		
		System.out.println(listClass.item(0).getChildNodes().item(1).getChildNodes().getLength());
		System.out.println(listClass.item(0).getChildNodes().item(1).getChildNodes().item(1).getNodeValue());
		System.out.println(listClass.item(0).getChildNodes().item(1).getChildNodes().item(2).getNodeValue());
		
		
		NodeList childNodes = doc.getDocumentElement().getChildNodes();
//		NodeList childNodes = doc.getChildNodes();
		int length = listClass.getLength();
		for (int i = 0; i < length; i++) {
			System.out.println(listClass.getLength());
			i++;
		}
		
	}

	private static void exampleByInternet() {
		try {

			DocumentBuilderFactory docBuilderFactory = DocumentBuilderFactory.newInstance();
			DocumentBuilder docBuilder = docBuilderFactory.newDocumentBuilder();
			Document doc = docBuilder.parse(new File(FILE_ADDRESS));

			// normalize text representation
			doc.getDocumentElement().normalize();
			System.out.println("==============================");
			System.out.println("Root element of the doc is " + doc.getDocumentElement().getNodeName());

			NodeList listClass = doc.getElementsByTagName(CLASSES);
			int totalClass = listClass.getLength();
			System.out.println("Total Class : " + totalClass);

			NodeList listAttributes = doc.getElementsByTagName(ATTRIBUTES);
			int totalAttributes = listAttributes.getLength();
			System.out.println("Total Attribute : " + totalAttributes);

			NodeList linksAtributesHiding = doc
					.getElementsByTagName(ATTRIBUTES);
			for (int i = 0; i < linksAtributesHiding.getLength(); i++) {

				Element link = (Element) linksAtributesHiding.item(i);

				System.out.println("attribute value = "
						+ link.getAttribute("visibility"));

			}

		} catch (SAXParseException err) {
			System.out.println("** Parsing error" + ", line "
					+ err.getLineNumber() + ", uri " + err.getSystemId());
			System.out.println(" " + err.getMessage());

		} catch (SAXException e) {
			Exception x = e.getException();
			((x == null) ? e : x).printStackTrace();

		} catch (Throwable t) {
			t.printStackTrace();
		}
	}
	

}
