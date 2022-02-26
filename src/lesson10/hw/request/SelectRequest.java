package lesson10.hw.request;

import lesson10.hw.WhereExpression;

/**
 * Результат данных по запросу select
 */
public class SelectRequest extends Request {

	/**
	 * Условие для фильтрации
	 */
	private WhereExpression expression;

	public WhereExpression getExpression() {
		return expression;
	}

	public void setExpression(WhereExpression expression) {
		this.expression = expression;
	}
}
