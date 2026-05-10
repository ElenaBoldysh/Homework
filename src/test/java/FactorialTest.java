import org.example.Factorial;
import org.junit.jupiter.api.Assertions;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.math.BigInteger;

public class FactorialTest {
    private Class IllegalArgumentException;

    @Test
    public void testFactorialPositive() {
        Assert.assertEquals(Factorial.calculate(5), 120);
    }

    @Test
    public void testFactorialZero() {
        Assert.assertEquals(Factorial.calculate(0), 1);
    }

    @Test
    public void testFactorialNegative() {
            Assert.assertEquals(Factorial.calculate(-1), IllegalArgumentException);
    }
}