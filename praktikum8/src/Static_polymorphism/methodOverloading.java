package Static_polymorphism;

public class methodOverloading {
    public static void main(String args[]){
        Overload obj = new Overload();//instance objek
        double result;
        obj.demo(10);           //calling constructors 1 of Overload class with obj object
        obj.demo(10,20);    //calling constructor 2 of Overload class with obj object
        result=obj.demo(5.5); //calling constructors 3 of Overload class with obj object
        System.out.println("O/P : " + result);

    }
}
