package javaSessionsBasics;

public class FinallyConcept {

	public static void main(String[] args) {

		test1();

		System.out.println();

		test2();

		System.out.println();

		test3();
	}

	public static void test1() {
		try {
			System.out.println("Inside Try Block");
			throw new RuntimeException();
		} catch (Exception exception) {
			System.out.println("Inside Catch Block");
		} finally { // Always with Try Catch Block
			System.out.println("Inside Finally Block");
		}
	}

	public static void test2() {
		try {
			System.out.println("Inside Try Block Test 2");
		} finally {
			System.out.println("Inside Finally Block");
		}
	}

	public static void test3() {
		int i = 10;
		try {
			int k = i / 0;
			System.out.println("Inside Try Block Test 2");
		} catch (ArithmeticException e) {
			System.out.println("ArithmeticException Catched");
		} finally {
			System.out.println("Inside Finally Block");
		}
	}
}
