package lesson8.hw.dataStructures;

/**
 * Структура данных "Стэк", в качестве элемента используется
 *
 * @see Element
 * <p>
 * Добавление в стек {@link Stack<T>#push(int)}
 * Получить значение верхнего элемента стэка и удалить элемент {@link Stack#pop()}
 * Получить значение верхнего элемента стэка {@link Stack#peek()}}
 */
public class Stack<T> {

	/**
	 * Верхний элемент
	 */
	private Element<T> current;

	/**
	 * Добавление в стэк
	 * Новый элемент становится вершиной стэка,
	 *
	 * @param value значение элемента
	 */
	public void push(T value) {
		current = new Element<>(value, current);
	}

	/**
	 * Получение значения элемента вершины и удаление его с вершины
	 *
	 * @return значение вершины или NullPointerException, если стэк пуст
	 */
	public T pop() {
		if (current == null) {
			throw new NullPointerException();
		}
		T result = current.getValue();
		current = current.getNext();
		return result;
	}

	/**
	 * Получение значения элемента вершины
	 *
	 * @return значение вершины или NullPointerException, если стэк пуст
	 */
	public T peek() {
		if (current == null) {
			throw new NullPointerException();
		}
		return current.getValue();
	}
}
