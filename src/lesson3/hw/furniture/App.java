package lesson3.hw.furniture;

import java.util.Scanner;

public class App {

	static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Давайте создадим мебель");

		Furniture furniture = new Furniture();

		System.out.println("Введите название");
		furniture.setName(scanner.nextLine());

		System.out.println("Введите цвет");
		furniture.setColor(scanner.nextLine());

		System.out.println("Введите тип");
		furniture.setType(FurnitureType.getByName(scanner.nextLine()));

		System.out.println("Вы создали: " + furniture);
	}
}
