package lesson4.hw.premium.calculators;

/**
 * Расчет премии для обычного рабочего
 * Премия для обычного рабочего = 10%
 */
public class SimpleWorkerCalculator extends Calculator {

	@Override
	public double calculate(int premiumFond) {
		return premiumFond * 0.1;
	}
}
