package lesson3.tests;

import org.junit.Test;

public class AnimalTest {

	@Test
	public void createAnimal() {
		lesson3.main.Animal animal = new lesson3.main.Animal("Слон");
		lesson3.Animal animal1 = new lesson3.Animal();
//		animal.voice();
	}
}
