package lesson5.hw.calculator;

/**
 * Парсер целый строки в данные для операции
 */
public class UserExpressionParser {

	/**
	 * Парсит строку вида 'x * y' в данные для выполнение операции
	 *
	 * @param expression строка с данными
	 * @return Данные для выполнения операции
	 */
	public ForOperationData parse(String expression) {
		String[] values = expression.split("\\+|-|\\*|/");
		if (values.length != 2) {
			return ForOperationData.EMPTY;
		}
		return new ForOperationData(Double.parseDouble(values[0]), Double.parseDouble(values[1]), getType(expression));
	}

	private String getType(String expression) {
		int type = expression.indexOf(OperationType.ADD.getValue());
		if (type != -1) {
			return OperationType.ADD.getValue();
		}

		type = expression.indexOf(OperationType.SUBTRACT.getValue());
		if (type != -1) {
			return OperationType.SUBTRACT.getValue();
		}

		type = expression.indexOf(OperationType.DIVIDE.getValue());
		if (type != -1) {
			return OperationType.DIVIDE.getValue();
		}

		type = expression.indexOf(OperationType.MULTIPLY.getValue());
		if (type != -1) {
			return OperationType.MULTIPLY.getValue();
		}
		return "";
	}
}
