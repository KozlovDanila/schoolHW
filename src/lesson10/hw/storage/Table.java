package lesson10.hw.storage;

import lesson10.hw.Column;
import lesson10.hw.ColumnValue;

import java.util.ArrayList;
import java.util.List;

/**
 * Представление таблицы
 * Содержит в себе колонки и значения
 */
public class Table {

	private List<Column> columns;
	private List<List<ColumnValue>> values = new ArrayList<>();

	public Table(List<Column> columns) {
		this.columns = columns;
	}

	public Table(List<Column> columns, List<List<ColumnValue>> values) {
		this.columns = columns;
		this.values = values;
	}

	public List<Column> getColumns() {
		return columns;
	}

	public void setColumns(List<Column> columns) {
		this.columns = columns;
	}

	public List<List<ColumnValue>> getValues() {
		return values;
	}

	public void setValues(List<List<ColumnValue>> values) {
		this.values = values;
	}
}
