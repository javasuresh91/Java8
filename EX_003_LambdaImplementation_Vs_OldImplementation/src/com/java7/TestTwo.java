package com.java7;

interface B {
	public void add(int a, int b);
}

class DemoTwo implements B {

	@Override
	public void add(int a, int b) {
		System.out.println("Normal Implementation : " + (a + b));

	}

}

public class TestTwo {

	public static void main(String[] args) {
		new DemoTwo().add(10, 30);

	}

}
