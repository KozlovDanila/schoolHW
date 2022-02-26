package lesson5.hw.coffeeMachine;

import lesson5.hw.coffeeMachine.coffee.IBeverage;

/**
 * Класс-представление машины с напитками
 */
public class BeverageMachine {

	private final IBeverage[] beverages;

	/**
	 * @param beverages Напитки
	 */
	public BeverageMachine(IBeverage[] beverages) {
		this.beverages = beverages;
	}

	/**
	 * Стоимость конкретного напитка
	 *
	 * @param index индекс напитка в массиве
	 * @return стоимость напитка
	 */
	public double getCost(int index) {
		if (index < 0 || index >= beverages.length) {
			return 0;
		}
		return beverages[index].getCost();
	}

	/**
	 * Получение списка названий напитков с нумерацией
	 *
	 * @return Список напитков
	 */
	public String getNames() {
		StringBuilder builder = new StringBuilder();
		for (int i = 0; i < beverages.length; i++) {
			builder.append(i + 1).append(". ").append(beverages[i].getName()).append("\n");
		}
		return builder.toString();
	}
}
