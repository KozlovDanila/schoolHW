package lesson5.hw.coffeeMachine.coffee;

/**
 * Кофе
 */
public class Coffee implements IBeverage {

	@Override
	public String getName() {
		return "Кофе";
	}

	@Override
	public double getCost() {
		return 10;
	}
}
