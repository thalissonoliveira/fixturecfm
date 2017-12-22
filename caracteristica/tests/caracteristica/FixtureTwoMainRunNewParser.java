package caracteristica;

import java.io.IOException;
import java.net.URISyntaxException;

import org.semanticweb.owlapi.model.OWLOntologyCreationException;

import examples.code.SPLTestObjectsFactory;
import fixture.owl.model.SPL;
import fixture.owl.model.intefaces.Nameable;
import fixture.owl.parser.ParserFeaToOntoFixture;

public class FixtureTwoMainRunNewParser {
	
	public static void main(String[] args) throws OWLOntologyCreationException, URISyntaxException, InstantiationException, IllegalAccessException, ClassNotFoundException, IOException {
		runFeaToOntoFixtureTest();
	}
	
	public static void runFeaToOntoFixtureTest() {
		
		ParserFeaToOntoFixture fixture = new ParserFeaToOntoFixture();
		SPL spl = new SPL("@spl","TESTE");
		SPLTestObjectsFactory.inserirFeaturesAndCompositionRuleNaLPSNewParser(spl, fixture);
		fixture.run(spl);
		
	}
	
}
