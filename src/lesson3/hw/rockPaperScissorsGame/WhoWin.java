package lesson3.hw.rockPaperScissorsGame;

/**
 * Признак победителя
 */
public enum WhoWin {
	PLAYER("Игрок"),
	COMPUTER("Компьютер"),
	DRAW("Ничья");

	String value;

	WhoWin(String value) {
		this.value = value;
	}

	public String getValue() {
		return value;
	}
}
