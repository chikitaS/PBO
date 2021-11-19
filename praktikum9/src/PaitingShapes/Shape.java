package PaitingShapes;

public abstract class Shape {
    String shapeName;

    public Shape(String name) {
        shapeName=name;
    }

    abstract public double area();
    public String toString() {
        return "Name of the shape = " + shapeName + "\n";
    }
}
