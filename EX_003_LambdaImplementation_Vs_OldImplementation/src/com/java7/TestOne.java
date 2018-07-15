package com.java7;

interface A {
	public void m1();
}

class DemoOne implements A {

	@Override
	public void m1() {
		System.out.println("Normal Implementation");

	}

}

public class TestOne {

	public static void main(String[] args) {
		new DemoOne().m1();

	}

}
