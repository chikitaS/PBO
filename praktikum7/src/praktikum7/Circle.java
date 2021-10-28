package praktikum7;

public class Circle {
    //private instance variable, not accessible from outside this class
    private double radius;
    private String color; //task 1.1 finished
    //Constructors (overload)
    /**Constructs a Circle instance with default value for radius and color*/
    public Circle() { // 1st (default) constructor
        radius = 1.0; //task 1.1 finished
        color="red";
    }
    /**Constructs a Circle instance with the given radius and default color*/
    public Circle(double r) { // 2nd constructor
        radius = r;
        color="red";
    }
    /** Returns the radius */
    public double getRadius(){
        return radius;
    }
    /**Returns the area of this Circle instance*/
    public double getArea() {
        return radius*radius*Math.PI;
    }
    /**Return a self descriptive string of this instance in the form of
     Circle[radius=?,color=?]*/
    public String toString(){
        return "Circle[ radius + color=" + color +"]";
    }
    /**getter and setter color*/
    public String getColor() { //task 1.1 finished
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
}
