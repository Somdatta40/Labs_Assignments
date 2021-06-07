package com.capgemini.lab9;

import java.util.Scanner;

public class FactMain {

	private static int r;
	public static int calFact(int n) {
		int r=1;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number: ");
		n=sc.nextInt();
		for(int i=1;i<=n;i++) {
			r=r*i;
		}
		System.out.println(r);
		return r;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Fact f=(FactMain::calFact);
		f.test(r);
		
	}

}
