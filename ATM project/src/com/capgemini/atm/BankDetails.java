package com.capgemini.atm;

public class BankDetails {

	private String accNo;
	private int balance=50000;
	private int withdrawalAmt;
	private int depo;


	


	public BankDetails() {
		super();
	}
	public BankDetails(String accNo, int balance) {
		super();
		this.accNo = accNo;
		this.balance = balance;
		//this.withdrawalAmt = withdrawalAmt;
		//this.depo = depo;
	}
	public String getAccNo() {
		return accNo;
	}
	public void setAccNo(String accNo) {
		this.accNo = accNo;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	
	/*public int getWithdrawalAmt() {
		return withdrawalAmt;
	}
	public void setWithdrawalAmt(int withdrawalAmt) {
		this.withdrawalAmt = withdrawalAmt;
	}
	public int getDepo() {
		return depo;
	}
	public void setDepo(int depo) {
		this.depo = depo;
	}*/
	
	
}
