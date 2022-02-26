package lesson5.hw.zerosAndOnes;

import java.util.Scanner;

/**
 * В данной реализации используется теория конечно автомата
 * и подобие паттерн "Состояние"
 */
public class App {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Введите строку из нулей и единиц");
		String value = scanner.nextLine();
		System.out.println(new ZeroAndOnesStateMachine(value).execute());
	}
}
