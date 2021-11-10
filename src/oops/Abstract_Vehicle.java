package oops;

public class Abstract_Vehicle {
	public static void main(String[] args) {
		Bus bus = new Bus();
		System.out.println(bus.getNoOfWheels());
	}

	/*
	 * --> Even though you remove abstract method (getNoOfWheels) then we can able
	 * to execute the program.
	 * 
	 * But the usage of abstract is to tell child that it should implement the
	 * functionality of abstract class in that cases we can mention the method as
	 * abstract in parent class
	 */
}