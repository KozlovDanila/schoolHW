package lesson7.forTest;

abstract class Animal {
	abstract String getName();
}

class Tiger extends Animal {
	public String getName() {
		return "Tiger";
	}
}

public class Lion extends Animal {
	@Override
	public String getName() {
		return "Lion";
	}

	public static void main(final String[] probe) {
		Animal[] animals = {new Tiger(), new Lion()};
		for (Animal animal : animals) {
			System.out.print(animal.getName());
		}
	}
}
