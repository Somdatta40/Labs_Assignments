package inheritanceQuestion2;

import java.util.Scanner;

public class Rectangle extends Shape {
	public double width;
	public double length;
    public double area;
    public double perimeter;

//    Getters
    public double getWidth() { return width; }
    public double getLength() { return length; }
    public double getArea() { 
		area=length*width;
    	return area; }
    public double getPerimeter() {
    	perimeter=2*(length+width);
    	return perimeter; }

//    Setters
    public void setWidth(double width) { this.width = width; }
    public void setLength(double length) { this.length = length; }
//    toString
    public String toString() { 
    	Shape s=new Shape();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the color with which you want to fill : ");
		s.color=sc.next();
		if(s.color!=null)
			s.filled=true;
    	return "Rectangle[Shape[width= " + getWidth() + ", length= " + getLength(); }
}
