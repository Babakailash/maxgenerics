package genericsdemo;

public class MaximumMain {

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













