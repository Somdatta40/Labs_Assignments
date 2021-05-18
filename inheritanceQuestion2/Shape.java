package inheritanceQuestion2;

public class Shape {
    public String color;
    public boolean filled;

//    Getters
    public String getColor() { return color; }
    public boolean isFilled() { return filled; }

//    Setters
    public void setColor(String color) { this.color= color; }
    public void setFilled(boolean filled) { this.filled = filled; }

//    toString
    public String toString() {
        return "Shape[color= " + this.color + ", filled= " + this.filled;
    }
}
