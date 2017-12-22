package utils;

import org.sat4j.core.VecInt;
import org.sat4j.minisat.SolverFactory;
import org.sat4j.specs.ContradictionException;
import org.sat4j.specs.IProblem;
import org.sat4j.specs.ISolver;
import org.sat4j.specs.TimeoutException;
public class SatSolver
{
	public SatSolver()
	{
		
	}
	
	public String nome;	
	
	
	public boolean DoIt(int maxVar, int nbClauses, String stringClauses) throws ContradictionException
	{       int MAXVAR = maxVar;
	        int NBCLAUSES = nbClauses;
	        boolean returnValue=false;
	        ISolver solver = SolverFactory.newDefault();
	        solver.setTimeout(3600); // 1 hour timeout
	        

	        // prepare the solver to accept MAXVAR variables. MANDATORY
	        solver.newVar(MAXVAR);
	        // not mandatory for SAT solving. MANDATORY for MAXSAT solving
	        solver.setExpectedNumberOfClauses(NBCLAUSES);
	        // Feed the solver using Dimacs format, using arrays of int
	        // (best option to avoid dependencies on SAT4J IVecInt)
	        String[] temporaryClauses = stringClauses.split("\\,0,");
	        for (int i=0;i<NBCLAUSES;i++)
	        {
	        	
	          String[] temporaryClause = temporaryClauses[i].split("\\,");// get the clause from somewhere
	          // the clause should not contain a 0, only integer (positive or negative)
	          // with absolute values less or equal to MAXVAR
	          
	          int [] clause = new int[temporaryClause.length];
	          
	          for(int j=0; j < temporaryClause.length ; j++)
	          {
	        	  clause[j] = Integer.parseInt(temporaryClause[j]);
	          }
	          
	          // while int [] clause = {1, -3, 7, 0}; is not fine 
	          solver.addClause(new VecInt(clause)); // adapt Array to IVecInt
	        }
	        try
	        {
	        	IProblem problem = solver;
	            returnValue= problem.isSatisfiable();
	        }
	        catch (TimeoutException e)
	        {
	            System.out.println("Timeout, sorry!");      
	        }
	        
	        return returnValue;
	        
	}
}
