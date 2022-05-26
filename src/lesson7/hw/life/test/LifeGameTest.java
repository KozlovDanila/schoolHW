package lesson7.hw.life.test;

import lesson7.hw.life.LifeGame;
import lesson7.hw.life.LifeYearExecutor;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LifeGameTest {

	@Test
	public void play() {
		int[][] field = {
				{0, 1, 1, 0},
				{1, 0, 0, 0},
				{0, 0, 0, 0},
				{0, 1, 1, 1}
		};
		LifeGame lifeGame = new LifeGame(field, new IOForTest(), new LifeYearExecutor());
		int yearOfLife = lifeGame.play();
		assertEquals(6, yearOfLife);
	}
}
