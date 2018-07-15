package com.java8;

interface B {
	public void add(int a, int b);
}

/**
 * @With Multiple Parameter without return type
 * @Input parenthesis(a,c) in the expression is without return type but compiler
 *        can guess/match the signature of the abstract method of the functional
 *        interface and take it as (int ,int) it is called as "TYPE INFERENCE"
 *
 */
public class TestTwo {

	public static void main(String[] args) {
		B b = (a, c) -> System.out.println("Lambda Implementation : " + (a + c));
		b.add(10, 30);
		b.add(10, 35);
	}

}
