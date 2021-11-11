package oops;

public class OOPS_1_Overloading_Study_3 {
	public void m1(String s) {
		System.out.println("String args method");
	}

	public void m1(StringBuffer sb) {
		System.out.println("StringBuffer args method");
	}

	public static void main(String[] args) {
		OOPS_1_Overloading_Study_3 ref = new OOPS_1_Overloading_Study_3();
		ref.m1("Durga");// String args method
		ref.m1(new StringBuffer());// StringBuffer args method
//		ref.m1(null);// The method m1(String) is ambiguous for the type OOPS_1_Overloading_Study_3
	}
}
