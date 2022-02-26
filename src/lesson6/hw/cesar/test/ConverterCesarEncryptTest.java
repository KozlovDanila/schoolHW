package lesson6.hw.cesar.test;

import lesson6.hw.cesar.CesarCryptoConverterEng;
import lesson6.hw.countSymbolsIntLine.IConverter;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class ConverterCesarEncryptTest {

	@Parameterized.Parameter
	public ObjectForTest objectForTest;

	@Parameterized.Parameters(name = "{index}: {0}")
	public static Collection<ObjectForTest> data() {
		String[] initialData = {"abcDAef ghijk@!lmno pqrs,tUvwxyZz"};
		return Arrays.asList(
				new ObjectForTest(0, initialData, new String[]{"abcDAef ghijk@!lmno pqrs,tUvwxyZz"}),
				new ObjectForTest(1, initialData, new String[]{"bcdEBfg hijkl@!mnop qrst,uVwxyzAa"}),
				new ObjectForTest(2, initialData, new String[]{"cdeFCgh ijklm@!nopq rstu,vWxyzaBb"}),
				new ObjectForTest(3, initialData, new String[]{"defGDhi jklmn@!opqr stuv,wXyzabCc"}),
				new ObjectForTest(4, initialData, new String[]{"efgHEij klmno@!pqrs tuvw,xYzabcDd"}),
				new ObjectForTest(5, initialData, new String[]{"fghIFjk lmnop@!qrst uvwx,yZabcdEe"}),
				new ObjectForTest(6, initialData, new String[]{"ghiJGkl mnopq@!rstu vwxy,zAbcdeFf"}),
				new ObjectForTest(7, initialData, new String[]{"hijKHlm nopqr@!stuv wxyz,aBcdefGg"}),
				new ObjectForTest(8, initialData, new String[]{"ijkLImn opqrs@!tuvw xyza,bCdefgHh"}),
				new ObjectForTest(9, initialData, new String[]{"jklMJno pqrst@!uvwx yzab,cDefghIi"}),
				new ObjectForTest(10, initialData, new String[]{"klmNKop qrstu@!vwxy zabc,dEfghiJj"}),
				new ObjectForTest(11, initialData, new String[]{"lmnOLpq rstuv@!wxyz abcd,eFghijKk"}),
				new ObjectForTest(12, initialData, new String[]{"mnoPMqr stuvw@!xyza bcde,fGhijkLl"}),
				new ObjectForTest(13, initialData, new String[]{"nopQNrs tuvwx@!yzab cdef,gHijklMm"}),
				new ObjectForTest(14, initialData, new String[]{"opqROst uvwxy@!zabc defg,hIjklmNn"}),
				new ObjectForTest(15, initialData, new String[]{"pqrSPtu vwxyz@!abcd efgh,iJklmnOo"}),
				new ObjectForTest(16, initialData, new String[]{"qrsTQuv wxyza@!bcde fghi,jKlmnoPp"}),
				new ObjectForTest(17, initialData, new String[]{"rstURvw xyzab@!cdef ghij,kLmnopQq"}),
				new ObjectForTest(18, initialData, new String[]{"stuVSwx yzabc@!defg hijk,lMnopqRr"}),
				new ObjectForTest(19, initialData, new String[]{"tuvWTxy zabcd@!efgh ijkl,mNopqrSs"}),
				new ObjectForTest(20, initialData, new String[]{"uvwXUyz abcde@!fghi jklm,nOpqrsTt"}),
				new ObjectForTest(21, initialData, new String[]{"vwxYVza bcdef@!ghij klmn,oPqrstUu"}),
				new ObjectForTest(22, initialData, new String[]{"wxyZWab cdefg@!hijk lmno,pQrstuVv"}),
				new ObjectForTest(23, initialData, new String[]{"xyzAXbc defgh@!ijkl mnop,qRstuvWw"}),
				new ObjectForTest(24, initialData, new String[]{"yzaBYcd efghi@!jklm nopq,rStuvwXx"}),
				new ObjectForTest(25, initialData, new String[]{"zabCZde fghij@!klmn opqr,sTuvwxYy"})
		);
	}

	@Test
	public void converterCesarEncrypt() {
		IConverter converter = new CesarCryptoConverterEng(objectForTest.getShift(), true);
		assertEquals(objectForTest.getResult(), converter.convert(objectForTest.getData()));
	}
}
