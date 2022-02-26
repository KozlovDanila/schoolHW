package lesson7.hw.dataStructures.test;

import lesson7.hw.dataStructures.Queue;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class QueueTest {

	private final Queue queue = new Queue();

	@Before
	public void setUp() {
		queue.push(4);
		queue.push(2);
		queue.push(5);
		queue.push(10);
	}

	@Test
	public void successPop() {
		assertEquals(4, queue.pop());
		assertEquals(2, queue.pop());
		assertEquals(5, queue.pop());
		assertEquals(10, queue.pop());
	}

	@Test(expected = NullPointerException.class)
	public void throwExceptionWhenLessThanZero() {
		Queue queue = new Queue();
		queue.pop();
	}

	@Test(expected = NullPointerException.class)
	public void throwExceptionWhenMoreThanSize() {
		Queue queue = new Queue();
		queue.push(4);
		queue.pop();
		queue.pop();
	}
}
