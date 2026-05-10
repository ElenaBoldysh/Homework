import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class FactorialTests {

    private Class<? extends Throwable> IllegalArgumentException;

    @Test
    void testFactorialOfZero() {
        assertEquals(1, Factorial.calculate(0));
    }

    @Test
    void testFactorialOfOne() {
        assertEquals(1, Factorial.calculate(1));
    }

    @Test
    void testFactorialOfFive() {
        assertEquals(120, Factorial.calculate(5));
    }

    @Test
    void testNegativeInput() {
        assertThrows(IllegalArgumentException, () -> Factorial.calculate(-1));
        }
}
