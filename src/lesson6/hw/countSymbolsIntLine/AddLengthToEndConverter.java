package lesson6.hw.countSymbolsIntLine;

import java.util.Arrays;

/**
 * Добавляет к строке проблеи и длину самой строки
 */
public class AddLengthToEndConverter implements IConverter {

	@Override
	public Object[] convert(Object[] value) {
		Object[] result = Arrays.copyOf(value, value.length);
		for (int i = 0; i < value.length; i++) {
			result[i] = value[i] + " " + ((String) value[i]).length();
		}
		return result;
	}
}
