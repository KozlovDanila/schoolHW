package lesson9.hw.citiesRating;

import lesson6.hw.countSymbolsIntLine.IReader;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

/**
 * Составляет рейтинг городов
 */
public class CitiesRating {

	private final IReader reader;

	public CitiesRating(IReader readerFromFile) {
		this.reader = readerFromFile;
	}

	/**
	 * Сотавляет рейтинг городов в нужной последовательности
	 *
	 * @param fileName   имя файла для чтения
	 * @param comparator последовательность для составления рейтинга
	 * @return рейтинг городов в нужной последовательности
	 */
	public Set<City> calculate(String fileName, Comparator<City> comparator) {
		Set<City> result = new TreeSet<>(comparator);
		String[] lines = reader.getReadLines(fileName);
		for (String line : lines) {
			String[] cityInfo = line.split("=");
			result.add(new City(cityInfo[0], Long.parseLong(cityInfo[1])));
		}
		return result;
	}
}
