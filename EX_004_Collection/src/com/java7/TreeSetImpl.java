package com.java7;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetImpl {

	public static void main(String[] args) {
		/**
		 * @Treeset has it own Sorted Implementation So we need not use any
		 *          Collection.sort() method
		 * @In TreeSet, if we use empty constructor, it use the Default Natural of
		 *     Sorting internally
		 * @Number - Ascending Order
		 * @String - Alphabetic Dictionary order
		 * 
		 */
		Set<Integer> s = new TreeSet<>();
		s.add(10);
		s.add(0);
		s.add(5);
		s.add(15);
		s.add(25);
		s.add(2);
		System.out.println("Sorted Order Default By Tree Set : " + s);

		/**
		 * @Customized Order using Implemented Comparator Interface
		 */
		s = new TreeSet<>(new myComparator());
		s.add(10);
		s.add(0);
		s.add(5);
		s.add(15);
		s.add(25);
		s.add(2);
		System.out.println("Sorted Order Customized By Comparator Implemented : " + s);

	}

}

class myComparator implements Comparator<Integer> {

	@Override
	public int compare(Integer o1, Integer o2) {
		// TODO Auto-generated method stub
		return o1 > o2 ? -1 : o1 < o2 ? 1 : 0;
	}

}
