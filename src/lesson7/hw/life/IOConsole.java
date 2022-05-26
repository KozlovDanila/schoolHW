package lesson7.hw.life;

import java.util.Scanner;

public class IOConsole implements InputOutput {

	public String in() {
		return new Scanner(System.in).nextLine();
	}

	public void out(Object value) {
		System.out.println(value);
	}

}
