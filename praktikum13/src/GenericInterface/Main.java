package GenericInterface;

// An interface that extends Comparable
interface MinMax<T extends Comparable<T> > {
    T min();
    T max();
}
// class extending Comparable and implementing interface
class MyClass<T extends Comparable<T> > implements MinMax<T> {
    T[] values;
    MyClass(T[] obj) {
        values = obj;
    }
    public T min() {
        T obj = values[0];
        for (int i = 1; i < values.length; i++)
            if (values[i].compareTo(obj) < 0)
                obj = values[i];
        return obj;
    }
    public T max() {
        T obj = values[0];
        for (int i = 1; i < values.length; i++)
            if (values[i].compareTo(obj) > 0)
                obj = values[i];
        return obj;
    }
}

class GFG {
    public static void main(String[] args) {
        Integer arr[] = { 1,3,7,8,9 };
        MyClass<Integer> obj1 = new MyClass<Integer>(arr);
        System.out.println("Minimum value: " + obj1.min());
        System.out.println("Maximum value: " + obj1.max());
    }
}

