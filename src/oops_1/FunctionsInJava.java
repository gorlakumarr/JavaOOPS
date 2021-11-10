package oops_1;

public class FunctionsInJava {

	public static void main(String[] args) {
		FunctionsInJava obj = new FunctionsInJava(); // Object's cant hold static methods
		System.out.println(obj.pqr());
		System.out.println(obj.qa());
		System.out.println(obj.division(10, 5));
	}

	// Non Static Method's

	// 1. No Input and No Output
	// void means doesn't return any value
	public void test() {
		System.out.println("test method");
	}

	// 2. No Input and Some Output
	// int return type
	public int pqr() {
		System.out.println("pqr method");
		int a = 10;
		int b = 20;
		int c = a + b;
		return c;
	}

	// 3. No Input and Some Ouput
	public String qa() {
		System.out.println("qa method");
		String s = "Selenium";
		return s;
	}

	// 4. Some Input and Some Ouput

	public int division(int x, int y) {
		System.out.println("division method");
		return x / y;
	}
}
