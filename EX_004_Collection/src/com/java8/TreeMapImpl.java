package com.java8;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapImpl {

	public static void main(String[] args) {
		/**
		 * @Treemap has it own Sorted Implementation So we need not use any
		 *          Collection.sort() method
		 * @SORTING will be carried by key in the map, not by values in the map object
		 */
		TreeMap<Integer, String> m = new TreeMap<>();
		m.put(20, "Hai");
		m.put(5, "Suresh");
		m.put(10, "Come");
		System.out.println("Default Sorting Order by Tree Map : " + m);

		/**
		 * Customized Sorting by Lambda
		 */
		m = new TreeMap<>((o1, o2) -> o1 > o2 ? -1 : o1 < o2 ? 1 : 0);
		m.put(20, "Hai");
		m.put(5, "Suresh");
		m.put(10, "Come");
		System.out.println("Lambda Sorting Order in Tree Map : " + m);

	}

}
