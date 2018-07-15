package com.common;

/**
 * 
 * @It is internally functional Interface, because it has only one abstract
 *     method and N no of default methods
 *
 */
public interface InterTwo {
	// default methods in interface are abstract
	public void m1();

	default void m2() {

	}

	public static void m3() {

	}

}
