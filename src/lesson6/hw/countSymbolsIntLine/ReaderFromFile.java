package lesson6.hw.countSymbolsIntLine;

import lesson6.hw.ArrayUtil;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Читает файл
 */
public class ReaderFromFile implements IReader {

	private String charSet;

	public ReaderFromFile() {
		this("UTF-8");
	}

	public ReaderFromFile(String charSet) {
		this.charSet = charSet;
	}

	/**
	 * Читает построчно из файла и создает массив строк построчно
	 *
	 * @param fileName файл для чтения
	 * @return массив прочитанных строк
	 */
	@Override
	public String[] getReadLines(String fileName) {
		String[] result = new String[0];
		try (BufferedReader in = new BufferedReader(new InputStreamReader(new FileInputStream(fileName), charSet))) {
			String value = in.readLine();
			while (value != null) {
				result = ArrayUtil.add(result, value);
				value = in.readLine();
			}
		} catch (IOException e) {
		}
		return result;
	}

	public void setCharSet(String charSet) {
		this.charSet = charSet;
	}
}
