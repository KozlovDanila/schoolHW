package lesson10.hw.parsers;

import lesson10.hw.WhereExpression;
import lesson10.hw.request.DeleteRequest;
import lesson10.hw.request.Request;

/**
 * Парсер для запросе delete
 * delete может быть пустой или с where
 * Пример: delete from table1
 * 		   delete from table1 where columnName=value
 */
public class DeleteParser implements Parser {
	@Override
	public Request parse(String value) {
		DeleteRequest request = new DeleteRequest();
		value = value.replace("delete from ", "").trim();
		String[] halfRequest = value.split("where");
		request.setTableName(halfRequest[0].trim());
		if (halfRequest.length > 1) {
			String[] whereExpression = halfRequest[1].split("=");
			request.setExpression(new WhereExpression(whereExpression[0].trim(), whereExpression[1].trim().replace("'", "")));
		}
		return request;
	}
}