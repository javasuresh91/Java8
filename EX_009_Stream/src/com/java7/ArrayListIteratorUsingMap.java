package com.java7;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * @We have are processing the element in the List and need to return the
 *     element
 *
 */
public class ArrayListIteratorUsingMap {

	public static void main(String[] args) {
		List<Integer> l = new ArrayList<>();
		List<Integer> filteredList = new ArrayList<>();
		l.add(10);
		l.add(3);
		l.add(34);
		l.add(5);
		System.out.println(l);
		for (Integer i : l) {

			filteredList.add(i * i);
		}
		System.out.println(filteredList);

	}

}
