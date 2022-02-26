package lesson3.hw.furniture;

/**
 * Описание мебели
 */
public class Furniture {

	String name;
	String color;
	FurnitureType type;

	public Furniture() {
	}

	public Furniture(String name, String color, FurnitureType type) {
		this.name = name;
		this.color = color;
		this.type = type;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public FurnitureType getType() {
		return type;
	}

	public void setType(FurnitureType type) {
		this.type = type;
	}

	@Override
	public String toString() {
		return String.format("Название - %s, цвет - %s, тип - %s", name, color, type.getName());
	}
}
