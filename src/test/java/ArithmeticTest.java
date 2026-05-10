import org.example.Arithmetic;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ArithmeticTest {
    private Arithmetic calc = new Arithmetic();

    @Test
    public void testAdd() {
        Assert.assertEquals(calc.add(5, 3), 8);
    }

    @Test
    public void testSubtract() {
        Assert.assertEquals(calc.subtract(10, 4), 6);
    }

    @Test
    public void testMultiply() {
        Assert.assertEquals(calc.multiply(6, 7), 42);
    }

    @Test
    public void testDivide() {
        Assert.assertEquals(calc.divide(10, 2), 5.0);
    }

    @Test //(expectedExceptions = ArithmeticException)
    public void testDivideByZero() {
        calc.divide(5, 0);
    }

}
