package lesson1.hw.five;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MovieTest {

	@Test
	public void successCreateMovie() {
		Movie movie = new Movie("12 обезьян", 120, "Терри Гиллиам");
		assertEquals("12 обезьян", movie.name);
		assertEquals(120, movie.length);
		assertEquals("Терри Гиллиам", movie.author);

		movie.setName("Бегущий по лезвию 2049");
		movie.setLength(180);
		movie.setAuthor("Дени Вильнёв");

		assertEquals("Бегущий по лезвию 2049", movie.getName());
		assertEquals(180, movie.getLength());
		assertEquals("Дени Вильнёв", movie.getAuthor());

		assertEquals("Movie{name='Бегущий по лезвию 2049', length=180, author='Дени Вильнёв'}", movie.toString());
	}
}
