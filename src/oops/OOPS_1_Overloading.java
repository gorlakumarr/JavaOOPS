package oops;

public class OOPS_1_Overloading {
	/*
	 * Two methods with same name but arguments are different or order also
	 * different.
	 * 
	 * Compile time polymorphism/ Static polymorphism/ Early binding
	 *
	 * Compiler is responsible for method resolution based on Reference Type
	 */
	public void m1() {
		System.out.println("No args method");
	}

	public void m1(int i) {
		System.out.println("Int args method");
	}

	public void m1(float d) {
		System.out.println("float args method");
	}

	public static void main(String[] args) {
		OOPS_1_Overloading o = new OOPS_1_Overloading();
		o.m1();
		o.m1(10);
		o.m1(1.5f);
		o.m1('1');// char can be promoted to int

		/*
		 * Automatic promotion in overloading
		 * 
		 * Byte -> short -> int -> long -> double
		 * 
		 * -------> char -> int
		 */
	}
}
