package com.capgemini.classexample;

import java.util.*;
public class EmailChecking {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the email : ");
		String em=sc.next();
		if(em.contains("@") && em.contains("."))
			System.out.println("Email contains both '@' and '.', thus valid");
		else if(em.contains("@"))
			System.out.println("Email contains '@' but not '.', thus invalid");
		else if(em.contains("."))
			System.out.println("Email contains '.' but not '@', thus invalid");
		else
			System.out.println("Email does not contain both '@' and '.', thus invalid email");
		
		sc.close();
	}

}
