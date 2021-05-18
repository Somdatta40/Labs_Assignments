import java.util.Scanner;
public class DuplicateDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sn=new Scanner(System.in);
		System.out.println("enter a number:\n");
		int n=sn.nextInt();
		int arr[]=new int[10];int i;
		while(n>0)
		{
			int d=n%10;
			arr[d]++;//it gives the frequency of how many times a digit has occured in a number
			n=n/10;
		}
		for(i=0;i<10;i++)
		{
			if(arr[i]>1)
				System.out.println("digit "+i+" is repeated "+arr[i]+" times");
		}
	}

}
