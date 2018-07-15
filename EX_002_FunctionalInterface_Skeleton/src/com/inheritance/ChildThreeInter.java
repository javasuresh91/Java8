package com.inheritance;

/**
 * 
 * @It gives compile time error because it have more than one abstract
 *     method,(i.e we trying to use new abstract) if we uncomment
 *     the @FunctionalInterface
 *
 */
//@FunctionalInterface
public interface ChildThreeInter extends ParentInter {

	public void m2();

}
