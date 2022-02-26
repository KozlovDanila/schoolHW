package lesson4.hw.temperature.calculator;

/**
Класс для перевода фаренгейта в цельсии
 */
public class FahrenheitToCelsiusCalculator extends TemperatureCalculator {

	@Override
	public double calculate(double value) {
		return (value - 32) * 5 / 9;
	}
}
