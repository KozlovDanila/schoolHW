package lesson4.hw.premium.test;

import lesson4.hw.premium.PremiumFondCalculator;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PremiumFondCalculatorTest {

	private final PremiumFondCalculator premiumFondCalculator = new PremiumFondCalculator(1_000_000);

	@Test
	public void emptyWorkerCalculate() {
		assertEquals(premiumFondCalculator.calculate("Какой-то непонятный тип"), 0, 0.01);
	}

	@Test
	public void simpleWorkerCalculate() {
		assertEquals(premiumFondCalculator.calculate("Рабочий"), 100_000, 0.01);
	}

	@Test
	public void directorHelperCalculate() {
		assertEquals(premiumFondCalculator.calculate("Помощник"), 200_000, 0.01);
	}

	@Test
	public void directorCalculate() {
		assertEquals(premiumFondCalculator.calculate("Директор"), 500_000, 0.01);
	}
}
