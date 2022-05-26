package lesson7.hw.life;

import java.util.Arrays;

/**
 * Игра в жизнь
 * Правила игры:
 * - мёртвая клетка становится живой, если рядом с ней находятся ровно три живые клетки;
 * - если живую клетку окружают две или три живые клетки, то эта клетка остаётся живой;
 * - в противном случае клетка становится мёртвой.
 */
public class LifeGame {

	private final int[][] field;
	private final InputOutput io;
	private final LifeYearExecutor lifeYearExecutor;

	public LifeGame(int[][] field, InputOutput io, LifeYearExecutor lifeYearExecutor) {
		this.field = ArrayUtil.copy(field);
		this.io = io;
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

	private boolean allDead() {
		for (int[] row : field) {
			for (int cell : row) {
				if (cell == 1) {
					return false;
				}
			}
		}
		return true;
	}

	private void print() {
		StringBuilder builder = new StringBuilder();
		for (int[] row : field) {
			builder.append(Arrays.toString(row));
		}
		io.out(builder.toString());
	}

	private void pressNext() {
		io.in();
	}
}
