package lesson3.hw.life;

public class App {

	public static void main(String[] args) {
		LifeGame lifeGame = new LifeGame(new FieldCreator().create(4), new GameHelper(true), new LifeYearExecutor());
		lifeGame.play();
	}
}
