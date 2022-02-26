package lesson10.hw.parsers;

import lesson10.hw.ColumnType;
import lesson10.hw.ColumnValue;
import lesson10.hw.request.InsertRequest;
import lesson10.hw.request.Request;

import java.math.BigDecimal;

/**
 * Парсер для запросе insert
 * Преобразует данные в нужный тип
 */
public class InsertParser implements Parser {
	@Override
	public Request parse(String str) {
		String[] halfRequest = str.split("\\(");
		InsertRequest request = new InsertRequest();
		request.setTableName(halfRequest[0].split(" ")[2]);
		String[] columns = halfRequest[1].replaceAll("[(,)]", "").split(" ");
		for (String columnValue : columns) {
			ColumnType type = getType(columnValue.trim());
			try {
				request.getValues().add(new ColumnValue(getValue(type, columnValue.trim()), type));
			} catch (Exception e) {
				throw new IllegalArgumentException("Неверный формат данных");
			}
		}
		return request;
	}

	private ColumnType getType(String value) {
		if (value.startsWith("'")) {
			return ColumnType.VARCHAR;
		}
		if (value.contains("true") || value.contains("false")) {
			return ColumnType.BOOLEAN;
		}
		return ColumnType.NUMERIC;
	}

	private Object getValue(ColumnType type, String value) {
		if ("null".equalsIgnoreCase(value)) {
			return null;
		}

		switch (type) {
			case NUMERIC:
				return new BigDecimal(value);
			case BOOLEAN:
				return Boolean.parseBoolean(value);
			case VARCHAR:
			default:
				return value.replace("'", "");
		}
	}
}