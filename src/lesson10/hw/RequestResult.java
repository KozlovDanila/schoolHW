package lesson10.hw;

import lesson10.hw.storage.Table;

/**
 * Результат исполнения запроса
 */
public class RequestResult {

	public static final RequestResult SUCCESS = new RequestResult(true, "");

	private boolean isSuccess;
	private String message;
	private Table table;

	public RequestResult(boolean isSuccess, String message) {
		this.isSuccess = isSuccess;
		this.message = message;
	}

	public RequestResult(boolean isSuccess, String message, Table table) {
		this.isSuccess = isSuccess;
		this.message = message;
		this.table = table;
	}

	public boolean isSuccess() {
		return isSuccess;
	}

	public void setSuccess(boolean success) {
		isSuccess = success;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Table getTable() {
		return table;
	}

	public void setTable(Table table) {
		this.table = table;
	}
}
