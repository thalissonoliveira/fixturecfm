package fixture.owl.reasoner;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

import org.semanticweb.owlapi.model.AxiomType;
import org.semanticweb.owlapi.model.OWLAxiom;
import org.semanticweb.owlapi.model.OWLClass;
import org.semanticweb.owlapi.model.OWLObjectProperty;
import org.semanticweb.owlapi.model.OWLOntology;
import org.semanticweb.owlapi.model.OWLOntologyCreationException;
import org.semanticweb.owlapi.model.SWRLAtom;
import org.semanticweb.owlapi.model.SWRLClassAtom;
import org.semanticweb.owlapi.model.SWRLObjectPropertyAtom;
import org.semanticweb.owlapi.model.SWRLRule;

import com.clarkparsia.pellet.owlapiv3.PelletReasoner;
import com.clarkparsia.pellet.owlapiv3.PelletReasonerFactory;
import com.clarkparsia.pellet.rules.builtins.BuiltInRegistry;

import fixture.owl.enumeration.FixtureSWRLBuiltinEnum;
import fixture.owl.enumeration.OWLObjectPropertyTypeEnum;
import fixture.owl.enumeration.RulesConstraintsOWLClassTypeEnum;
import fixture.owl.factory.OWLClassFactory;
import fixture.owl.factory.OWLObjectPropertyFactory;
import fixture.owl.rules.error.SWRLError;
import fixture.owl.rules.error.SWRLErrorBuilder;
import fixture.owl.rules.error.SWRLErrorBuilderV2;
import fixture.owl.swrl.FixtureBuiltin;
import fixture.owl.swrl.FixtureEqualNameFeatureBuiltinHelper;
import fixture.owl.utils.EnumHelper;
import fixture.owl.utils.OntoHelper;
import fixture.owl.utils.Utils;

/**
 * 
 * 
 * @author thalissonoliveira
 *
 */
public class RulesAnalyser {
	
	private OntoHelper ontoHelper;
	private PelletReasoner reasoner;
	
	public String run() throws InstantiationException, IllegalAccessException, OWLOntologyCreationException, ClassNotFoundException {
		BuiltInRegistry.instance.registerBuiltIn(FixtureSWRLBuiltinEnum.EQUAL_NAME.getPathUri(), new FixtureBuiltin(new FixtureEqualNameFeatureBuiltinHelper()));
    	ontoHelper = new OntoHelper();
    	ontoHelper.loadOntology(Utils.SPLiSEM_OUTPUT_PATH, Utils.SPLiSEM_OUTPUT_PATH);
    	String message = checkRules();
    	ontoHelper.saveAndRemoveOntology();
    	return message;
	}

	private String checkRules() {
		//TODO REFAZER ESSA ESTRUTURA PARA GERAR UM RELATORIO DE ERROS GENERICO.
		reasoner = PelletReasonerFactory.getInstance().createReasoner(ontoHelper.getMetaOntology());
		reasoner.flush();
		
		ontoHelper.saveOntology();
	
		//TODO Ver uma maneira de fazer essa verificacao sem jena (sem parser de owl pra rdf)
//		verifyOntologyConsistency(ontoHelper.getMetaOntology(), reasoner);
		
		//TODO Ler o arquivo e fazer a verificacao. Trazer os dados e colocar em um objeto que trabalha com 
		//     objetos (vide codigo que nao contenha )
		
		Set<SWRLError> brokenRules = processRules();
		StringBuilder sb = new StringBuilder();
		sb.append("               FixOnto Analysis Result\n");
		sb.append(".-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.\n");
		if (brokenRules != null && !brokenRules.isEmpty()) {
			for (SWRLError swrlError : brokenRules) {
				sb.append(swrlError.getDescription());
				sb.append(".-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.\n");
			}
			System.out.println("####### CHECK IT OUT! #######");
			System.out.println(sb.toString());
		} else {
			sb.append("[FIXONTO] - There are no broken rules");
			System.err.println("[FIXTURE2][LOG] - NENHUMA REGRA FOI VIOLADA NA VERIFICACAO DO MCSC!");
		}
		
		
		return sb.toString();
		
		//TODO VER OUTRA STRING RESULTANTE, POIS DO JEITO QUE ESTAH TAH F. MOSTRAR APENAS OS ERROS. NAO PRECISA MOSTRAR QUE REGRA X DEU CERTO. >>> ITERAR NAS BROKEN RULES
		

//		System.out.println("####### CHECK IT OUT! #######");
//		
//		boolean hasError = false;
//		StringBuilder sb = new StringBuilder();
//		int index = 0;
//		for (SWRLError swrlError : swrlErrors) {
//			if (swrlError != null) {
//				sb.append(swrlError.getDescription() + "\n");
//				hasError = true;
//			} else {
//				sb.append("RULE" + index +"[OK]" + "\n");
//			}
//			sb.append(".-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-\n");
//			index++;
//		}
//		
//		if (!hasError) {
//			System.err.println("[FIXTURE2][LOG] - NENHUMA REGRA FOI VIOLADA NA VERIFICACAO DO MCSC!");
//		} else {
//			System.out.println(sb.toString());
//		}
//		
//		return sb.toString();
	}
	
	@SuppressWarnings("unchecked")
	public Set<SWRLError> processRules() {
		Set<SWRLError> errors = new HashSet<SWRLError>();
		AxiomType<?> type = AxiomType.getAxiomType("Rule");
		OWLOntology metaOntology = ontoHelper.getMetaOntology();
		Set<OWLAxiom> ruleAxioms = (Set<OWLAxiom>) metaOntology.getAxioms(type);
		SWRLRule rule = null;
		SWRLError error;
		for (OWLAxiom ruleAxiom : ruleAxioms) {
			rule = (SWRLRule) ruleAxiom;
			Set<SWRLAtom> head = rule.getHead();
			error = execute(ontoHelper, reasoner, head);
			if (error != null) {
				errors.add(error);
			}
		}
		return errors;
	}
	
	private SWRLError execute(OntoHelper ontoHelper, PelletReasoner pelletReasoner, Set<SWRLAtom> head) {
		String typeRuleString = null;
		String objectPropertyRuleString = null;
		
		for (SWRLAtom swrlAtom : head) {
			if (swrlAtom instanceof SWRLClassAtom) {
				Set<OWLClass> classesInSignature = swrlAtom.getClassesInSignature();
				if (classesInSignature.size() == 1) {
					OWLClass ruleOwlClass = new ArrayList<OWLClass>(classesInSignature).get(0);
					typeRuleString = ruleOwlClass.getIRI().getFragment();
				} else  {
					throw new RuntimeException("Inconsistent rule head [SWRLClassAtom]!");
				}
			} else if (swrlAtom instanceof SWRLObjectPropertyAtom) {
				Set<OWLObjectProperty> objectPropertiesInSignature = swrlAtom.getObjectPropertiesInSignature();
				if (objectPropertiesInSignature.size() == 1) {
					OWLObjectProperty ruleObjectProperty = new ArrayList<OWLObjectProperty>(objectPropertiesInSignature).get(0);
					objectPropertyRuleString = ruleObjectProperty.getIRI().getFragment();
				} else  {
					throw new RuntimeException("Inconsistent rule head [SWRLObjectPropertyAtom]!");
				}
			} else {
				throw new RuntimeException("Inconsistent rule head [SWRLAtom]!");
			}
		}
		
		RulesConstraintsOWLClassTypeEnum ruleEnum = typeRuleString == null ? null : EnumHelper.findByLabel(RulesConstraintsOWLClassTypeEnum.class, typeRuleString);
		OWLObjectPropertyTypeEnum objectPropertyEnum = objectPropertyRuleString == null ? null : EnumHelper.findByLabel(OWLObjectPropertyTypeEnum.class, objectPropertyRuleString);//OWLObjectPropertyTypeEnum.valueOf(objectPropertyRuleString);
		
		if (ruleEnum != null) {
			if (objectPropertyEnum != null) {
				OWLClass gfrOWLClass = OWLClassFactory.getInstance(ontoHelper).get(ruleEnum);
				OWLObjectProperty hasEqualNameObjectProperty = OWLObjectPropertyFactory.getInstance(ontoHelper).get(objectPropertyEnum);
				return SWRLErrorBuilderV2.build(ruleEnum, pelletReasoner, gfrOWLClass, hasEqualNameObjectProperty, ontoHelper);
			} else {
				OWLClass gfrOWLClass = OWLClassFactory.getInstance(ontoHelper).get(ruleEnum);
				return SWRLErrorBuilderV2.build(ruleEnum, pelletReasoner, gfrOWLClass, ontoHelper);
			}
		} else {
			throw new RuntimeException("Invalid Rule");
		}
		
	}
	
	public static void main(String[] args) throws InstantiationException, IllegalAccessException, OWLOntologyCreationException, ClassNotFoundException {
		new RulesAnalyser().run();
	}
	
}
