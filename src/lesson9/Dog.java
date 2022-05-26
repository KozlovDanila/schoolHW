package lesson9;

import java.util.Objects;

public class Dog implements Comparable<Dog> {

	private int id;
	private String value;

	public Dog(int id) {
		this.id = id;
	}

	public Dog(String value) {
		this.value = value;
	}

	public int getId() {
		return id;
	}

	public String getValue() {
		return value;
	}

	@Override
	public String toString() {
		return "Dog{" +
				"id=" + id +
				'}';
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		Dog dog = (Dog) o;
		return id == dog.id &&
				Objects.equals(value, dog.value);
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, value);
	}

	@Override
	public int compareTo(Dog otherDog) {
		if  (otherDog.id == id) {
			return 0;
		}
		return id > otherDog.id ? 1 : 0;
	}

	public void setId(int id) {
		this.id = id;
	}
}
