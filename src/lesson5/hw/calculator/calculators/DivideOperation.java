package lesson5.hw.calculator.calculators;

/**
 * Деление двух чисел
 */
public class DivideOperation implements IOperation {
	@Override
	public double execute(double x, double y) {
		if (y == 0) {
			return y;
		}
		return x / y;
	}
}