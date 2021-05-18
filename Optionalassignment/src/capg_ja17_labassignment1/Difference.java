package capg_ja17_labassignment1;

import java.util.Scanner;
public class Difference {
	public static int diff(int n) {
		int i,sq=1,sq_sum=0,sum_sq=0;
		for(i=1;i<=n;i++)
			{
				sum_sq+=i;
				 sq=sum_sq*sum_sq;
				sq_sum+=i*i;
			}
		return (sq_sum-sq);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		Scanner sn=new Scanner(System.in);
		System.out.println("enter the digit:");
		 n=sn.nextInt();
		 System.out.println("the diff is:"+diff(n));
	}

}
