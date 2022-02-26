package lesson10.hw.storage;

import lesson10.hw.Column;
import lesson10.hw.ColumnValue;
import lesson10.hw.RequestResult;
import lesson10.hw.WhereExpression;
import lesson10.hw.request.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Самый простой пример, как можно хранить данные
 * Помимо этого решения, можно придумать класс,
 * который будет иначе хранить данные. И благодаря наследованию,
 * вся программа будет работать, надо лишь изменить создание объекта там, где создается этот класс
 */
public class SimpleDataBase implements IDataBaseDao {

	/**
	 * Храним в виде мапы, где
	 * ключ - это название таблицы
	 * значение - это таблица с данными по колонкам и по их значениям
	 */
	private final Map<String, Table> dataBase = new HashMap<>();

	/**
	 * При создании проверяем, что такой таблицы ещё нет. Если такая есть - возвращаем плохой результат,
	 * иначе создаем таблицу
	 *
	 * @param request запрос на создание
	 * @return результат выполнения
	 */
	@Override
	public RequestResult create(Request request) {
		CreateRequest req = (CreateRequest) request;
		if (dataBase.get(req.getTableName()) != null) {
			return new RequestResult(false, String.format("Таблица с именем '%s' уже существует", req.getTableName()));
		}
		List<Column> column = req.getColumn();
		dataBase.put(req.getTableName(), new Table(column));
		return RequestResult.SUCCESS;
	}

	/**
	 * При вставке проверяем, что таблица для вставки существует,
	 * что набор аргументов соответствует таблице, и последовательность по типам соблюдена
	 * Если все хорошо, кладём значения в таблицу
	 *
	 * @param request запрос на вставку
	 * @return результат выполнения
	 */
	@Override
	public RequestResult insert(Request request) {
		InsertRequest req = (InsertRequest) request;
		Table table = dataBase.get(req.getTableName());
		if (table == null) {
			return new RequestResult(false, String.format("Таблицы '%s' не существует", req.getTableName()));
		}
		if (table.getColumns().size() != req.getValues().size()) {
			return new RequestResult(false, "Передан неправильный набор аргументов");
		}
		for (int i = 0; i < table.getColumns().size(); i++) {
			if (table.getColumns().get(i).getType() != req.getValues().get(i).getType()) {
				return new RequestResult(false, "Неверная последовательность параметров");
			}
		}
		table.getValues().add(req.getValues());
		return RequestResult.SUCCESS;
	}

	/**
	 * Проверяем, что таблица существует,
	 * Если условия для удаления нет, то удаляем все, иначе только те, что подходят по условию
	 *
	 * @param request запрос на удаление
	 * @return результат выполнения
	 */
	@Override
	public RequestResult delete(Request request) {
		DeleteRequest req = (DeleteRequest) request;
		Table table = dataBase.get(req.getTableName());
		if (table == null) {
			return new RequestResult(false, String.format("Таблицы '%s' не существует", req.getTableName()));
		}
		WhereExpression expression = req.getExpression();
		if (expression == null) {
			table.setValues(new ArrayList<>());
			return RequestResult.SUCCESS;
		}

		int columnIndex = getColumnIndex(table.getColumns(), expression.getColumnName());
		if (columnIndex == -1) {
			return new RequestResult(false, String.format("Столбец с именем '%s' не существует", expression.getColumnName()));
		}

		List<List<ColumnValue>> values = table.getValues();
		for (int i = 0; i < values.size(); i++) {
			List<ColumnValue> value = values.get(i);
			if (value.get(columnIndex).getValue().toString().equalsIgnoreCase(expression.getValue().toString())) {
				values.remove(i);
				i--;
			}
		}
		return RequestResult.SUCCESS;
	}

	/**
	 * Получение данных из таблицы
	 * Проверяем, что такая таблица существует
	 * Если условия получения нет, то возвращаем все, иначе только те, что подходят по условию
	 *
	 * @param request запрос на получение данных
	 * @return результат выполнения
	 */
	@Override
	public RequestResult select(Request request) {
		SelectRequest req = (SelectRequest) request;
		Table table = dataBase.get(req.getTableName());
		if (table == null) {
			return new RequestResult(false, String.format("Таблицы '%s' не существует", req.getTableName()));
		}

		List<List<ColumnValue>> resultValues = new ArrayList<>();

		WhereExpression expression = req.getExpression();
		if (expression == null) {
			resultValues.addAll(table.getValues());
		} else {
			int columnIndex = getColumnIndex(table.getColumns(), expression.getColumnName());
			if (columnIndex == -1) {
				return new RequestResult(false, String.format("Столбец с именем '%s' не существует", expression.getColumnName()));
			}

			List<List<ColumnValue>> values = table.getValues();
			for (List<ColumnValue> value : values) {
				if (value.get(columnIndex).getValue().toString().equalsIgnoreCase(expression.getValue().toString())) {
					resultValues.add(value);
				}
			}
		}
		return new RequestResult(true, null, new Table(table.getColumns(), resultValues));
	}

	private int getColumnIndex(List<Column> columns, String columnName) {
		for (int i = 0; i < columns.size(); i++) {
			if (columns.get(i).getName().equalsIgnoreCase(columnName)) {
				return i;
			}
		}
		return -1;
	}
}
