package com.defult.method;

/**
 * 
 * @Overwritting the Default Methods
 *
 */
public class DefaultMethodOverwrite implements SampleInterface {

	public static void main(String[] args) {
		DefaultMethodOverwrite d = new DefaultMethodOverwrite();
		d.m1();
	}

	@Override
	public void m1() {
		System.out.println("My Own Default Method Overwrite");
	}

}
