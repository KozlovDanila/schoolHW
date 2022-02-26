package lesson10.hw.request;

/**
 * Запрос к БД
 */
public abstract class Request {

	/**
	 * Название таблицы
	 */
	private String tableName;

	public String getTableName() {
		return tableName;
	}

	public void setTableName(String tableName) {
		this.tableName = tableName;
	}
}
