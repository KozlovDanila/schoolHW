package lesson5.hw.zerosAndOnes;

import lesson5.hw.zerosAndOnes.states.AllEvenState;
import lesson5.hw.zerosAndOnes.states.State;

/**
 * Конечный автомат рассчета кол-ва четных и нечетных нулей и единиц в строке
 */
public class ZeroAndOnesStateMachine {

	/**
	 * Начальное состояние - все цифры четные
	 *
	 * @see AllEvenState
	 */
	private State state = new AllEvenState();

	/**
	 * Строка с нулями и единицами
	 */
	private final String value;

	public ZeroAndOnesStateMachine(String value) {
		this.value = value;
	}

	/**
	 * Выполнить расчеты
	 *
	 * @return Если в строке четное кол-во единиц и нечетное кол-во нулей, то 'работает'
	 * в любом другом случае 'не работае'
	 */
	public String execute() {
		for (char symbol : value.toCharArray()) {
			state = state.execute(symbol);
		}
		return state.getValue();
	}
}
