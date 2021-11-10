package javaSessionsBasics;

public class ExceptionHandling_Throws {

	// JVM will accept thrown exceptions from main method
	public static void main(String[] args) throws ArithmeticException {
		ExceptionHandling_Throws obj = new ExceptionHandling_Throws();
		obj.sum();
	}

	public void sum() throws ArithmeticException {
		div();
	}

	public void div() throws ArithmeticException {
		int i = 9 / 0;
	}
}
