package oops;

class Animal {

}

class Monkey extends Animal {

}

public class OOPS_1_Overloading_Study_6 {
	public void m1(Animal A) {
		System.out.println("Animal Version");
	}

	public void m1(Monkey m) {
		System.out.println("Monkey Version");
	}

	public static void main(String[] args) {
		OOPS_1_Overloading_Study_6 ref = new OOPS_1_Overloading_Study_6();

		// 1
		Animal animal = new Animal();
		ref.m1(animal);

		// 2
		Monkey monkey = new Monkey();
		ref.m1(monkey);

		// 3
		Animal animal2 = new Monkey();
		ref.m1(animal2);// Animal Version

		/*
		 * Based on reference type
		 */
	}
}
