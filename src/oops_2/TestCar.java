package oops_2;

public class TestCar {// Has A Relationship

	public static void main(String[] args) {

		// Static Polymorphism -- Compile Time Polymorphism
		BMW b = new BMW();

		/*
		 * Method Overriding
		 */
		b.start();// BMW..... Start
		// Warn:The static method start() from the type BMW should be
		// accessed in a static way
		b.stop();
		b.refuel();
		b.theftSafety();
		b.engine();

		System.out.println();

		Car c = new Car();
		c.start();
		c.stop();
		c.refuel();
//		c.theftSafety();// The method theftSafety() is undefined for the type Car
		c.engine();

		System.out.println();

		// Top Casting
		Car c1 = new BMW(); // Child Object refered by Parent Class Variable-- Runtime Polymorphism
		c1.start();
		c1.stop();
		c1.refuel();
//		c1.theftSafety();
		c1.engine();

		// Down Casting
//		BMW b1 = (BMW) new Car();// Type mismatch: cannot convert from Car to BMW
		/*
		 * Exception in thread "main" java.lang.ClassCastException:
		 */
//		b1.start();
//		b1.stop();
//		b1.refuel();
//		b1.theftSafety();
//		b1.engine();
	}
}
