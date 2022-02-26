package lesson4.hw.menu.items;

/**
 * пункт меню
 */
public class MenuItem {

	protected String name = "Неверный пункт!";

	public String getName() {
		return name;
	}

	public void execute() {
		System.out.println("Вы выбрали " + name);
	}
}
