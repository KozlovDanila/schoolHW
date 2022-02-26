package lesson10.hw;

/**
 * Условие для фильтрации
 * ВНИМАНИЕ, К ПРОЧТЕНИЮ!!!!
 * На самом деле, не очень удачное решение.
 * Как только появится больше, чем колонка=значение,
 * а, напрмиер, колонка1=значение И/ИЛИ колонка2=значение,
 * то в таком случае придется педелывать всю логику связанную с этим классом
 */
public class WhereExpression {

	private String columnName;
	private Object value;

	/**
	 * @param columnName Имя колонки
	 * @param value      Значение колонки
	 */
	public WhereExpression(String columnName, Object value) {
		this.columnName = columnName;
		this.value = value;
	}

	public String getColumnName() {
		return columnName;
	}

	public void setColumnName(String columnName) {
		this.columnName = columnName;
	}

	public Object getValue() {
		return value;
	}

	public void setValue(Object value) {
		this.value = value;
	}
}
