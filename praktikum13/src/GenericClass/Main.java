package GenericClass;

class Test<T>
{
    T obj;
    Test(T obj) {
        this.obj = obj;
    }
    public T getObject() {
        return this.obj;
    }
}

public class Main {
    public static void main (String[] args)
    {
        // instance of Integer type
        Test <Integer> iObj = new Test<Integer>(15);
        System.out.println(iObj.getObject());

        // instance of String type
        Test <String> sObj = new Test<String>("Generic class example");
        System.out.println(sObj.getObject());

        //instance of  doble type
        Test <Double> dObj = new Test<Double>(2.5);
        System.out.println(dObj.getObject());
    }
}


