package lesson6.hw.encoding.test;

import lesson6.hw.countSymbolsIntLine.LineToLineFileOvertaker;
import lesson6.hw.countSymbolsIntLine.ReaderFromFile;
import lesson6.hw.countSymbolsIntLine.WriterToFile;
import lesson6.hw.encoding.EmptyLineConverter;
import org.junit.Test;

import java.io.File;

import static org.junit.Assert.assertEquals;

public class FileEncoderTest {

	@Test
	public void utfToWindows1251() {
		LineToLineFileOvertaker overtaker = new LineToLineFileOvertaker(
				new ReaderFromFile(), new WriterToFile("windows-1251"), new EmptyLineConverter()
		);

		String readFileName = "./src/lesson6/hw/encoding/test/utf-8-test.txt";
		String writeFileName = "./src/lesson6/hw/encoding/test/utf-8-test_result.txt";
		overtaker.overtake(readFileName, writeFileName);

		String[] resultCorrectEncoding = new ReaderFromFile("windows-1251").getReadLines(writeFileName);
		assertEquals(1, resultCorrectEncoding.length);
		assertEquals("Это UTF-8", resultCorrectEncoding[0]);

		String[] resultUnCorrectEncoding = new ReaderFromFile().getReadLines(writeFileName);
		assertEquals(1, resultUnCorrectEncoding.length);
		assertEquals("��� UTF-8", resultUnCorrectEncoding[0]);

		File file = new File(writeFileName);
		file.delete(); // Чтобы каждый раз при запуске не оставлять новый файл, его удаляем
	}


	@Test
	public void Windows1251ToUtf8() {
		LineToLineFileOvertaker overtaker = new LineToLineFileOvertaker(
				new ReaderFromFile("windows-1251"), new WriterToFile(), new EmptyLineConverter()
		);

		String readFileName = "./src/lesson6/hw/encoding/test/windows-1251-test.txt";
		String writeFileName = "./src/lesson6/hw/encoding/test/windows-1251-test_result.txt";
		overtaker.overtake(readFileName, writeFileName);

		String[] resultCorrectEncoding = new ReaderFromFile().getReadLines(writeFileName);
		assertEquals(1, resultCorrectEncoding.length);
		assertEquals("Это windows-1251", resultCorrectEncoding[0]);

		String[] resultUnCorrectEncoding = new ReaderFromFile("windows-1251").getReadLines(writeFileName);
		assertEquals(1, resultUnCorrectEncoding.length);
		assertEquals("Р\u00ADС‚Рѕ windows-1251", resultUnCorrectEncoding[0]);

		File file = new File(writeFileName);
		file.delete(); // Чтобы каждый раз при запуске не оставлять новый файл, его удаляем
	}
}
