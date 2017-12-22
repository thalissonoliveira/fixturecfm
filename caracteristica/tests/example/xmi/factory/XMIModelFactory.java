package example.xmi.factory;

import example.xmi.XMIFeatureModelTags;
import example.xmi.model.XMIModel;


public class XMIModelFactory {

	
	public static XMIModel newXmiModel(String tagName) {
		
		for (XMIFeatureModelTags xmiFeatureModelTags : XMIFeatureModelTags.values()) {
			if (tagName.equals(xmiFeatureModelTags.getTagName())) {
				try {
					return (XMIModel) Class.forName(xmiFeatureModelTags.getClassName()).newInstance();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		}
		
		return null;
	}
	
	public static void main(String[] args) {
		System.out.println(XMIModelFactory.newXmiModel("UML:Node"));
	}
	
}
