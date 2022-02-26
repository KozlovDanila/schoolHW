package lesson8.hw.dependenciesInjection.bean;

import lesson8.hw.dataStructures.List;

/**
 * По названию параметра возвращает сам параметр
 */
public class PropertyByNameGetter {

	public static final String LEVEL = "level";
	public static final String WRITER = "writer";
	public static final String FILE_TO_WRITE = "file";

	private final List<Property<String>> properties;

	public PropertyByNameGetter(List<Property<String>> properties) {
		this.properties = properties;
	}

	/**
	 * Ищет в параметрах нужное свойство
	 * Если не нашёл, возвращает пустое
	 *
	 * @param name наименование свойства
	 * @return найденное свойство или пустое свойство
	 */
	public Property<String> get(String name) {
		for (int i = 0; i < properties.getSize(); i++) {
			String propertyName = properties.get(i).getName();
			if (propertyName != null && propertyName.equals(name)) {
				return properties.get(i);
			}
		}
		return new Property<>(null, null);
	}
}
