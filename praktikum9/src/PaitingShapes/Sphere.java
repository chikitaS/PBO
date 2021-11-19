package PaitingShapes;

public class Sphere extends Shape{
    private double radius; //radius in feet
    public Sphere(double r){
        super("Sphere");
        radius=r;
    }
    //return the surface area of the sphere
    public double area(){
        return 4*Math.PI*radius*radius;
    }
    //return the sphere as a string
    public String toString() {
        return super.toString() + "of radius " + radius;
    }
}
