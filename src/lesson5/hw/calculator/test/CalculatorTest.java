package lesson5.hw.calculator.test;

import lesson5.hw.calculator.Calculator;
import lesson5.hw.calculator.calculators.AddOperation;
import lesson5.hw.calculator.calculators.DivideOperation;
import lesson5.hw.calculator.calculators.MultiplyOperation;
import lesson5.hw.calculator.calculators.SubtractOperation;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {

	private final Calculator calculator = new Calculator();

	@Test
	public void calculateAdd() {
		assertEquals(6.5, calculator.calculate(5.5, 1, new AddOperation()), 0.01);
	}

	@Test
	public void calculateSubtract() {
		assertEquals(4.5, calculator.calculate(5.5, 1, new SubtractOperation()), 0.01);
	}


	@Test
	public void calculateMultiply() {
		assertEquals(11.0, calculator.calculate(5.5, 2, new MultiplyOperation()), 0.01);
	}

	@Test
	public void calculateDivide() {
		assertEquals(1.1, calculator.calculate(5.5, 5, new DivideOperation()), 0.01);
	}

	@Test
	public void calculateDivideZero() {
		assertEquals(0, calculator.calculate(5.5, 0, new DivideOperation()), 0.01);
	}
}
