package Dynamic_polymorphism;

public class Horse extends Animal {
    @Override
    public void Sound(){
        System.out.println("neigh");
    }
    public static void main(String args[]){
        Animal obj = new Horse();//instance obj object of class Animal and initialized with Horse class
        obj.Sound();//calling Sound() of Horse class
    }
}
