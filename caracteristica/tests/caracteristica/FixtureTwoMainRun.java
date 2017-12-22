package caracteristica;

import java.io.IOException;
import java.net.URISyntaxException;

import org.semanticweb.owlapi.model.OWLOntologyCreationException;

import examples.code.SPLTestObjectsFactory;
import fixture.owl.dlquery.DLQueryEngine;
import fixture.owl.factory.SPLConceptFactory;
import fixture.owl.model.SPL;
import fixture.owl.model.product.ProductOptionalFeature;
import fixture.owl.model.product.ProductVariationTwo;
import fixture.owl.parser.FeaToOntoFixture;
import fixture.owl.reasoner.RulesAnalyser;
import fixture.owl.utils.OntoHelper;
import fixture.owl.utils.Utils;

public class FixtureTwoMainRun {
	
	public static void main(String[] args) throws OWLOntologyCreationException, URISyntaxException, InstantiationException, IllegalAccessException, ClassNotFoundException, IOException {
//		runFeaToOntoFixtureTest();
		runRulesAnalyser();
//		runDlRule();
//		runCoung();
	}
	
	
	private static void runDlRule() throws OWLOntologyCreationException, IOException {
		
        while (true) {
            // Prompt the user to enter a class expression
            System.out.println("Digitar a 'class expression' (DL Query) e aperte Enter (0 pra sair):");
            System.out.print("");
            String classExpression = Utils.readInput();
            if (classExpression.equalsIgnoreCase("x")) {
                break;
            }
            

            new DLQueryEngine().executeDLQuery(classExpression);
            System.out.println();
            System.out.println();
        }
    }
	
	public static void runFeaToOntoFixtureTest() {
		
		FeaToOntoFixture fixture = new FeaToOntoFixture();
		SPL spl = new SPL("100","TESTE");
		
		SPLTestObjectsFactory.inserirFeaturesAndCompositionRuleNaLPS(spl);
		
		fixture.run(spl);
		

	}
	
	
	public static void runRulesAnalyser() throws InstantiationException, IllegalAccessException, OWLOntologyCreationException, ClassNotFoundException {
		RulesAnalyser analyser = new RulesAnalyser();
		analyser.run();
	}
	
//	public static void runCoung() throws OWLOntologyCreationException {
//		OntoHelper ontoHelper = new OntoHelper();
//		ontoHelper.loadOntology(Utils.SPLiSEM_OUTPUT_PATH, Utils.SPLiSEM_OUTPUT_PATH);
//		int countFromOntology = OWLUtils.getInstance(ontoHelper).getCountFromOntology();
//		System.out.println("OI? " + countFromOntology);
//		OWLUtils.getInstance(ontoHelper).addMaxIdCountToOntology();
//		ontoHelper.saveAndRemoveOntology();
//	}
	
}
