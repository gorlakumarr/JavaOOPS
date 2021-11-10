package abstractConcepts;

public class TestBank {

	public static void main(String[] args) {

		HDFCBank hdfcBank = new HDFCBank();
		hdfcBank.loan();
		hdfcBank.credit();
		hdfcBank.debit();
		hdfcBank.funds();

		System.out.println();

		Bank bank = new HDFCBank();
		bank.loan();
		bank.credit();
		bank.debit();
//		bank.funds();
	}
}
