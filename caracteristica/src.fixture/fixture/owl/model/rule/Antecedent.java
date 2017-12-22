package fixture.owl.model.rule;


public abstract class Antecedent extends Expression {
	
	
	public Antecedent() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Antecedent(String id, String name) {
		super();
		this.setId(id);
		this.setName(name);
	}
	
	public abstract boolean isCompositionLiteral();
	public abstract boolean isLogicalExpression();
	public abstract boolean isRelationalExpression();

} // Antecedente
