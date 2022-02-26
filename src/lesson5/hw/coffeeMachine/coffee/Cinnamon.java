package lesson5.hw.coffeeMachine.coffee;

/**
 * Корица
 */
public class Cinnamon extends CondimentDecorator {

	public Cinnamon(IBeverage beverage) {
		super(beverage);
	}

	@Override
	public String getName() {
		return getBeverage().getName() + " с корицей";
	}

	@Override
	public double getCost() {
		return getBeverage().getCost() + 2;
	}
}
