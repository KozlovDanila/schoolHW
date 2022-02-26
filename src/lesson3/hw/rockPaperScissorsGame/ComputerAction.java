package lesson3.hw.rockPaperScissorsGame;

/**
 * Класс, отвечающий за ход комптютера
 */
public class ComputerAction {

	/**
	 * Рандомно выбирает ход
	 *
	 * @return рандомное значение хода
	 */
	GameValue execute() {
		GameValue[] values = GameValue.values();
		return values[(int) (Math.random() * values.length - 1) + 1];
	}
}
