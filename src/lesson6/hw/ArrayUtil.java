package lesson6.hw;

public final class ArrayUtil {

	private ArrayUtil() {
	}

	public static String[] add(String[] values, String valueForAdd) {
		int length = values != null ? values.length : 0;
		String[] result = new String[length + 1];
		for (int i = 0; i < length; i++) {
			result[i] = values[i];
		}
		result[length] = valueForAdd;
		return result;
	}
}
