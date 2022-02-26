package lesson9.hw.citiesRating.test;

import lesson6.hw.countSymbolsIntLine.ReaderFromFile;
import lesson9.hw.citiesRating.AscComparator;
import lesson9.hw.citiesRating.CitiesRating;
import lesson9.hw.citiesRating.City;
import lesson9.hw.citiesRating.DeskComparator;
import org.junit.Test;

import java.util.Set;

import static org.junit.Assert.assertEquals;

public class CitiesRatingTest {

	private final CitiesRating rating = new CitiesRating(new ReaderFromFile());
	private final String fileName = "./src/lesson9/hw/citiesRating/test/test.txt";

	@Test
	public void createRatingAscComporator() {
		Set<City> citiesRating = rating.calculate(fileName, new AscComparator());
		City[] cities = new City[citiesRating.size()];
		citiesRating.toArray(cities);
		assertEquals(5, cities.length);
		assertEquals("Москва", cities[0].getName());
		assertEquals(Long.valueOf(10_000_000), cities[0].getCount());

		assertEquals("Санк-Петербург", cities[1].getName());
		assertEquals(Long.valueOf(5_000_000), cities[1].getCount());

		assertEquals("Сочи", cities[2].getName());
		assertEquals(Long.valueOf(1_000_000), cities[2].getCount());

		assertEquals("Краснодар", cities[3].getName());
		assertEquals(Long.valueOf(500_000), cities[3].getCount());

		assertEquals("Тверь", cities[4].getName());
		assertEquals(Long.valueOf(420_000), cities[4].getCount());
	}

	@Test
	public void createRatingDescComporator() {
		Set<City> citiesRating = rating.calculate(fileName, new DeskComparator());
		City[] cities = new City[citiesRating.size()];
		citiesRating.toArray(cities);
		assertEquals(5, cities.length);

		assertEquals("Москва", cities[4].getName());
		assertEquals(Long.valueOf(10_000_000), cities[4].getCount());

		assertEquals("Санк-Петербург", cities[3].getName());
		assertEquals(Long.valueOf(5_000_000), cities[3].getCount());

		assertEquals("Сочи", cities[2].getName());
		assertEquals(Long.valueOf(1_000_000), cities[2].getCount());

		assertEquals("Краснодар", cities[1].getName());
		assertEquals(Long.valueOf(500_000), cities[1].getCount());

		assertEquals("Тверь", cities[0].getName());
		assertEquals(Long.valueOf(420_000), cities[0].getCount());
	}
}
