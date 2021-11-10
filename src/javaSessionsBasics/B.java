package javaSessionsBasics;

public class B extends A {

	public B() {

		super(10, 10);
//		super(10); 

		/*
		 * There should be only one super Keyword
		 * 
		 * super given preference over extends Class.
		 * 
		 * it should be the first statement
		 */

		System.out.println("Child Constructor");
	}

	public static void main(String[] args) {
		B b = new B();
	}
}
