package lesson1;

public class Car {

	String color;
	int power;
	String name;

	Car(String color, int power, String name) {
		this.power = power;
		if (power > 1000) {
			this.power = 1000;
		}
		this.color = color;
		this.name = name;
	}

	void go() {
		System.out.println("Поехали с силой " + power + "! " + color);
	}

	void setColor(String color) {
		if ("красный".equalsIgnoreCase(color)) {
			this.color = "Синий";
		} else {
			this.color = color;
		}

	}

	String getColor() {
		return color;
	}

	@Override
	public String toString() {
		return "lesson1.Car{" +
				"color='" + color + '\'' +
				", power=" + power +
				", name='" + name + '\'' +
				'}';
	}
}
