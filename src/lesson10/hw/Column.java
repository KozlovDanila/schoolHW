package lesson10.hw;

/**
 * Представление колокни
 */
public class Column {

	private ColumnType type;
	private String name;

	/**
	 * @param type Тип колонки
	 * @param name Наименование колонки
	 */
	public Column(ColumnType type, String name) {
		this.type = type;
		this.name = name;
	}

	public ColumnType getType() {
		return type;
	}

	public void setType(ColumnType type) {
		this.type = type;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}