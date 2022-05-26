package lesson7.hw.life;

/**
 * Утилитарный класс для работы с масивами
 */
public class ArrayUtil {

	/**
	 * Копирует двумерный масив
	 *
	 * @param array настоящий массив
	 * @return скопированный массив
	 */
	public static int[][] copy(int[][] array) {
		int length = array.length;
		int[][] result = new int[length][length];
		for (int i = 0; i < length; i++) {
			for (int j = 0; j < length; j++) {
				result[i][j] = array[i][j];
			}
		}
		return result;
	}
}
