package lesson6.additLesson;

public class Executor {

	private ISomeInterface someInterface;

	public Executor(ISomeInterface someInterface) {
		this.someInterface = someInterface;
	}

	public void foo() {
		someInterface.someMethod();
	}

	public void setSomeInterface(ISomeInterface someInterface) {
		this.someInterface = someInterface;
	}
}
