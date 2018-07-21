package com.java8;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ArrayListSortedByCustomised {

	public static void main(String[] args) {

		List<Integer> l = new ArrayList<>();
		l.add(10);
		l.add(3);
		l.add(34);
		l.add(5);
		System.out.println(l);

		List<Integer> l1 = l.stream().sorted((o1, o2) -> o1 > o2 ? -1 : o1 < o2 ? 1 : 0).collect(Collectors.toList());
		System.out.println("Sorted Order Customised : " + l1);

		List<Integer> l2 = l.stream().sorted((o1, o2) -> -o1.compareTo(o2)).collect(Collectors.toList());
		System.out.println("Sorted Order Customised : " + l2);

	}

}
