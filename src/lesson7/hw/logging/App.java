package lesson7.hw.logging;

import lesson7.hw.logging.writers.WriterToFile;

public class App {

	public static void main(String[] args) {
		Logger.init(LoggingLevel.ERROR, new WriterToFile("./src/lesson7/hw/logging/log.txt"));

		Logger log = Logger.getLogger(App.class);

		log.debug("debug");

		new SimpleClass().someMethod();

		log.error("error");
	}
}
