package javaSessionsBasics;

public class Constructor_This {

	String name;
	int age;

	public Constructor_This(String name, int age) {
		this.name = name;
		this.age = age;

		System.out.println(name);
		System.out.println(age);
	}

	public static void main(String[] args) {
		Constructor_This this1 = new Constructor_This("Gk", 20);

		System.out.println();

		System.out.println(this1.name);
		System.out.println(this1.age);
	}
}
