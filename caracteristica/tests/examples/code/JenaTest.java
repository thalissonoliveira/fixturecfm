package examples.code;

import java.io.File;
import java.io.IOException;
import java.net.URISyntaxException;

import org.semanticweb.owlapi.io.RDFXMLOntologyFormat;
import org.semanticweb.owlapi.model.IRI;
import org.semanticweb.owlapi.model.OWLOntologyCreationException;
import org.semanticweb.owlapi.model.OWLOntologyFormat;
import org.semanticweb.owlapi.model.OWLOntologyStorageException;

import com.hp.hpl.jena.ontology.OntModel;
import com.hp.hpl.jena.ontology.OntModelSpec;
import com.hp.hpl.jena.query.Query;
import com.hp.hpl.jena.query.QueryExecution;
import com.hp.hpl.jena.query.QueryExecutionFactory;
import com.hp.hpl.jena.query.QueryFactory;
import com.hp.hpl.jena.query.ResultSetFormatter;
import com.hp.hpl.jena.rdf.model.ModelFactory;
import com.hp.hpl.jena.util.FileManager;

import fixture.owl.utils.OntoHelper;
import fixture.owl.utils.Utils;

public class JenaTest {

	public static void main(String[] args) throws OWLOntologyCreationException, IOException, URISyntaxException, OWLOntologyStorageException {
		run();
	}

	private static void run() throws IOException, OWLOntologyCreationException, URISyntaxException, OWLOntologyStorageException {
//		OntoHelper o = new OntoHelper();
//		o.loadMetaOntology();
		
		
//		FileWriter fw = new FileWriter(new File(Utils.SPLiSEM_RDF_OUTPUT_PATH));
		OWLOntologyFormat f = new RDFXMLOntologyFormat();
////		OWLOntologyFormat f = new TurtleOntologyFormat();
//		RDFXMLRenderer r = new RDFXMLRenderer(o.getMetaOntology(), fw, f);
//		r.render();
		
		
//		o.getManager().saveOntology(o.getMetaOntology(), f, IRI.create(new File(Utils.SPLiSEM_RDF_OUTPUT_PATH)));
		
//		PropertyConfigurator.configure("D:\\apache-jena-2.10.1\\jena-log4j.properties");
		OntModel model = ModelFactory.createOntologyModel(OntModelSpec.OWL_DL_MEM_RDFS_INF);
//		FileManager.get().readModel( model, "file:.owl" );
		FileManager.get().readModel(model, Utils.SPLiSEM_RDF_OUTPUT_PATH);

		String queryString =
//		    "PREFIX rdf: <http://www.w3.org/1999/02/22-rdf-syntax-ns#> " +        
//		    "PREFIX owl: <http://www.w3.org/2002/07/owl#> " +
//		    "PREFIX xsd: <http://www.w3.org/2001/XMLSchema#> " +
//		    "PREFIX rdfs: <http://www.w3.org/2000/01/rdf-schema#> " +
//		    "PREFIX bio: <http://www.semanticweb.org/vassilis/ontologies/2013/5/Bio#> " +
//
//		    " SELECT ?x " +
//		    " WHERE { ?x rdf:type bio:Class } " ;
				
				"PREFIX rdf: <http://www.w3.org/1999/02/22-rdf-syntax-ns#>"+
					"PREFIX owl: <http://www.w3.org/2002/07/owl#>"+
					"PREFIX xsd: <http://www.w3.org/2001/XMLSchema#>"+
					"PREFIX rdfs: <http://www.w3.org/2000/01/rdf-schema#>"+
					"PREFIX fix: <http://www.semanticweb.org/2014/8/FeaToOntoFixture2#>"+

//					"SELECT ?name"+
//					"WHERE {"+
//					"?feature fix:hasName ?name."+
//					"FILTER(NOT EXISTS {?feature fix:hasUseCase ?usecase.})"+
//					"}";
		"SELECT ?name "+
		"WHERE { "+
			"?feature fix:hasName ?name. "+
			"FILTER(NOT EXISTS {?feature fix:hasUseCase ?usecase.}) "+
//			"?feature fix:hasUseCase ?usecase."+
		"}";


		Query query = QueryFactory.create(queryString);
		QueryExecution qe= QueryExecutionFactory.create(query, model);
		com.hp.hpl.jena.query.ResultSet resultset = qe.execSelect();
		ResultSetFormatter.out(System.out, resultset, query);
		
	}

}
