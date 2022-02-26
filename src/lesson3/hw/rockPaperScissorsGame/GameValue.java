package lesson3.hw.rockPaperScissorsGame;

/**
 * Возможные ходы
 */
public enum GameValue {
	EXIT("Выход"),
	ROCK("Камень"),
	SCISSORS("Ножницы"),
	PAPER("Бумага");

	String name;

	GameValue(String name) {
		this.name = name;
	}

	/**
	 * @return Название хода
	 */
	String getName() {
		return name;
	}

	/**
	 * @return Объект хода по имени
	 */
	public static GameValue getByName(String name) {
		for (GameValue value : values()) {
			if (value.getName().equalsIgnoreCase(name)) {
				return value;
			}
		}
		return null;
	}

	/**
	 * @return Все названия хода
	 */
	public static String getAllNames() {
		StringBuilder builder = new StringBuilder();
		for (GameValue value : values()) {
			builder.append("\"").append(value.getName()).append("\" ");
		}
		return builder.toString();
	}

	/**
	 * @return Все названия без ВЫХОД
	 */
	public static String getNamesWithoutExit() {
		StringBuilder builder = new StringBuilder();
		GameValue[] values = values();
		for (int i = 1; i < values.length; i++) {
			builder.append("\"").append(values[i].getName()).append("\" ");
		}
		return builder.toString();
	}
}
