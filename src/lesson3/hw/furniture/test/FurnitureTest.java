package lesson3.hw.furniture.test;

import lesson3.hw.furniture.Furniture;
import lesson3.hw.furniture.FurnitureType;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FurnitureTest {

	@Test
	public void createFurniture() {
		Furniture furniture = new Furniture("Riva beton", "серый", FurnitureType.getByName("Стол"));
		assertEquals(furniture.toString(), "Название - Riva beton, цвет - серый, тип - Стол");
	}

}