package com.java8;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ArrayListSortedByDefault {

	public static void main(String[] args) {

		List<Integer> l = new ArrayList<>();
		l.add(10);
		l.add(3);
		l.add(34);
		l.add(5);
		System.out.println(l);

		List<Integer> l1 = l.stream().sorted().collect(Collectors.toList());
		System.out.println("Sorted Order : "+l1);

	}

}
