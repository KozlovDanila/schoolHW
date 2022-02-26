package lesson5.hw.calculator.calculators;

/**
 * Интерфейс выполнения арифмитической операции над двумя числами
 */
public interface IOperation {

	/**
	 * Выполняет арифмитическую операцию над двумя числами
	 *
	 * @param x левый операнд
	 * @param y правый операнд
	 * @return результат выражения
	 */
	double execute(double x, double y);
}
