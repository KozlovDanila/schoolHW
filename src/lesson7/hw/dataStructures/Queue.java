package lesson7.hw.dataStructures;

/**
 * Структура данных "Очередь", в качестве элемента используется
 *
 * @see Element
 * <p>
 * Добавление в очередь {@link Queue#push(int)}
 * Получить значение первого элемента очереди и удалить элемент {@link Queue#pop()}
 */
public class Queue {

	/**
	 * Первый элемент очереди
	 */
	private Element first;

	/**
	 * Вставка в очередь
	 * Элемент добавляется в конец очереди
	 *
	 * @param value значение элемента
	 */
	public void push(int value) {
		Element newElement = new Element(value);
		if (first == null) {
			first = newElement;
		} else {
			Element next = first;
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
	public int pop() {
		if (first == null) {
			throw new NullPointerException();
		}
		int result = first.getValue();
		first = first.getNext();
		return result;
	}
}
