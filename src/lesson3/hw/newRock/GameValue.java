package lesson3.hw.newRock;

public enum GameValue {
	ROCK("камень"),
	PAPER("бумага"),
	SCISSORS("ножницы");

	private String value;

	GameValue(String value) {
		this.value = value;
	}
}
