package lesson6.hw.encoding;

import lesson6.hw.countSymbolsIntLine.LineToLineFileOvertaker;
import lesson6.hw.countSymbolsIntLine.ReaderFromFile;
import lesson6.hw.countSymbolsIntLine.WriterToFile;

import java.nio.charset.Charset;

public class App {

	public static void main(String[] args) {
		LineToLineFileOvertaker overtaker = new LineToLineFileOvertaker(
				new ReaderFromFile("windows-1251"), new WriterToFile(), new EmptyLineConverter()
		);

		String readFileName = "./src/lesson6/hw/encoding/windows-1251.txt";
		String writeFileName = "./src/lesson6/hw/encoding/windows-1251_result.txt";
		overtaker.overtake(readFileName, writeFileName);
	}
}
