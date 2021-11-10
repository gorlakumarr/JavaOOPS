package javaSessionsBasics;

public class Singleton {
	/*
	 * 1.Static member: It gets memory only once because of static, it contains the
	 * instance of the Singleton class.
	 * 
	 * 2.Private constructor: It will prevent to instantiate the Singleton class
	 * from outside the class.
	 * 
	 * 3.Static factory method: This provides the global point of access to the
	 * Singleton object and returns the instance to the caller.
	 */

	private static Singleton singleton_instance = null;
	public String str;

	private Singleton() {
		str = "Sample"; // Hinder others class create object of this
	}

	public static Singleton getInstance() {
		if (singleton_instance == null) {
			singleton_instance = new Singleton();
		}
		return singleton_instance;
	}

	public static void main(String[] args) {

		Singleton obj1 = Singleton.getInstance();
		Singleton obj2 = Singleton.getInstance();

		System.out.println(obj1.str);
		System.out.println(obj2.str);

		System.out.println(obj1.hashCode());
		System.out.println(obj2.hashCode());
	}
}