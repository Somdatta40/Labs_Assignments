package inheritanceQuestion2;

public class Square extends Rectangle{
	public double side;
	

//    Getters
    public double getSide() { return length; }
    public double getArea() { 
		area=length*length;
    	return area; }
    public double getPerimeter() {
    	perimeter=2*length;
    	return perimeter; }

//    Setters
    public void setSide(double length) { this.length = length; }
    public void setWidth(double width) { this.width = width; }
    public void setLength(double length) { this.length = length; }
//    toString
    public String toString() {
    	Rectangle r=new Rectangle();
    	return "Square["+r+"]"; }
}

