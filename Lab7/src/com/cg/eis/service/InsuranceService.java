package com.cg.eis.service;

import java.util.Scanner;

import com.cg.eis.bean.Employee;

public class InsuranceService extends Employee implements EmployeeService {

	  Employee emp = new Employee();

	@Override
	public void getEmployeeDetails() {
		// TODO Auto-generated method stub
		
		Scanner sn=new Scanner(System.in);
			System.out.println("Enter the details of Employee");
			System.out.println("Enter the id");
			emp.eId = sn.nextInt();
			System.out.println("Enter the Name");
			emp.eName = sn.next();
			System.out.println("Enter the Salary");
			emp.eSalary = sn.nextInt();
			System.out.println("Enter the Designation");
			emp.eDesignation = sn.next();
			
		}
	

	@Override
	public void displayEmpDetails() {
		// TODO Auto-generated method stub
		emp.insuranceScheme="No Scheme";
		if (eSalary > 5000 && eSalary < 20000 && eDesignation.equalsIgnoreCase("System Associate"))
            emp.insuranceScheme= "Scheme C";
        else if (eSalary >= 20000 && eSalary < 40000 && eDesignation.equalsIgnoreCase("Programmer"))
        	emp.insuranceScheme= "Scheme B";
        else if (eSalary >= 40000 && eDesignation.equalsIgnoreCase("Manager"))
        	emp.insuranceScheme="Scheme A";
        else if (eSalary < 5000 && eDesignation.equalsIgnoreCase("Clerk"))
        	emp.insuranceScheme="No Scheme";
		System.out.println("Employee id\tName\t\tSalary\tDesignation\tInsurance scheme");

		System.out.println(emp.eId+"\t\t"+emp.eName+"\t"+emp.eSalary+"\t"+emp.eDesignation+"\t\t"+emp.insuranceScheme);
			
	}
	

	

}
