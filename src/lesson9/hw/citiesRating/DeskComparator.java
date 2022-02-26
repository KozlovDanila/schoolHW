package lesson9.hw.citiesRating;

import java.util.Comparator;

/**
 * Сравнение по возрастанию
 * (Добавил чисто для теста)
 */
public class DeskComparator implements Comparator<City> {

	@Override
	public int compare(City city1, City city2) {
		if (city1.getCount() > city2.getCount()) {
			return 1;
		} else if (city2.getCount() > city1.getCount()) {
			return -1;
		}
		return 0;
	}
}
