package com.java8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ArrayListImpl {

	public static void main(String[] args) {
		List<Integer> l = new ArrayList<>();
		l.add(10);
		l.add(0);
		l.add(15);
		l.add(5);
		l.add(20);
		System.out.println("Insertion Order : " + l);

		// Sorting Implementation
		/**
		 * @This is default Natural sorting in collection.
		 * @Number - Ascending Order
		 * @String - Alphabetic Dictionary order
		 */
		Collections.sort(l);
		System.out.println("After Natural Sorting : " + l);

		/**
		 * @This Customized Sorting in Descending Order USing Lambda Expression
		 * @Comparator is Functional Interface because it has only one abstract method,
		 *             So lambda Expression is acceptable
		 */
		Comparator<Integer> c = (o1, o2) -> o1 > o2 ? -1 : o1 < o2 ? 1 : 0;
		Collections.sort(l, c);
		System.out.println("After Customized Sorting using Lambda Expression : " + l);

	}

}
