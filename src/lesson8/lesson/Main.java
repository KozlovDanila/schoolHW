package lesson8.lesson;

import lesson8.Bird;
import lesson8.Crown;
import lesson8.hw.dataStructures.List;

public class Main {

	public static void main(String[] args) {
		List<Bird> birdList = new List<>();
		List<Crown> crowList = new List<>();
		Crown value = new Crown();
		birdList.add(value);
		birdList.add(new Bird());
		copy(birdList, crowList);
		print(birdList);

	}

	public static <T> void copy(List<? super T> to, List<? extends T> from) {
		for (int i = 0; i < from.getSize(); i++) {
			to.add(from.get(i));
		}
	}

	public static <T> void print(List<T> list) {
		for (int i = 0; i < list.getSize(); i++) {
			System.out.println(list.get(0));
		}
	}


}
