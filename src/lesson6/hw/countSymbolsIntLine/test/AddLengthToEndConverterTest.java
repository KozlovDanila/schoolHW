package lesson6.hw.countSymbolsIntLine.test;

import lesson6.hw.countSymbolsIntLine.AddLengthToEndConverter;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AddLengthToEndConverterTest {

	@Test
	public void successConvert() {
		AddLengthToEndConverter converter = new AddLengthToEndConverter();
		String[] result = (String[]) converter.convert(new String[]{"Кот", "Собака"});
		assertEquals(2, result.length);
		assertEquals("Кот 3", result[0]);
		assertEquals("Собака 6", result[1]);
	}
}
