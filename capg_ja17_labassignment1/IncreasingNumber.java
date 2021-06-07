package capg_ja17_labassignment1;

import java.util.Scanner;
public class IncreasingNumber {
	public static boolean inc(int n) {
		int i,cn,an;
		boolean flag=true;
		while(n>1)
			{
				cn=n%10;
				n=n/10;
				an=n%10;
				if(cn<=an)
					flag=false;
			}
		return flag;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		Scanner sn=new Scanner(System.in);
		System.out.println("enter the digit:");
		 n=sn.nextInt();
		 if(inc(n))
			 System.out.println(n+"is an increasing no.");
		 else
			 System.out.println(n+"is not an increasing no.");
	}

}
