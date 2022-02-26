package lesson5.hw.calculator;

import lesson5.hw.calculator.calculators.IOperation;

/**
 * Выполнение арифмитического действия
 */
public class Calculator {

	/**
	 * Выполняет действие над двумя числами
	 * @param x левый операнд
	 * @param y правый операнд
	 * @param calculator Арифмитическая операция
	 * @return
	 */
	public double calculate(double x, double y, IOperation calculator) {
		return calculator.execute(x, y);
	}
}
