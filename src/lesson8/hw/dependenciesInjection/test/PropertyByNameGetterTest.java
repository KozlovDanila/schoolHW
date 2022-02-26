package lesson8.hw.dependenciesInjection.test;

import lesson6.hw.countSymbolsIntLine.ReaderFromFile;
import lesson8.hw.dataStructures.List;
import lesson8.hw.dependenciesInjection.bean.PropertiesReader;
import lesson8.hw.dependenciesInjection.bean.Property;
import lesson8.hw.dependenciesInjection.bean.PropertyByNameGetter;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

public class PropertyByNameGetterTest {

	@Test
	public void getRealProperty() {
		PropertiesReader propertiesReader = new PropertiesReader(new ReaderFromFile(), "./src/lesson8/hw/javaBean/test/properties_for_test.txt");
		List<Property<String>> properties = propertiesReader.read();

		assertEquals(3, properties.getSize());

		PropertyByNameGetter getter = new PropertyByNameGetter(properties);
		Property<String> levelProperty = getter.get(PropertyByNameGetter.LEVEL);
		assertEquals("level", levelProperty.getName());
		assertEquals("ERROR", levelProperty.getValue());

		Property<String> writerProperty = getter.get(PropertyByNameGetter.WRITER);
		assertEquals("writer", writerProperty.getName());
		assertEquals("lesson7.hw.logging.writers.ConsoleWriter", writerProperty.getValue());

		Property<String> fileToWriteProperty = getter.get(PropertyByNameGetter.FILE_TO_WRITE);
		assertEquals("file", fileToWriteProperty.getName());
		assertEquals("./src/lesson8/hw/javaBean/test/log.txt", fileToWriteProperty.getValue());
	}

	@Test
	public void getNotRealProperty() {
		PropertyByNameGetter getter = new PropertyByNameGetter(new List<>());
		Property<String> levelProperty = getter.get(PropertyByNameGetter.LEVEL);
		assertNull("level", levelProperty.getName());
		assertNull("ERROR", levelProperty.getValue());
	}
}
