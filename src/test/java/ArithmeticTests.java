import org.example.Arithmetic;
import org.junit.jupiter.api.Assertions;
import org.testng.annotations.Test;

public class ArithmeticTests {
    private final Arithmetic calculator = new Arithmetic();
    private Class<? extends Throwable> IllegalArgumentException;

    @Test
    void testAdd() {
        Assertions.assertEquals(5, calculator.add(2, 3));
        Assertions.assertEquals(-1, calculator.add(-3, 2));
        Assertions.assertEquals(0, calculator.add(-2, 2));
    }

    @Test
    void testSubtract() {
        Assertions.assertEquals(1, calculator.subtract(3, 2));
        Assertions.assertEquals(-5, calculator.subtract(-2, 3));
        Assertions.assertEquals(4, calculator.subtract(10, 6));
    }

    @Test
    void testMultiply() {
        Assertions.assertEquals(6, calculator.multiply(2, 3));
        Assertions.assertEquals(-6, calculator.multiply(-2, 3));
        Assertions.assertEquals(0, calculator.multiply(0, 5));
    }

    @Test
    void testDivide() {
        Assertions.assertEquals(2, calculator.divide(10, 5));
        Assertions.assertEquals(-2, calculator.divide(-10, 5));
        Assertions.assertEquals(2, calculator.divide(10, -5));
    }

    @Test
    void testDivideByZero() {
        Assertions.assertThrows(IllegalArgumentException, () -> {
            calculator.divide(5, 0);
        });
    }
}
