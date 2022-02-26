package lesson4.hw.temperature;

import lesson4.hw.temperature.calculator.TemperatureCalculator;

/**
 * Конвертирует входные данные в ответ
 */
public class Converter {

	private CalculatorFactory calculatorFactory;

	/**
	 * @param calculatorFactory Фабрика для создания нужного класса расчетов
	 */
	public Converter(CalculatorFactory calculatorFactory) {
		this.calculatorFactory = calculatorFactory;
	}

	/**
	 * Конвертирует входные данные в конкретные роасчитанные данные
	 *
	 * @param degrees         градусы
	 * @param unitMeasurement единица измерения
	 * @return расчитанные данные
	 */
	public double convert(double degrees, String unitMeasurement) {
		TemperatureCalculator calculator = calculatorFactory.getCalculator(unitMeasurement);
		return getTemperatureExecutor(calculator).execute(degrees);
	}

	/**
	 * Получение исполнителя расчтево
	 *
	 * @param calculator калькулятор для расчетов
	 * @return исполнитель расчетов
	 */
	protected TemperatureExecutor getTemperatureExecutor(TemperatureCalculator calculator) {
		return new TemperatureExecutor(calculator);
	}
}
