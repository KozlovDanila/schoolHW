package lesson7.hw.dataStructures.test;

import lesson7.hw.dataStructures.Stack;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class StackTest {

	private final Stack stack = new Stack();

	@Before
	public void setUp() {
		stack.push(4);
		stack.push(2);
		stack.push(5);
		stack.push(10);
	}

	@Test
	public void successPop() {
		assertEquals(10, stack.pop());
		assertEquals(5, stack.pop());
		assertEquals(2, stack.pop());
		assertEquals(4, stack.pop());
	}

	@Test
	public void successPeek() {
		assertEquals(10, stack.peek());
		assertEquals(10, stack.peek());
	}

	@Test(expected = NullPointerException.class)
	public void throwExceptionPopWhenStackIsEmpty() {
		Stack stack = new Stack();
		stack.pop();
	}

	@Test(expected = NullPointerException.class)
	public void throwExceptionPeekWhenStackIsEmpty() {
		Stack stack = new Stack();
		stack.peek();
	}

	@Test(expected = NullPointerException.class)
	public void throwExceptionPopWhenStackCrowded() {
		Stack stack = new Stack();
		stack.push(1);
		stack.pop();
		stack.pop();
	}

	@Test(expected = NullPointerException.class)
	public void throwExceptionPeekWhenStackCrowded() {
		Stack stack = new Stack();
		stack.push(1);
		stack.pop();
		stack.peek();
	}
}
