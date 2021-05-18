package arithmeticoperations;
import java.lang.Math;
import java.util.Scanner;

public class Circle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the radius:");
		int r=sc.nextInt();
		double area=r*r*Math.PI;
		System.out.println("area is:"+area);
		double perimeter=2*r*Math.PI;
		System.out.println("perimeter is:"+perimeter);
	}

}
