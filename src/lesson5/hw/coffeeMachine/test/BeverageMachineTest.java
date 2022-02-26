package lesson5.hw.coffeeMachine.test;

import lesson5.hw.coffeeMachine.BeverageMachine;
import lesson5.hw.coffeeMachine.coffee.*;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class BeverageMachineTest {

	private final BeverageMachine beverageMachine = new BeverageMachine(new IBeverage[]{
			new Coffee(),
			new Tea(),
			new Milk(new Coffee()),
			new Milk(new Tea()),
			new Cinnamon(new Milk(new Coffee())),
			new Cinnamon(new Milk(new Tea())),
	});

	@Test
	public void notValidBeverage() {
		assertEquals(0, beverageMachine.getCost(-1), 0.01);
		assertEquals(0, beverageMachine.getCost(6), 0.01);
	}

	@Test
	public void costCoffee() {
		assertEquals(10, beverageMachine.getCost(0), 0.01);
	}

	@Test
	public void costTea() {
		assertEquals(8, beverageMachine.getCost(1), 0.01);
	}

	@Test
	public void costCoffeeWithMilk() {
		assertEquals(15, beverageMachine.getCost(2), 0.01);
	}

	@Test
	public void costTeaWithMilk() {
		assertEquals(13, beverageMachine.getCost(3), 0.01);
	}

	@Test
	public void costCoffeeWithMilkAndCinnamon() {
		assertEquals(17, beverageMachine.getCost(4), 0.01);
	}

	@Test
	public void costTeaWithMilkAndCinnamon() {
		assertEquals(15, beverageMachine.getCost(5), 0.01);
	}

	@Test
	public void getNames() {
		assertEquals("1. Кофе\n2. Чай\n" +
				"3. Кофе с молоком\n4. Чай с молоком\n" +
				"5. Кофе с молоком с корицей\n6. Чай с молоком с корицей\n", beverageMachine.getNames());
	}
}
