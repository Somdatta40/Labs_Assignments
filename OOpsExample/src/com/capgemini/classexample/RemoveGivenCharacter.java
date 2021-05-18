package com.capgemini.classexample;
import java.util.*;
public class RemoveGivenCharacter {
		public static String remove(String s,char k)
		{
			s=s.replace(k, ' ');
			String res="";
			char ch[]=s.toCharArray();
			for(char c : ch) {
				if(c!=' ')
				{
					res+=c;
				}
			}
			return res;
		}
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Scanner sc=new Scanner(System.in); 
			System.out.print("Enter the string : ");
			String string=sc.next();
			System.out.print("Enter the character to be removed : ");
			char ch=sc.next().charAt(0);
			System.out.printf("New String after removing '%c' is %s.",ch,remove(string,ch));
			
			sc.close();
		}

	}