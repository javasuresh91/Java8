package com.consumer;

import java.util.function.Consumer;

public class SampleOne {
	/**
	 * 
	 * @We can perform only some operation by using this functional interface.
	 * @It wont return any value,It takes only one parameter
	 */
	public static void main(String[] args) {
		Consumer<String> c = s -> System.out.println(s.concat(" Consumer"));
		c.accept("Sure");
		c.accept("Hai");
	}

}
