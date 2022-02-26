package lesson5.hw.coffeeMachine.coffee;

/**
 * Молоко
 */
public class Milk extends CondimentDecorator {

	public Milk(IBeverage beverage) {
		super(beverage);
	}

	@Override
	public String getName() {
		return getBeverage().getName() + " с молоком";
	}

	@Override
	public double getCost() {
		return getBeverage().getCost() + 5;
	}
}
