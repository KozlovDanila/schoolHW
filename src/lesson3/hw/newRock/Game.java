package lesson3.hw.newRock;

public class Game {

	private WhoWinCalculator whoWinChecker;

	public Game(WhoWinCalculator whoWinChecker) {
		this.whoWinChecker = whoWinChecker;
	}


	public int play(GameValue user1, GameValue user2) {
		return whoWinChecker.calculate(user1, user2);
	}
}
