package genericsdemo;

public class MaximumMain {
    public static Integer maximum(Integer x, Integer y, Integer z) {

        Integer max = x;

        if (y.compareTo(max) > 0)
            max = y;

        if (z.compareTo(max) > 0)
            max = z;

        System.out.println("Maximum Number in (3,4,5) is: ");
        return max;
    }

    public static void main(String[] args) {
        System.out.println(maximum(3,4,5));
    }

}

