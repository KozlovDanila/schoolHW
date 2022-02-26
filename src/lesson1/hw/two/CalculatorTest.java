package lesson1.hw.two;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {

	Calculator calculator = new Calculator();

	@Test
	public void calculator() {
		assertEquals(2, calculator.add(1, 1));
		assertEquals(2, calculator.divide(6, 3));
		assertEquals(0, calculator.divide(6, 0));
		assertEquals(0, calculator.divide(0, 6));
		assertEquals(-3, calculator.multiply(3, -1));
		assertEquals(0, calculator.subtract(1, 1));
	}
}
