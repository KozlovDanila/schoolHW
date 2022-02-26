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
public class ConverterCesarDecryptTest {

	@Parameterized.Parameter
	public ObjectForTest objectForTest;

	@Parameterized.Parameters(name = "{index}: {0}")
	public static Collection<ObjectForTest> data() {
		String[] initialData = {"abcDAef ghijk@!lmno pqrs,tUvwxyZz"};
		return Arrays.asList(
				new ObjectForTest(0, new String[]{"abcDAef ghijk@!lmno pqrs,tUvwxyZz"}, initialData),
				new ObjectForTest(1, new String[]{"bcdEBfg hijkl@!mnop qrst,uVwxyzAa"}, initialData),
				new ObjectForTest(2, new String[]{"cdeFCgh ijklm@!nopq rstu,vWxyzaBb"}, initialData),
				new ObjectForTest(3, new String[]{"defGDhi jklmn@!opqr stuv,wXyzabCc"}, initialData),
				new ObjectForTest(4, new String[]{"efgHEij klmno@!pqrs tuvw,xYzabcDd"}, initialData),
				new ObjectForTest(5, new String[]{"fghIFjk lmnop@!qrst uvwx,yZabcdEe"}, initialData),
				new ObjectForTest(6, new String[]{"ghiJGkl mnopq@!rstu vwxy,zAbcdeFf"}, initialData),
				new ObjectForTest(7, new String[]{"hijKHlm nopqr@!stuv wxyz,aBcdefGg"}, initialData),
				new ObjectForTest(8, new String[]{"ijkLImn opqrs@!tuvw xyza,bCdefgHh"}, initialData),
				new ObjectForTest(9, new String[]{"jklMJno pqrst@!uvwx yzab,cDefghIi"}, initialData),
				new ObjectForTest(10, new String[]{"klmNKop qrstu@!vwxy zabc,dEfghiJj"}, initialData),
				new ObjectForTest(11, new String[]{"lmnOLpq rstuv@!wxyz abcd,eFghijKk"}, initialData),
				new ObjectForTest(12, new String[]{"mnoPMqr stuvw@!xyza bcde,fGhijkLl"}, initialData),
				new ObjectForTest(13, new String[]{"nopQNrs tuvwx@!yzab cdef,gHijklMm"}, initialData),
				new ObjectForTest(14, new String[]{"opqROst uvwxy@!zabc defg,hIjklmNn"}, initialData),
				new ObjectForTest(15, new String[]{"pqrSPtu vwxyz@!abcd efgh,iJklmnOo"}, initialData),
				new ObjectForTest(16, new String[]{"qrsTQuv wxyza@!bcde fghi,jKlmnoPp"}, initialData),
				new ObjectForTest(17, new String[]{"rstURvw xyzab@!cdef ghij,kLmnopQq"}, initialData),
				new ObjectForTest(18, new String[]{"stuVSwx yzabc@!defg hijk,lMnopqRr"}, initialData),
				new ObjectForTest(19, new String[]{"tuvWTxy zabcd@!efgh ijkl,mNopqrSs"}, initialData),
				new ObjectForTest(20, new String[]{"uvwXUyz abcde@!fghi jklm,nOpqrsTt"}, initialData),
				new ObjectForTest(21, new String[]{"vwxYVza bcdef@!ghij klmn,oPqrstUu"}, initialData),
				new ObjectForTest(22, new String[]{"wxyZWab cdefg@!hijk lmno,pQrstuVv"}, initialData),
				new ObjectForTest(23, new String[]{"xyzAXbc defgh@!ijkl mnop,qRstuvWw"}, initialData),
				new ObjectForTest(24, new String[]{"yzaBYcd efghi@!jklm nopq,rStuvwXx"}, initialData),
				new ObjectForTest(25, new String[]{"zabCZde fghij@!klmn opqr,sTuvwxYy"}, initialData)
		);
	}

	@Test
	public void converterCesarDecrypt() {
		IConverter converter = new CesarCryptoConverterEng(objectForTest.getShift(), false);
		assertEquals(objectForTest.getResult(), converter.convert(objectForTest.getData()));
	}
}
