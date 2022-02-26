package lesson6.hw.countSymbolsIntLine;

/**
 * Интерфейс для чтения данных
 */
public interface IReader {

	/**
	 * Читает построчно откуда-то и возвращает строки в виде массив
	 *
	 * @param name Если читаем из файла, то название файла, иначе название иного источника
	 * @return прочитаные строки
	 */
	String[] getReadLines(String name);
}
