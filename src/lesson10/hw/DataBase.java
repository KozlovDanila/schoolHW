package lesson10.hw;

import lesson10.hw.request.Request;
import lesson10.hw.storage.SimpleDataBase;
import lesson7.hw.logging.Logger;

import java.util.Arrays;

/**
 * Работа с БД
 */
public class DataBase {

	private static final Logger logger = Logger.getLogger(DataBase.class);

	private final DataBaseManager manager;
	private final RequestParser requestParser;

	public DataBase() {
		this.manager = new DataBaseManager(new SimpleDataBase());
		this.requestParser = new RequestParser(new RequestParserFactory());
	}

	public DataBase(DataBaseManager manager, RequestParser requestParser) {
		this.manager = manager;
		this.requestParser = requestParser;
	}

	/**
	 * Исполняет запрос
	 *
	 * @param value запрос
	 * @return результат исполнения
	 */
	public RequestResult execute(String value) {
		RequestResult result;
		try {
			Request request = requestParser.parse(value);
			result = manager.execute(request);
		} catch (Exception e) {
			logger.error(e.getMessage());
			logger.error(Arrays.toString(e.getStackTrace()));
			result = new RequestResult(false, e.getMessage() != null ? e.getMessage() : e.toString());
		}
		return result;
	}

}
