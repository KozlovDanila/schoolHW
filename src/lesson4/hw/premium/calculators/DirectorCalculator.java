package lesson4.hw.premium.calculators;

/**
 * Расчет премии для Директора
 * Премия для Директора = 50%
 */
public class DirectorCalculator extends Calculator {

	@Override
	public double calculate(int premiumFond) {
		return premiumFond * 0.5;
	}
}
