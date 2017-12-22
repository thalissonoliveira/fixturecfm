package examples.code;

import java.io.IOException;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.xmi.XMIResource;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceImpl;

public class CopyOfReader {
	
	public static void main(String[] args) throws IOException {
		
		XMIResource resource = new XMIResourceImpl(URI.createURI(ExampleXMI.FILE_ADDRESS_2));
		resource.load(null);
		System.out.println(resource.getContents().get(0) );
	}

}
