package lesson9.hw.cache.cacheExperiment;

import java.util.HashMap;
import java.util.Map;

/**
 * Пример того, как можно было бы сделать КЭШ
 * Но им становится сложно пользоваться и нужно менять того, кто им пользуется
 *
 * @param <R> Тип результата
 */
public final class Cache<R> {


	private static Cache instance;
	private final Map<String, R> cache = new HashMap<>();

	private Cache() {
	}

	public static Cache getInstance() {
		if (instance == null) {
			instance = new Cache();
		}
		return instance;
	}

	public R calculate(ICalculate<R> calculator) {
		String keyHash = calculator.getKeyHash();
		R cities = cache.get(keyHash);
		if (cities != null) {
			return cities;
		}
		R result = calculator.calculate();
		cache.put(keyHash, result);
		return result;
	}
}