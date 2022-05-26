package lesson7.hw.life;

/**
 * Класс, который имитирует год жизни
 */
public class LifeYearExecutor {

	/**
	 * Создает копию настоящего поля и заполняет его новыми значениями по правилам:
	 * - мёртвая клетка становится живой, если рядом с ней находятся ровно три живые клетки;
	 * - если живую клетку окружают две или три живые клетки, то эта клетка остаётся живой;
	 * - в противном случае клетка становится мёртвой.
	 *
	 * @param field Поле для игры
	 */
	public void lifeYear(int[][] field) {
		int[][] tempField = ArrayUtil.copy(field);
		for (int i = 0; i < field.length; i++) {
			for (int j = 0; j < field.length; j++) {
				int neighborsCount = getNeighborsCount(tempField, i, j);
				if (tempField[i][j] == 1) {
					if (neighborsCount == 2 || neighborsCount == 3) {
						field[i][j] = 1;
					} else {
						field[i][j] = 0;
					}
				} else if (neighborsCount == 3) {
					field[i][j] = 1;
				}
			}
		}
	}

	/**
	 * Подсчет соседей рядом
	 *
	 * @param field Поле для подсчета
	 * @param i     координата ячейки по i
	 * @param j     координата ячейки по j
	 * @return кол-во соседей, равных 1
	 */
	private int getNeighborsCount(int[][] field, int i, int j) {
		int size = field.length;
		int result = 0;

		if (j != 0 && field[i][j - 1] == 1) {
			result++;
		}
		if (j != 0 && i != 0 && field[i - 1][j - 1] == 1) {
			result++;
		}
		if (j != 0 && i + 1 != size && field[i + 1][j - 1] == 1) {
			result++;
		}

		if (j + 1 != size && field[i][j + 1] == 1) {
			result++;
		}
		if (j + 1 != size && i != 0 && field[i - 1][j + 1] == 1) {
			result++;
		}
		if (j + 1 != size && i + 1 != size && field[i + 1][j + 1] == 1) {
			result++;
		}

		if (i + 1 != size && field[i + 1][j] == 1) {
			result++;
		}
		if (i != 0 && field[i - 1][j] == 1) {
			result++;
		}
		return result;
	}
}
