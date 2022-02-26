package lesson8.hw.dependenciesInjection.test;

import lesson7.hw.logging.writers.ConsoleWriter;
import lesson7.hw.logging.writers.WriterToFile;
import lesson8.hw.dependenciesInjection.bean.WriterFactory;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class WriterFactoryTest {

	@Test
	public void createRealWriter() {
		assertTrue(WriterFactory.get("lesson7.hw.logging.writers.ConsoleWriter", null) instanceof ConsoleWriter);
		assertTrue(WriterFactory.get("lesson7.hw.logging.writers.WriterToFile", null) instanceof WriterToFile);
	}

	@Test
	public void createNotRealWriter() {
		assertTrue(WriterFactory.get("какой-то", null) instanceof ConsoleWriter);
		assertTrue(WriterFactory.get(null, null) instanceof ConsoleWriter);

	}
}
