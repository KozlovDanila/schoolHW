package lesson1.hw.one;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

public class HumanTest {

	@Test
	public void createEmptyHuman() {
		Human human = new Human();
		assertNull(human.firstName);
		assertNull(human.lastName);
		assertNull(human.patronymic);
		assertEquals(0, human.age);
		assertEquals("Human{lastName='null', firstName='null', patronymic='null', age=0}", human.toString());
	}


	@Test
	public void createNotEmptyHuman() {
		Human human = new Human("Олегов", "Олег", "Олегович", 20);
		assertEquals("Олег", human.firstName);
		assertEquals("Олегов", human.lastName);
		assertEquals("Олегович", human.patronymic);
		assertEquals(20, human.age);

		human.setAge(30);
		human.setFirstName("Вика");
		human.setLastName("Викова");
		human.setPatronymic("Виковна");
		assertEquals("Вика", human.firstName);
		assertEquals("Викова", human.lastName);
		assertEquals("Виковна", human.patronymic);
		assertEquals(30, human.age);

		assertEquals("Human{lastName='Викова', firstName='Вика', patronymic='Виковна', age=30}", human.toString());
	}
}
