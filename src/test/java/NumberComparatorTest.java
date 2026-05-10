import org.example.CompareNumbers;
import org.testng.Assert;
import org.testng.annotations.Test;

public class NumberComparatorTest {
    @Test
    public void testGreaterThan() {
        String result = CompareNumbers.compare(15, 8);
        Assert.assertEquals(result, "a > b");
    }

    @Test
    public void testLessThan() {
        String result = CompareNumbers.compare(3, 10);
        Assert.assertEquals(result,"a < b");
    }

    @Test
    public void testEqual() {
        String result = CompareNumbers.compare(8, 8);
        Assert.assertEquals(result, "a == b");
    }

    @Test
    public void testNegativeNumbersGreater() {
        String result = CompareNumbers.compare(-4, -9);
        Assert.assertEquals(result, "a > b");
    }

    @Test
    public void testNegativeNumbersLess() {
        String result = CompareNumbers.compare(-4, -2);
        Assert.assertEquals(result, "a < b");
    }

    @Test
    public void testZeroAndPositive() {
        String result = CompareNumbers.compare(0, 10);
        Assert.assertEquals(result, "a < b");
    }

    @Test
    public void testZeroAndNegative() {
        String result = CompareNumbers.compare(0, -5);
        Assert.assertEquals(result, "a > b");
    }
}
