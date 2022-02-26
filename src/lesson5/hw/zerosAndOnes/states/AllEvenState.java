package lesson5.hw.zerosAndOnes.states;

/**
 * Состояние 'Все цифры четные'
 */
public class AllEvenState extends State {

	/**
	 * Если пришла единица, то единицы нечетные, а нули четные
	 * @see OneNotEvenZeroEvenState
	 * иначе единицы четные, а нули нечетные
	 * @see OneEvenZeroNotEvenState
	 *
	 * @param symbol символ для расчетов
	 * @return следующее состояние автомата
	 */
	@Override
	public State execute(char symbol) {
		if (symbol == '1') {
			return new OneNotEvenZeroEvenState();
		} else {
			return new OneEvenZeroNotEvenState();
		}
	}
}
