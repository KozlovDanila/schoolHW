package lesson5.hw.zerosAndOnes.states;

/**
 * Состояние 'Единицы нечетные, нули четные'
 */
public class OneNotEvenZeroEvenState extends State {

	/**
	 * Если пришла единица, то все четные
	 * @see AllEvenState
	 * иначе все нечетные
	 * @see AllNotEvenState
	 *
	 * @param symbol символ для расчетов
	 * @return следующее состояние автомата
	 */
	@Override
	public State execute(char symbol) {
		if (symbol == '1') {
			return new AllEvenState();
		} else {
			return new AllNotEvenState();
		}
	}
}
