package lesson6.hw.test;

import lesson6.hw.ArrayUtil;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ArrayUtilTest {

	@Test
	public void addToEmptyArray() {
		String[] result = ArrayUtil.add(null, "");
		assertEquals(1, result.length);
		assertEquals("", result[0]);
	}

	@Test
	public void addToNotEmptyArray() {
		String[] result = ArrayUtil.add(new String[]{"1"}, "");
		assertEquals(2, result.length);
		assertEquals("1", result[0]);
		assertEquals("", result[1]);
	}
}
