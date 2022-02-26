package lesson10.hw.storage;

import lesson10.hw.RequestResult;
import lesson10.hw.request.Request;

/**
 * Интерфейс взаимодействия с БД
 */
public interface IDataBaseDao {

	/**
	 * Создание таблицы
	 *
	 * @param request запрос на создание
	 * @return результат выполнения действия
	 */
	RequestResult create(Request request);

	/**
	 * Вставка в таблицу
	 *
	 * @param request запрос на вставку
	 * @return результат выполнения действия
	 */
	RequestResult insert(Request request);

	/**
	 * Удаление из таблицы
	 *
	 * @param request запрос на удаление
	 * @return результат выполнения действия
	 */
	RequestResult delete(Request request);

	/**
	 * Получение данных из таблицы
	 *
	 * @param request запрос на получение
	 * @return результат выполнения действия
	 */
	RequestResult select(Request request);
}
