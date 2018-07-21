package com.java8;

import java.util.ArrayList;
import java.util.List;

public class ArrayListToArray {

	public static void main(String[] args) {

		List<Integer> l = new ArrayList<>();
		l.add(10);
		l.add(3);
		l.add(34);
		l.add(5);
		System.out.println(l);

		System.out.println("Using toArray()");
		Integer[] intArr = l.stream().toArray(Integer[]::new);
		System.out.println(intArr);
		for (Integer integer : intArr) {
			System.out.println(integer);
		}
	}

}
