package GenericWildCard;
import java.util.*;

public class WildCard {
    public static void main(String[] args) {
        //Upper Bounded Integer List
        List < Integer > intList = Arrays.asList(10, 50, 70, 80);

        //printing the sum of integer elements in list
        System.out.println("Total sum is:" + sum(intList));

        //Upper Bounded Double list
        List < Double > doubleList = Arrays.asList(7.5, 10.9, 11.5, 22.0);

        //printing the sum of double elements in list
        System.out.print("Total sum is: " + sum(doubleList));
    }
    private static double sum(List < ?extends Number > myList) {
        double sum = 0.0;
        for (Number iterator: myList) {
            sum = sum + iterator.doubleValue();
        }
        return sum;
    }
}
