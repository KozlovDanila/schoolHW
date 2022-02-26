package lesson4.hw.temperature;

import lesson4.hw.temperature.calculator.CelsiusToFahrenheitCalculator;
import lesson4.hw.temperature.calculator.FahrenheitToCelsiusCalculator;
import lesson4.hw.temperature.calculator.TemperatureCalculator;

/**
 * Фабрика создания нужного класса рассчета температуры
 */
public class CalculatorFactory {

	/**
	 * Если единица измерения F
	 * @see FahrenheitToCelsiusCalculator
	 * Если C -
	 * @see CelsiusToFahrenheitCalculator
	 * Если пусто или null, или непонятное значение, то
	 * @see TemperatureCalculator
	 *
	 * @param unitMeasurement единица измерения
	 * @return созданный класс для расчетов
	 */
	public TemperatureCalculator getCalculator(String unitMeasurement) {
		if (unitMeasurement == null) {
			unitMeasurement = "";
		}
		unitMeasurement = unitMeasurement.toUpperCase();
		switch (unitMeasurement) {
			case "F":
				return new FahrenheitToCelsiusCalculator();
			case "C":
				return new CelsiusToFahrenheitCalculator();
		}
		return new TemperatureCalculator();
	}
}
