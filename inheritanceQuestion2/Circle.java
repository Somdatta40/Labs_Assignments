package inheritanceQuestion2;
import java.util.Scanner;
import java.lang.Math;
public class Circle extends Shape{
	public double radius;
    public double area;
    public double perimeter;

//    Getters
    public double getRadius() { return radius; }
    public double getArea() { 
		area=Math.PI*radius*radius;
    	return area; }
    public double getPerimeter() {
    	perimeter=2*radius*Math.PI;
    	return perimeter; }

//    Setters
    public void setRadius(double radius) { this.radius = radius; }
//    toString
    public String toString() { 
    	Shape s=new Shape();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the color with which you want to fill : ");
		s.color=sc.next();
		if(s.color!=null)
			s.filled=true;
    	return "Circle[Shape[radius= " + getRadius() ; }
}

