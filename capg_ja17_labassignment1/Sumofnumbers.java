package capg_ja17_labassignment1;
import java.util.Scanner;
public class Sumofnumbers {
	public static int sum(int n) {
		int i,s=0;
		for(i=1;i<=n;i++)
		{
			if(i%3==0||i%5==0) {
				s=s+i;
			}
			
		}
		return s;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		Scanner sn=new Scanner(System.in);
		System.out.println("enter the digit:");
		 n=sn.nextInt();
		 System.out.println("the sum of number is:"+sum(n));
	}

}
