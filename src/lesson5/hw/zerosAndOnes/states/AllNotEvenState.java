package lesson5.hw.zerosAndOnes.states;

/**
 * Состояние 'Все цифры нечетные'
 */
public class AllNotEvenState extends State {

	/**
	 * Если пришла единица, то единицы четные, а нули нечетные
	 * @see OneEvenZeroNotEvenState
	 * иначе единицы нечетные, а нули четные
	 * @see OneNotEvenZeroEvenState
	 *
	 * @param symbol символ для расчетов
	 * @return следующее состояние автомата
	 */
	@Override
	public State execute(char symbol) {
		if (symbol == '1') {
			return new OneEvenZeroNotEvenState();
		} else {
			return new OneNotEvenZeroEvenState();
		}
	}
}
