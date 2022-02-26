package lesson3.hw.life;

/**
 * Игра в жизнь
 * Правила игры:
 * - мёртвая клетка становится живой, если рядом с ней находятся ровно три живые клетки;
 * - если живую клетку окружают две или три живые клетки, то эта клетка остаётся живой;
 * - в противном случае клетка становится мёртвой.
 */
public class LifeGame {

	int[][] field;
	GameHelper helper;
	LifeYearExecutor lifeYearExecutor;

	public LifeGame(int[][] field, GameHelper helper, LifeYearExecutor lifeYearExecutor) {
		this.field = ArrayUtil.copy(field);
		this.helper = helper;
		this.lifeYearExecutor = lifeYearExecutor;
	}

	/**
	 * Запуск игры
	 *
	 * @return кол-во прожитых поколений
	 */
	public int play() {
		int yearOfLife = 0;
		while (!allDead()) {
			pressNext();
			yearOfLife++;
			lifeYearExecutor.lifeYear(field);
			print();
		}
		return yearOfLife;
	}

	/**
	 * Все ли ячейки умерли
	 *
	 * @return true, если нет ни одной ячейки = 1
	 */
	boolean allDead() {
		for (int[] row : field) {
			for (int cell : row) {
				if (cell == 1) {
					return false;
				}
			}
		}
		return true;
	}

	/**
	 * Вывод поля
	 */
	void print() {
		helper.print(field);
	}

	/**
	 * Нажатие для следующего хода
	 */
	void pressNext() {
		helper.pressNext();
	}
}
