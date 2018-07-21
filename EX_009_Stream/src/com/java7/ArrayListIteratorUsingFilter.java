package com.java7;

import java.util.ArrayList;
import java.util.List;
/**
 * 
 * @Filter the LIst Element Which is Even element using Java 7
 *
 */
public class ArrayListIteratorUsingFilter {

	public static void main(String[] args) {
		List<Integer> l = new ArrayList<>();
		List<Integer> filteredList = new ArrayList<>();
		l.add(10);
		l.add(3);
		l.add(34);
		l.add(5);
		System.out.println(l);
		System.out.println("After Filter :");
		for (Integer i : l) {
			if (i % 2 == 0) {
				filteredList.add(i);
			}
		}
		System.out.println(filteredList);
	}

}
