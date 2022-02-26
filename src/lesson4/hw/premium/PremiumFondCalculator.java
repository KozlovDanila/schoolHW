package lesson4.hw.premium;

/**
 * Калькулятор премиальных
 */
public class PremiumFondCalculator {

	/**
	 * Премиальный фонд(кол-во денег в фонде всего)
	 */
	private int premiumFond;

	public PremiumFondCalculator(int premiumFond) {
		this.premiumFond = premiumFond;
	}

	/**
	 * Расчет премиальных
	 *
	 * @param worker названия работника
	 * @return Размер премии
	 */
	public double calculate(String worker) {
		return Worker.getWorkerByName(worker).getCalculator().calculate(premiumFond);
	}

	public void setPremiumFond(int premiumFond) {
		this.premiumFond = premiumFond;
	}
}
