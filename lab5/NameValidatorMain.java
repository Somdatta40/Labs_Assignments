package com.capgemini.lab5;
import java.util.Scanner;



public class NameValidatorMain {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the First name: ");
		String fn= sc.nextLine();
		System.out.println("enter the Last name: ");
		String ln= sc.nextLine();
		//char[] chars = fn.toCharArray();
		try {
				if(fn.isEmpty() && ln.isEmpty())
					throw new NameValidator("InValid Input");
				else if(fn.isEmpty())
					throw new NameValidator("enter the First name please");
				else if(ln.isEmpty())
					throw new NameValidator("enter the Last name please");
				else
					throw new NameValidator("ValidInput");
		}
		catch(NameValidator an)
		{
			
			System.out.println(an.getMessage());
			
		}
		}
			

}
