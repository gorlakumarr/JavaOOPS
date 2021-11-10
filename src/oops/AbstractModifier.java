package oops;

/*
 * Abstract modifiers applicable for below:
 * 
 * 1.Method
 * 2.Class
 *
 *Abstract = Partial/Not Completed
 */
public abstract class AbstractModifier {
	public abstract int getNumOfWheels();
	/*
	 * Abstract method has only declaration but not implementation. Its child
	 * classe's provide the implementation.
	 * 
	 * Abstract method is placed only on abstract class, should end with (); but not
	 * {}
	 */
}

abstract class Sample {
	/*
	 * Abstract class: not fully implemented class (Partially implemented)
	 */
	// Sample sample = new Sample();
	/*
	 * Can't create object for abstract class.
	 * 
	 * --> if a class contains at least one abstract method then that class should
	 * be declared as abstract
	 * 
	 * --> Abstract class can contain zero abstract method
	 * 
	 */
	public void method() {
		System.out.println("Concrete Method");
	}

	abstract void abstractMethod();
}

abstract class Name {
	// Dummy Methods, instead of normal class we can declare class as
	// abstract
	public void m1() {
	}

	public void m2() {
	}
}

abstract class DemoAbstract {
	public abstract void m1();

	public abstract void m2();
}

class ChildDemoAbstract extends DemoAbstract {
	/*
	 * We need to provide implementation for all the abstract methods which are in
	 * Parent Abstract class
	 * 
	 * or
	 * 
	 * we can mention child class as abstract
	 */
	@Override
	public void m1() {
	}

	@Override
	public void m2() {
	}
}
