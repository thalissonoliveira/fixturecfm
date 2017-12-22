package fixture.owl.dlquery;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.coode.dlquery.DLQueryResultsSection;
import org.coode.dlquery.DLQueryResultsSectionItem;
import org.coode.dlquery.ResultsSection;
import org.coode.owlapi.manchesterowlsyntax.ManchesterOWLSyntaxEditorParser;
import org.semanticweb.owlapi.expression.OWLEntityChecker;
import org.semanticweb.owlapi.expression.ParserException;
import org.semanticweb.owlapi.expression.ShortFormEntityChecker;
import org.semanticweb.owlapi.model.OWLClass;
import org.semanticweb.owlapi.model.OWLClassExpression;
import org.semanticweb.owlapi.model.OWLDataFactory;
import org.semanticweb.owlapi.model.OWLIndividual;
import org.semanticweb.owlapi.model.OWLNamedIndividual;
import org.semanticweb.owlapi.model.OWLObject;
import org.semanticweb.owlapi.model.OWLOntology;
import org.semanticweb.owlapi.model.OWLOntologyCreationException;
import org.semanticweb.owlapi.reasoner.Node;
import org.semanticweb.owlapi.reasoner.OWLReasoner;
import org.semanticweb.owlapi.util.BidirectionalShortFormProvider;
import org.semanticweb.owlapi.util.BidirectionalShortFormProviderAdapter;
import org.semanticweb.owlapi.util.ShortFormProvider;
import org.semanticweb.owlapi.util.SimpleShortFormProvider;

import com.clarkparsia.pellet.owlapiv3.PelletReasoner;
import com.clarkparsia.pellet.owlapiv3.PelletReasonerFactory;

import fixture.owl.utils.OntoHelper;
import fixture.owl.utils.OntoUtils;
import fixture.owl.utils.Utils;


public class DLQueryEngine {
	
	
	public static void main(String[] args) throws OWLOntologyCreationException {
		
		String resultDLQuery = new DLQueryEngine().executeDLQuery("Feature and hasFatherFeature some RootFeature");
    	System.out.println(resultDLQuery);
	}
	
	
	@SuppressWarnings("unused")
	private List<Object> setOWLClassExpression(String classExpressionString, OntoHelper ontoHelper) {
		
		OWLClassExpression description = parseClassExpression(classExpressionString, ontoHelper);
		
		OWLReasoner reasoner = PelletReasonerFactory.getInstance().createReasoner(ontoHelper.getMetaOntology());
	   
        List<Object> data = new ArrayList<Object>();
        OWLDataFactory factory = ontoHelper.getDataFactory();
        
        Set<OWLClass> results = reasoner.getEquivalentClasses(description).getEntities();
        data.add(new DLQueryResultsSection(ResultsSection.EQUIVALENT_CLASSES.getDisplayName() + " (" + results.size() + ")"));
        for (OWLClass cls : results) {
            data.add(new DLQueryResultsSectionItem(cls, factory.getOWLEquivalentClassesAxiom(description, cls)));
        }
        
        results = reasoner.getSuperClasses(description, false).getFlattened();
        data.add(new DLQueryResultsSection(ResultsSection.SUPER_CLASSES.getDisplayName() + " (" + results.size() + ")"));
        for (OWLClass superClass : results) {
            data.add(new DLQueryResultsSectionItem(superClass, factory.getOWLSubClassOfAxiom(description, superClass)));
        }
        
        results = reasoner.getSuperClasses(description, true).getFlattened();
        data.add(new DLQueryResultsSection(ResultsSection.DIRECT_SUPER_CLASSES.getDisplayName() + " (" + results.size() + ")"));
        for (OWLClass superClass : results) {
            data.add(new DLQueryResultsSectionItem(superClass, factory.getOWLSubClassOfAxiom(description, superClass)));
        }
        
        Set<OWLClass> resultSet = new HashSet<OWLClass>();
        for (Node<OWLClass> clsSet : reasoner.getSubClasses(description, true)) {
            resultSet.addAll(clsSet.getEntities());
        }
        
        results = resultSet;
        data.add(new DLQueryResultsSection(ResultsSection.DIRECT_SUB_CLASSES.getDisplayName() + " (" + results.size() + ")"));
        for (OWLClass subClass : results) {
            data.add(new DLQueryResultsSectionItem(subClass, factory.getOWLSubClassOfAxiom(subClass, description)));
        }
        
        resultSet = new HashSet<OWLClass>();
        for (Node<OWLClass> clsSet : reasoner.getSubClasses(description, false)) {
            resultSet.addAll(clsSet.getEntities());
        }
        
        results = resultSet;
        data.add(new DLQueryResultsSection(ResultsSection.SUB_CLASSES.getDisplayName() + " (" + results.size() + ")"));
        for (OWLClass cls : results) {
            data.add(new DLQueryResultsSectionItem(cls, factory.getOWLSubClassOfAxiom(cls, description)));
        }
        
        Set<OWLNamedIndividual> flattened = reasoner.getInstances(description, false).getFlattened();
        data.add(new DLQueryResultsSection(ResultsSection.INSTANCES.getDisplayName() + " (" + results.size() + ")"));
        for (OWLIndividual ind : flattened) {
            data.add(new DLQueryResultsSectionItem(ind, factory.getOWLClassAssertionAxiom(description, ind)));
        }
        
        return data;
    }
	
	private List<Object> executeDLQuery(OWLReasoner reasoner, String classExpressionString, OntoHelper ontoHelper) {
		
		OWLClassExpression description = parseClassExpression(classExpressionString, ontoHelper);
		
        List<Object> data = new ArrayList<Object>();
        OWLDataFactory factory = ontoHelper.getDataFactory();
        
        Set<OWLNamedIndividual> flattened = reasoner.getInstances(description, false).getFlattened();
        data.add(new DLQueryResultsSection(ResultsSection.INSTANCES.getDisplayName() + " (" + flattened.size() + ")"));
        for (OWLIndividual ind : flattened) {
            data.add(new DLQueryResultsSectionItem(ind, factory.getOWLClassAssertionAxiom(description, ind)));
        }
        
        return data;
    }
	
	
	
	public String executeDLQuery(String classExpressionString) throws OWLOntologyCreationException {
    	OntoHelper ontoHelper = new OntoHelper();
    	ontoHelper.loadOntology(Utils.SPLiSEM_OUTPUT_PATH, Utils.SPLiSEM_OUTPUT_PATH);
    	OWLReasoner reasoner = PelletReasonerFactory.getInstance().createReasoner(ontoHelper.getMetaOntology());
    	
    	try {
	    	List<Object> setOWLClassExpression = executeDLQuery(reasoner, classExpressionString, ontoHelper);
	    	
	    	StringBuilder result = null;
	    	
	    	if (!setOWLClassExpression.isEmpty()) {
	    		result = new StringBuilder();
	    	}
	    	
	    	
	    	for (Object object : setOWLClassExpression) {
	    		
	    		if (object instanceof DLQueryResultsSectionItem) {
	    			DLQueryResultsSectionItem resultado = (DLQueryResultsSectionItem) object;
	    			
	    			OWLObject owlObject = resultado.getOWLObject();
	    			Set<OWLNamedIndividual> individualsInSignature = owlObject.getIndividualsInSignature();
					String relatedName = OntoUtils.getRelatedName((PelletReasoner) reasoner,
							new ArrayList<OWLNamedIndividual>(
									individualsInSignature).get(0), ontoHelper);
	    			
//	    			result.append("1: " + owlObject.getSignature());
	    			result.append("1: " + relatedName);
	    			
	    			result.append("\n");
//	    			System.out.println("1: " + owlObject.getSignature());
	    			
	    		} else if (object instanceof DLQueryResultsSection) {
	    			DLQueryResultsSection resultado = (DLQueryResultsSection) object;
	    			result.append("2: " + resultado.getName());
	    			result.append("\n");
//	    			System.out.println("2: " + resultado.getName());
	    			
	    		}
	    		
//				System.out.println(object);
			}
	
	    	ontoHelper.saveAndRemoveOntology();
	    	
	    	return result == null ? "Query did not return any result." : result.toString();
    	} catch (ParserException e) {
    		return "Erro ao executar a DL Query. Verificar se a sintaxe está incorreta ou se foi informado algum elemento (classe, propriedade, indivíduo) errado.";
    	}
    	
	}
	
	
	/**
	 * Thanks Google and thanks Matthew Horridge  
	 * 
	 *  adaptaded from @author Matthew Horridge, The University of Manchester, Bio-Health
     *         Informatics Group, Date: 13-May-2010
	 * 
	 * @param classExpressionString
	 * @param ontoHelper
	 * @return
	 */
	private OWLClassExpression parseClassExpression(String classExpressionString, OntoHelper ontoHelper) {
		Set<OWLOntology> importsClosure = ontoHelper.getMetaOntology().getImportsClosure();
		
		ShortFormProvider shortFormProvider = new SimpleShortFormProvider();
		
		BidirectionalShortFormProvider bidiShortFormProvider = new BidirectionalShortFormProviderAdapter(ontoHelper.getManager(), importsClosure, shortFormProvider);
		
		OWLDataFactory dataFactory = ontoHelper.getDataFactory();
		ManchesterOWLSyntaxEditorParser parser = new ManchesterOWLSyntaxEditorParser(dataFactory, classExpressionString);
		parser.setDefaultOntology(ontoHelper.getMetaOntology());
		OWLEntityChecker entityChecker = new ShortFormEntityChecker(bidiShortFormProvider);
		parser.setOWLEntityChecker(entityChecker);
		return parser.parseClassExpression();
	}

	
}
