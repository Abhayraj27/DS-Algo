package com.java8;

@FunctionalInterface
public interface MyFunctionalInterface {

	void m1();
	//void m18();

	default void m2() {
		System.out.print("Default-method-1");
	}

	default void m3() {
		System.out.print("Default-method-3");
	}

	static void m4() {
		System.out.print("Static-method-3");
	}

}
