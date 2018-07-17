package com.predicate;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.function.Predicate;

public class SampleThree {

	/**
	 * 
	 * @Predicate using the Collection
	 */
	public static void main(String[] args) {
		Predicate<Collection<String>> p = c -> c.isEmpty();
		ArrayList<String> al = new ArrayList<>();
		System.out.println(p.test(al));
		al.add("Suresh");
		System.out.println(p.test(al));
	}

}
