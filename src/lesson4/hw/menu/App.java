package lesson4.hw.menu;

import lesson4.hw.menu.items.*;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		MenuItem[] menuItems = {
				new NewGameItem(),
				new ExitItem(),
				new ResumeGameItem(),
				new SettingsItem()
		};

		Menu menu = new Menu(menuItems);

		System.out.println(menu.getAllMenuNames());
		System.out.println("Введите пункт меню!");

		Scanner scanner = new Scanner(System.in);
		int menuIndex = scanner.nextInt();
		menu.getItem(menuIndex).execute();
	}
}
