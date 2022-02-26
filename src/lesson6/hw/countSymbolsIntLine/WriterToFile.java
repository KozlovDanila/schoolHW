package lesson6.hw.countSymbolsIntLine;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

/**
 * Записывает в файл
 */
public class WriterToFile {

	private String charSet;

	public WriterToFile() {
		this("UTF-8");
	}

	public WriterToFile(String charSet) {
		this.charSet = charSet;
	}

	/**
	 * Пишет в файл переданные данные
	 *
	 * @param fileName имя файла для записи
	 * @param data     данные для записи
	 * @return true - если удалось записать, false - если какая-то ошибка
	 */
	public boolean writeData(String fileName, String[] data) {
		try (BufferedWriter out = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(fileName), charSet))) {
			for (String value : data) {
				out.write(value + "\n");
			}
		} catch (IOException e) {
			return false;
		}
		return true;
	}

	public void setCharSet(String charSet) {
		this.charSet = charSet;
	}
}
