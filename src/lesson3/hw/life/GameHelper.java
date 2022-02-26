package lesson3.hw.life;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Класс для работы с консолью
 */
public class GameHelper {

	/**
	 * Если isReal = true, значит запущена реальная версия игры, иначе тест
	 */
	boolean isReal;

	public GameHelper(boolean isReal) {
		this.isReal = isReal;
	}

	/**
	 * Для того, чтобы смотреть ходы по нажатию
	 */
	void pressNext() {
		if (isReal) {
			new Scanner(System.in).nextLine();
		}
	}

	/**
	 * Печатает двумерный массив
	 *
	 * @param field Поле для печати
	 */
	void print(int[][] field) {
		if (isReal) {
			for (int[] row : field) {
				System.out.println(Arrays.toString(row));
			}
		}
	}
}
