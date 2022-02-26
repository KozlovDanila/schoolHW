package lesson4.hw.temperature;

import java.util.Scanner;

/**
 * В данном примере используются паттерны "Фабрика или 'Простая фабрика'"
 * и паттерн "Стратегия"
 */
public class App {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Введите градусы");
		double degree = scanner.nextDouble();

		System.out.println("Введите единицу измерения. С - для Цельсий, F - для Фаренгейт");
		String unit = scanner.next();

		Converter converter = new Converter(new CalculatorFactory());
		double result = converter.convert(degree, unit);
		System.out.println("Результат = " + result);
	}
}
