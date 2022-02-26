package lesson8.forTest;

class Box<T> {

	private final T value;

	public Box(T value) {
		this.value = value;
	}

	public T getValue() {
		return value;
	}

	@Override
	public String toString() {
		return "Box = " + value;
	}
}

public class Main {
//
//	public static void main(String[] args) {
//		print(new Box<Integer>(1));
//	}
//
//	public static void print(Box<? super Number> box) {
//		System.out.println(box.getValue());
//	}
}
