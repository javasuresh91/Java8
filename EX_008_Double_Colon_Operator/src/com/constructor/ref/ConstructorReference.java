package com.constructor.ref;

class Sample {
	Sample() {
		System.out.println("Constructor Reference");
	}

}

interface Test {
	public Sample get();
}

public class ConstructorReference {

	public static void main(String[] args) {
		/**
		 * @Get() method in the Test interface return type is Sample Instance,
		 * @So we need to give the sample object to the Test Reference Variable t
		 * @new is used to create the instance of the class which is mentioned before
		 *      the ::
		 * @So When we call t.get(), the method signature will math the Sample
		 *     constructor so it will run
		 */
		Test t = Sample::new;
		Sample s = t.get();
	}

}
