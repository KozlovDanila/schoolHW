package lesson7.hw.logging.writers;

/**
 * Интерфейс логирования в конкретное место
 */
public interface IWriter {

	/**
	 * Логирует
	 *
	 * @param message сообщение
	 */
	void write(String message);
}
