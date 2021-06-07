package optional;
import java.util.Scanner;
public class TrafficLight {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("1.red");
		System.out.println("2.yellow");
		System.out.println("3.green");
		System.out.println("enter your choice:");
		Scanner light=new Scanner(System.in);
		int ch=light.nextInt();
		switch(ch) {
		case 1:
			System.out.println("STOP");
			break;
		case 2:
			System.out.println("READY");
			break;
		case 3:
			System.out.println("GO");
			break;
		default:
			System.out.println("no such choice");
			
		}
	}

}
