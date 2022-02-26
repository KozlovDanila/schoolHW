package lesson6.hw.cesar.test;

import lesson6.hw.cesar.CesarCryptoConverterEng;
import lesson6.hw.countSymbolsIntLine.IConverter;
import lesson6.hw.countSymbolsIntLine.LineToLineFileOvertaker;
import lesson6.hw.countSymbolsIntLine.ReaderFromFile;
import lesson6.hw.countSymbolsIntLine.WriterToFile;
import org.junit.Test;

import java.io.File;

import static org.junit.Assert.assertEquals;

public class CryptoCesarTest {

	private final ReaderFromFile readerFromFile = new ReaderFromFile();

	@Test
	public void encrypt() {
		IConverter converter = new CesarCryptoConverterEng(3, true);
		LineToLineFileOvertaker overtaker = new LineToLineFileOvertaker(new ReaderFromFile(), new WriterToFile(), converter);

		String readFileName = "./src/lesson6/hw/cesar/test/test_encrypt.txt";
		String writeFileName = "./src/lesson6/hw/cesar/test/overtake_result.txt";
		overtaker.overtake(readFileName, writeFileName);

		String[] result = readerFromFile.getReadLines(writeFileName);
		assertEquals(1, result.length);
		assertEquals("defGDhi jklmn@!opqr stuv,wXyzabCc", result[0]);
		File file = new File(writeFileName);
		file.delete(); // Чтобы каждый раз при запуске не оставлять новый файл, его удаляем
	}

	@Test
	public void decrypt() {
		IConverter converter = new CesarCryptoConverterEng(2, false);
		LineToLineFileOvertaker overtaker = new LineToLineFileOvertaker(new ReaderFromFile(), new WriterToFile(), converter);

		String readFileName = "./src/lesson6/hw/cesar/test/test_decrypt.txt";
		String writeFileName = "./src/lesson6/hw/cesar/test/overtake_result.txt";
		overtaker.overtake(readFileName, writeFileName);

		String[] result = readerFromFile.getReadLines(writeFileName);
		assertEquals(1, result.length);
		assertEquals("abcDAef ghijk@!lmno pqrs,tUvwxyZz", result[0]);
		File file = new File(writeFileName);
		file.delete(); // Чтобы каждый раз при запуске не оставлять новый файл, его удаляем
	}
}
