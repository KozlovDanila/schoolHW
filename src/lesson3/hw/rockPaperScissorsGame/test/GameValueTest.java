package lesson3.hw.rockPaperScissorsGame.test;

import lesson3.hw.rockPaperScissorsGame.GameValue;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GameValueTest {

	@Test
	public void getByName() {
		Assert.assertEquals(GameValue.getByName("Ножницы"), GameValue.SCISSORS);
		assertEquals(GameValue.getByName("бумага"), GameValue.PAPER);
		assertEquals(GameValue.getByName("КаМень"), GameValue.ROCK);
	}

	@Test
	public void getAllNames() {
		assertEquals(GameValue.getAllNames(), "\"Выход\" \"Камень\" \"Ножницы\" \"Бумага\" ");
	}

	@Test
	public void getNamesWithoutExit() {
		assertEquals(GameValue.getNamesWithoutExit(), "\"Камень\" \"Ножницы\" \"Бумага\" ");
	}
}