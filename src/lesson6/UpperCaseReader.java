package lesson6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.Reader;

public class UpperCaseReader extends BufferedReader {
	public UpperCaseReader(Reader in) {
		super(in);
	}

	@Override
	public String readLine() throws IOException {
		return super.readLine().toUpperCase();
	}
}
