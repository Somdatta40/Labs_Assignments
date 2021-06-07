package capg_ja17_labassignment2;
import java.util.Scanner;
public class SmallestNumber {
public static int getSecondSmallest(int[]a,int n) {
			int temp,i,j;
			for(i=0;i<n;i++)
			{
				for(j=i+1;j<n;j++)
				{
					if(a[i]>a[j])
					{
						temp=a[i];
						a[i]=a[j];
						a[j]=temp;
					}
				}
			}
			return a[1];
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sn=new Scanner(System.in);
		System.out.println("enter the number of elements:");
		int n= sn.nextInt();
		int [] a=new int[n];
		int i;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the numbers:");
		for(i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("the 2nd smallest no is:"+getSecondSmallest(a,n));
		
	}

}
