package lesson4.hw.menu.test;

import lesson4.hw.menu.Menu;
import lesson4.hw.menu.items.*;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MenuTest {

	private Menu menu;

	@Before
	public void setUp() {
		menu = new Menu(new MenuItem[]{
				new NewGameItem(),
				new ResumeGameItem(),
				new SettingsItem(),
				new ExitItem()
		});
	}

	@Test
	public void getAllMenuNames() {
		String names = menu.getAllMenuNames();
		assertEquals(names, "1. Новая игра\n2. Продолжить игру\n3. Настройки\n4. Выйти\n");
	}

	@Test
	public void checkGetMenuItem() {
		assertEquals(menu.getItem(1).getName(), "Новая игра");
		assertEquals(menu.getItem(2).getName(), "Продолжить игру");
		assertEquals(menu.getItem(3).getName(), "Настройки");
		assertEquals(menu.getItem(4).getName(), "Выйти");
		assertEquals(menu.getItem(0).getName(), "Неверный пункт!");
		assertEquals(menu.getItem(5).getName(), "Неверный пункт!");
	}
}
