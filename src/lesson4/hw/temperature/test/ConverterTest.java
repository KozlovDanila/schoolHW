package lesson4.hw.temperature.test;

import lesson4.hw.temperature.CalculatorFactory;
import lesson4.hw.temperature.Converter;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ConverterTest {

	@Test
	public void convertToFahrenheit() {
		Converter converter = new Converter(new CalculatorFactory());
		assertEquals(converter.convert(12.5, "F"), -10.83, 0.01);
	}

	@Test
	public void convertToCelsius() {
		Converter converter = new Converter(new CalculatorFactory());
		assertEquals(converter.convert(12.5, "C"), 54.5, 0.01);
	}

	@Test
	public void convertEmpty() {
		Converter converter = new Converter(new CalculatorFactory());
		assertEquals(converter.convert(12.5, null), 12.5, 0.01);
	}
}
