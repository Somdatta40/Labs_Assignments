package lab_assignment3;
import java.util.*;


public class Modify {
	
	public static int modifyNumber(int number1)
	{
		String s=Integer.toString(number1);
		StringBuffer sbf=new StringBuffer();
		int len=s.length();
		StringBuffer ss=null;
		for(int i=1;i<len;i++)
		{
			int d=(int)s.charAt(i)-(int)s.charAt(i-1);
			if(d<0)
				d=d*(-1);
			ss=sbf.append(d);
			if(i==len-1)
				ss=sbf.append(s.charAt(i));
			
			
		}
		String str=ss.toString();
		int num=Integer.valueOf(str);
		
		return num;
	}
	public static void main(String[] args) { 
		Scanner sc=new Scanner(System.in);
		int number=sc.nextInt();
		int n=modifyNumber(number);
		System.out.println(n);
		
		sc.close();
	}

}


