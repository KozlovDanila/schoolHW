package lesson4.hw.temperature.test;

import lesson4.hw.temperature.TemperatureExecutor;
import lesson4.hw.temperature.calculator.CelsiusToFahrenheitCalculator;
import lesson4.hw.temperature.calculator.FahrenheitToCelsiusCalculator;
import lesson4.hw.temperature.calculator.TemperatureCalculator;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TemperatureExecutorTest {

	@Test
	public void fahrenheitToCelsius() {
		TemperatureCalculator calculator = new FahrenheitToCelsiusCalculator();
		TemperatureExecutor executor = new TemperatureExecutor(calculator);
		assertEquals(executor.execute(12.5), -10.83, 0.01);
	}

	@Test
	public void celsiusToFahrenheit() {
		TemperatureCalculator calculator = new CelsiusToFahrenheitCalculator();
		TemperatureExecutor executor = new TemperatureExecutor(calculator);
		assertEquals(executor.execute(12.5), 54.5, 0.01);
	}

	@Test
	public void emptyCalculator() {
		TemperatureCalculator calculator = new TemperatureCalculator();
		TemperatureExecutor executor = new TemperatureExecutor(calculator);
		assertEquals(executor.execute(12.5), 12.5, 0.01);
	}
}
