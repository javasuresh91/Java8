package com.defult.method;

/**
 * 
 * @Both Interface has same default method in it, So the compile time error will
 *       be show,
 * @To solve the compile time error, we need to overwrite the default method By
 *     calling the parent Interface by specific
 *
 */

public class MultipleInheritanceTwo implements SampleInterface, SampleInterfaceTwo {

	public static void main(String[] args) {
		MultipleInheritanceTwo m = new MultipleInheritanceTwo();
		m.m1();
	}

	@Override
	public void m1() {
		/**
		 * This will call the parent method as we mentioned
		 */

		SampleInterface.super.m1();
		// SampleInterfaceTwo.super.m1();
	}

}
