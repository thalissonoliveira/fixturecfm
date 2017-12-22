package fixture.owl.model.rule;

import fixture.owl.model.enumeration.LogicalOperator;

public class LogicalEvent extends Event {
	
	private Event rightSideEvent;
	
	private Event leftSideEvent;
	
	private LogicalOperator logicalOperator;
	

	public LogicalEvent() {
		super();
	}

	public LogicalEvent(String id, String name) {
		super(id, name);
	}

	public void setLogicalOperator(int logicalOperator) {
		this.logicalOperator = LogicalOperator.get(logicalOperator);
	}

	public Event getRightSideEvent() {
		return rightSideEvent;
	}

	public void setRightSideEvent(Event rightSideEvent) {
		this.rightSideEvent = rightSideEvent;
	}

	public Event getLeftSideEvent() {
		return leftSideEvent;
	}

	public void setLeftSideEvent(Event leftSideEvent) {
		this.leftSideEvent = leftSideEvent;
	}

	public LogicalOperator getLogicalOperator() {
		return logicalOperator;
	}

	public void setLogicalOperator(LogicalOperator logicalOperator) {
		this.logicalOperator = logicalOperator;
	}

	
	public boolean isLogicalEvent() {
		return true;
	}

	
	public boolean isRelationalEvent() {
		return false;
	}
	
} // EventoLogico
