package com.method.ref;

/**
 * 
 * @Thread starting by Method Reference
 *
 */
public class MethodReferenceTwo {

	public static void m1() {
		for (int i = 0; i < 10; i++) {
			System.out.println("Child Thread by static method Reference");
		}
	}

	public static void main(String[] args) {

		/**
		 * @Static MethodReference
		 */
		Runnable r = MethodReferenceTwo::m1;
		Thread t = new Thread(r);
		t.start();
		for (int i = 0; i < 10; i++) {
			System.out.println("Main Thread");
		}

		/**
		 * @Non-Static MethodReference
		 */
		MethodReferenceTwo m = new MethodReferenceTwo();
		r = m::m2;
		t = new Thread(r);
		t.start();
	}

	public void m2() {
		for (int i = 0; i < 10; i++) {
			System.out.println("Child Thread by non- static method Reference");
		}
	}

}
