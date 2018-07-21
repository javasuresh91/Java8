package com.java8;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ArrayListIteratorUsingMap {

	public static void main(String[] args) {
		List<Integer> l = new ArrayList<>();
		l.add(10);
		l.add(3);
		l.add(34);
		l.add(5);
		System.out.println(l);

		List<Integer> filteredList = l.stream().map(I -> I * I).collect(Collectors.toList());
		System.out.println(filteredList);
		
		/**
		 * To get the LEngth of the Object in the Stream after Functionality
		 */

		int filteredListSize = (int) l.stream().map(I -> I * I).count();
		System.out.println("Size of the Filtered Objected :"+filteredListSize);


	}

}
