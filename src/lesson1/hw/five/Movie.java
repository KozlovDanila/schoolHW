package lesson1.hw.five;

/**
 * Класс, описывает фильм
 */
public class Movie {

	String name;
	int length;
	String author;

	/**
	 * @param name название
	 * @param length длительность
	 * @param author автор
	 */
	Movie(String name, int length, String author) {
		this.name = name;
		this.length = length;
		this.author = author;
	}

	/**
	 * @return Название
	 */
	String getName() {
		return name;
	}

	/**
	 * @param name Название
	 */
	void setName(String name) {
		this.name = name;
	}

	/**
	 * @return Длительность
	 */
	int getLength() {
		return length;
	}

	/**
	 * @param length Длительность
	 */
	void setLength(int length) {
		this.length = length;
	}

	/**
	 * @return Автор
	 */
	String getAuthor() {
		return author;
	}

	/**
	 * @param author Автор
	 */
	void setAuthor(String author) {
		this.author = author;
	}

	@Override
	public String toString() {
		return "Movie{" +
				"name='" + name + '\'' +
				", length=" + length +
				", author='" + author + '\'' +
				'}';
	}
}
