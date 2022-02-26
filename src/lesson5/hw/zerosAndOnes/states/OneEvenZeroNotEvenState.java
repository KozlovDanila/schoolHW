package lesson5.hw.zerosAndOnes.states;

/**
 * Состояние 'Единицы четные, нули нечетные'
 */
public class OneEvenZeroNotEvenState extends State {

	/**
	 * Если пришла единица, то все нечетные
	 * @see AllNotEvenState
	 * иначе все четные
	 * @see AllEvenState
	 *
	 * @param symbol символ для расчетов
	 * @return следующее состояние автомата
	 */
	@Override
	public State execute(char symbol) {
		if (symbol == '1') {
			return new AllNotEvenState();
		} else {
			return new AllEvenState();
		}
	}

	@Override
	public String getValue() {
		return "работает";
	}
}
