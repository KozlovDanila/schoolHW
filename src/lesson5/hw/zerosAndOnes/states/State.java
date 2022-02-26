package lesson5.hw.zerosAndOnes.states;

/**
 * Класс, представляющий состояние автомата
 */
public abstract class State {

	/**
	 * Рассчитывает следующее значение автомата
	 *
	 * @param symbol символ для расчетов
	 * @return след значение автомата
	 */
	public abstract State execute(char symbol);

	/**
	 * @return значение автомата
	 */
	public String getValue() {
		return "не работает";
	}

}
