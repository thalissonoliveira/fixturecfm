package fixture.owl.model.rule;

import fixture.owl.model.element.Attribute;
import fixture.owl.model.enumeration.RelationalOperator;

public class RelationalExpression extends Antecedent {
	
	private Attribute expressionVariable;
	
	private RelationalOperator relationalOperator;
	
	private String value;
	
	public RelationalExpression() {
		super();
	}

	public RelationalExpression(String id, String name) {
		super(id, name);
	}

	public void setRelationalOperator(int  relationalOperator) {
		this.relationalOperator = RelationalOperator.get(relationalOperator);
	}
	
	public Attribute getExpressionVariable() {
		return expressionVariable;
	}

	public void setExpressionVariable(Attribute expressionVariable) {
		this.expressionVariable = expressionVariable;
	}

	public RelationalOperator getRelationalOperator() {
		return relationalOperator;
	}

	public void setRelationalOperator(RelationalOperator relationalOperator) {
		this.relationalOperator = relationalOperator;
	}
	
	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	
	public boolean isCompositionLiteral() {
		return false;
	}

	
	public boolean isLogicalExpression() {
		return false;
	}

	
	public boolean isRelationalExpression() {
		return true;
	}
	
} // ExpressaoRelacional
