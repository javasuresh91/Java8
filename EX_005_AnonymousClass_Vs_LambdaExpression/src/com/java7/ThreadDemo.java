package com.java7;

public class ThreadDemo {
	/**
	 * 
	 * @Anonymous Class :- The class which implement the Interface, providing
	 *            implementation for that class. For that class we creating object
	 * @Now the Runnable object is ready.. it is formed by the class withits now
	 *      implementation with class name, it is called anonymous class
	 */
	public static void main(String[] args) {
		Runnable r = new Runnable() {

			@Override
			public void run() {
				for (int i = 0; i < 10; i++) {
					System.out.println("Child Thread");
				}

			}
		};
		Thread t = new Thread(r);
		t.start();
		for (int i = 0; i < 10; i++) {
			System.out.println("Main Thread");
		}

	}

}
