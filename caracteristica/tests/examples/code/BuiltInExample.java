package examples.code;

import java.util.Map;
import java.util.Set;

import org.semanticweb.owlapi.apibinding.OWLManager;
import org.semanticweb.owlapi.io.OWLObjectRenderer;
import org.semanticweb.owlapi.model.AxiomType;
import org.semanticweb.owlapi.model.IRI;
import org.semanticweb.owlapi.model.OWLDataFactory;
import org.semanticweb.owlapi.model.OWLDataProperty;
import org.semanticweb.owlapi.model.OWLDataPropertyExpression;
import org.semanticweb.owlapi.model.OWLLiteral;
import org.semanticweb.owlapi.model.OWLNamedIndividual;
import org.semanticweb.owlapi.model.OWLOntology;
import org.semanticweb.owlapi.model.OWLOntologyCreationException;
import org.semanticweb.owlapi.model.OWLOntologyManager;
import org.semanticweb.owlapi.model.SWRLRule;
import org.semanticweb.owlapi.reasoner.OWLReasoner;
import org.semanticweb.owlapi.reasoner.OWLReasonerFactory;
import org.semanticweb.owlapi.reasoner.SimpleConfiguration;
import org.semanticweb.owlapi.vocab.PrefixOWLOntologyFormat;

import uk.ac.manchester.cs.owlapi.dlsyntax.DLSyntaxObjectRenderer;

import com.clarkparsia.pellet.owlapiv3.PelletReasonerFactory;
import com.clarkparsia.pellet.rules.builtins.BuiltInRegistry;

import fixture.owl.swrl.banchmark.CustomSWRLBuiltin;
import fixture.owl.swrl.banchmark.IRIParts;

public class BuiltInExample {
	
	
    //a simple example ontology 
    private static final String DOC_URL = "http://acrab.ics.muni.cz/ontologies/swrl_tutorial_ind.owl"; 
 
    public static void main(String[] args) throws OWLOntologyCreationException { 
        //register my built-in implementation 
        BuiltInRegistry.instance.registerBuiltIn("urn:makub:builtIn#IRIparts", new CustomSWRLBuiltin(new IRIParts())); 
        //initialize ontology and reasoner 
        OWLOntologyManager manager = OWLManager.createOWLOntologyManager(); 
        OWLOntology ontology = manager.loadOntologyFromOntologyDocument(IRI.create(DOC_URL)); 
        OWLReasonerFactory reasonerFactory = PelletReasonerFactory.getInstance(); 
        OWLReasoner reasoner = reasonerFactory.createReasoner(ontology, new SimpleConfiguration()); 
        OWLDataFactory factory = manager.getOWLDataFactory(); 
        PrefixOWLOntologyFormat pm = (PrefixOWLOntologyFormat) manager.getOntologyFormat(ontology); 
        //print the SWRL rule 
        listSWRLRules(ontology, pm); 
        //use the rule with the built-in to infer property values 
        OWLNamedIndividual martin = factory.getOWLNamedIndividual(":Martin", pm); 
        listAllDataPropertyValues(martin, ontology, reasoner); 
    } 
 
    public static void listSWRLRules(OWLOntology ontology, PrefixOWLOntologyFormat pm) { 
        OWLObjectRenderer renderer = new DLSyntaxObjectRenderer(); 
        for (SWRLRule rule : ontology.getAxioms(AxiomType.SWRL_RULE)) { 
            System.out.println(renderer.render(rule)); 
        } 
    } 
 
    public static void listAllDataPropertyValues(OWLNamedIndividual individual, OWLOntology ontology, OWLReasoner reasoner) { 
        OWLObjectRenderer renderer = new DLSyntaxObjectRenderer(); 
        Map<OWLDataPropertyExpression, Set<OWLLiteral>> assertedValues = individual.getDataPropertyValues(ontology); 
        for (OWLDataProperty dataProp : ontology.getDataPropertiesInSignature(true)) { 
            for (OWLLiteral literal : reasoner.getDataPropertyValues(individual, dataProp)) { 
                Set<OWLLiteral> literalSet = assertedValues.get(dataProp); 
                boolean asserted = (literalSet != null && literalSet.contains(literal)); 
                System.out.println((asserted ? "asserted" : "inferred") + " data property for " + renderer.render(individual) + " : " 
                        + renderer.render(dataProp) + " -> " + renderer.render(literal)); 
            } 
        } 
    } 
	

}
