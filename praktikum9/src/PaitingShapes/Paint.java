package PaitingShapes;

public class Paint {
    private double coverage; //number of square feet per gallon
    public Paint(double c){
        coverage=c;
    }
    //return the amount of paint (number of gallons)
    //needed to paint the shape given as the parameter
    public double amount(Shape s){
        System.out.println("computing amount for " + s);
        return s.area()/coverage;
    }
}
