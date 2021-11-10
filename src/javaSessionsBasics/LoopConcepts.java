package javaSessionsBasics;

public class LoopConcepts {
	public static void main(String[] args) {

		// 1.While Loop
		/*
		 * it will give you infinte loop if we dont mention i++ or i--
		 */
		int i = 0;
		while (i < 10) {
			System.out.println(i);
			i++;
		}

		System.out.println();

		// 2.for loop
		for (int j = 0; j < 10; j++) {
			System.out.print(j);// 0123456789
		}

		System.out.println();

		for (int j = 10; j >= 0; j--) {
			System.out.print(j); // 109876543210
		}
	}
}
