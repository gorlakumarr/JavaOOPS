package javaSessionsBasics;

public class IncrementDecrementOperator {
	public static void main(String[] args) {

		int i = 1;
		int j = i++; // Post Increment

		System.out.println(i);
		System.out.println(j);

		System.out.println();

		int a = 1;
		int b = ++a; // Pre Increment

		System.out.println(a);
		System.out.println(b);

		System.out.println();

		int k = 2;
		int l = k--; // Post Decrement

		System.out.println(k);
		System.out.println(l);

		System.out.println();

		int m = 2;
		int n = --m; // Pre Decrement

		System.out.println(m);
		System.out.println(n);
	}
}
