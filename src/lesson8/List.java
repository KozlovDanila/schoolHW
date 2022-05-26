package lesson8;

public class List<T> {

	private Element<T> first;
	private int size;

	public void add(T value) {
		Element<T> newElement = new Element<>(value);
		if (first == null) {
			first = newElement;
		} else {
			Element<T> el = first;
			while (el.getNext() != null) {
				el = el.getNext();
			}
			el.setNext(newElement);
		}
		size++;
	}

	public T get(int index) {
		if (index >= size) {
			throw new IndexOutOfBoundsException();
		}
		int currentIndex = 0;
		Element<T> el = first;
		while (currentIndex++ < index) {
			el = el.getNext();
		}
		return el.getValue();
	}

	public int getSize() {
		return size;
	}
}
