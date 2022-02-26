package lesson8.hw.dependenciesInjection.test;

import lesson7.hw.logging.LoggingLevel;
import lesson8.hw.dependenciesInjection.bean.LoggingLevelFactory;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LoggingLevelFactoryTest {

	@Test
	public void createRealLoggingLevel() {
		assertEquals(LoggingLevel.ALL, LoggingLevelFactory.get("ALL"));
		assertEquals(LoggingLevel.ERROR, LoggingLevelFactory.get("ERROR"));
		assertEquals(LoggingLevel.DEBUG, LoggingLevelFactory.get("DEBUG"));
		assertEquals(LoggingLevel.OFF, LoggingLevelFactory.get("OFF"));
	}

	@Test
	public void createNotRealLoggingLevel() {
		assertEquals(LoggingLevel.OFF, LoggingLevelFactory.get("КАКОЙ-ТО"));
		assertEquals(LoggingLevel.OFF, LoggingLevelFactory.get(null));
	}
}
