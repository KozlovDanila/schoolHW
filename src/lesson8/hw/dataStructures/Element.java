package lesson8.hw.dataStructures;

/**
 * Элемент очереди/стека/списка
 */
public class Element<T> {

	private T value;
	private Element<T> next;

	/**
	 * @param value значение элемента
	 */
	public Element(T value) {
		this.value = value;
	}

	/**
	 * @param value значение элемента
	 * @param next  следующий элемент
	 */
	public Element(T value, Element<T> next) {
		this.value = value;
		this.next = next;
	}

	/**
	 * @return значение элемента
	 */
	public T getValue() {
		return value;
	}

	/**
	 * Присваивает значение элемента
	 */
	public void setValue(T value) {
		this.value = value;
	}

	/**
	 * @return Следующий элемент
	 */
	public Element<T> getNext() {
		return next;
	}

	/**
	 * Присваивает следующий элемент
	 */
	public void setNext(Element<T> next) {
		this.next = next;
	}
}
