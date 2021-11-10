package javaSessionsBasics;

public class ConstructorConcepts {

	// While Creating Object if you want to define some class features in the form
	// of global variables

	/*
	 * 1. No Return Type
	 * 
	 * 2. No Static Keyword
	 * 
	 * 3. We can overload constructor
	 * 
	 * 4. Even though we remove Default Constructor, There is hidden Default
	 * Construtor
	 */

	public ConstructorConcepts() {
		System.out.println("Default Constructor");
	}

	public ConstructorConcepts(int i) {
		System.out.println("Single Param Constructor : i => " + i);
	}

	public ConstructorConcepts(int i, int j) {
		System.out.println("Two Params Constructor : i => " + i + ": j => " + j);
	}

	public static void main(String[] args) {
		ConstructorConcepts obj1 = new ConstructorConcepts();
		ConstructorConcepts obj2 = new ConstructorConcepts(10);
		ConstructorConcepts obj3 = new ConstructorConcepts(10, 10);

	}
}
