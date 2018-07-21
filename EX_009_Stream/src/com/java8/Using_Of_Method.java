package com.java8;

import java.util.stream.Stream;

public class Using_Of_Method {

	public static void main(String[] args) {
		System.out.println("Using Just Group Of Data");
		Stream<Integer> s = Stream.of(9, 99, 999, 9999);
		s.forEach(a -> System.out.println(a));

		Stream<String> s1 = Stream.of(" hai ", " welcome ", " everyone");
		s1.forEach(a -> System.out.print(a));

		System.out.println("Using Just Group Of Array Elements");
		Double[] d = { 10.0, 10.1, 10.2, 10.3 };
		Stream<Double> s3 = Stream.of(d);
		s3.forEach(System.out::println);

	}

}
