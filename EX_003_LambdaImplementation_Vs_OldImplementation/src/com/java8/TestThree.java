package com.java8;

interface C {
	public int m1(String s);
}

/**
 * 
 * @With Single Parameter and with retrun type
 *
 */
public class TestThree {

	public static void main(String[] args) {
		C c = (s) -> s.length();
		System.out.println("Lambda Expression : " + c.m1("Suresh"));

		c = s -> s.length();
		System.out.println("Lambda Expression : " + c.m1("God"));

	}

}
