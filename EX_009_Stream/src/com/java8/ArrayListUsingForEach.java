package com.java8;

import java.util.ArrayList;
import java.util.List;

public class ArrayListUsingForEach {

	public static void main(String[] args) {
		List<Integer> l = new ArrayList<>();
		l.add(10);
		l.add(3);
		l.add(34);
		l.add(5);
		System.out.println(l);

		System.out.println("Using Lambda :");
		l.stream().forEach(s -> System.out.println(s));
		System.out.println("Using Method Reference : ");
		l.stream().forEach(System.out::println);
	}

}
