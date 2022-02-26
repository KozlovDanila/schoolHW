package lesson5;

public class ActionExecutor {

	private IAction action;

	public ActionExecutor(IAction action) {
		this.action = action;
	}

	public void doAction() {
		action.doAction();
	}

	public void setAction(IAction action) {
		this.action = action;
	}
}
