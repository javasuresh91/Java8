package com.java8;

interface Test {
	public void m1();
}

/**
 * 
 * @Using This in the Anonymous Class and its scope and functionality
 *
 */
class Demo {
	// Instance Variable of the Demo Class
	int a = 100;

	public void m2() {
		// Anonymous Class using Lambda
		Test t = () -> {
			// This variable is not a instance variable of anonymous implementation
			int a = 200;
			/**
			 * @Here 'this' is denotating the instance variable of the Demo Class, because
			 *       lamba hold only local/block/method level variable
			 */
			System.out.println(this.a); //100
			System.out.println(a); //200
		};
		t.m1();

	}

}

public class ThisKeyWord {

	public static void main(String[] args) {
		Demo d = new Demo();
		d.m2();
	}

}
