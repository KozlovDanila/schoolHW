package lesson1.hw.four;

/**
 * Класс, описывает книгу
 */
class Book {

	String name;
	int pageCount;
	int year;
	String author;

	/**
	 * @param name      Название
	 * @param pageCount кол-во страниц
	 * @param year      год создания
	 * @param author    автор
	 */
	Book(String name, int pageCount, int year, String author) {
		this.name = name;
		this.pageCount = pageCount;
		this.year = year;
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
	 * @return Кол-во страниц
	 */
	int getPageCount() {
		return pageCount;
	}

	/**
	 * @param pageCount Кол-во страниц
	 */
	void setPageCount(int pageCount) {
		this.pageCount = pageCount;
	}

	/**
	 * @return год издания
	 */
	int getYear() {
		return year;
	}

	/**
	 * @param year год издания
	 */
	void setYear(int year) {
		this.year = year;
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
		return "Book{" +
				"name='" + name + '\'' +
				", pageCount=" + pageCount +
				", year=" + year +
				", author='" + author + '\'' +
				'}';
	}
}
