package lesson10.hw;

import lesson10.hw.request.*;
import lesson10.hw.storage.IDataBaseDao;

/**
 * Вызывает нужный метод к БД
 */
public class DataBaseManager {

	private final IDataBaseDao dao;

	public DataBaseManager(IDataBaseDao dao) {
		this.dao = dao;
	}

	public RequestResult execute(Request request) {
		if (request instanceof CreateRequest) {
			return create(request);
		}
		if (request instanceof InsertRequest) {
			return insert(request);
		}
		if (request instanceof DeleteRequest) {
			return delete(request);
		}
		if (request instanceof SelectRequest) {
			return select(request);
		}
		return new RequestResult(false, "Такой команды не существует");
	}

	private RequestResult create(Request request) {
		return dao.create(request);
	}

	private RequestResult insert(Request request) {
		return dao.insert(request);
	}

	private RequestResult delete(Request request) {
		return dao.delete(request);
	}

	private RequestResult select(Request request) {
		return dao.select(request);
	}
}
