package oops_1;

public class Static_NonStatic {

	String name = "Tom"; // Global Var
	static int age = 25;// Static Global Var

	public static void main(String[] args) {
		// How to call Static Methods and Variables.?

		// 1.Direct Calling
		some();
		System.out.println(age);

		// 2.By Class Name
		Static_NonStatic.some();
		System.out.println(Static_NonStatic.age);

		// How to Call Non Static Method
		Static_NonStatic nonStatic = new Static_NonStatic();
		nonStatic.sendMail();
		System.out.println(nonStatic.name);

		// Can i Access Static Methods using Object Reference.??? - It's a bad practice
		nonStatic.some();// Warning:
		/*
		 * The static method some() from the type Static_NonStatic should be accessed in
		 * a static way
		 */

	}

	public void sendMail() { // Non Static Method
		// We can access Static Variables and Methods from anywhere in Class
		System.out.println("Calling Static Variable in Non Static Method :" + age);
		System.out.println("Send Mail Method");
	}

	public static void some() {// Static Method
		System.out.println("Some Method");
	}
}
