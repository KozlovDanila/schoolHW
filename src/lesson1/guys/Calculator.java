package lesson1.guys;

/**
 * Класс, производящий простые действия между числами на основе калькулятора
 */

/*
	Замечания
	1. Почему две переменные являются полями класса?
	2. Названия методов должны быть глаголом
	3. Форматирование кода cntrl + alt + L
 */
public class Calculator {

	public int sum(int number1, int number2) {
		return number1 + number2;
	}

	public int subtraction(int number1, int number2) {
		return number1 - number2;
	}

	public int multiplication(int number1, int number2) {
		return number1 * number2;
	}

	public int division(int number1, int number2) {
		return number1 / number2;
	}

	@Override
	public String toString() {
		return super.toString();
	}
}
