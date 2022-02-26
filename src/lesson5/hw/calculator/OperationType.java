package lesson5.hw.calculator;

/**
 * Возможный тип операции
 */
public enum OperationType {
	ADD("+"),
	SUBTRACT("-"),
	MULTIPLY("*"),
	DIVIDE("/"),
	UNKNOWN(null);

	private final String value;

	OperationType(String value) {
		this.value = value;
	}

	/**
	 * Получение типа по строковому представлению
	 *
	 * @param value строковое представление типа
	 * @return Тип операции
	 */
	public static OperationType getTypeByValue(String value) {
		if (value == null) {
			return UNKNOWN;
		}
		for (OperationType type : values()) {
			if (value.equalsIgnoreCase(type.value)) {
				return type;
			}
		}
		return UNKNOWN;
	}

	public String getValue() {
		return value;
	}
}
