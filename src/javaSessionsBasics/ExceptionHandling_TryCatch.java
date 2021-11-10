package javaSessionsBasics;

public class ExceptionHandling_TryCatch {

	int a = 1;

	public static void main(String[] args) throws InterruptedException {

		/*
		 * UnCaught Exception
		 */
//		int i = 9 / 0;
//		System.out.println(i);

		/*
		 * Caught Exception
		 */
//		Thread.sleep(1000);

//		ExceptionHandling obj = new ExceptionHandling();
//		obj = null;// NullPointerException
//		System.out.println(obj.a);

		// 1. try catch block

		try {
			int i = 9 / 0;// This code will throw an exception
		} catch (ArithmeticException e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		}

		System.out.println("Sample");

	}
}
