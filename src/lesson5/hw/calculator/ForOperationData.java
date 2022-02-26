package lesson5.hw.calculator;

/**
 * Данные для выполнения операции
 */
public class ForOperationData {

	public static final ForOperationData EMPTY = new ForOperationData(0, 0, "");

	/**
	 * Левый операнд
	 */
	private double x;

	/**
	 * Правый операнд
	 */
	private double y;

	/**
	 * Тип операции
	 */
	private String type;

	public ForOperationData(double x, double y, String type) {
		this.x = x;
		this.y = y;
		this.type = type;
	}

	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	public double getY() {
		return y;
	}

	public void setY(double y) {
		this.y = y;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
}
