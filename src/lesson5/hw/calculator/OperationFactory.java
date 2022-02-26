package lesson5.hw.calculator;

import lesson5.hw.calculator.calculators.*;

/**
 * Фабрика для полечения конкретного экземпляра операции
 */
public class OperationFactory {

	/**
	 *
	 * @see AddOperation +
	 * @see DivideOperation -
	 * @see SubtractOperation *
	 * @see MultiplyOperation /
	 * @see EmptyOperation Если непонятный тип
	 *
	 * @param type строковое преджставление типа
	 * @return созданный экземпляр операции
	 */
	public IOperation get(OperationType type) {
		switch (type) {
			case ADD:
				return new AddOperation();
			case DIVIDE:
				return new DivideOperation();
			case SUBTRACT:
				return new SubtractOperation();
			case MULTIPLY:
				return new MultiplyOperation();
			default:
				return new EmptyOperation();
		}
	}
}
