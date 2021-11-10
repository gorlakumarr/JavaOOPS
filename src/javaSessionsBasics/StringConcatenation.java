package javaSessionsBasics;

public class StringConcatenation {
	/*
	 * + Acts as Concatenation
	 * 
	 * println used to print new line in console
	 * 
	 * print doesnt add new line in console
	 */

	public static void main(String[] args) {
		int a = 100;
		int b = 200;

		String x = "Hello";
		String y = "World";

		double c = 12.33;
		double d = 10.33;

		System.out.println(a + b); // 300
		System.out.println(x + y); // HelloWorld
		System.out.println(a + b + x + y);// 300HelloWorld
		System.out.println(x + y + a + b);// HelloWorld100200
		System.out.println(x + y + (a + b));// HelloWorld300
		System.out.println(a + b + x + y + a + x + b + y);// 300HelloWorld100Hello200World
		System.out.println(a + b + x + y + a + b);// 300HelloWorld100200
		System.out.println(c + d);// 22.66
		System.out.println(x + y + c + d);// HelloWorld12.3310.33
		System.out.println(a + b + c + d);// 322.65999999999997
		System.out.println("HelloWorld");
		System.out.println("Value of a is :" + a);// Value of a is :100
		System.out.println("Addition of a and a is :" + (a + b));// Addition of a and a is :300
		System.out.print("No New Line");
		System.out.println("New Line");
	}
}
