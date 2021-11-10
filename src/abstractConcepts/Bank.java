package abstractConcepts;

public abstract class Bank {
	/*
	 * Partial Abstraction: hiding the Implementation logic
	 * 
	 * It can have Abstract and Non Abstract methods
	 * 
	 * Can't create the object of Abstract Class
	 */
	public abstract void loan(); // Abstract Method

	public void credit() {
		System.out.println("Non Abstract...Bank...credit");
	}

	public void debit() {
		System.out.println("Non Abstract...Bank...debit");
	}
}
