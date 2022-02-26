package lesson6.additLesson;

public class B implements ISomeInterface {

	private int a;

	@Override
	public void someMethod() {
		System.out.println(a + "B");
	}
}
