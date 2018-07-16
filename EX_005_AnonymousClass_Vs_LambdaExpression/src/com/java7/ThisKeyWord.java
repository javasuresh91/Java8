package com.java7;

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
		// Anonymous Class
		Test t = new Test() {
			// Instance Variable of the Anonymous Class Implementation
			int a = 102;

			@Override
			public void m1() {
				// Here 'this' is denotating to Instance Variable of the Anonymous Class
				System.out.println(this.a);

			}
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
