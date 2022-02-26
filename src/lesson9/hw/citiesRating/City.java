package lesson9.hw.citiesRating;

/**
 * Описание модели города
 */
public class City {

	private String name;
	private Long count;

	/**
	 * @param name  Название
	 * @param count кол-во жителей
	 */
	public City(String name, Long count) {
		this.name = name;
		this.count = count;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Long getCount() {
		return count;
	}

	public void setCount(Long count) {
		this.count = count;
	}

	@Override
	public String toString() {
		return "Город=" + name + " " + "кол-во жителей=" + count;
	}
}
