package com.capgemini.lab5;

import java.util.Scanner;

public class AgeNotValidMain {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the age: ");
		int age=sc.nextInt();
		try {
			if(age<15)
				throw new AgeNotValid(age+" is not valid");
			else
				throw new AgeNotValid(age+" is valid");
		}catch(AgeNotValid a) {
			System.out.println(a.getMessage());
		}
	}
}
