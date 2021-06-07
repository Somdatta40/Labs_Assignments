package com.capgemini.lab9;

import java.util.Scanner;

public class FormatStringMain {

	private static String m;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		FormatString msg= (String m)->{
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the String: ");
			m=sc.nextLine();
			return m.replace(""," ").trim();

		};
		String returnMsg= msg.printMessage(m);
		System.out.println(returnMsg);
	}

}
