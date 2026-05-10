import org.example.TriangleArea;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TriangleAreaTest {
    private double IllegalArgumentException;

    @Test
    public void testAreaPositive() {
        TriangleArea calc = new TriangleArea();
        Assert.assertEquals(calc.area(10, 5), 25.0);
        Assert.assertEquals(calc.area(4, 3), 6.0);
    }

    @Test
    public void testAreaNegative() {
        TriangleArea calc = new TriangleArea();
        Assert.assertEquals(calc.area(-5, 3), IllegalArgumentException);
    }

}
