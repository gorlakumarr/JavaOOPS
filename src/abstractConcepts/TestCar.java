package abstractConcepts;

public class TestCar {

	public static void main(String[] args) {

		BMW bmw = new BMW();
		bmw.start();
		bmw.stop();
		bmw.refuel();
		bmw.safety();

		System.out.println();

		Car car = new BMW();
		car.start();
		car.stop();
		car.refuel();
	}
}
