package GenericBoundedParameters;

public class MaximumTest {
    // determines the largest of three Comparable objects

    public static <T extends Comparable<T>> T maximum(T x, T y, T z) {
        T max = x;   // assume x is initially the largest

        if(y.compareTo(max) > 0) {
            max = y;   // y is the largest so far
        }

        if(z.compareTo(max) > 0) {
            max = z;   // z is the largest now
        }
        return max;   // returns the largest object
    }

    public static void main(String args[]) {
        System.out.printf("Max of %d, %d and %d is %d\n\n", 6, 7, 50, maximum( 6, 7, 50 ));

        System.out.printf("Max of %.1f,%.1f and %.1f is %.1f\n\n", 6.6, 8.8, 7.7, maximum(7.0,11.5,20.0 ));

        System.out.printf("Max of %s, %s and %s is %s\n","banana", "blueberry", "grape", maximum("banana", "blueberry", "grape"));
    }
}
