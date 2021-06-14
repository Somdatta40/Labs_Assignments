package com.capgemini.atm;

public class Withdraw extends Transaction {

	double amount;

	public Withdraw() {
		super();
	}


	public Withdraw(int accountNum,double amount) {
		super(accountNum);
		this.amount = amount;
	}

	public Double getAmount() {
		return amount;
	}


	public void setAmount(double amount) {
		this.amount = amount;
	}


	public void execute(double balance) {
		super.execute();
		balance=balance-amount;
		System.out.println("Balance : "+balance);
	}


	@Override
	public String toString() {
		return "Withdraw [amount=" + amount + "]";
	}
	
}
