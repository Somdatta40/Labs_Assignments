package lab_assignment3;
import java.util.Scanner;
public class MirrorImage {
public String getImage(String str) {
	StringBuffer sc= new StringBuffer(str);
	sc.append('|');
	StringBuffer sb= new StringBuffer(str);
	sb.reverse();
	sc.append(sb);
	return sc.toString();
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s= new Scanner(System.in);
		System.out.println("enter the string:");
		String str= s.nextLine();
		MirrorImage i= new MirrorImage();
		System.out.println("the new String is:"+i.getImage(str));
	}

}
