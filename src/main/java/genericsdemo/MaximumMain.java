package genericsdemo;

public class MaximumMain {
    public static Float maximum(Float x, Float y, Float z) {

        Float max = x;

        if (y.compareTo(max) > 0)
            max = y;

        if (z.compareTo(max) > 0)
            max = z;

        System.out.println(max);
        return max;
    }

    public static void main(String[] args) {
        System.out.println(maximum(2.3f,3.4f,4.88f));
    }

}

