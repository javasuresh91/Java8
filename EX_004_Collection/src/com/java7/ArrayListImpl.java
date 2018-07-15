package com.java7;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ArrayListImpl {

	public static void main(String[] args) {

		ArrayList<Integer> l = new ArrayList<>();
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
		 * @This Customized Sorting in Descending Order
		 */
		Collections.sort(l, new MyCompartor());
		System.out.println("After Customized Sorting : " + l);
	}

}

class MyCompartor implements Comparator<Integer> {

	@Override
	public int compare(Integer o1, Integer o2) {
		/*
		 * if (o1 > o2) return -1; else if (o1 < o2) return 1; else return 0;
		 */
		// The above if..else can be written as Conditional Stmt
		return o1 > o2 ? -1 : o1 < o2 ? 1 : 0;
	}

}
