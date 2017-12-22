package fixture.owl.model.rule;


public abstract class Action extends Expression {
	
	public Action() {
		super();
	}
	
	public Action(String id, String name) {
		super();
		this.setId(id);
		this.setName(name);
	}
	
	public abstract boolean isActionLiteral();
	public abstract boolean isDesignate();
	public abstract boolean isLogicalAction();
	
}
