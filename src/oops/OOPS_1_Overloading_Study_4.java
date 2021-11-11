package oops;

public class OOPS_1_Overloading_Study_4 {
	public void m1(int i, float f) {
		System.out.println("int float args method");
	}

	public void m1(float f, int i) {
		System.out.println("float int args method");
	}

	public static void main(String[] args) {

		OOPS_1_Overloading_Study_4 ref = new OOPS_1_Overloading_Study_4();
		ref.m1(10, 10.5f);// int float args method
		ref.m1(10.5f, 10);// float int args method
//		ref.m1(10, 10);//The method m1(int, float) is ambiguous for the type OOPS_1_Overloading_Study_4
	}
}
