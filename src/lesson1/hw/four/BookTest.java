package lesson1.hw.four;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BookTest {

	@Test
	public void successCreateBook() {
		Book book = new Book("Война и мир", 1000, 1865, "Л.Н. Толстой");
		assertEquals("Война и мир", book.name);
		assertEquals(1000, book.pageCount);
		assertEquals(1865, book.year);
		assertEquals("Л.Н. Толстой", book.author);

		book.setName("Три мушкетера");
		book.setYear(1844);
		book.setPageCount(500);
		book.setAuthor("А. Дюма");

		assertEquals("Три мушкетера", book.getName());
		assertEquals(1844, book.getYear());
		assertEquals(500, book.getPageCount());
		assertEquals("А. Дюма", book.getAuthor());

		assertEquals("Book{name='Три мушкетера', pageCount=500, year=1844, author='А. Дюма'}", book.toString());
	}
}
