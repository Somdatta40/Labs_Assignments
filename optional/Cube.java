package optional;
import java.util.Scanner;
import java.lang.Math.*;
public class Cube {
	public static int cubesOfdigits(int digit) {
		int d,s=0;
		while(digit>0){
		d=digit%10;
		s=s+(d*d*d);
		digit/=10;
	}
		return s;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int digit;
		Scanner sn=new Scanner(System.in);
		System.out.println("enter the digit:");
		 digit=sn.nextInt();
		 System.out.println("the sum of cube of:"+digit+"is"+cubesOfdigits(digit));
		}
		
		
	}


