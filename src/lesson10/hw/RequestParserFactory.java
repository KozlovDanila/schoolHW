package lesson10.hw;

import lesson10.hw.parsers.*;
import lesson10.hw.request.Request;

/**
 * Получение нужного парсера по запросу
 */
public class RequestParserFactory {

	/**
	 * Возвращает нужный парсер по запросу
	 *
	 * @param value запрос
	 * @return парсер запроса
	 */
	public Parser getParser(String value) {
		switch (value.toLowerCase()) {
			case "create":
				return new CreateParser();
			case "insert":
				return new InsertParser();
			case "delete":
				return new DeleteParser();
			case "select":
				return new SelectParser();
			default:
				return new Parser() {
					@Override
					public Request parse(String value) {
						return new Request() {
						};
					}
				};
		}

	}
}
