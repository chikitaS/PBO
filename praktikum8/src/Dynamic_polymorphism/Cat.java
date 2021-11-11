package Dynamic_polymorphism;

public class Cat extends Animal {
    @Override
    public void Sound(){
        System.out.println("Meow");
    }
    public static void main(String args[]){
        Animal obj = new Cat();//instance obj object of class Animal and initialized with Cat class
        obj.Sound();// calling Sound() of Cat class
    }
}
