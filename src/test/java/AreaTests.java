import org.testng.annotations.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class AreaTests {
    private Class<? extends Throwable> IllegalArgumentException;

    @Test
    void testEquilateralTriangle() {
        assertEquals(Math.sqrt(3) / 4, TriangleArea.area(1, 1, 1), 1e-9);
    }

    @Test
    void testRightTriangle() {
        assertEquals(6.0, TriangleArea.area(3, 4, 5), 1e-9);
    }

    @Test
    void testInvalidSides() {
        assertThrows(IllegalArgumentException, () -> TriangleArea.area(1, 1, 3));
    }

    @Test
    void testNegativeSides() {
        assertThrows(IllegalArgumentException, () -> TriangleArea.area(-1, 2, 2));
    }
}
