package com.sttic.method;

interface Test {
	public static void m1() {
		System.out.println("Static Methods");
	}
}

public class StaticMethod implements Test {

	public static void main(String[] args) {

		StaticMethod s = new StaticMethod();
		/*
		 * m1(); s.m1(); StaticMethod.m1();
		 */
		// The Above ways will give Compile Time Error
		Test.m1();

	}
	
	

}
