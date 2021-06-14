package com.capgemini.atm;


public class Deposit extends Transaction{
double amount;

	public Deposit() {
		super();
	}

	public Deposit(int accountNumber,double amount) {
		super(accountNumber);
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
		balance=balance+amount;
		
		System.out.println("Balance : "+balance);
	}

	@Override
	public String toString() {
		return "Deposit [amount=" + amount + "]";
	}
	
	
}
