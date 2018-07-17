package com.predicate;

import java.util.function.Predicate;

public class SampleOne {
	/**
	 * 
	 * @Need to check whether the input is greater than 10 or not
	 */
	public static void main(String[] args) {
		/**
		 * @Predicate is a generic type so need to mention the input type like Integer
		 * @It has one abstract method called test(<parameter>)
		 * @Lambda Expression is written as i -> i > 10 by accepting one input
		 * @test() will return the boolean value
		 */
		Predicate<Integer> p = i -> i > 10;
		System.out.println(p.test(100));
		System.out.println(p.test(5));

	}

}
