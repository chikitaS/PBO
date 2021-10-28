package praktikum7;

public class TestCylinder {
    public static void main ( String[]args) {
        //Declare and allocate a new instance of cylinder
        //with default color, radius, and height
        Cylinder c1 = new Cylinder();
        System.out.println("Cylinder:"
                + "\tradius=" + c1.getRadius()
                + "\theight=" + c1.getHeight()
                + "\tbase area=" + c1.getArea()
                + "\tvolume=" + c1.getVolume());
        //Declare and allocate a new instance of cylinder
        //specifying height, with default color and radius
        Cylinder c2 = new Cylinder(10.0);
        System.out.println("Cylinder:"
                + "\tradius=" + c2.getRadius()
                + "\theight=" + c2.getHeight()
                + "\tbase area=" + c2.getArea()
                + "\t\tvolume=" + c2.getVolume());
        //Declare and allocate a new instance of cylinder
        //specifying radius and height, with default color
        Cylinder c3 = new Cylinder(2.0,10.0);
        System.out.println("Cylinder:"
                + "\tradius=" + c3.getRadius()
                + "\theight=" + c3.getHeight()
                + "\tbase area=" + c3.getArea()
                + "\tvolume=" + c3.getVolume());
        System.out.println(c3.toString());
    }
}
