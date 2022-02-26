package lesson3.hw.rockPaperScissorsGame.test;

import lesson3.hw.rockPaperScissorsGame.GameValue;
import lesson3.hw.rockPaperScissorsGame.WhoWin;
import lesson3.hw.rockPaperScissorsGame.WinDeterminant;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WinDeterminantTest {

	WinDeterminant determinant = new WinDeterminant();

	@Test
	public void draw() {
		Assert.assertEquals(determinant.determine(GameValue.PAPER, GameValue.PAPER), WhoWin.DRAW);
	}

	@Test
	public void playerWin() {
		assertEquals(determinant.determine(GameValue.PAPER, GameValue.ROCK), WhoWin.PLAYER);
		assertEquals(determinant.determine(GameValue.ROCK, GameValue.SCISSORS), WhoWin.PLAYER);
		assertEquals(determinant.determine(GameValue.SCISSORS, GameValue.PAPER), WhoWin.PLAYER);
	}

	@Test
	public void computerWin() {
		assertEquals(determinant.determine(GameValue.SCISSORS, GameValue.ROCK), WhoWin.COMPUTER);
		assertEquals(determinant.determine(GameValue.PAPER, GameValue.SCISSORS), WhoWin.COMPUTER);
		assertEquals(determinant.determine(GameValue.ROCK, GameValue.PAPER), WhoWin.COMPUTER);
	}
}