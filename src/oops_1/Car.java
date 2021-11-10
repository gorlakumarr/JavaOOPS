package oops_1;

public class Car {

	// Global Variables/Class Variables
	int mod;
	int wheel;

	public static void main(String[] args) {

		// new keyword is used to create the object

		Car a = new Car(); // new Object -> new Car(); a-> Reference Name
		Car b = new Car();
		Car c = new Car();

		a.mod = 2015;
		a.wheel = 4;

		b.mod = 2016;
		b.wheel = 4;

		c.mod = 2017;
		c.wheel = 4;

		System.out.println("-----Before Assigning the Reference------");

		System.out.println(a.mod);
		System.out.println(a.wheel);

		System.out.println(b.mod);
		System.out.println(b.wheel);

		System.out.println(c.mod);
		System.out.println(c.wheel);

		System.out.println("-----After Assigning the Reference------");

		a = b;
		b = c;
		c = a;
		
		System.out.println(a.mod);
		System.out.println(a.wheel);

		System.out.println(b.mod);
		System.out.println(b.wheel);

		System.out.println(c.mod);
		System.out.println(c.wheel);

	}
}
