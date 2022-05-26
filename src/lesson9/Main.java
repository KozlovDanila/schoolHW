package lesson9;

import sun.reflect.generics.tree.Tree;

import java.util.*;

public class Main {

	public static void main(String[] args) {
		Set<String> map = new TreeSet<>();
		map.add("13");
		map.add("1");
		map.add("12");
		System.out.println(map);

//		long time = System.currentTimeMillis();
//		List<Integer> list = new LinkedList<>();
//
//		for (int i = 0; i < 10000000; i++) {
//			list.add(i);
//		}
//
//		System.out.println(System.currentTimeMillis() - time);
//		System.out.println("______");
//		time = System.currentTimeMillis();
//
//		for (int i = 5000; i < 10000; i++) {
//			list.remove(i);
//		}
//
//		System.out.println(System.currentTimeMillis() - time);

	}
}
