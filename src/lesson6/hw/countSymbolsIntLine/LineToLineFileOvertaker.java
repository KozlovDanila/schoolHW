package lesson6.hw.countSymbolsIntLine;

/**
 * Переводит один файл для чтения в другой файл
 */
public class LineToLineFileOvertaker {

	private final ReaderFromFile readerFromFile;
	private final WriterToFile writerToFile;
	private final IConverter converter;

	/**
	 * @param readerFromFile    Читатель файла
	 * @param writerToFile Писатель в файл
	 * @param converter         Тот, кто переводит исходные данные в новые
	 */
	public LineToLineFileOvertaker(ReaderFromFile readerFromFile, WriterToFile writerToFile, IConverter converter) {
		this.readerFromFile = readerFromFile;
		this.writerToFile = writerToFile;
		this.converter = converter;
	}

	/**
	 * @param readFileName  имя файла для чтения
	 * @param writeFileName имя файла для записи
	 */
	public void overtake(String readFileName, String writeFileName) {
		String[] linesFromFile = readerFromFile.getReadLines(readFileName);
		linesFromFile = (String[]) converter.convert(linesFromFile);
		writerToFile.writeData(writeFileName, linesFromFile);
	}
}
