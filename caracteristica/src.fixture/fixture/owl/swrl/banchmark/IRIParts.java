package fixture.owl.swrl.banchmark;

import org.mindswap.pellet.ABox;
import org.mindswap.pellet.Node;
import org.mindswap.pellet.utils.ATermUtils;

/** 
 * The built-in implementation. 
 */ 
public class IRIParts implements CustomSWRLBuiltin.CustomSWRLFunction { 
	
	private final String XSD = "http://www.w3.org/2001/XMLSchema#";

     
    public boolean isApplicable(boolean[] boundPositions) { 
        //applicable only to 4 arguments, two bound and two unbound 
        return boundPositions.length == 4 && boundPositions[0] && boundPositions[1] && !boundPositions[2] && !boundPositions[3]; 
    } 

     
    public boolean apply(ABox abox, Node[] args) { 
        //accepts IRIparts(individual,separator string,unbound variable,unbound variable) 
        if (!args[0].isIndividual() || !args[1].isLiteral() || args[2] != null || args[3] != null) return false; 
        //get the IRI of the individual in the first argument 
        String iri = args[0].getNameStr(); 
        //get the string value of the second argument 
        String separator = ATermUtils.getLiteralValue(args[1].getTerm()); 
        //split the IRI at the separator 
        int idx = iri.indexOf(separator); 
        if (idx == -1) return false; 
        String prefix = iri.substring(0, idx); 
        String id = iri.substring(idx + separator.length()); 
        //bind the third and fourth arguments to the IRI parts 
        args[2] = abox.addLiteral(ATermUtils.makeTypedLiteral(prefix, XSD + "string")); 
        args[3] = abox.addLiteral(ATermUtils.makeTypedLiteral(id, XSD + "string")); 
        return true; 
    } 
} 