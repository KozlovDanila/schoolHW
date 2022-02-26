package lesson10.hw.request;

import lesson10.hw.Column;

import java.util.ArrayList;
import java.util.List;

/**
 * Результат данных по запросу create
 */
public class CreateRequest extends Request {

	/**
	 * Колонки
	 */
	private List<Column> column = new ArrayList<>();

	public List<Column> getColumn() {
		return column;
	}

	public void setColumn(List<Column> column) {
		this.column = column;
	}
}
