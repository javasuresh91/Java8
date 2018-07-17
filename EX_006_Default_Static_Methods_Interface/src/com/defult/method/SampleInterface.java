/**
 * 
 */
package com.defult.method;

/**
 * @author Sravikumar
 *
 */
public interface SampleInterface {
	default void m1() {
		System.out.println("Default Method Called One");
	}

}
