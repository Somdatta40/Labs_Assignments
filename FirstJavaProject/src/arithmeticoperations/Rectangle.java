package arithmeticoperations;
import java.util.Scanner;
public class Rectangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the length:");
		int a=sc.nextInt();
		System.out.println("enter the breadth:");
		int b=sc.nextInt();
		System.out.println("area is:"+a*b);
		System.out.println("area is:"+2*(a+b));
		
	}

}
