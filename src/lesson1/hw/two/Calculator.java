package lesson1.hw.two;

/**
 * Простой калькулятор
 */
class Calculator {

	/**
	 * Сложение
	 *
	 * @param a левый операнд
	 * @param b правый операнд
	 * @return результат сложения двух операндов
	 */
	int add(int a, int b) {
		return a + b;
	}

	/**
	 * Вычитание
	 *
	 * @param a левый операнд
	 * @param b правый операнд
	 * @return результат вычитания второго операнда от первого
	 */
	int subtract(int a, int b) {
		return a - b;
	}

	/**
	 * Умножение
	 *
	 * @param a левый операнд
	 * @param b правый операнд
	 * @return результат умножения двух операндов
	 */
	int multiply(int a, int b) {
		return a * b;
	}

	/**
	 * Деление
	 * Если второй операнд равен 0, то метод возвращает 0
	 *
	 * @param a левый операнд
	 * @param b правый операнд
	 * @return результат деления первого операнда на второй
	 */
	int divide(int a, int b) {
		if (b == 0) {
			return 0;
		}
		return a / b;
	}
}