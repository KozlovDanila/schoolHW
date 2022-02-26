package lesson5.hw.calculator.test;

import lesson5.hw.calculator.ForOperationData;
import lesson5.hw.calculator.UserExpressionParser;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class UserExpressionParserTest {

	private final UserExpressionParser parser = new UserExpressionParser();

	@Test
	public void parseAddExpression() {
		ForOperationData value = parser.parse("1+2");
		assertEquals(1.0, value.getX(), 0.01);
		assertEquals(2.0, value.getY(), 0.01);
		assertEquals("+", value.getType());
	}

	@Test
	public void parseSubtractExpression() {
		ForOperationData value = parser.parse("  1  -  2  ");
		assertEquals(1.0, value.getX(), 0.01);
		assertEquals(2.0, value.getY(), 0.01);
		assertEquals("-", value.getType());
	}

	@Test
	public void parseMultiplyExpression() {
		ForOperationData value = parser.parse("  1  * 2.54");
		assertEquals(1.0, value.getX(), 0.01);
		assertEquals(2.54, value.getY(), 0.01);
		assertEquals("*", value.getType());
	}

	@Test
	public void parseDivideExpression() {
		ForOperationData value = parser.parse("1/2");
		assertEquals(1.0, value.getX(), 0.01);
		assertEquals(2.0, value.getY(), 0.01);
		assertEquals("/", value.getType());
	}
}
