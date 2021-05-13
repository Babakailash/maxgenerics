package genericsdemo;

public class MaximumMain {
    public static String maximum(String Apple, String Peach, String Banana) {

        String max = Apple;

        if (Peach.compareTo(max) > 0)
            max = Peach;

        if (Banana.compareTo(max) > 0)
            max = Banana;

        System.out.println(max);
        return max;
    }

}

