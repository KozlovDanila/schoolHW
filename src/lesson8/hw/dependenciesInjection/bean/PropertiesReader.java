package lesson8.hw.dependenciesInjection.bean;

import lesson6.hw.countSymbolsIntLine.IReader;
import lesson6.hw.countSymbolsIntLine.ReaderFromFile;
import lesson8.hw.dataStructures.List;

/**
 * Читает параметры из properties.txt
 */
public class PropertiesReader {

	private IReader reader;
	private String fileName;

	public PropertiesReader() {
		this.reader = new ReaderFromFile();
		this.fileName = "./src/lesson8/hw/javaBean/properties.txt";
	}

	public PropertiesReader(IReader reader, String fileName) {
		this.reader = reader;
		this.fileName = fileName;
	}

	/**
	 * Читает параметры из properties.txt и возвращает их в виде списка
	 *
	 * @return список объектов Property(ключ=значение)
	 * @see Property
	 */
	public List<Property<String>> read() {
		List<Property<String>> result = new List<>();
		String[] lines = reader.getReadLines(fileName);
		for (String line : lines) {
			String[] keyAndValue = line.split("=");
			result.add(new Property<>(keyAndValue[0], keyAndValue[1]));
		}
		return result;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	public void setReader(IReader reader) {
		this.reader = reader;
	}
}
