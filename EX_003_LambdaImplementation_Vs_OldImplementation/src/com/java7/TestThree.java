package com.java7;

interface C {
	public int m1(String s);
}

class DemoThree implements C {

	@Override
	public int m1(String s) {
		System.out.println("Normal Implementation : " + s.length());
		return s.length();

	}

}

public class TestThree {

	public static void main(String[] args) {
		new DemoThree().m1("Suresh");

	}

}
