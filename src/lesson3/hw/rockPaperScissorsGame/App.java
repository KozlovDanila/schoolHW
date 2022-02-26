package lesson3.hw.rockPaperScissorsGame;

/**
 * Запуск приложения
 */
public class App {

	public static void main(String[] args) {
		RockPaperScissorsGame game = new RockPaperScissorsGame(
				new PlayerAction(),
				new ComputerAction(),
				new WinDeterminant()
		);
		game.play();
	}
}
