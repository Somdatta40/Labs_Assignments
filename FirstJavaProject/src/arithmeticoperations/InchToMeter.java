package arithmeticoperations;

import java.util.*;
public class InchToMeter {

public static void main(String[] args) {
 // TODO Auto-generated method stub
try(Scanner sc=new Scanner(System.in)){;
 System.out.println("Enter the length in inches");
 int inch=sc.nextInt();
 
 float meter=(float)(inch/39.37);
 System.out.println(inch+" inch = "+meter+" meter");
}
}
}
