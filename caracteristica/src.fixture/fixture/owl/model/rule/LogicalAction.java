package fixture.owl.model.rule;

import fixture.owl.model.enumeration.LogicalActionOperator;

public class LogicalAction extends Action {
	
	private Action rightSideAction;
	
	private Action leftSideAction;
	
	private LogicalActionOperator logicalActionOperator;
	
	public LogicalAction() {
		super();
	}

	public LogicalAction(String id, String name) {
		super(id, name);
	}
	
	public void setLogicalActionOperator(int logicalActionOperator) {
		this.logicalActionOperator = LogicalActionOperator.get(logicalActionOperator);
	}

	public Action getRightSideAction() {
		return rightSideAction;
	}

	public void setRightSideAction(Action rightSideAction) {
		this.rightSideAction = rightSideAction;
	}

	public Action getLeftSideAction() {
		return leftSideAction;
	}

	public void setLeftSideAction(Action leftSideAction) {
		this.leftSideAction = leftSideAction;
	}

	public LogicalActionOperator getLogicalActionOperator() {
		return logicalActionOperator;
	}

	public void setLogicalActionOperator(LogicalActionOperator logicalActionOperator) {
		this.logicalActionOperator = logicalActionOperator;
	}
	
	
	public boolean isActionLiteral() {
		return false;
	}

	
	public boolean isDesignate() {
		return false;
	}

	
	public boolean isLogicalAction() {
		return true;
	}

	
}
