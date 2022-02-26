package lesson10.hw.parsers;

import lesson10.hw.request.Request;

/**
 * Парсинг запроса строки и преобразование его в объект
 */
public interface Parser {

	/**
	 * Преобразует входную строку в объект
	 *
	 * @param value строка с запросом
	 * @return преобразованный объект с данными
	 */
	Request parse(String value);
}
