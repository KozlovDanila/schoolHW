package lesson7.hw.life;

/**
 * Создает поле для игры
 */
public class FieldCreator {

	/**
	 * Создает поле n*n и заполняет ячейку поля единицей
	 * с вероятностью в 30 процентов,
	 * нолик с вероятностью в 70 процентов
	 *
	 * @param size размерность создаваемого поля
	 * @return Созданное поле
	 */
	public int[][] create(int size) {
		int[][] result = new int[size][size];
		for (int i = 0; i < size; i++) {
			for (int j = 0; j < size; j++) {
				if ((int) (Math.random() * 100) + 1 > 70) {
					result[i][j] = 1;
				} else {
					result[i][j] = 0;
				}
			}
		}
		return result;
	}
}
