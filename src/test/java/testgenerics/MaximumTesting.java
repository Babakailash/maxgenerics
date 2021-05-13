package testgenerics;
import genericsdemo.MaximumMain;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MaximumTesting {

    @Test
    public void max_first_position() {
        MaximumMain m = new MaximumMain();
        Integer result = m.maximum(70,50,30);
        Assertions.assertEquals(70,result);
    }
}