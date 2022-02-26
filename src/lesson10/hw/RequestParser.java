package lesson10.hw;

import lesson10.hw.parsers.Parser;
import lesson10.hw.request.Request;

/**
 * Парсит запрос
 */
public class RequestParser {

	private final RequestParserFactory factory;

	public RequestParser(RequestParserFactory factory) {
		this.factory = factory;
	}

	/**
	 * Находит нужный парсер и парсит запрос
	 *
	 * @param value запрос
	 * @return результат парсинга
	 */
	public Request parse(String value) {
		String[] data = value.split(" ");
		Parser parser = factory.getParser(data[0]);
		return parser.parse(value);
	}
}
