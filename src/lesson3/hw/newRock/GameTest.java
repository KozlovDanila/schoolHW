package lesson3.hw.newRock;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GameTest {

	@Test
	public void play() {
		Game game = new Game(new WhoWinCalculatorFast());
		assertEquals(-1, game.play(GameValue.ROCK, GameValue.ROCK));
	}
}
