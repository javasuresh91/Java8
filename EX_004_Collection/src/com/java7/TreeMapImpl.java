package com.java7;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

public class TreeMapImpl {

	public static void main(String[] args) {
		/**
		 * @Treemap has it own Sorted Implementation So we need not use any
		 *          Collection.sort() method
		 * @In Treemap, if we use empty constructor, it use the Default Natural of
		 *     Sorting internally
		 * @Number - Ascending Order
		 * @String - Alphabetic Dictionary order
		 * 
		 * @SORTING will be carried by key in the map, not by values in the map object
		 */
		Map<Integer, String> m = new TreeMap<>();
		m.put(20, "Hai");
		m.put(5, "Suresh");
		m.put(10, "Come");
		System.out.println("Default Sorting Order by Tree Map : " + m);

		/**
		 * @Customized Order by the Comparator
		 */
		m = new TreeMap<>(new myTreeMapComparator());
		m.put(20, "Hai");
		m.put(5, "Suresh");
		m.put(10, "Come");
		System.out.println("Sorting Order by Comparator of Tree Map : " + m);
	}

}

class myTreeMapComparator implements Comparator<Integer> {

	@Override
	public int compare(Integer o1, Integer o2) {
		// TODO Auto-generated method stub
		return o1 > o2 ? -1 : o1 < o2 ? 1 : 0;
	}

}
