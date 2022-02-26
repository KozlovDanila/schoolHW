package lesson3.hw.rockPaperScissorsGame;

/**
 * Определяет победителя
 */
public class WinDeterminant {

	/**
	 * Определяет победителя
	 *
	 * @param player   ход игрока
	 * @param computer ход компьютера
	 * @return камень > ножник > бумага > камень, если одинаковые значения - ничья
	 */
	public WhoWin determine(GameValue player, GameValue computer) {
		if (player == computer) {
			return WhoWin.DRAW;
		}
		switch (player) {
			case ROCK:
				return computer == GameValue.PAPER ? WhoWin.COMPUTER : WhoWin.PLAYER;
			case PAPER:
				return computer == GameValue.SCISSORS ? WhoWin.COMPUTER : WhoWin.PLAYER;
			case SCISSORS:
				return computer == GameValue.ROCK ? WhoWin.COMPUTER : WhoWin.PLAYER;
		}
		return WhoWin.DRAW;
	}
}
