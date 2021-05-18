package capg_ja17_labassignment1;
import java.util.Scanner;
public class PowerOfTwo {
		public static boolean power(int n) {
			boolean flag=true;
			if(n==0){return (flag=false);}
			else
			return (int)(Math.ceil((Math.log(n) / Math.log(2)))) ==
		       (int)(Math.floor(((Math.log(n) / Math.log(2)))));
		
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		Scanner sn=new Scanner(System.in);
		System.out.println("enter the digit:");
		 n=sn.nextInt();
		 if(power(n))
			 System.out.println(n+" is power of 2");
		 else
			 System.out.println(n+"is not power of 2");
	}

}
