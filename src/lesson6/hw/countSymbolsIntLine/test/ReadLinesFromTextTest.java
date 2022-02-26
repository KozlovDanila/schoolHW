package lesson6.hw.countSymbolsIntLine.test;

import lesson6.hw.countSymbolsIntLine.ReaderFromFile;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ReadLinesFromTextTest {

	private final ReaderFromFile readerFromFile = new ReaderFromFile();

	@Test
	public void readEmptyFile() {
		String[] result = readerFromFile.getReadLines("./src/lesson6/hw/countSymbolsIntLine/test/testEmptyFile.txt");
		assertEquals(0, result.length);
	}

	@Test
	public void readFileNotFound() {
		String[] result = readerFromFile.getReadLines("./src/lesson6/hw/countSymbolsIntLine/test/fileNotFound.txt");
		assertEquals(0, result.length);
	}

	@Test
	public void readRealFile() {
		String[] result = readerFromFile.getReadLines("./src/lesson6/hw/countSymbolsIntLine/test/test.txt");
		assertEquals(2, result.length);
		assertEquals("Какой-то рандомный текст", result[0]);
		assertEquals("in any language", result[1]);
	}
}
