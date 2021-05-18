import java.util.Scanner;
public class StrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sn=new Scanner(System.in);
		System.out.println("enter a number:\n");
		int n=sn.nextInt();
		int i, s=0, d, temp=n, f;
		while(n>0)
		{
			d=n%10;
			f=1;
			for(i=1;i<=d;i++)
			{
				f=f*i;
			}
			s=s+f;
			n=n/10;
		}
		if(s==temp)
			System.out.println("it's a strong number");
		else
			System.out.println("not a strong number");
	}

}
