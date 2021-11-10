package javaSessionsBasics;

public class A {

	public A() {
		System.out.println("Parent Constrctor");
	}

	public A(int i) {
		System.out.println("Parent Constrctor : i => " + i);
	}

	public A(int i, int j) {
		System.out.println("Parent Constrctor : i => " + i + ": j => " + j);
	}
}
