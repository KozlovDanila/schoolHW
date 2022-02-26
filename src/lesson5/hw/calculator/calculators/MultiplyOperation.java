package lesson5.hw.calculator.calculators;

/**
 * Умножение двух чисел
 */
public class MultiplyOperation implements IOperation {

	@Override
	public double execute(double x, double y) {
		return x * y;
	}
}
