package lesson7.hw.dataStructures.test;

import lesson7.hw.dataStructures.List;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ListTest {

	private final List list = new List();

	@Before
	public void setUp() {
		list.add(4);
		list.add(2);
		list.add(5);
		list.add(10);
	}

	@Test
	public void successGet() {
		assertEquals(4, list.get(0));
		assertEquals(2, list.get(1));
		assertEquals(5, list.get(2));
		assertEquals(10, list.get(3));
	}

	@Test(expected = ArrayIndexOutOfBoundsException.class)
	public void throwExceptionWhenLessThanZero() {
		list.get(-1);
	}

	@Test(expected = ArrayIndexOutOfBoundsException.class)
	public void throwExceptionWhenMoreThanSize() {
		list.get(4);
	}
}
