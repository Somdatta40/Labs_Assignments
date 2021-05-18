package inheritanceQuestion1;

import java.util.Scanner;

public class MainPerson {
	static void PersonDetails() {
		Scanner sc=new Scanner(System.in);
		Person person=new Person();
		System.out.println("enter the name: ");
		String name =sc.nextLine();
		person.setName(name);
		System.out.print("Enter the address: ");
        String address = sc.nextLine();
        person.setAddress(address);
        System.out.println("The details are: ");
        System.out.println(person.toString());
	}
    static void studentDetails() {
        Scanner sc = new Scanner(System.in);
        Student student = new Student();
        System.out.print("Enter the name: ");
        String name = sc.nextLine();
        student.setName(name);
        System.out.print("Enter the address: ");
        String address = sc.nextLine();
        student.setAddress(address);
        System.out.print("Enter the year: ");
        int year = sc.nextInt();
        student.setYear(year);
        System.out.print("Enter the program: ");
        String program = sc.next();
        student.setProgram(program);
        sc.nextLine();
        System.out.print("Enter the fee: ");
        double fee = sc.nextDouble();
        student.setFee(fee);
        sc.nextLine();
        System.out.println("The details are: ");
        System.out.println(student.toString());

    }

    static void staffDetails() {
        Scanner sc = new Scanner(System.in);
        Staff staff = new Staff();
        System.out.print("Enter the name: ");
        String name = sc.nextLine();
        staff.setName(name);
        System.out.print("Enter the address: ");
        String address = sc.nextLine();
        staff.setAddress(address);
        System.out.print("Enter the school: ");
        String school = sc.nextLine();
        staff.setSchool(school);
        System.out.print("Enter the pay: ");
        double pay = sc.nextDouble();
        staff.setPay(pay);
        System.out.println("The details are: ");
        System.out.println(staff.toString());

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the choice: \n1. Person details\n2. Student details\n3. Staff details\n");
        int ch = sc.nextInt();
        	switch(ch) {
        	case 1:
        		PersonDetails();
        		break;
        	case 2:
        		studentDetails();
        		break;
        	case 3:
        		staffDetails();
        		break;
        	default:
        		System.out.println("Enter choice correctly!");
        		break;
        	}
   
    }
}
