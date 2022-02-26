package lesson7.hw.logging;

/**
 * Уровни трасировки
 */
public enum LoggingLevel {
	/**
	 * Выключить
	 */
	OFF(1),
	/**
	 * Ошибки
	 */
	ERROR(2),
	/**
	 * Дэбаг
	 */
	DEBUG(3),
	/**
	 * Все
	 */
	ALL(4);

	private final int order;

	LoggingLevel(int order) {
		this.order = order;
	}

	/**
	 * Доступен ли уровень для записи
	 *
	 * @param error возможный уровень для записи
	 * @return доступность
	 */
	public boolean isEnable(LoggingLevel error) {
		return order >= error.order;
	}
}
