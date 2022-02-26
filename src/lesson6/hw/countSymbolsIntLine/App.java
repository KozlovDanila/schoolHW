package lesson6.hw.countSymbolsIntLine;

public class App {

	public static void main(String[] args) {
		LineToLineFileOvertaker overtaker = new LineToLineFileOvertaker(new ReaderFromFile(), new WriterToFile(), new AddLengthToEndConverter());
		overtaker.overtake("./src/lesson6/hw/countSymbolsIntLine/text.txt", "./src/lesson6/hw/countSymbolsIntLine/result.txt");
	}
}
