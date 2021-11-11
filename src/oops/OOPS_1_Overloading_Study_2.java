package oops;

public class OOPS_1_Overloading_Study_2 {
	public void m1(Object o) {
		System.out.println("Object args method");
	}

	public void m1(String s) {
		System.out.println("String args method");
	}

	public static void main(String[] args) {
		OOPS_1_Overloading_Study_2 ref = new OOPS_1_Overloading_Study_2();
		ref.m1(new Object()); // Exact match will get high priority
		ref.m1("java");
		ref.m1(null);// String args method
	}
}
