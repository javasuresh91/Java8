package com.java8;

/**
 * 
 * @It is a functional Interface
 *
 */
interface A {
	public void m1();
}

/**
 * 
 * @The Implementation for the interface given in the single line if we compare
 *      to com.java7.TestOne
 * @Lambda expression should assign to the functional interface
 * @paranthesis in the expression should match the signature of the abstract
 *              method
 * @Using reference variable , we can access the abstract method and its
 *        implementation will be executed
 */
public class TestOne {

	public static void main(String[] args) {
		A a = () -> System.out.println("Lambda Expression");
		a.m1();
	}

}
