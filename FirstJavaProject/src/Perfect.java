import java.util.Scanner;
public class Perfect {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try(Scanner sn=new Scanner(System.in)){
		System.out.println("enter a number:\n");
		int n=sn.nextInt();
		int i, s=0;
		for(i=1;i<=(n/2);i++)
		{
			if(n%i==0)
			{
				s=s+i;
			}
		}
		if(s==n)
		{
			System.out.println("the no. is perfect");
		}
		else
		{
			System.out.println("the no. is not perfect");
		}
		
	}
	}
}
