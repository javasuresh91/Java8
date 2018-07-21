package com.java8;

import java.util.ArrayList;
import java.util.List;

public class ArrayListMin_MaxValues {

	public static void main(String[] args) {

		List<Integer> l = new ArrayList<>();
		l.add(10);
		l.add(3);
		l.add(34);
		l.add(5);
		System.out.println(l);

		Integer min = l.stream().min((o1, o2) -> o1.compareTo(o2)).get();
		System.out.println("Minimum Value in the List : " + min);

		Integer max = l.stream().max((o1, o2) -> o1.compareTo(o2)).get();
		System.out.println("Maximum Value in the List : " + max);

	}

}
