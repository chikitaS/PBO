package PaitingShapes;

public class Rectangle extends Shape{
    private double length;
    private double width;
    public Rectangle(double l,double w){
        super("Rectangle");
        length=l;
        width=w;
    }
    //return the surface area of the sphere
    public double area(){
        return length*width;
    }
    //return the ractangle as a string
    public String toString() {
        return super.toString() + "of length " + length + " and width " + width;
    }
}
