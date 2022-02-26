package lesson9.hw.cache.cacheExperiment;

/**
 * Интерфейс для кэша
 * Любой, кто пользуется кэшом, должен его реализовать
 *
 * @param <T> Тип возвращаемого значения
 */
public interface ICalculate<T> {

	/**
	 * Производит расчеты
	 *
	 * @return результат расчетов
	 */
	T calculate();

	/**
	 * @return хэш для ключа
	 */
	String getKeyHash();
}
