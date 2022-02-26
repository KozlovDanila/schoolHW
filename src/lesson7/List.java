package lesson7;

public class List {

	private Element first;
	private int size;

	public void add(int value) {
		Element newElement = new Element(value);
		if (first == null) {
			first = newElement;
		} else {
			Element el = first;
			while (el.getNext() != null) {
				el = el.getNext();
			}
			el.setNext(newElement);
		}
		size++;
	}

	public int get(int index) {
		if (index >= size) {
			throw new IndexOutOfBoundsException();
		}
		int currentIndex = 0;
		Element el = first;
		while (currentIndex++ < index) {
			el = el.getNext();
		}
		return el.getValue();
	}

	public int getSize() {
		return size;
	}
}
