package fixture.owl.model.rule;

import fixture.owl.model.enumeration.LogicalOperator;

public class LogicalExpression extends Antecedent {

	
	private Antecedent rightSideComposition;
	
	private Antecedent leftSideComposition;
	
	private LogicalOperator logicalOperator;
	
	
	public LogicalExpression() {
		super();
	}

	public LogicalExpression(String id, String name) {
		super(id, name);
	}


	public void setLogicalOperator(int logicalOperator) {
		this.logicalOperator = LogicalOperator.get(logicalOperator);
	}
	

	public Antecedent getLeftSideComposition() {
		return leftSideComposition;
	}

	public void setLeftSideComposition(Antecedent leftSideComposition) {
		this.leftSideComposition = leftSideComposition;
	}

	public LogicalOperator getLogicalOperator() {
		return logicalOperator;
	}

	public void setLogicalOperator(LogicalOperator logicalOperator) {
		this.logicalOperator = logicalOperator;
	}

	public Antecedent getRightSideComposition() {
		return rightSideComposition;
	}

	public void setRightSideComposition(Antecedent rightSideComposition) {
		this.rightSideComposition = rightSideComposition;
	}

	
	public boolean isCompositionLiteral() {
		return false;
	}

	
	public boolean isLogicalExpression() {
		return true;
	}

	
	public boolean isRelationalExpression() {
		return false;
	}
	
} // ExpressaoLogica
