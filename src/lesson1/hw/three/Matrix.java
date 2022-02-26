package lesson1.hw.three;

/**
 * Класс для работы с матрицами
 */
class Matrix {

	int[][] matrix;

	/**
	 * @param matrix двухмерный массив одинаковой длины nxn
	 */
	Matrix(int[][] matrix) {
		this.matrix = matrix;
	}

	/**
	 * Получение значения элементы матрицы по индексам
	 *
	 * @param i индекс по колонке
	 * @param j индекс по строке
	 * @return значение элемента по индексам
	 */
	int getValue(int i, int j) {
		return matrix[i][j];
	}

	/**
	 * Изменяет значения элементы матрицы по индексам переданным значением
	 *
	 * @param i     индекс по колонке
	 * @param j     индекс по строке
	 * @param value новое значение
	 */
	void setValue(int i, int j, int value) {
		matrix[i][j] = value;
	}

	/**
	 * Сложение двух матриц
	 *
	 * @param otherMatrix вторая матрица для сложения
	 * @return новая матрица, являющаяся результом сложения двух матриц
	 */
	Matrix add(Matrix otherMatrix) {
		int length = otherMatrix.matrix.length;
		int[][] newMatrix = new int[length][length];
		for (int i = 0; i < length; i++) {
			for (int j = 0; j < length; j++) {
				newMatrix[i][j] = matrix[i][j] + otherMatrix.matrix[i][j];
			}
		}
		return new Matrix(newMatrix);
	}

	/**
	 * Умножение двух матриц
	 *
	 * @param otherMatrix вторая матрица для умножения
	 * @return новая матрица, являющаяся результом умножения двух матриц
	 */
	Matrix multiply(Matrix otherMatrix) {
		int length = otherMatrix.matrix.length;
		int[][] newMatrix = new int[length][length];
		for (int i = 0; i < length; i++) {
			for (int j = 0; j < length; j++) {
				newMatrix[i][j] = matrix[i][j] * otherMatrix.matrix[i][j];
			}
		}
		return new Matrix(newMatrix);
	}
}