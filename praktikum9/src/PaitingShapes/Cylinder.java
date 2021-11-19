package PaitingShapes;

public class Cylinder extends Shape{
    private double radius;
    private double height;
    public Cylinder (double r,double h){
        super("Rectangle");
        radius=r;
        height=h;
    }
    //return the surface area of the sphere
    public double area(){
        return Math.PI*radius*radius*height;
    }
    //return the Cylinder as a string
    public String toString() {
        return super.toString() + "of radius " + radius + " and height " + height;
    }
}
