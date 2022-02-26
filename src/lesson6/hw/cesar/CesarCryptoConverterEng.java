package lesson6.hw.cesar;

import lesson6.hw.countSymbolsIntLine.IConverter;

import java.util.Arrays;


/**
 * Кодирует или декодируеть английский текст в шифр Цезаря
 */
public class CesarCryptoConverterEng implements IConverter {

	private static final char LOWER_A = 'a';
	private static final char LOWER_Z = 'z';
	private static final char UPPER_A = 'A';
	private static final char UPPER_Z = 'Z';

	private final int shift;

	/**
	 * @param shift     сдвиг
	 * @param isEncrypt признак кодировать или декодировать
	 */
	public CesarCryptoConverterEng(int shift, boolean isEncrypt) {
		this.shift = isEncrypt ? shift : -shift;
	}

	/**
	 * Кодирует или декодирует текст в шифр цезаря
	 * То есть происходит сдвиг на shift элементов по алфавиту
	 *
	 * @param value исходный массив
	 * @return закодированный или раскодированный текст
	 */
	@Override
	public Object[] convert(Object[] value) {
		Object[] result = Arrays.copyOf(value, value.length);
		for (int i = 0; i < value.length; i++) {
			if (value[i] instanceof String) {
				result[i] = crypt(value[i]);
			}
		}
		return result;
	}

	private Object crypt(Object value) {
		String line = (String) value;
		char[] result = new char[line.toCharArray().length];
		for (int i = 0; i < line.length(); i++) {
			char symbol = line.charAt(i);
			if (symbol >= LOWER_A && symbol <= LOWER_Z || symbol >= UPPER_A && symbol <= UPPER_Z) {
				symbol = calculateShift(symbol);
			}
			result[i] = symbol;
		}
		return new String(result);
	}

	private char calculateShift(char symbol) {
		char shiftSymbol = (char) (symbol + shift);
		if (isLowerSymbolAndOutOfRange(symbol, shiftSymbol)) {
			shiftSymbol = reCalculateShiftSymbol(LOWER_A, LOWER_Z, shiftSymbol);
		} else if (isUpperSymbolAndOutOfRange(symbol, shiftSymbol)) {
			shiftSymbol = reCalculateShiftSymbol(UPPER_A, UPPER_Z, shiftSymbol);
		}
		return shiftSymbol;
	}

	private char reCalculateShiftSymbol(char left, char right, char shiftSymbol) {
		if (shiftSymbol < left) {
			return (char) (right - (left - shiftSymbol - 1));
		}
		return (char) (shiftSymbol - right + left - 1);
	}

	private boolean isLowerSymbolAndOutOfRange(char symbol, char shiftSymbol) {
		return symbol >= LOWER_A && symbol <= LOWER_Z && (shiftSymbol < LOWER_A || shiftSymbol > LOWER_Z);
	}

	private boolean isUpperSymbolAndOutOfRange(char symbol, char shiftSymbol) {
		return symbol >= UPPER_A && symbol <= UPPER_Z && (shiftSymbol < UPPER_A || shiftSymbol > UPPER_Z);
	}
}