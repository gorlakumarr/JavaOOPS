package oops;

class A {
	/*
	 * D:\JavaOOPS\src\oops>java A
	 * 
	 * Error: Could not find or load main class A.java Caused by:
	 * java.lang.ClassNotFoundException: A.java
	 */
}

/*
 * Java Program can contain any number of Classes
 * 
 * It may contains at most only one public class. More than 2 public class not
 * allowed
 * 
 * if there is public class we should name the whole class name as name of
 * public class
 * 
 * if there is not public class we can name the whole class any name
 *
 * there is no relation between whole class name and class having main method
 * 
 * In this scenario post compile : 4 .class files will be created. A.class,
 * B.class , c.class and D.class
 *
 */
public class B {
	public static void main(String[] args) {
		System.out.println("Class B");
	}
}

class C {
	public static void main(String[] args) {
		System.out.println("Class C");
	}
}

class D {
	public static void main(String[] args) {
		System.out.println("Class D");
	}
}