package lesson4.hw.premium.calculators;

/**
 * Расчет премии для помощника Директора
 * Премия для помощника Директора = 20%
 */
public class DirectorHelperCalculator extends Calculator {

	@Override
	public double calculate(int premiumFond) {
		return premiumFond * 0.2;
	}
}
