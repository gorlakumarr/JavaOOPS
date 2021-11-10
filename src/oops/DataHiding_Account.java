package oops;

public class DataHiding_Account {

	/*
	 * We can achieve data hiding by Declaring the member variable private. We can
	 * call these variable's by using getter and setter methods
	 */

	private double balance;

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}
}
