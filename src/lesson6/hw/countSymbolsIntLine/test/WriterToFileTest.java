package lesson6.hw.countSymbolsIntLine.test;

import lesson6.hw.countSymbolsIntLine.ReaderFromFile;
import lesson6.hw.countSymbolsIntLine.WriterToFile;
import org.junit.Test;

import java.io.File;

import static org.junit.Assert.assertEquals;

public class WriterToFileTest {

	private final WriterToFile writerToFile = new WriterToFile();
	private final ReaderFromFile readerFromFile = new ReaderFromFile();

	@Test
	public void write() {
		String fileName = "./src/lesson6/hw/countSymbolsIntLine/write_test.txt";
		writerToFile.writeData(fileName, new String[]{"Это", "новая", "строка"});
		String[] result = readerFromFile.getReadLines(fileName);
		assertEquals(3, result.length);
		assertEquals("Это", result[0]);
		assertEquals("новая", result[1]);
		assertEquals("строка", result[2]);
		File file = new File(fileName);
		file.delete(); // Чтобы каждый раз при запуске не оставлять новый файл, его удаляем
	}
}
