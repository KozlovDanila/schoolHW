package lesson5.hw.calculator.test;

import lesson5.hw.calculator.OperationType;
import lesson5.hw.calculator.Calculator;
import lesson5.hw.calculator.OperationFactory;
import lesson5.hw.calculator.calculators.IOperation;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class OperationFactoryTest {

	private final OperationFactory calculatorFactory = new OperationFactory();
	private final Calculator calculator = new Calculator();

	@Test
	public void calculateAdd() {
		IOperation calculatorImpl = calculatorFactory.get(OperationType.getTypeByValue("+"));
		assertEquals(6.5, calculator.calculate(5.5, 1, calculatorImpl), 0.01);
	}

	@Test
	public void calculateSubtract() {
		IOperation calculatorImpl = calculatorFactory.get(OperationType.getTypeByValue("-"));
		assertEquals(4.5, calculator.calculate(5.5, 1, calculatorImpl), 0.01);
	}


	@Test
	public void calculateMultiply() {
		IOperation calculatorImpl = calculatorFactory.get(OperationType.getTypeByValue("*"));
		assertEquals(11.0, calculator.calculate(5.5, 2, calculatorImpl), 0.01);
	}

	@Test
	public void calculateDivide() {
		IOperation calculatorImpl = calculatorFactory.get(OperationType.getTypeByValue("/"));
		assertEquals(1.1, calculator.calculate(5.5, 5, calculatorImpl), 0.01);
	}

	@Test
	public void calculateUnknown() {
		IOperation calculatorImpl = calculatorFactory.get(OperationType.getTypeByValue("*=1"));
		assertEquals(0, calculator.calculate(5.5, 0, calculatorImpl), 0.01);
	}

}
