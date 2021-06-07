package com.capgemini.lab9;

import java.util.Scanner;

public class PowerMain {

	private static double y;
	private static double x;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		PowerUsingLambda p= (double x, double y) -> {
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the two numbers: ");
			x=sc.nextDouble();
			y=sc.nextDouble();
			System.out.println("ans of x to the power y= " + (Math.pow(x,y)));
		};
		p.power(x,y);
	}

}
