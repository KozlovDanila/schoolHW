package lesson10.hw.parsers;

import lesson10.hw.Column;
import lesson10.hw.ColumnType;
import lesson10.hw.request.CreateRequest;
import lesson10.hw.request.Request;

import java.util.List;

/**
 * Парсер для запросе create
 * Пример: create table table1(id numeric, param1 varchar, boolParam boolean)
 */
public class CreateParser implements Parser {

	@Override
	public Request parse(String value) {
		String[] halfRequest = value.split("\\(");
		CreateRequest request = new CreateRequest();
		request.setTableName(halfRequest[0].split(" ")[2]);
		String[] columns = halfRequest[1].replaceAll("[(,)]", "").split(" ");
		for (int i = 0; i < columns.length; i += 2) {
			String columnName = columns[i];
			checkColumnExist(request.getColumn(), columnName);
			request.getColumn().add(new Column(ColumnType.valueOf(columns[i + 1].toUpperCase()), columnName));
		}
		return request;
	}

	private void checkColumnExist(List<Column> columns, String columnName) {
		for (Column column : columns) {
			if (column.getName().equalsIgnoreCase(columnName)) {
				throw new IllegalArgumentException("Столбец с именем '" + columnName + "' уже существует");
			}
		}
	}
}
