package lesson7.hw.logging.writers;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Логирует в файл
 */
public class WriterToFile implements IWriter {

	private final static String DEFAULT_LOGGER_FILE = "./src/lesson7/hw/logging/log.txt";
	private final String fileName;

	public WriterToFile(String fileName) {
		if (fileName == null) {
			fileName = DEFAULT_LOGGER_FILE;
		}
		this.fileName = fileName;
	}

	/**
	 * Если файл не создан, создает его, иначе записывает в конец
	 *
	 * @param message сообщение
	 */
	@Override
	public void write(String message) {
		try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName, true))) {
			writer.write(message + "\n");
		} catch (IOException e) {
		}
	}
}
