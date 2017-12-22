package fixture.owl.model.rule;


/**
 * 
 * @author thalissonoliveira
 *
 */
public class ContextRule extends Rule {
	
	private Event event;
	
	private Action action;
	
	public ContextRule() {
		super();
	}

	public ContextRule(String id, String name) {
		super(id, name);
	}

	public Event getEvent() {
		return event;
	}

	public void setEvent(Event event) {
		this.event = event;
	}

	public Action getAction() {
		return action;
	}

	public void setAction(Action action) {
		this.action = action;
	}

	
	public boolean isCompositionRule() {
		return false;
	}
	
	
	public boolean isContextRule() {
		return true;
	}
	
} // RegraDeContexto
