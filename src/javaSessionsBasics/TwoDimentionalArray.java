package javaSessionsBasics;

public class TwoDimentionalArray {

	public static void main(String[] args) {

		String x[][] = new String[2][2];

		System.out.println(x.length); // Total No of Rows
		System.out.println(x[0].length); // Total No of Columns

		x[0][0] = "A";
		x[0][1] = "B";
		x[1][0] = "C";
//		x[1][1] = "D";

		System.out.println(x[1][0]);

		System.out.println();

		for (int i = 0; i < x.length; i++) {
			for (int j = 0; j < x[0].length; j++) {
				System.out.println(x[i][j]);
			}
		}
	}
}
