package lesson6;

import java.io.*;

public class Main {

	public static void main(String[] args) {
		try (InputStreamReader reader = new InputStreamReader(new FileInputStream("a.txt"))) {
			int value = reader.read();
			while (value!=-1) {
				System.out.println((char)value);
				value = reader.read();
			}
		} catch (IOException e) {
			System.out.println("Не смогли найти файл");
		}
	}



}
