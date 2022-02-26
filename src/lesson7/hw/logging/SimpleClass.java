package lesson7.hw.logging;

/**
 * Просто, чтобы проверить, что везде работает
 */
public class SimpleClass {

	private static final Logger LOG = Logger.getLogger(SimpleClass.class);

	public void someMethod() {
		LOG.error("Ошибка");
		LOG.debug("Дэбаг");
	}
}
