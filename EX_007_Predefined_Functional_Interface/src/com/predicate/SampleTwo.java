package com.predicate;

import java.util.function.Predicate;

public class SampleTwo {

	public static void main(String[] args) {
		Predicate<String> p = s -> s.length() > 10;
		System.out.println(p.test("Abc"));
		System.out.println(p.test("Abcerewrewfhty"));
		

	}

}
