package lesson5;

public class ActionFactory {

	public static IAction get(String actionName) {
		return new Exit();
	}
}
