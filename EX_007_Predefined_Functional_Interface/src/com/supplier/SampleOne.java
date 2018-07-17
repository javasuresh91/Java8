package com.supplier;

import java.util.function.Supplier;

public class SampleOne {

	public static void main(String[] args) {
		Supplier<String> s = () -> {
			String[] s1 = { "sds", "sds", "wqewq","ewr" };
			int x = (int) (Math.random() * 3 + 1);
			return s1[x];
		};
		System.out.println(s.get());
		System.out.println(s.get());
		System.out.println(s.get());
	}

}
