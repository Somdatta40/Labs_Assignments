package lab4;

public class SavingAccount extends Account {
	final double minimumBalance;

	public SavingAccount(long accNum, double balance, Person accHolder, double minimumBalance) {
		super(accNum, balance, accHolder);
		this.minimumBalance = minimumBalance=500;
	}
	public void withdarw(double amt) {
		if(balance>=minimumBalance)
			balance=balance-amt;
		else
			System.out.println("cannot withdraw due to lesser amt in account");
	}
}
