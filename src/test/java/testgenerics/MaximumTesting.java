package testgenerics;
import genericsdemo.MaximumMain;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MaximumTesting {

    @Test
    public void max_first_position() {
        MaximumMain m = new MaximumMain();
        Float result = m.maximum(70.55f,50.50f,30.33f);
        Assertions.assertEquals(70.55f,result);
    }

    @Test
    public void max_second_position() {
        MaximumMain m = new MaximumMain();
        Float result = m.maximum(55.25f,55.27f,55.26f);
        Assertions.assertEquals(55.27f,result);
    }


}