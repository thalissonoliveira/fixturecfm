package fixture.owl.utils;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URISyntaxException;
import java.util.Formatter;

import org.semanticweb.owlapi.apibinding.OWLManager;
import org.semanticweb.owlapi.io.OWLXMLOntologyFormat;
import org.semanticweb.owlapi.model.AddAxiom;
import org.semanticweb.owlapi.model.IRI;
import org.semanticweb.owlapi.model.OWLDataFactory;
import org.semanticweb.owlapi.model.OWLOntology;
import org.semanticweb.owlapi.model.OWLOntologyCreationException;
import org.semanticweb.owlapi.model.OWLOntologyManager;
import org.semanticweb.owlapi.model.OWLOntologyStorageException;
import org.semanticweb.owlapi.model.SWRLRule;
import org.semanticweb.owlapi.vocab.PrefixOWLOntologyFormat;

import fixture.owl.swrl.parser.SWRLRuleStringParser;

/**
 * 
 * Should be called OntoManager
 * 
 * @author thalissonoliveira
 *
 */
public class OntoHelper {
	
	private OWLOntologyManager manager;
	private OWLOntology metaOntology;
	private OWLDataFactory dataFactory;
	private PrefixOWLOntologyFormat prefixOWLOntologyFormat;
	
	private String pathSaveOntology;
	
	public synchronized void loadMetaOntology() throws URISyntaxException, OWLOntologyCreationException {
		File file = getMetaOntologyXML();
		
		this.manager = OWLManager.createOWLOntologyManager();
		this.metaOntology = manager.loadOntologyFromOntologyDocument(file);
		this.dataFactory = manager.getOWLDataFactory();
		this.pathSaveOntology = Utils.SPLiSEM_OUTPUT_PATH;
		this.prefixOWLOntologyFormat = createtPrefixOWLOntologyFormat();
		
		
		//TODO Algumas regras que estao sendo geradas estao inconsistentes. Visitar essa etapa de geracao para deixar correta.
//		loadRules();
		loadRulesFromFile();
		
		System.out.println("[FIXTURE2][LOG] - temp Meta Ontology deleted? : " + file.delete());
		
		Utils.refreshOutputFolder();
	}
	
	public synchronized void loadOntology(String pathLoadOntology, String pathSaveOntology) throws OWLOntologyCreationException {
		File file = new File(pathLoadOntology);
		this.manager = OWLManager.createOWLOntologyManager();
		this.metaOntology = manager.loadOntologyFromOntologyDocument(file);
		this.dataFactory = manager.getOWLDataFactory();
		this.pathSaveOntology = pathSaveOntology;
		this.prefixOWLOntologyFormat = createtPrefixOWLOntologyFormat();
	}
		
	public synchronized void saveAndRemoveOntology() {
		try {
//			OWLUtils.getInstance(this).addMaxIdCountToOntology();
			manager.saveOntology(getMetaOntology(), new OWLXMLOntologyFormat(), IRI.create(new File(pathSaveOntology)));
	        manager.removeOntology(getMetaOntology());
		} catch (OWLOntologyStorageException e) {
			e.printStackTrace();
		}
	}
	
	public synchronized void saveOntology() {
		try {
//			OWLUtils.getInstance(this).addMaxIdCountToOntology();
			manager.saveOntology(getMetaOntology(), new OWLXMLOntologyFormat(), IRI.create(new File(pathSaveOntology)));
		} catch (OWLOntologyStorageException e) {
			e.printStackTrace();
		}
	}
	
    private PrefixOWLOntologyFormat createtPrefixOWLOntologyFormat() {
    	PrefixOWLOntologyFormat pm = (PrefixOWLOntologyFormat) getManager().getOntologyFormat(getMetaOntology());
    	pm.setDefaultPrefix(Utils.META_ONTOLOGY_BASE_URL_SHARP);
    	return pm;
    }
    
	private synchronized File getMetaOntologyXML() throws URISyntaxException {
		Utils.refreshTempFolderInUserHome();
		File file = new File(Utils.META_ONTOLOGY_TEMP_PATH);
		try {
			String name = "/resources/MetaOntologyFixture2.owl";

			InputStream is = getClass().getResourceAsStream(name);

			if (is == null) {
				System.out.println("UNABLE to load " + name + "\n");
				return null;
			}
			
			BufferedReader br = new BufferedReader(new InputStreamReader(is));
			Formatter formater = new Formatter(file);
			load(br, formater);
			formater.close();
			is.close();
			
		} catch (IOException exx) {
			System.out.println("--> " + exx + "\n");
		}
		return file;
	}
	
	public InputStream getSPLiSEM() {
		//SE FOR MEXER AQUI, TEM QUE FAZER O PARSER PARA RDF PARA O JENA PODER TRABALHAR.
		String name = Utils.SPLiSEM_OUTPUT_PATH;
		try {
			FileInputStream fis = new FileInputStream(name);
			return fis;
		} catch (FileNotFoundException e) {
			System.out.println("UNABLE to load " + name + "\n");
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
	}
	
	private synchronized void loadRulesFromFile() throws URISyntaxException {
		
			String name = "/resources/rules.fix";

			InputStream is = getClass().getResourceAsStream(name);

			if (is == null) {
				System.out.println("UNABLE to load " + name + "\n");
				return;
			}
			
			
			BufferedReader br = new BufferedReader(new InputStreamReader(is));
			System.out.println("## reading rules, please wait ##");
			String ruleStr;

			try {
				while ((ruleStr = br.readLine()) != null) {
					ruleStr = ruleStr.trim();
					int len = ruleStr.length();
					if (len > 0) {
						if (ruleStr.startsWith("--") || ruleStr.trim().equals("")) {
							System.out.println("Pulou?");
							System.out.println(ruleStr);
							continue;
						}
						
						SWRLRule swrlRule = new SWRLRuleStringParser(this).parse(ruleStr);
						this.getManager().applyChange(new AddAxiom(this.getMetaOntology(), swrlRule));
						this.saveOntology();
					}
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
	}
	
	private synchronized void load(BufferedReader br, Formatter formatter) {
		try {
			System.out.println("## reading Meta Ontology, please wait ##");
			String str;

			while ((str = br.readLine()) != null) {
				str = str.trim();
				int len = str.length();
				if (len > 0) {
					formatter.format(str + "\n");
				}
			}
		} catch (IOException exx) {
			exx.printStackTrace();
		}
	}
	
	public boolean deleteTempDir() {
		return Utils.deleteTempFolder();
	}

	public String getPathToSaveOntology() {
		return pathSaveOntology;
	}

	public OWLOntologyManager getManager() {
		return manager;
	}

	public OWLOntology getMetaOntology() {
		return metaOntology;
	}

	public OWLDataFactory getDataFactory() {
		return dataFactory;
	}

	public PrefixOWLOntologyFormat getPrefixOWLOntologyFormat() {
		return prefixOWLOntologyFormat;
	}
	
	
	public boolean equals(Object obj) {
		return this.getDataFactory().equals(((OntoHelper) obj).getDataFactory());
	}
	
}
