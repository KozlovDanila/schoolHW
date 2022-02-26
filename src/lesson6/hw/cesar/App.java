package lesson6.hw.cesar;

import lesson6.hw.countSymbolsIntLine.IConverter;
import lesson6.hw.countSymbolsIntLine.LineToLineFileOvertaker;
import lesson6.hw.countSymbolsIntLine.ReaderFromFile;
import lesson6.hw.countSymbolsIntLine.WriterToFile;

public class App {

	public static void main(String[] args) {
		IConverter converter = new CesarCryptoConverterEng(5, false);
		LineToLineFileOvertaker overtaker = new LineToLineFileOvertaker(new ReaderFromFile(), new WriterToFile(), converter);

		String readFileName = "./src/lesson6/hw/cesar/cesar.txt";
		String writeFileName = "./src/lesson6/hw/cesar/cesar_result.txt";
		overtaker.overtake(readFileName, writeFileName);
	}
}
