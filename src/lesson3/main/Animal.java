package lesson3.main;

/**
 * Класс, описывающий животное
 */
public class Animal {

	String name;

	/**
	 * @param name название
	 */
	public Animal(String name) {
		this.name = name;
	}

	/**
	 * @return название
	 */
	public String getName() {
		return name;
	}


	/**
	 * @param name название
	 */
	public void setName(String name) {
		this.name = name;
	}

	void voice() {
		System.out.println("Я " + name);
	}

}
