package lesson3.hw.rockPaperScissorsGame;

import java.util.Scanner;

/**
 * Класс, отвечающий за ход игрока
 */
public class PlayerAction {

	Scanner scanner = new Scanner(System.in);

	public GameValue execute() {
		GameValue result = GameValue.getByName(scanner.nextLine());
		while (result == null) {
			System.out.println("Недопустимое значение, введите снова");
			result = GameValue.getByName(scanner.nextLine());
		}
		return result;
	}
}
