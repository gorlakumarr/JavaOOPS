package abstractConcepts;

public class HDFCBank extends Bank {

	@Override
	public void loan() {
		System.out.println("HDFCBank...Loan");
	}

	public void funds() {
		System.out.println("HDFCBank...funds");
	}
}
