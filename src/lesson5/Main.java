package lesson5;

public class Main {

	public static void main(String[] args) {
		IAction action = ActionFactory.get("newGame");
		ActionExecutor executor = new ActionExecutor(action);
		executor.doAction();
	}

}
