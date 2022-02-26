package lesson7.hw.dataStructures;

/**
 * Структура данных "Стэк", в качестве элемента используется
 *
 * @see Element
 * <p>
 * Добавление в стек {@link Stack#push(int)}
 * Получить значение верхнего элемента стэка и удалить элемент {@link Stack#pop()}
 * Получить значение верхнего элемента стэка {@link Stack#peek()}}
 */
public class Stack {

	/**
	 * Верхний элемент
	 */
	private Element current;

	/**
	 * Добавление в стэк
	 * Новый элемент становится вершиной стэка,
	 *
	 * @param value значение элемента
	 */
	public void push(int value) {
		current = new Element(value, current);
	}

	/**
	 * Получение значения элемента вершины и удаление его с вершины
	 *
	 * @return значение вершины или NullPointerException, если стэк пуст
	 */
	public int pop() {
		if (current == null) {
			throw new NullPointerException();
		}
		int result = current.getValue();
		current = current.getNext();
		return result;
	}

	/**
	 * Получение значения элемента вершины
	 *
	 * @return значение вершины или NullPointerException, если стэк пуст
	 */
	public int peek() {
		if (current == null) {
			throw new NullPointerException();
		}
		return current.getValue();
	}
}
