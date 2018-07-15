package com.inheritance;

/**
 * 
 * @It is valid Functional Interface because, it has one abstract method which
 *     is overwrite from parent which is a same method signature
 *
 */
@FunctionalInterface
public interface ChildTwoInter extends ParentInter {
	
	public void m1();

}
