package mainOverload;

public class MainOverload {

	// JVM -- main(String[] args) --public static void
	public static void main(String[] args) {
		System.out.println("Main Method");

		main(0);
		main("Gk");
		main(1, 2);
	}

	public static void main(int a) {
		System.out.println("Main Int Method");
	}

	public static void main(String a) {
		System.out.println("Main String Method");
	}

	public static void main(int a, int b) {
		System.out.println("Main 2 Int Method");

	}

}
