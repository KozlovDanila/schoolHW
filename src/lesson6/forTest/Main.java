package lesson6.forTest;

import lesson6.hw.ArrayUtil;

import java.io.*;

public class Main {

	public static void main(String[] args) {
		try (BufferedWriter out =
					 new BufferedWriter(
					 		new OutputStreamWriter(
					 				new FileOutputStream("a.txt"))))
		{
			out.write("Это строка");
		} catch (IOException e) {
		}
	}

}
