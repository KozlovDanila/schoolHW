package lesson9.hw.cache.cacheExperiment;

import lesson6.hw.countSymbolsIntLine.ReaderFromFile;
import lesson9.hw.citiesRating.AscComparator;
import lesson9.hw.citiesRating.City;
import lesson9.hw.citiesRating.DeskComparator;

import java.util.Set;

public class App {

	public static void main(String[] args) {
		String fileName = "./src/lesson9/hw/citiesRating/cities.txt";
		Cache<Set<City>> rating = Cache.getInstance();
		Set<City> citiesRating = rating.calculate(new CitiesRating(new ReaderFromFile(), fileName, new AscComparator()));
		Set<City> citiesRating1 = rating.calculate(new CitiesRating(new ReaderFromFile(), fileName, new DeskComparator()));
		Set<City> citiesRating2 = rating.calculate(new CitiesRating(new ReaderFromFile(), fileName, new AscComparator()));
		Set<City> citiesRating3 = rating.calculate(new CitiesRating(new ReaderFromFile(), fileName, new DeskComparator()));
		System.out.println(citiesRating3);
	}
}
