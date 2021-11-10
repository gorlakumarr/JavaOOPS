package javaSessionsBasics;

public class WrapperConcepts {

	public static void main(String[] args) {
		String x = "100";
		System.out.println(x + 20);

		// String to Integer Conversion

		// 1
		String s = "100A";
//		System.out.println(Integer.parseInt(s));// java.lang.NumberFormatException:
		// 2
		int i1 = Integer.parseInt(x);
		int i2 = Integer.valueOf(x);

		System.out.println(i1);
		System.out.println(i2);

		System.out.println(i1 + 20);
		System.out.println(i2 + 20);

		System.out.println();

		String y = "10.13";
		System.out.println(y + 20);

		// String to Double Conversion
		double d1 = Double.parseDouble(y);
		double d2 = Double.valueOf(y);

		System.out.println(d1);
		System.out.println(d2);

		System.out.println(d1 + 20);
		System.out.println(d2 + 20);

		System.out.println();

		// String to boolean
		String b = "true";
		System.out.println(Boolean.parseBoolean(b));

		// Int to String
		int j = 200;
		System.out.println(String.valueOf(j));
		System.out.println();

	}
}
