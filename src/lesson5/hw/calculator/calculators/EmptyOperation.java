package lesson5.hw.calculator.calculators;

/**
 * пустое выражение
 */
public class EmptyOperation implements IOperation {

	/**
	 * @return 0
	 */
	@Override
	public double execute(double x, double y) {
		System.out.println("Is empty calculator");
		return 0;
	}
}
