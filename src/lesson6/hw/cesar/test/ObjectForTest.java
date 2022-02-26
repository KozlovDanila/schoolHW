package lesson6.hw.cesar.test;

import java.util.Arrays;

public class ObjectForTest {

	private final int shift;
	private final String[] data;
	private final String[] result;

	public ObjectForTest(int shift, String[] data, String[] result) {
		this.shift = shift;
		this.data = data;
		this.result = result;
	}

	public int getShift() {
		return shift;
	}

	public String[] getData() {
		return data;
	}

	public String[] getResult() {
		return result;
	}

	@Override
	public String toString() {
		return "shift=" + shift +
				", data=" + Arrays.toString(data) +
				", result=" + Arrays.toString(result);
	}
}
