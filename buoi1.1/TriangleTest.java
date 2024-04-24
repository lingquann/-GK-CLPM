import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TriangleTest {
    @Test
    public void testEquilateralTriangle() {
        assertEquals("Equilateral", Triangle.classifyTriangle(5, 5, 5));
    }

    @Test
    public void testIsoscelesTriangle() {
        assertEquals("Isosceles", Triangle.classifyTriangle(5, 5, 8));
    }

    @Test
    public void testScaleneTriangle() {
        assertEquals("Scalene", Triangle.classifyTriangle(5, 4, 7));
    }

    @Test
    public void testNotATriangle() {
        assertEquals("NotATriangle", Triangle.classifyTriangle(1, 2, 10));
    }

    @Test
    public void testRightTriangle() {
        assertEquals("RightTriangle", Triangle.classifyTriangle(3, 4, 5));
    }
}