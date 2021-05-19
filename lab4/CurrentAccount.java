package lab4;

public class CurrentAccount extends Account {
	double overdraftLimit;

	public CurrentAccount(long accNum, double balance, Person accHolder, double overdraftLimit) {
		super(accNum, balance, accHolder);
		this.overdraftLimit = overdraftLimit=90;
	}
	public void withdraw(double amt) {
		if((balance + amt)>overdraftLimit)
			System.out.println("Limit reached, deposit not possible");
		else
			balance=balance+amt;
	}
}
