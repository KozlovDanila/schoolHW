package lesson8.hw.dataStructures;

/**
 * Структура данных "Очередь", в качестве элемента используется
 *
 * @see Element
 * <p>
 * Добавление в очередь {@link Queue<T>#push(int)}
 * Получить значение первого элемента очереди и удалить элемент {@link Queue#pop()}
 */
public class Queue<T> {

	/**
	 * Первый элемент очереди
	 */
	private Element<T> first;

	/**
	 * Вставка в очередь
	 * Элемент добавляется в конец очереди
	 *
	 * @param value значение элемента
	 */
	public void push(T value) {
		Element<T> newElement = new Element<>(value);
		if (first == null) {
			first = newElement;
		} else {
			Element<T> next = first;
			while (next.getNext() != null) {
				next = next.getNext();
			}
			next.setNext(newElement);
		}
	}

	/**
	 * Получается значение первого элемента в очереди
	 * и делает первым эдементом следующий элемент в очереди
	 *
	 * @return значение первого элемента в очереди
	 * или NullPointerException, если очередь пуста
	 */
	public T pop() {
		if (first == null) {
			throw new NullPointerException();
		}
		T result = first.getValue();
		first = first.getNext();
		return result;
	}
}
