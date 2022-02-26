package lesson5.hw.calculator;

import lesson5.hw.calculator.calculators.IOperation;

import java.util.Scanner;


/**
 * В данном примере используются паттерны "Фабрика или 'Простая фабрика'"
 * и паттерн "Стратегия"
 */
public class App {

	private final UserExpressionParser parser = new UserExpressionParser();
	private final OperationFactory calculatorFactory = new OperationFactory();
	private final Calculator calculator = new Calculator();

	public static void main(String[] args) {
		App app = new App();
		String expression = app.getUserExpression();
		ForOperationData userData = app.getUserDataByExpression(expression);
		double result = app.calculate(userData);
		System.out.println("Результат выражения " + expression + " = " + result);
	}

	private String getUserExpression() {
		System.out.println("Введите выражение");
		Scanner scanner = new Scanner(System.in);
		return scanner.nextLine();
	}

	private ForOperationData getUserDataByExpression(String expression) {
		return parser.parse(expression);
	}

	private double calculate(ForOperationData userData) {
		OperationType typeByValue = OperationType.getTypeByValue(userData.getType()); // Вот это не очень хорошо, но оставим так
		IOperation calculatorImpl = calculatorFactory.get(typeByValue);
		return calculator.calculate(userData.getX(), userData.getY(), calculatorImpl);
	}
}
