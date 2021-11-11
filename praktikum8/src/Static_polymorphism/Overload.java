package Static_polymorphism;

public class Overload {
    //constructors 1
    void demo(int a){
        System.out.println("a:"+ a);
    }
    //constructors 2
    void demo(int a, int b){
        System.out.println("a and b:"+ a + ","+ b);
    }
    //constructors 3
    double demo(double a){
        System.out.println("double a:" + a);
        return a*a;
    }
}
