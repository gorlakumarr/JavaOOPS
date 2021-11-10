package oops;

public abstract class AbstractDemoClass_Vehicle {
	public abstract int getNoOfWheels();
}

class Bus extends AbstractDemoClass_Vehicle {

	public int getNoOfWheels() {
		return 4;
	}
}

class Auto extends AbstractDemoClass_Vehicle {

	public int getNoOfWheels() {
		return 3;
	}
}
