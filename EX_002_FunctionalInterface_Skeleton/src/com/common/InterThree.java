package com.common;

/**
 * 
 * @It is Externally functional Interface, because it is annotated
 *     with @FunctionalInterface and has only one abstract method and N no of
 *     default methods
 * 
 * @FunctionalInterface is used to tell the compiler am going to use or follow
 *                      the Functional Interface rules
 */
@FunctionalInterface
public interface InterThree {
	// default methods in interface are abstract
	public void m1();

	default void m2() {

	}

	public static void m3() {

	}

}
