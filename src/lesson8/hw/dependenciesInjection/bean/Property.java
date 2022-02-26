package lesson8.hw.dependenciesInjection.bean;

/**
 * Параметр/свойство
 */
public class Property<T> {

	/**
	 * Название свойства
	 */
	private String name;

	/**
	 * Значение свойства
	 */
	private T value;

	public Property(String name, T value) {
		this.name = name;
		this.value = value;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public T getValue() {
		return value;
	}

	public void setValue(T value) {
		this.value = value;
	}
}
