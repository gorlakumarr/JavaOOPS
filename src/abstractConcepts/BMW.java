package abstractConcepts;

public class BMW implements Car {

	@Override
	public void stop() {
		System.out.println("BMW...stop");
	}

	@Override
	public void refuel() {
		System.out.println("BMW...refuel");
	}

	@Override
	public void start() {
		System.out.println("BMW...start");
	}

	public void safety() {
		System.out.println("BMW...safety");
	}
}
