package testgenerics;
import genericsdemo.MaximumMain;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MaximumTesting {
    @Test
    void integer_first_position() {
        MaximumMain m = new MaximumMain();
        Integer result = m.printMax(80,70,60);
        Assertions.assertEquals( result, 80);
    }

    @Test
    void integer_second_position() {
        MaximumMain m = new MaximumMain();
        Integer result = m.printMax(20,50,30);
        Assertions.assertEquals( result, 50);
    }

    @Test
    void integer_third_position() {
        MaximumMain m = new MaximumMain();
        Integer result = m.printMax(50,60,70);
        Assertions.assertEquals( result, 70);
    }

    @Test
    void float_first_position() {
        MaximumMain m = new MaximumMain();
        Float result = m.printMax(20.55f,19.55f,19.53f);
        Assertions.assertEquals( result, 20.55f);
    }

    @Test
    void float_second_position() {
        MaximumMain m = new MaximumMain();
        Float result = m.printMax(20.55f,20.56f,20.53f);
        Assertions.assertEquals( result, 20.56f);
    }

    @Test
    void float_third_position() {
        MaximumMain m = new MaximumMain();
        Float result = m.printMax(20.55f,19.55f,21.52f);
        Assertions.assertEquals( result, 21.52f);
    }

    @Test
    void string_first_position() {
        MaximumMain m = new MaximumMain();
        String result = m.printMax("peach","banana","apple");
        Assertions.assertEquals( result, "peach");
    }

    @Test
    void string_second_position() {
        MaximumMain m = new MaximumMain();
        String result = m.printMax("banana","peach","apple");
        Assertions.assertEquals( result, "peach");
    }

    @Test
    void string_third_position() {
        MaximumMain m = new MaximumMain();
        String result = m.printMax("apple","banana","peach");
        Assertions.assertEquals( result, "peach");
    }

    @Test
    void integer_maximum_mumtiple_values() {
        MaximumMain m = new MaximumMain();
        Integer[] ar = {10,15,11,9};
        Integer result = (Integer)m.pritnMultiple(ar);
        Assertions.assertEquals( result, 15);
    }

    @Test
    void string_maximum_multiple_values() {
        MaximumMain m = new MaximumMain();
        String[] ar = {"peach","banana", "apple","mango"};
        String result = (String)m.pritnMultiple(ar);
        Assertions.assertEquals( result, "peach");
    }

    @Test
    void float_maximum_multiple_values() {
        MaximumMain m = new MaximumMain();
        Float[] ar = {10.30f,55.02f,22.44f,23.54f};
        Float result = (Float) m.pritnMultiple(ar);
        Assertions.assertEquals( result, 55.02f);
    }


}