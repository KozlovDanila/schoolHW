package lesson9;

import java.util.Comparator;
import java.util.function.ToIntFunction;

public class DogByValueComparator implements Comparator<Dog> {
	@Override
	public int compare(Dog o1, Dog o2) {
		return 0;
	}


	//	@Override
//	public int compare(Dog o1, Dog o2) {
//		if (o1.getValue().length() == o2.getValue().length()) {
//			return 0;
//		}
//		return o1.getValue().length() > o2.getValue().length() ? 1 : 0;
//	}

}
