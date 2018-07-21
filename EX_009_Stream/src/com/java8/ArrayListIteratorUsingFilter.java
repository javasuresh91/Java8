package com.java8;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ArrayListIteratorUsingFilter {

	public static void main(String[] args) {
		List<Integer> l = new ArrayList<>();

		l.add(10);
		l.add(3);
		l.add(34);
		l.add(5);
		System.out.println(l);
		/**
		 * Reference Note
		 */
		List<Integer> filteredList = l.stream().filter(I -> I % 2 == 0).collect(Collectors.toList());
		System.out.println("After Filter :" + filteredList);

		/**
		 * To get the LEngth of the Object in the Stream after Filter
		 */

		int filteredListSize = (int) l.stream().filter(I -> I % 2 == 0).count();
		System.out.println("Size of the Filtered Objected :"+filteredListSize);
	}

}
