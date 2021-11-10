package oops;

//import java.util.ArrayList;  // Explicit Import Statement (Recommended - Readability is good)
//or
//import java.util.*;// Implicit Import Statement

public class Test {
	public static void main(String[] args) {
		// Fully Qualified Name
		java.util.ArrayList<Integer> arrayList = new java.util.ArrayList<Integer>();

		/*
		 * Java.lang package
		 */
		String s = new String();
		Thread thread = new Thread();
		Exception exception = new Exception();
		StringBuffer buffer = new StringBuffer();
		/*
		 * Same Default package
		 */
		Student student = new Student();
	}
}

/*
 * import statements are not required for below :-
 * 
 * 1. java.lang 2. default package
 */