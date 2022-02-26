package lesson3.hw.furniture;

/**
 * Тип мебели
 */
public enum FurnitureType {
	BED("Кровать"),
	WARDROBE("Шкаф"),
	CHAIR("Стул"),
	TABLE("Стол"),
	UNKNOWN("Неизвестно");

	String name;

	FurnitureType(String name) {
		this.name = name;
	}

	public static FurnitureType getByName(String name) {
		for (FurnitureType furniture : values()) {
			if (furniture.getName().equalsIgnoreCase(name)) {
				return furniture;
			}
		}
		return UNKNOWN;
	}

	public String getName() {
		return name;
	}
}
