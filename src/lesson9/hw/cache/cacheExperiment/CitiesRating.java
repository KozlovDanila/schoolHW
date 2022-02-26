package lesson9.hw.cache.cacheExperiment;

import lesson6.hw.countSymbolsIntLine.IReader;
import lesson9.hw.citiesRating.City;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

/**
 * Составляет рейтинг городов
 */
public class CitiesRating implements ICalculate<Set<City>> {

	private final IReader reader;
	private final String fileName;
	private final Comparator<City> comparator;

	public CitiesRating(IReader reader, String fileName, Comparator<City> comparator) {
		this.reader = reader;
		this.fileName = fileName;
		this.comparator = comparator;
	}

	@Override
	public Set<City> calculate() {
		Set<City> result = new TreeSet<>(comparator);
		String[] lines = reader.getReadLines(fileName);
		for (String line : lines) {
			String[] cityInfo = line.split("=");
			result.add(new City(cityInfo[0], Long.parseLong(cityInfo[1])));
		}
		return result;
	}

	@Override
	public String getKeyHash() {
		return fileName + getClass().getName();
	}
}
