package lesson8.hw.dependenciesInjection.bean;

import lesson7.hw.logging.writers.ConsoleWriter;
import lesson7.hw.logging.writers.IWriter;
import lesson7.hw.logging.writers.WriterToFile;

/**
 * Фабрика создания объека для записи логирования
 */
public class WriterFactory {

	private static final IWriter DEFAULT_WRITER = new ConsoleWriter();

	private WriterFactory() {
	}

	/**
	 * Создает объект для записи логов
	 * Если нужный не найден, то
	 *	@see WriterToFile
	 * @param writerName        наименование класса для создания
	 * @param fileNameForWriter наименование файла для записи
	 * @return объект для записи логов
	 *
	 */
	public static IWriter get(String writerName, String fileNameForWriter) {
		if (writerName == null) {
			return DEFAULT_WRITER;
		}
		switch (writerName) {
			case "lesson7.hw.logging.writers.ConsoleWriter":
				return new ConsoleWriter();
			case "lesson7.hw.logging.writers.WriterToFile":
				return new WriterToFile(fileNameForWriter);
			default:
				return DEFAULT_WRITER;
		}
	}
}
