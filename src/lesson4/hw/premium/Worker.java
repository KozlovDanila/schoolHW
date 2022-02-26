package lesson4.hw.premium;

import lesson4.hw.premium.calculators.Calculator;
import lesson4.hw.premium.calculators.DirectorCalculator;
import lesson4.hw.premium.calculators.DirectorHelperCalculator;
import lesson4.hw.premium.calculators.SimpleWorkerCalculator;

/**
 * Хранит в себе наименование работника и его калькулятор
 */
public enum Worker {
	SIMPLE_WORKER("рабочий", new SimpleWorkerCalculator()),
	DIRECTOR_HELPER("помощник", new DirectorHelperCalculator()),
	DIRECTOR("директор", new DirectorCalculator()),
	UNKNOWN(null, new Calculator());

	String name;
	Calculator calculator;

	Worker(String name, Calculator calculator) {
		this.name = name;
		this.calculator = calculator;
	}

	/**
	 * @return калькулятор премии
	 */
	public Calculator getCalculator() {
		return calculator;
	}

	/**
	 * Получение работника по имени
	 *
	 * @param name имя работника
	 * @return работник
	 */
	static Worker getWorkerByName(String name) {
		if (name == null) {
			name = "";
		}
		for (Worker worker : values()) {
			if (name.equalsIgnoreCase(worker.name)) {
				return worker;
			}
		}
		return UNKNOWN;
	}
}
