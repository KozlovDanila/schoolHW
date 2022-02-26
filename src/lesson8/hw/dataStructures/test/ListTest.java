package lesson8.hw.dataStructures.test;

import lesson8.hw.dataStructures.List;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ListTest {

	private final List<Integer> list = new List<>();

	@Before
	public void setUp() {
		list.add(4);
		list.add(2);
		list.add(5);
		list.add(10);
	}

	@Test
	public void successGet() {
		assertEquals(Integer.valueOf(4), list.get(0));
		assertEquals(Integer.valueOf(2), list.get(1));
		assertEquals(Integer.valueOf(5), list.get(2));
		assertEquals(Integer.valueOf(10), list.get(3));
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
