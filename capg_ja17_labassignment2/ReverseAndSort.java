package capg_ja17_labassignment2;

import java.util.Scanner;
import java.util.Arrays;
 
public class ReverseAndSort{
public static int[] getsorted(int arr[])
{
     int n=arr.length;
     for(int i=0;i<n;i++)
     {
    	 StringBuffer s = new StringBuffer(String.valueOf(arr[i]));
			s.reverse();
			arr[i]= Integer.parseInt(String.valueOf(s));
     }
		Arrays.sort(arr);
		
		return arr;
}
public static void main(String[] args)
{
int n,i;
Scanner sc=new Scanner(System.in);
System.out.println("enter the length of the array:");
n=sc.nextInt();
int []arr=new int[n];
System.out.println("enter the numbers:");
for(i=0;i<arr.length;i++)
{
	arr[i]=sc.nextInt();
}
 ReverseAndSort sn= new ReverseAndSort();
 int []r_arr=new int[arr.length];
 r_arr=sn.getsorted(arr);
    for(i=0;i<(r_arr.length);i++) {
    	System.out.println(r_arr[i]+" ");
    }
}
}
