package lesson6.additLesson;

public class Main {

	public static void main(String[] args) {
		Executor executor = new Executor(new B());
		executor.foo();

		executor.setSomeInterface(new A());
		executor.foo();
	}
}
