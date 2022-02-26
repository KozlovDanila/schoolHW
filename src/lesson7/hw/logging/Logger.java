package lesson7.hw.logging;

import lesson7.hw.logging.writers.IWriter;

import java.util.Date;

/**
 * Логирует
 * Чтобы использовать, при запуске приложения нужно проинициализировать
 * и записать уровень логирования и задать место логирования
 * {@link Logger#init(lesson7.hw.logging.LoggingLevel, lesson7.hw.logging.writers.IWriter)}
 * <p>
 * Далее, в любом месте приложения можно написать
 * Logger name = Logger.getLogger(Class.class);
 * name.error("Ошибка");
 * И тогда произойдёт запись в указанный источник
 */
public class Logger {

	private static LoggingLevel loggingLevel = LoggingLevel.OFF;
	private static IWriter writer;

	/**
	 * Данные об классе, из которого вызываются методы логирования
	 * Нужен, чтобы при записи указать наименование класса
	 */
	private Class clazz;

	/**
	 * Чтобы нельзя было создать новый логгер при работе приложения
	 */
	private Logger(Class clazz) {
		this.clazz = clazz;
	}

	/**
	 * Доступ для инициализации логгера, использовать при запуске приложения
	 *
	 * @param loggingLevel Уровень логирования
	 * @param writer       куда писать
	 */
	public static void init(LoggingLevel loggingLevel, IWriter writer) {
		Logger.loggingLevel = loggingLevel;
		Logger.writer = writer;
	}

	/**
	 * Получение логера для использования
	 *
	 * @param clazz класс, в котором логируем
	 * @return логер
	 */
	public static Logger getLogger(Class clazz) {
		return new Logger(clazz);
	}

	/**
	 * Уровень логирования - ошибка
	 *
	 * @param message сообщение для логирования
	 */
	public void error(String message) {
		if (loggingLevel.isEnable(LoggingLevel.ERROR)) {
			write(message);
		}
	}

	/**
	 * Уровень логирования - дэбаг
	 *
	 * @param message сообщение для логирования
	 */
	public void debug(String message) {
		if (loggingLevel.isEnable(LoggingLevel.DEBUG)) {
			write(message);
		}
	}

	/**
	 * Запись в итсточник в виде
	 * время + имя класса + сообщение
	 *
	 * @param message сообщение
	 */
	private void write(String message) {
		writer.write(new Date() + " " + clazz.getName() + " : " + message);
	}
}
