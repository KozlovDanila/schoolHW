package lesson9.hw.cache;

import lesson6.hw.countSymbolsIntLine.ReaderFromFile;
import lesson9.hw.citiesRating.AscComparator;
import lesson9.hw.citiesRating.CitiesRating;
import lesson9.hw.citiesRating.City;
import lesson9.hw.citiesRating.DeskComparator;

import java.util.Set;

public class App {

	/**
	 * Тест на это дело хоть и можно написать, но сложно, поэтому, без тестов :(
	 */
	public static void main(String[] args) {
		CitiesRatingCache rating = CitiesRatingCache.getInstance(new CitiesRating(new ReaderFromFile()));
		String fileName = "./src/lesson9/hw/citiesRating/cities.txt";
		Set<City> citiesRating = rating.calculate(fileName, new AscComparator());
		Set<City> citiesRating1 = rating.calculate(fileName, new DeskComparator());
		Set<City> citiesRating2 = rating.calculate(fileName, new AscComparator());
		Set<City> citiesRating3 = rating.calculate(fileName, new DeskComparator());
		System.out.println(citiesRating3);
	}
}
