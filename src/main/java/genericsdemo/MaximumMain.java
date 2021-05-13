package genericsdemo;

import java.util.Arrays;
import java.util.Collections;

public class MaximumMain < T extends Comparable> {
    T x, y, z;

    public MaximumMain() {
        this.x = x;
        this.y = y;
        this.z = z;
    }
    public static <T extends Comparable<T>> T pritnMultiple(T[] input) {
        T max = Collections.max(Arrays.asList(input));
        System.out.println("Max Values From given Array is: " + max );
        return max;
    }

    public T testMaximum(T x, T y, T z) {
        T max = x;
        if(y.compareTo(max) > 0) {
            max = y;
        }
        if(z.compareTo(max) > 0) {
            max = z;
        }
        System.out.println(" Maximum using Generic class is: " + max);
        return max;
    }

    public static <T extends Comparable<T>> T printMax(T x, T y, T z) {
        T max = x;
        if(y.compareTo(max) > 0) {
            max = y;
        }
        if(z.compareTo(max) > 0) {
            max = z;
        }
        System.out.println("Maximum Element is: " + max );
        return max;
    }
}












