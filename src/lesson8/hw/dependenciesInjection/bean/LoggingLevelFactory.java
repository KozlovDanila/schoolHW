package lesson8.hw.dependenciesInjection.bean;

import lesson7.hw.logging.LoggingLevel;

/**
 * Фабрика создания
 *
 * @see LoggingLevel
 */
public class LoggingLevelFactory {

	private static final LoggingLevel DEFAULT_LEVEL = LoggingLevel.OFF;

	private LoggingLevelFactory() {
	}

	/**
	 * Получает LoggingLevel по значению
	 *
	 * @param level название уровня
	 * @return Конкре
	 */
	public static LoggingLevel get(String level) {
		if (level == null) {
			return DEFAULT_LEVEL;
		}
		try {
			return LoggingLevel.valueOf(level.toUpperCase());
		} catch (Exception e) {
			return DEFAULT_LEVEL;
		}
	}
}
