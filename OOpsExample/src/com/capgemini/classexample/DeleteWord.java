package com.capgemini.classexample;

import java.util.*;

public class DeleteWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the string : ");
		String string=sc.nextLine();
		System.out.print("Enter the word to be deleted : ");
		String dw=sc.next();
		if(string.contains(dw))
		{
			string=string.replace(dw, "");
		}
		System.out.printf("After deleting the word %s new String = %s",dw,string);
	}

}
