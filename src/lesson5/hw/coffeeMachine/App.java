package lesson5.hw.coffeeMachine;

import lesson5.hw.coffeeMachine.coffee.*;

import java.util.Scanner;

/**
 * В данном примере используется паттерн "Декоратор"
 */
public class App {

	public static void main(String[] args) {
		final BeverageMachine beverageMachine = new BeverageMachine(new IBeverage[]{
				new Coffee(),
				new Tea(),
				new Milk(new Coffee()),
				new Milk(new Tea()),
				new Cinnamon(new Milk(new Coffee())),
				new Cinnamon(new Milk(new Tea())),
		});

		System.out.println("Введите номер напитка");
		System.out.println(beverageMachine.getNames());

		Scanner scanner = new Scanner(System.in);
		int beverageIndex = scanner.nextInt();
		System.out.println("Стоимость напитка = " + beverageMachine.getCost(beverageIndex - 1));
	}
}
