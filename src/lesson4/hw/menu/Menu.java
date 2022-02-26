package lesson4.hw.menu;

import lesson4.hw.menu.items.MenuItem;

/**
 * Класс, хрогящий в себе пункты меню
 */
public class Menu {

	/**
	 * Пункты меню
	 */
	private final MenuItem[] menuItems;

	public Menu(MenuItem[] menuItems) {
		this.menuItems = menuItems;
	}

	/**
	 * @return пункты меню в виде списка
	 */
	public String getAllMenuNames() {
		StringBuilder builder = new StringBuilder();
		for (int i = 0; i < menuItems.length; i++) {
			builder.append(i + 1).append(". ").append(menuItems[i].getName()).append("\n");
		}
		return builder.toString();
	}

	/**
	 * Получение нужного пункта меню
	 *
	 * @param index номер пункта
	 * @return пункт меню
	 */
	public MenuItem getItem(int index) {
		if (index <= 0 || index > menuItems.length) {
			return new MenuItem();
		}
		return menuItems[index - 1];
	}
}
