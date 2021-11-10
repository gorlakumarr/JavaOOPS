package oops_1;

public class MethodOverloading {

	public static void main(String[] args) {
		MethodOverloading obj = new MethodOverloading();
		obj.sum();
		obj.sum(10);
		obj.sum(10, 10);
		obj.sum("Kumar", 10);
		obj.sum(10, "Gk");
		main(1);
	}

	public static void main(int a) {
		System.out.println("Overloaded Main Method");
	}

	// Method Name is same with different arguments(different Data types) or input
	// parameters with in the
	// same class

	/*
	 * Duplicate Methods are not allowed
	 * 
	 * Method inside Method not allowed
	 * 
	 * Method Name and Same Arguments not allowed
	 */

	public void sum() {
		System.out.println("Sum Method - Zero Param");
	}

	public void sum(int i) {
		System.out.println("Sum Method - One Param");
	}

	public void sum(int i, int j) {
		System.out.println("Sum Method - Two Param - Int,Int");
	}

	public void sum(String s, int j) {
		System.out.println("Sum Method - Two Param - String,Int");
	}

	public void sum(int j, String s) {
		System.out.println("Sum Method - Two Param - Int,String");
	}
}
