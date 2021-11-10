package oops_1;

public class LocalGlobalVariable {
	// Global or Class Variable
	String name = "Tom";
	int age = 25;

	public static void main(String[] args) {

		int i = 10; // Local Variable for Main Method
		System.out.println(i);

		LocalGlobalVariable localGlobalVariable = new LocalGlobalVariable();
		System.out.println(localGlobalVariable.name);
		System.out.println(localGlobalVariable.age);
		localGlobalVariable.sum();
	}

	public void sum() {
		// Local Variable for SUM Method. it will not be accessible outside the SUM
		// Method
		int i = 15;
		int j = 20;
		int age = 25;

		System.out.println(i);
	}
}
