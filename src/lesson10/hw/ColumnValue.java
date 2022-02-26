package lesson10.hw;

/**
 * Значение колонки
 */
public class ColumnValue {

	private Object value;
	private ColumnType type;

	/**
	 * @param value значение
	 * @param type  Тип
	 */
	public ColumnValue(Object value, ColumnType type) {
		this.value = value;
		this.type = type;
	}

	public Object getValue() {
		return value;
	}

	public void setValue(Object value) {
		this.value = value;
	}

	public ColumnType getType() {
		return type;
	}

	public void setType(ColumnType type) {
		this.type = type;
	}
}
