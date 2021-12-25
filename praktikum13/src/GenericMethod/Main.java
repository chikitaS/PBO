package GenericMethod;

class DemoClass {

    // creae a generics method
    public <T> void genericsMethod(T data) {
        System.out.println(data);
    }
}

class Main {
    public static void main(String[] args) {

        // initialize the class with Integer data
        DemoClass demo = new DemoClass();

        // generics method working with String
        demo.<String>genericsMethod("Generic Method Example");

        // generics method working with integer
        demo.<Integer>genericsMethod(25);
    }
}

