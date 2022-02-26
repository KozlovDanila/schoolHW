package lesson4.hw.temperature.calculator;

/**
Класс для перевода цельсии в фаренгейта
 */
public class CelsiusToFahrenheitCalculator extends TemperatureCalculator {

	@Override
	public double calculate(double value) {
		return (value * 9 / 5) + 32;
	}
}
