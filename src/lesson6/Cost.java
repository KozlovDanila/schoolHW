package lesson6;

public enum Cost {
	TEA(6),
	COFFEE(10);

	private int value;

	Cost(int value) {
		this.value = value;
	}

	public int getValue() {
		return value;
	}
}