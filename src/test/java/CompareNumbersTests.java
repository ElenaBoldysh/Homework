import org.example.CompareNumbers;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class CompareNumbersTests {
    @Test
    public void testGreaterThan() {
        String result = CompareNumbers.compare(15, 8);
        Assertions.assertEquals(result, "a > b");
    }

    @Test
    public void testLessThan() {
        String result = CompareNumbers.compare(3, 10);
        Assertions.assertEquals(result,"a < b");
    }

    @Test
    public void testEqual() {
        String result = CompareNumbers.compare(8, 8);
        Assertions.assertEquals(result, "a == b");
    }

    @Test
    public void testNegativeNumbersGreater() {
        String result = CompareNumbers.compare(-4, -9);
        Assertions.assertEquals(result, "a > b");
    }

    @Test
    public void testNegativeNumbersLess() {
        String result = CompareNumbers.compare(-4, -2);
        Assertions.assertEquals(result, "a < b");
    }

    @Test
    public void testZeroAndPositive() {
        String result = CompareNumbers.compare(0, 10);
        Assertions.assertEquals(result, "a < b");
    }

    @Test
    public void testZeroAndNegative() {
        String result = CompareNumbers.compare(0, -5);
        Assertions.assertEquals(result, "a > b");
    }
}
