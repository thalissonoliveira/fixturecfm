package utils;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;

import jdd.bdd.BDD;

/**
 * This is the most simple BDD example. Created for those of you doing
 * BDD coding for the first time.
 *
 * <p>
 * The comments in the code will guide you thr creating a very simple
 * BDD Application
 */

// This is our class "Simple1", where we will put all the code for this simple example:
public class DecisionDiagram{


	
	public DecisionDiagram(){}
	
	public String DoIt(){return "oi";}
	
	public BDD CreateBDD(int nodeTableSize, int operationCache) 
	{
		return new BDD(nodeTableSize,operationCache);
	}
	
	public int CreateVar(BDD bdd)
	{
		return bdd.createVar();		
	}
	public int BigOr(BDD bdd, ArrayList<Integer> variaveis)
	{
		int dumb=bdd.getZero();
		
		for(int i : variaveis)
		{
			dumb=bdd.ref(bdd.or(dumb, i));
		}	
		
		return dumb;		
	}
	public int BigXOr(BDD bdd, ArrayList<Integer> variaveis)
	{	
		if(variaveis.size()==1)
			return variaveis.get(0);
		
		int index=2;		
		int dumb=bdd.ref(bdd.xor(variaveis.get(0), variaveis.get(1)));
		while(index<variaveis.size())		
		{
			dumb=bdd.ref(bdd.xor(dumb, variaveis.get(index)));
			index++;
		}	
		
		return dumb;		
	}
	public int BigAnd(BDD bdd, ArrayList<Integer> variaveis)
	{
		int dumb=bdd.getOne();
		
		for(int i : variaveis)
		{
			dumb=bdd.ref(bdd.and(dumb, i));
		}	
		
		return dumb;		
	}
	
	public int FOr(BDD bdd, int v1, int v2){
		int t=bdd.or(v1,v2);	
		bdd.ref(t);
		return t;
	}
	public int FXor(BDD bdd, int v1, int v2){
		int t=bdd.xor(v1,v2);	
		bdd.ref(t);
		return t;
	}
	public int FAnd(BDD bdd, int v1, int v2){
		int t=bdd.and(v1,v2);	
		bdd.ref(t);
		return t;
	}
	public int FImplica(BDD bdd, int v1, int v2)
	{
		int t=bdd.imp(v1, v2);
		bdd.ref(t);
		return t;
	}
	public int FEquivale(BDD bdd, int v1, int v2)
	{
		int t=bdd.biimp(v1, v2);
		bdd.ref(t);
		return t;
	}
	
	public int FNot(BDD bdd, int v1){	
		int t=bdd.not(v1);
		bdd.ref(t);		
		return t;
	}
	public void FRef(BDD bdd, int v1){
		bdd.ref(v1);
	}
	public void FDeRef(BDD bdd, int v1){
		bdd.deref(v1);
	}
	
	public String[] Solve(BDD bdd, int formula){		
		
		
		PrintStream outAntigo = System.out;
		PrintStream errAntigo = System.err;
		List<String> resultados = new ArrayList<String>();  
		
		try
		{
			File f = new File("solution.txt");
			System.out.println(f.getAbsolutePath());			
			PrintStream ps;
			ps = new PrintStream(f);			
			bdd.printSet(formula);
			System.setOut(ps); // catches System.out messages  
			System.setErr(ps); // catches error messages  
			
			bdd.printSet(formula);
			 try {
			        BufferedReader in = new BufferedReader(new FileReader(f.getAbsolutePath()));
			            String str;
			            while (in.ready()) {
			                str = in.readLine();
			                if(str.length()!=0)
			                	resultados.add(str);
			            }
			            in.close();
			    } catch (IOException e){}
				
			System.out.println(resultados);	
			
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		}  
		finally
		{
			 System.setOut(outAntigo); // catches System.out messages  
				System.setErr(errAntigo);	
			//bdd.cleanup();
		}
		return resultados.toArray(new String[resultados.size()]);
		
	}
	
}