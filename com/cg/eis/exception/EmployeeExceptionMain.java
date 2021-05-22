package com.cg.eis.exception;

import java.util.Scanner;

public class EmployeeExceptionMain {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter employee salary: ");
		int salary=sc.nextInt();
		try {
			if(salary<3000)
				throw new EmployeeException("Salary is below 3000");
			else
				throw new EmployeeException("Salary is above 3000");
		}catch(EmployeeException a) {
			System.out.println(a.getMessage());
		}
		
	}

}
