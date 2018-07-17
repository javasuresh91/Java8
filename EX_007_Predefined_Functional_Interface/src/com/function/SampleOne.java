package com.function;

import java.util.function.Function;

/**
 * 
 * @Taking String as a input and returning its length as a integer using
 *         Function(Pre-defined Functional Interface)
 *
 */
public class SampleOne {

	public static void main(String[] args) {
		/**
		 * @Function Accept the Generic Input type and return Type
		 * @Here String is the Input type ANd integer is the Return Type
		 */
		Function<String, Integer> f = s -> s.length();
		System.out.println(f.apply("Suresh"));

	}

}
