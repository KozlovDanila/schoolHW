package lesson4.hw.premium;

import java.util.Scanner;

/**
 * В примере используется подобие паттерна "Стратегия"
 */
public class App {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Введите вашу должность");
		String worker = scanner.next();

		PremiumFondCalculator premiumFondCalculator = new PremiumFondCalculator(1_000_000);
		double result = premiumFondCalculator.calculate(worker);

		System.out.println("Ваша пермия = " + result);
	}
}
