package lesson9.hw.citiesRating;

import lesson6.hw.countSymbolsIntLine.ReaderFromFile;

import java.util.Set;

public class App {

	public static void main(String[] args) {
		CitiesRating rating = new CitiesRating(new ReaderFromFile());
		String fileName = "./src/lesson9/hw/citiesRating/cities.txt";
		Set<City> citiesRating = rating.calculate(fileName, new AscComparator());
		System.out.println(citiesRating);
	}
}
