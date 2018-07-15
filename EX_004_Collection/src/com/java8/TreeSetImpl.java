package com.java8;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetImpl {

	public static void main(String[] args) {
		/**
		 * @In TreeSet, if we use empty constructor, it use the Default Natural of
		 *     Sorting internally
		 */
		TreeSet<Integer> s = new TreeSet<>();
		s.add(10);
		s.add(0);
		s.add(5);
		s.add(15);
		s.add(25);
		s.add(2);
		System.out.println("Sorted Order Default By Tree Set : " + s);

		/**
		 * Customized Ordering Using Lamba Expression
		 * 
		 * @Comparator is Functional Interface because it has only one abstract method,
		 *             So lambda Expression is acceptable
		 */

		s = new TreeSet<>((o1, o2) -> o1 > o2 ? -1 : o1 < o2 ? 1 : 0);
		s.add(10);
		s.add(0);
		s.add(5);
		s.add(15);
		s.add(25);
		s.add(2);
		System.out.println("Customized Sorted Order in Tree Set using Lambda: " + s);
	}

}
