package lesson10.hw.parsers;

import lesson10.hw.WhereExpression;
import lesson10.hw.request.Request;
import lesson10.hw.request.SelectRequest;

/**
 * Парсер для запросе select
 * delete может быть пустой или с where
 * Пример: delete from table1
 * 		   delete from table1 where columnName=value
 */
//select * from table_name
//select * from table_name where column1=value1
public class SelectParser implements Parser {
	@Override
	public Request parse(String value) {
		SelectRequest request = new SelectRequest();
		value = value.replace("select * from ", "").trim();
		String[] halfRequest = value.split("where");
		request.setTableName(halfRequest[0].trim());
		if (halfRequest.length > 1) {
			String[] whereExpression = halfRequest[1].split("=");
			request.setExpression(new WhereExpression(whereExpression[0].trim(), whereExpression[1].trim().replace("'", "")));
		}
		return request;
	}
}
