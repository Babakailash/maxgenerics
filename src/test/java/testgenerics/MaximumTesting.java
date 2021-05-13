package testgenerics;
import genericsdemo.MaximumMain;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MaximumTesting {

    @Test
    public void max_first_position() {
        MaximumMain m = new MaximumMain();
        String result = m.maximum("Peach","Apple","Banana");
        Assertions.assertEquals("Peach",result);
    }

    @Test
    public void max_second_position() {
        MaximumMain m = new MaximumMain();
        String result = m.maximum("Apple","Peach","Banana");
        Assertions.assertEquals("Peach",result);
    }

    @Test
    public void max_third_position() {
        MaximumMain m = new MaximumMain();
        String result = m.maximum("Apple","Banana","Peach");
        Assertions.assertEquals("Peach",result);
    }




}