package lesson5.hw.coffeeMachine.coffee;

/**
 * Декораторк для добавок
 */
public abstract class CondimentDecorator implements IBeverage {

	private final IBeverage beverage;

	public CondimentDecorator(IBeverage beverage) {
		this.beverage = beverage;
	}

	/**
	 * @return напиток
	 */
	public IBeverage getBeverage() {
		return beverage;
	}
}
