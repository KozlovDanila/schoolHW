package lesson8.hw.dataStructures.test;

import lesson8.hw.dataStructures.Stack;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class StackTest {

	private final Stack<Double> stack = new Stack<>();

	@Before
	public void setUp() {
		stack.push(4.0);
		stack.push(2.0);
		stack.push(5.0);
		stack.push(10.0);
	}

	@Test
	public void successPop() {
		assertEquals(Double.valueOf(10), stack.pop());
		assertEquals(Double.valueOf(5), stack.pop());
		assertEquals(Double.valueOf(2), stack.pop());
		assertEquals(Double.valueOf(4), stack.pop());
	}

	@Test
	public void successPeek() {
		assertEquals(Double.valueOf(10), stack.peek());
		assertEquals(Double.valueOf(10), stack.peek());
	}

	@Test(expected = NullPointerException.class)
	public void throwExceptionPopWhenStackIsEmpty() {
		Stack<Double> stack = new Stack<>();
		stack.pop();
	}

	@Test(expected = NullPointerException.class)
	public void throwExceptionPeekWhenStackIsEmpty() {
		Stack<Double> stack = new Stack<>();
		stack.peek();
	}

	@Test(expected = NullPointerException.class)
	public void throwExceptionPopWhenStackCrowded() {
		Stack<Double> stack = new Stack<>();
		stack.push(1.0);
		stack.pop();
		stack.pop();
	}

	@Test(expected = NullPointerException.class)
	public void throwExceptionPeekWhenStackCrowded() {
		Stack<Double> stack = new Stack<>();
		stack.push(1.0);
		stack.pop();
		stack.peek();
	}
}
