package lesson1.hw.three;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MatrixTest {

	Matrix matrix1 = new Matrix(new int[][]{
			{1, 2, 3},
			{3, 2, 4},
			{-1, 2, 0}
	});

	Matrix matrix2 = new Matrix(new int[][]{
			{1, 2, 3},
			{-1, 2, 0},
			{3, 2, 4}
	});


	@Test
	public void add() {
		Matrix result = matrix1.add(matrix2);
		assertEquals(2, result.getValue(0, 0));
		assertEquals(6, result.getValue(0, 2));
		assertEquals(2, result.getValue(2, 0));
		assertEquals(4, result.getValue(2, 2));
		assertEquals(4, result.getValue(1, 1));
	}

	@Test
	public void multiply() {
		Matrix result = matrix1.multiply(matrix2);
		assertEquals(1, result.getValue(0, 0));
		assertEquals(9, result.getValue(0, 2));
		assertEquals(-3, result.getValue(2, 0));
		assertEquals(0, result.getValue(2, 2));
		assertEquals(4, result.getValue(1, 1));
	}

	@Test
	public void setValue() {
		assertEquals(1, matrix1.getValue(0, 0));
		matrix1.setValue(0, 0, 2);
		assertEquals(2, matrix1.getValue(0, 0));
	}
}
