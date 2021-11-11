package oops;

public class OOPS_1_Overloading_Study_4 {
	public void m1(int i) {
		System.out.println("int args method");
	}

	public void m1(int... sb) {
		System.out.println("int var args method");
	}

	public static void main(String[] args) {
		OOPS_1_Overloading_Study_4 ref = new OOPS_1_Overloading_Study_4();
		ref.m1(0);// int args method
		ref.m1();// int var args method
		ref.m1(10, 12);// int var args method
	}
}
