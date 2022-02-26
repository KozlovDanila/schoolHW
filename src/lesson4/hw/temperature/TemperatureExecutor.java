package lesson4.hw.temperature;

import lesson4.hw.temperature.calculator.TemperatureCalculator;

/**
 * Производит расчеты температуры
 */
public class TemperatureExecutor {

	private TemperatureCalculator calculator;

	/**
	 * @param calculator Калькудятор для температуры
	 */
	public TemperatureExecutor(TemperatureCalculator calculator) {
		this.calculator = calculator;
	}

	/**
	 * Выполнение расчетов
	 *
	 * @param value температура
	 * @return рассчитанная температура
	 */
	public double execute(double value) {
		return calculator.calculate(value);
	}

}
