package oops_2;

public class HSBCBank implements USBank, BrazilBank // Muliple Inheritence : Is A RelationShip
{
	@Override
	public void credit() {
		System.out.println("HSBC...Credit");
	}

	@Override
	public void debit() {
		System.out.println("HSBC...Debit");
	}

	@Override
	public void tranferMoney() {
		System.out.println("HSBC...TransferMoney");
	}

	public void educationLoan() {
		System.out.println("HSBC...educationLoan");
	}

	public void carLoan() {
		System.out.println("HSBC...carLoan");
	}

	@Override
	public void mutualFund() {
		System.out.println("HSBC...MutualFund");
	}

}
