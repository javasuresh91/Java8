package com.common;

/**
 * 
 * @It gives compile time error because it have more than one abstract method,
 *     if we uncomment the @FunctionalInterface
 *
 */
// @FunctionalInterface
public interface InterFive {

	public void m1();

	public void m2();

}
