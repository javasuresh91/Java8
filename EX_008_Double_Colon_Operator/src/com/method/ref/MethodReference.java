package com.method.ref;

interface Test {
	public void m1();
}

public class MethodReference {

	public static void m2() {
		System.out.println("IMplementation of Static Method Reference");
	}

	public static void main(String[] args) {
		/**
		 * @Static MethodReference
		 */
		Test t = MethodReference::m2;
		t.m1();

		/**
		 * @Non-Static MethodReference
		 */
		MethodReference m = new MethodReference();
		Test t1 = m::m3;
		t1.m1();

	}

	public void m3() {
		System.out.println("IMplementation of Non-Static Method Reference");
	}

}
