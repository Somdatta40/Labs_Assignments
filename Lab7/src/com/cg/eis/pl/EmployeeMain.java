package com.cg.eis.pl;

import java.util.HashMap;


import java.util.Map;
import java.util.Scanner;

import com.cg.eis.bean.Employee;
import com.cg.eis.service.InsuranceService;

public class EmployeeMain extends Employee{

	public static void main(String[] args) {
		Scanner sm=new Scanner(System.in);
		HashMap<String,Employee> hmap=new HashMap<String,Employee>();
		HashMap<String,Integer> alist=new HashMap<String,Integer>();
		int choice;
		char ch='y';
		while(ch=='y') {

			System.out.println("Enter your choice: ");
			System.out.println("1.Add Employee Details: ");
			System.out.println("2.Display Employee Details with Scheme applied: ");
			System.out.println("3.Delete Employee Details: ");
			choice=sm.nextInt();
			switch(choice) {
			case 1 : System.out.print("Enter the number of employees : ");
			int numOfEmp=sm.nextInt();
			Employee emp[]=new Employee[numOfEmp];
			for(int i=0;i<numOfEmp;i++) {
				emp[i]=new Employee();
			}
			for(int i=0;i<numOfEmp;i++) {
				System.out.println("Enter id : ");
				emp[i].eId=sm.nextInt();
				System.out.println("Enter name : ");
				emp[i].eName=sm.next();
				System.out.println("Enter salary : ");
				emp[i].eSalary=sm.nextInt();
				System.out.println("Enter designation : ");
				sm.nextLine();
				emp[i].eDesignation=sm.nextLine();
				hmap.put(emp[i].getInsuranceScheme(), emp[i]);
				alist.put(emp[i].getInsuranceScheme(),emp[i].eId);
				System.out.println();
			}
			System.out.println("After adding employee details :\n");
			for(HashMap.Entry<String, Employee> m : hmap.entrySet()) {
				System.out.println(m.getValue());
			}
			break;
			case 2 : if(hmap.size()<1) {
				System.out.println("\nNo data found...");
			}else {
				System.out.print("Enter the insurance scheme : ");
				sm.nextLine();
				String ins_scheme=sm.nextLine();
				System.out.print("The employee details for the given insurance scheme are :\n ");
				for(HashMap.Entry<String, Employee> m : hmap.entrySet()) {
					if(m.getKey().equalsIgnoreCase(ins_scheme))
						System.out.println(m.getValue());
				}
			}
			break;
			case 3 :if(hmap.size()<1) {
				System.out.println("\nNo data found...");
			}else {
				System.out.print("Enter the id of the employee you want to delete : ");
				int id=sm.nextInt();
				for(Map.Entry<String,Integer> m : alist.entrySet()) {
					if(m.getValue()==id)
						hmap.remove(m.getKey());
				}
				System.out.println("After deleting employee details :\n");
				for(HashMap.Entry<String, Employee> m : hmap.entrySet()) {
					System.out.println(m.getValue());
				}
			}
			break;
			default :
				System.out.println("Invalid Choice");
			}
			System.out.println();
			System.out.print("Do you want to continue?(y/n) ");
			ch=sm.next().charAt(0);
		}
		sm.close();
	}

}
