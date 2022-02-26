package lesson1.hw.one;

/**
 * Класс, описывает человка
 */
class Human {

	String lastName;
	String firstName;
	String patronymic;
	int age;

	Human() {
	}

	/**
	 * @param lastName   Фамилия
	 * @param firstName  Имя
	 * @param patronymic Отчество
	 * @param age        кол-во лет
	 */
	Human(String lastName, String firstName, String patronymic, int age) {
		this.lastName = lastName;
		this.firstName = firstName;
		this.patronymic = patronymic;
		this.age = age;
	}

	/**
	 * @return Фамилия
	 */
	String getLastName() {
		return lastName;
	}

	/**
	 * @param lastName Фамилия
	 */
	void setLastName(String lastName) {
		this.lastName = lastName;
	}

	/**
	 * @return Имя
	 */
	String getFirstName() {
		return firstName;
	}

	/**
	 * @param firstName Имя
	 */
	void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	/**
	 * @return Отчество
	 */
	String getPatronymic() {
		return patronymic;
	}

	/**
	 * @param patronymic Отчество
	 */
	void setPatronymic(String patronymic) {
		this.patronymic = patronymic;
	}

	/**
	 * @return Кол-во лет
	 */
	int getAge() {
		return age;
	}

	/**
	 * @param age Кол-во лет
	 */
	void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Human{" +
				"lastName='" + lastName + '\'' +
				", firstName='" + firstName + '\'' +
				", patronymic='" + patronymic + '\'' +
				", age=" + age +
				'}';
	}
}
