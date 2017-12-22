package fixture.owl.model.rule;

public abstract class Event extends Expression {
	
	public Event() {
		super();
	}
	
	public Event(String id, String name) {
		super();
		this.setId(id);
		this.setName(name);
	}
	public abstract boolean isLogicalEvent();
	public abstract boolean isRelationalEvent();
} // Evento
