package oops_2;

public class TestBank_InterfaceExample {

	public static void main(String[] args) {

		HSBCBank hsbcBank = new HSBCBank();
		hsbcBank.credit();
		hsbcBank.debit();
		hsbcBank.tranferMoney();
		hsbcBank.educationLoan();
		hsbcBank.carLoan();
		hsbcBank.mutualFund();

		/*
		 * Dynamic Polymorphsim : Child Class Objects referred by Parent Interface
		 * Reference Variable
		 */
		System.out.println();

		USBank hsbcBank1 = new HSBCBank();
		hsbcBank1.credit();
		hsbcBank1.debit();
		hsbcBank1.tranferMoney();
//		hsbcBank1.educationLoan();
//		hsbcBank1.carLoan();
		hsbcBank.mutualFund();

		/*
		 * The method educationLoan() is undefined for the type USBank
		 */

		System.out.println();

		System.out.println(USBank.min_bal); // Min Bal is Final we cant change

	}
}
