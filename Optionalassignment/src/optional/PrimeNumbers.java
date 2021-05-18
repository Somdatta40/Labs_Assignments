package optional;
import java.util.Scanner;
public class PrimeNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,temp;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the no. upto which we have to find prime number:");
		n=sc.nextInt();
		for(int i=2;i<n;i++)
		{
			temp=0;
			for(int j=2;j<i;j++)
			{
				if(i%j==0)
					temp=1;
			}
			if(temp==0)
				System.out.println(i);
		}
	}

}
