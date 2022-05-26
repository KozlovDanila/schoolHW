package lesson7.hw.life.test;

import lesson7.hw.life.FieldCreator;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class FieldCreatorTest {

	@Test
	public void create() {
		FieldCreator creator = new FieldCreator();
		int[][] field = creator.create(4);
		assertEquals(4, field.length);
		for (int[] row : field) {
			for (int cell : row) {
				assertTrue(cell == 1 || cell == 0);
			}
		}
	}

}
