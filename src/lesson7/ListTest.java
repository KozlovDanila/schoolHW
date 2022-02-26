package lesson7;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ListTest {

	@Test
	public void createSuccessList() {
		List list = new List();
		list.add(5);
		list.add(2);
		list.add(0);
		assertEquals(3, list.getSize());
		assertEquals(0, list.get(2));
		assertEquals(5, list.get(0));
		assertEquals(2, list.get(1));
	}

	@Test(expected = IndexOutOfBoundsException.class)
	public void getThrow() {
		List list = new List();
		list.add(5);
		list.add(2);
		list.add(0);
		assertEquals(2, list.get(3));
	}
}
