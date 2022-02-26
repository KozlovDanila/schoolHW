package lesson3.hw.rockPaperScissorsGame;

/**
 * Игра "Камень-ножницы-бумага"
 */
public class RockPaperScissorsGame {

	PlayerAction playerAction;
	ComputerAction computerAction;
	WinDeterminant winDeterminant;

	public RockPaperScissorsGame(PlayerAction playerAction, ComputerAction computerAction, WinDeterminant winDeterminant) {
		this.playerAction = playerAction;
		this.computerAction = computerAction;
		this.winDeterminant = winDeterminant;
	}

	/**
	 * Игрок вводит значения для игры или "выход".
	 * Если игрок ввел выйти - игра заканчивается,
	 * иначе ходит компьютер и происходит печать победителей
	 */
	void play() {
		System.out.println("Это игра " + GameValue.getNamesWithoutExit());
		while (true) {
			System.out.println("Введите одно из значений " + GameValue.getAllNames());
			GameValue userValue = playerAction.execute();
			if (userValue == GameValue.EXIT) {
				System.out.println("Спасибо за игру, приходите ещё!");
				return;
			}
			GameValue computerValue = computerAction.execute();
			WhoWin checkResult = winDeterminant.determine(userValue, computerValue);
			System.out.println(checkResult == WhoWin.DRAW ? "Ничья" : "Победил: " + checkResult.getValue());
			System.out.println("Ваше значение: " + userValue.getName());
			System.out.println("Значение компьютера: " + computerValue.getName());
		}
	}
}
