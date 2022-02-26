package lesson8.hw.dataStructures;

/**
 * Структура данных "Список", в качестве элемента используется
 *
 * @see Element
 * <p>
 * Добавление в список {@link List<T>#add(int)}
 * Получить значение элемента по индексу {@link List#get(int)} (int)}
 */
public class List<T> {

	/**
	 * Указатель на первый элемент списка,
	 * чтобы по нему дойти до каждого послеующего элемента
	 */
	private Element<T> first;

	/**
	 * Размерность списка
	 */
	private int size = 0;

	/**
	 * Добавление в список
	 * <p>
	 * Добавление в список происходит в конец
	 * Если первый элемент списка null, то новый элемент становится первым
	 *
	 * @param value значение элемента
	 */
	public void add(T value) {
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
		size++;
	}

	/**
	 * Получение элемента из списка по индексу
	 *
	 * @param index индекс элемента
	 * @return значение элемента по индексу,
	 * или ArrayIndexOutOfBoundsException,
	 * если индекс меньше 0 или больше размерности
	 */
	public T get(int index) {
		if (index < 0 || index > size - 1) {
			throw new ArrayIndexOutOfBoundsException();
		}
		int count = 0;
		Element<T> next = first;
		while (index != count) {
			next = next.getNext();
			count++;
		}
		return next.getValue();
	}

	public int getSize() {
		return size;
	}
}
