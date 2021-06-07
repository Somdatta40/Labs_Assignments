package com.capgemini.lab9;

import java.util.Scanner;

public class AuthenticateMain {

	private static String userName;
	private static String passWord;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//boolean result = false;
		AuthenticationOfUsernamePassword up=(String userName, String passWord)->{
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the Username and Password: ");
			userName=sc.nextLine();
			passWord=sc.nextLine();
			if(!userName.matches("^[A-Za-z]\\\\w{5,29}$")&&!passWord.matches("(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[@$!%*?&])[A-Za-z\\d@$!%*?&]{8,}$")) {
				return false;
			}
			return true;
					
		};
		boolean result=up.authenticate(userName, passWord);
		System.out.println(result);
	}

}
