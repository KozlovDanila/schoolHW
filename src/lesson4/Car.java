package lesson4;

public class Car {

	private Motor motor;

	Car(Motor motor) {
		this.motor = motor;
	}

	public void drive() {
		motor.start();
	}
}
