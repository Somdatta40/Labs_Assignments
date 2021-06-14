package com.capgemini.atm;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class BankCustomer {
	
	static int accNum ;
	static int balance;
	public static void withdraw(int accNum,double balance) {
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter the amount you want to withdraw : ");
		double amount=sc.nextDouble();
		Withdraw wthd=new Withdraw(accNum,amount);
		
		wthd.execute(balance);
		
		sc.close();
	}
	public static void deposit(int accNum,double balance) {
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter the amount you want to deposit : ");
		double amount=sc.nextDouble();
		Deposit deposit=new Deposit(accNum,amount);
		
		deposit.execute(balance);
		
		sc.close();
	}

	public static void checkBalance(int accNum,double balance) {
		Scanner sc=new Scanner(System.in);
		BalanceInquiry be=new BalanceInquiry(accNum);
		
		be.execute(balance);
		
		sc.close();
	}
	public static void main (String[] args) {
		
		Scanner sn=new Scanner(System.in);
		char ch='y';
		while(ch=='y') {
		System.out.println("enter your choice: ");
		System.out.println("1.create bank details: ");
		System.out.println("2.create personal details: ");
		System.out.println("3.create card details: ");
		System.out.println("4.Transaction: ");
		int c=sn.nextInt();
		switch(c) {
		case 1:
			ArrayList<BankDetails>bankList=new ArrayList<BankDetails>();
			Scanner sc=new Scanner(System.in);
			for(int i=0;i<1;i++) {
				System.out.println("enter the information to access: ");
				System.out.println("enter the acc no: ");
				String accNo=sc.next();
				sc.nextLine();
				System.out.println("enter the balance: ");
				int balance=sc.nextInt();
				bankList.add(new BankDetails(accNo,balance));
			}
			
			Iterator<BankDetails>Itr = bankList.iterator();
			System.out.println("bank ArrayList values using Iterator");
			while(Itr.hasNext()) {
				BankDetails st = Itr.next();
				System.out.println(st.getAccNo() + " \t\t\t " + st.getBalance());
				System.out.println();
			}
			break;
		case 2:
			ArrayList<PersonalDetails>personalList=new ArrayList<PersonalDetails>();
			Scanner sc1=new Scanner(System.in);
			for(int i=0;i<1;i++) {
				System.out.println("enter the information to access: ");
				System.out.println("enter the name: ");
				String customerName=sc1.nextLine();
				System.out.println("enter the address: ");
				String address=sc1.nextLine();
				System.out.println("enter the email: ");
				String email=sc1.nextLine();
				System.out.println("enter the account number: ");
				String accNo=sc1.nextLine();
				personalList.add(new PersonalDetails(customerName,address,email,accNo));
			}
			
			Iterator<PersonalDetails>Itr1 = personalList.iterator();
			System.out.println("personal ArrayList values using Iterator");
			while(Itr1.hasNext()) {
				PersonalDetails st = Itr1.next();
				System.out.println(st.getCustomerName() + " \t\t\t " + st.getAddress()+ " \t\t\t " + st.getEmail()+ " \t\t\t " + st.getAccNo());
				System.out.println();
			}
			break;
		case 3:
			ArrayList<CardDetails>cardList=new ArrayList<CardDetails>();
			Scanner sc2=new Scanner(System.in);
			for(int i=0;i<1;i++) {
				System.out.println("enter the information to access: ");
				System.out.println("enter the acc no: ");
				String accNo=sc2.next();
				sc2.nextLine();
				System.out.println("enter the card number: ");
				String cardNo=sc2.nextLine();
				System.out.println("enter the pin: ");
				String pin=sc2.nextLine();
				validatePin(pin);
				cardList.add(new CardDetails(accNo,cardNo,pin));
				
			}
			
			Iterator<CardDetails>Itr2 =cardList.iterator();
			System.out.println("card ArrayList values using Iterator");
			while(Itr2.hasNext()) {
				CardDetails st1 = Itr2.next();
				System.out.println(st1.getAccNo() + " \t\t\t " + st1.getCardNo()+ " \t\t\t " + st1.getPin());
				System.out.println();
			}
			break;
		case 4:
			System.out.println("enter your transaction choice: ");
			System.out.println("1.withdraw");
			System.out.println("2.deposit");
			System.out.println("3.check balance");
			int cn=sn.nextInt();
			switch(cn) {
			case 1:
				withdraw(accNum,balance);
				break;
			case 2:
				deposit(accNum,balance);
				break;
			case 3:
				checkBalance(accNum,balance);
				break;
			default:
				System.out.println("invalid choice");
			}
			break;
		default:
			System.out.println("wrong choice");
		}
		System.out.println("enter your choice: y/n");
		ch=sn.next().trim().charAt(0);
		}
		
	
	}
	private static void validatePin(String pin) {
		// TODO Auto-generated method stub

		String regex = "[0-9]{4}";
		
		Pattern p = Pattern.compile(regex);
		
		Matcher m = p.matcher(pin);
		if(m.matches()) {
			System.out.println("valid pin");
		}else {
			System.out.println("invalid pin");
		}
	}

}

