package lesson5.hw.coffeeMachine.coffee;

/**
 * Чай
 */
public class Tea implements IBeverage {

	@Override
	public String getName() {
		return "Чай";
	}

	@Override
	public double getCost() {
		return 8;
	}
}
