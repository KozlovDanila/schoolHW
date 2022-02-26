package lesson10.hw.request;

import lesson10.hw.ColumnValue;

import java.util.ArrayList;
import java.util.List;

/**
 * Результат данных по запросу insert
 */
public class InsertRequest extends Request {

	/**
	 * Значения колонок
	 */
	private List<ColumnValue> values = new ArrayList<>();

	public List<ColumnValue> getValues() {
		return values;
	}

	public void setValues(List<ColumnValue> values) {
		this.values = values;
	}
}
