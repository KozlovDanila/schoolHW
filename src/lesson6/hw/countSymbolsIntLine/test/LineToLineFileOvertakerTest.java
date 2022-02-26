package lesson6.hw.countSymbolsIntLine.test;

import lesson6.hw.countSymbolsIntLine.AddLengthToEndConverter;
import lesson6.hw.countSymbolsIntLine.LineToLineFileOvertaker;
import lesson6.hw.countSymbolsIntLine.ReaderFromFile;
import lesson6.hw.countSymbolsIntLine.WriterToFile;
import org.junit.Test;

import java.io.File;

import static org.junit.Assert.assertEquals;

public class LineToLineFileOvertakerTest {

	private final ReaderFromFile readerFromFile = new ReaderFromFile();

	@Test
	public void overtake() {
		LineToLineFileOvertaker overtaker = new LineToLineFileOvertaker(new ReaderFromFile(), new WriterToFile(), new AddLengthToEndConverter());
		String readFileName = "./src/lesson6/hw/countSymbolsIntLine/test/test.txt";
		String writeFileName = "./src/lesson6/hw/countSymbolsIntLine/test/overtake_result.txt";
		overtaker.overtake(readFileName, writeFileName);

		String[] result = readerFromFile.getReadLines(writeFileName);
		assertEquals(2, result.length);
		assertEquals("Какой-то рандомный текст 24", result[0]);
		assertEquals("in any language 15", result[1]);
		File file = new File(writeFileName);
		file.delete(); // Чтобы каждый раз при запуске не оставлять новый файл, его удаляем
	}
}
