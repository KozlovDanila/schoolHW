package lesson6.hw.encoding;

import lesson6.hw.countSymbolsIntLine.IConverter;

/**
 * Конвертер, который ничего не делает и возвращает тот же массив данных
 */
public class EmptyLineConverter implements IConverter {

	@Override
	public Object[] convert(Object[] value) {
		return value;
	}
}
