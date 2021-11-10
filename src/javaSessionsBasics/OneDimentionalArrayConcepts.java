package javaSessionsBasics;

import java.util.Arrays;

public class OneDimentionalArrayConcepts {
	/*
	 * Array is store similar data types
	 * 
	 * Types of Arrays:
	 * 
	 * 1.Int Array
	 * 
	 * 2.Double Array
	 * 
	 * 3.Char Array
	 * 
	 * 4.Boolean Array
	 * 
	 * 5.String Array
	 */

	/**
	 * Disadvantages of Array:
	 * 
	 * 1.Size is Fixed : Static Array --> To Overcome this we use Collections
	 * (Dynamic Array)
	 * 
	 * 2.Stores only Similar Data Types --> To overcome this problem we use Object
	 * Array
	 * 
	 */

	public static void main(String[] args) {

//		int i = 20;
//		int i = 30;

		int[] i = new int[2];
		i[0] = (int) 10.1;
		i[1] = 20;
//		i[2] = 30;
		/*
		 * Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 2
		 * out of bounds for length 2 at
		 * javaSessionsBasics.ArrayConcepts.main(ArrayConcepts.java:15)
		 */

		System.out.println(i[0]);
		System.out.println(i[1]);
//		System.out.println(i[2]);
		/*
		 * Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 2
		 * out of bounds for length 2 at
		 * javaSessionsBasics.ArrayConcepts.main(ArrayConcepts.java:24)
		 */

		System.out.println(i.length);

		// Print All the values of array
		for (int j = 0; j < i.length; j++) {
			System.out.println(i[j]);
		}

		// Object Array

		Object[] obj = new Object[5];
		obj[0] = "Tom";
		obj[1] = 1;
		obj[2] = 1.34;
		obj[3] = 'C';
		obj[4] = "Peter";

		System.out.println(Arrays.toString(obj));
		System.out.println(obj.length);

		for (Object object : obj) {
			System.out.println(object);
		}
	}
}
