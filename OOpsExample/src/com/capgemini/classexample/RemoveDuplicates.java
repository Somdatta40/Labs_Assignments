package com.capgemini.classexample;
import java.util.Scanner;
public class RemoveDuplicates {
		
		public static String removeDuplicates(String string) {
		    
		    char[] chr = string.toCharArray();
		    String newresult = "";
		    for (char value : chr) {
		      if (newresult.indexOf(value) == -1) {
		        newresult+= value;
		      }
		    }
		    return newresult;
		  }

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Scanner sc=new Scanner(System.in);
			System.out.print("Enter the string : ");
			String string = sc.next();
			
			System.out.println("After removing duplicates, new string = "+removeDuplicates(string));
			sc.close();

		}

	}
