package lesson7.hw.dataStructures;

/**
 * Элемент очереди/стека/списка
 */
public class Element {

	private int value;
	private Element next;

	/**
	 * @param value значение элемента
	 */
	public Element(int value) {
		this.value = value;
	}

	/**
	 * @param value значение элемента
	 * @param next  следующий элемент
	 */
	public Element(int value, Element next) {
		this.value = value;
		this.next = next;
	}

	/**
	 * @return значение элемента
	 */
	public int getValue() {
		return value;
	}

	/**
	 * Присваивает значение элемента
	 */
	public void setValue(int value) {
		this.value = value;
	}

	/**
	 * @return Следующий элемент
	 */
	public Element getNext() {
		return next;
	}

	/**
	 * Присваивает следующий элемент
	 */
	public void setNext(Element next) {
		this.next = next;
	}
}
