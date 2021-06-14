package com.capgemini.atm;

public class CardDetails {

	private String accNo;
	private String cardNo;
	private String pin;
	public CardDetails() {
		super();
	}
	public CardDetails(String accNo, String cardNo, String pin) {
		super();
		this.accNo = accNo;
		this.cardNo = cardNo;
		this.pin = pin;
	}
	public String getAccNo() {
		return accNo;
	}
	public void setAccNo(String accNo) {
		this.accNo = accNo;
	}
	public String getCardNo() {
		return cardNo;
	}
	public void setCardNo(String cardNo) {
		this.cardNo = cardNo;
	}
	public String getPin() {
		return pin;
	}
	public void setPin(String pin) {
		this.pin = pin;
	}
	
	
}
