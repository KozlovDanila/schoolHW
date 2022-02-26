package lesson9.hw.cache;

import lesson9.hw.cache.cacheExperiment.Cache;
import lesson9.hw.citiesRating.CitiesRating;
import lesson9.hw.citiesRating.City;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * Кэш получения рейтинга городов
 * <p>
 * (Инфо не про класс, а про кэш)
 * Чем этот кэш плох? Тем, что он хранит в себе всю информацию на протяжении
 * всей жизни программы, что очень сильно забивает память. Так же, информация ведь могла обновиться,
 * а с таким кэшом мы никогда её не обновим
 * Чтобы решить эти проблемы, раз в какое-то время запускают очищение кэша.
 * Мы этого делать не будем, тк нам важно понять принцип, а не придумать велосипед.
 * Понятное дело существуют библиотеки и фреймворки, в которых есть свои кэши и которыми удобно пользоваться
 * <p>
 * Так же, этот класс можно было бы сделать более универсальным.
 * Ведь видно, что весь его смысл в том, чтобы получить сделать запрос куда, получить данные и сохранить их.
 * И при будущих таких же запросах, не лезть за информацией снова, а отдать уже рассчитанную.
 * Поэтому, можно очень сильно его обобщить, но тогда им будет сложнее пользоваться.
 * Поэтому, пусть лучше будет понятным, чем сложным. Ведь мы снова хотим понять смысл, а не сделать велосиепед
 *
 * Или посмотрите
 * @see Cache
 */
public final class CitiesRatingCache {

	/**
	 * Снова паттерн "одиночка"
	 * Нужен для того, чтобы сделать всего один экземпляр на всю программу
	 * Чтобы в любой части программы кэш работал правильно
	 */
	private static CitiesRatingCache instance;

	/**
	 * Тот, кто будет делать реальные запросы
	 */
	private final CitiesRating citiesRating;

	/**
	 * Тот, кто хранит результат реального запроса и его ключ
	 */
	private final Map<String, Set<City>> cache = new HashMap<>();

	/**
	 * Приватный конструктор, тк нужно запретить создавать объект извне
	 *
	 * @param citiesRating объект для реальных расчетов
	 */
	private CitiesRatingCache(CitiesRating citiesRating) {
		this.citiesRating = citiesRating;
	}

	/**
	 * Статический метод для получения объекта кэша
	 *
	 * @param citiesRating объект для реальных расчетов
	 * @return кэш
	 */
	public static CitiesRatingCache getInstance(CitiesRating citiesRating) {
		if (instance == null) {
			instance = new CitiesRatingCache(citiesRating);
		}
		return instance;
	}

	/**
	 * Производит рассчеты, если они нужны, иначе возвращает готовый результат
	 * Если в кэше нет по ключу данных, то делаем реальный запрос, иначе возвращаем из кэща
	 *
	 * @param fileName   имя файла для запроса
	 * @param comparator последовательность для составления рейтинга
	 * @return рейтинг по городам
	 */
	public Set<City> calculate(String fileName, Comparator<City> comparator) {
		String keyHash = fileName + comparator.getClass().getName();
		Set<City> cities = cache.get(keyHash);
		if (cities != null) {
			return cities;
		}
		Set<City> result = citiesRating.calculate(fileName, comparator);
		cache.put(keyHash, result);
		return result;
	}
}