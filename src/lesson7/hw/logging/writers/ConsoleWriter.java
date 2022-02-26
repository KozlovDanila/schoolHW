package lesson7.hw.logging.writers;

/**
 * Логирует данные в консоль
 */
public class ConsoleWriter implements IWriter {
	@Override
	public void write(String message) {
		System.out.println(message);
	}
}
