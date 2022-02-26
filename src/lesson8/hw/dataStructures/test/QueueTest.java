package lesson8.hw.dataStructures.test;

import lesson8.hw.dataStructures.Queue;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class QueueTest {

	private final Queue<ClassForTest> queue = new Queue<>();

	@Before
	public void setUp() {
		queue.push(new ClassForTest(4));
		queue.push(new ClassForTest(2));
		queue.push(new ClassForTest(5));
		queue.push(new ClassForTest(10));
	}

	@Test
	public void successPop() {
		assertEquals(new ClassForTest(4), queue.pop());
		assertEquals(new ClassForTest(2), queue.pop());
		assertEquals(new ClassForTest(5), queue.pop());
		assertEquals(new ClassForTest(10), queue.pop());
	}

	@Test(expected = NullPointerException.class)
	public void throwExceptionWhenLessThanZero() {
		Queue<ClassForTest> queue = new Queue<>();
		queue.pop();
	}

	@Test(expected = NullPointerException.class)
	public void throwExceptionWhenMoreThanSize() {
		Queue<ClassForTest> queue = new Queue<>();
		queue.push(new ClassForTest(4));
		queue.pop();
		queue.pop();
	}
}
