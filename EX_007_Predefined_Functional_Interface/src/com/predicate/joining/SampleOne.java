package com.predicate.joining;

import java.util.function.Predicate;

public class SampleOne {

	public static void main(String[] args) {
		int a[] = { 3, 12, 78, 0, 3, 67, 5, 890, 34 };
		Predicate<Integer> p1 = i -> i > 10;
		Predicate<Integer> p2 = i -> i % 2 == 0;
		System.out.println("Number Greater Than 10");
		calc(p1, a);
		System.out.println("Number Not Greater Than 10");
		calc(p1.negate(), a); // This Negate is used to give reserve value for the Test Method
		System.out.println("Even Number Only");
		calc(p2, a);
		System.out.println("Executing And/Or Predicate");
		calc(p1.and(p2), a); //Checking Two Predicate
		calc(p1.or(p2), a); 
	}

	public static void calc(Predicate<Integer> p, int[] a) {
		for (Integer x : a) {
			if (p.test(x)) {
				System.out.print(x + " ");
			}
		}
		System.out.println("");
		
	}

}
