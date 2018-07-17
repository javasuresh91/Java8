package com.defult.method;

/**
 * 
 * @Both Interface has same default method in it, So the compile time error will
 *       be show,
 * @To solve the compile time error, we need to overwrite the default method
 *     with our Own implementation
 *
 */

public class MultipleInheritance implements SampleInterface, SampleInterfaceTwo {

	public static void main(String[] args) {
		MultipleInheritance m = new MultipleInheritance();
		m.m1();
	}

	@Override
	public void m1() {
		System.out.println("Multiple Inheritance Own Implementation");
	}

}
