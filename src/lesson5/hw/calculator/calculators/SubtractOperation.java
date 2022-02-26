package lesson5.hw.calculator.calculators;

/**
 * Вычитание двух чисел
 */
public class SubtractOperation implements IOperation {

	@Override
	public double execute(double x, double y) {
		return x - y;
	}
}
