package lesson10.hw;

import lesson7.hw.logging.Logger;
import lesson7.hw.logging.LoggingLevel;
import lesson7.hw.logging.writers.ConsoleWriter;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		Logger.init(LoggingLevel.ALL, new ConsoleWriter());

		Scanner scanner = new Scanner(System.in);
		DataBase dataBase = new DataBase();
		while (true) {
			String value = scanner.nextLine();
			if ("exit".equalsIgnoreCase(value)) {
				return;
			}
			RequestResult result = dataBase.execute(value);
			System.out.println("Выполнение: " + result.isSuccess());
			System.out.println("Сообщение: " + result.getMessage());
		}
	}
}
