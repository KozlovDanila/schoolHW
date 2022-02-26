package lesson5.hw.calculator.calculators;

/**
 * Сложение двух чисел
 */
public class AddOperation implements IOperation {

	@Override
	public double execute(double x, double y) {
		return x + y;
	}
}
