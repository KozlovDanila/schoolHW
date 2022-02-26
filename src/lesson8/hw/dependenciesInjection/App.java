package lesson8.hw.dependenciesInjection;

import lesson7.hw.logging.Logger;
import lesson7.hw.logging.LoggingLevel;
import lesson7.hw.logging.SimpleClass;
import lesson7.hw.logging.writers.IWriter;
import lesson8.hw.dependenciesInjection.bean.LoggingLevelFactory;
import lesson8.hw.dependenciesInjection.bean.PropertiesReader;
import lesson8.hw.dependenciesInjection.bean.PropertyByNameGetter;
import lesson8.hw.dependenciesInjection.bean.WriterFactory;

public class App {

	public static void main(String[] args) {
		PropertiesReader reader = new PropertiesReader();
		PropertyByNameGetter properties = new PropertyByNameGetter(reader.read());

		Logger.init(getLoggingLevel(properties), getWriter(properties));

		Logger log = Logger.getLogger(App.class);

		log.debug("debug");

		new SimpleClass().someMethod();

		log.error("error");
	}

	private static LoggingLevel getLoggingLevel(PropertyByNameGetter properties) {
		return LoggingLevelFactory.get(properties.get(PropertyByNameGetter.LEVEL).getValue());
	}

	private static IWriter getWriter(PropertyByNameGetter properties) {
		return WriterFactory.get(
				properties.get(PropertyByNameGetter.WRITER).getValue(),
				properties.get(PropertyByNameGetter.FILE_TO_WRITE).getValue()
		);
	}
}
