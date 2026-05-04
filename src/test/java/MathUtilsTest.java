;import static org.junit.jupiter.api.Assertions.*;

import org.example.MathUtils;
import org.junit.jupiter.api.Test;

public class MathUtilsTest {
    MathUtils math = new MathUtils();

    @Test
    void testAdd() {
        assertEquals(5, math.add(2, 3));
    }

    @Test
    void testDivide() {
        assertEquals(2, math.divide(10, 5));
        assertThrows(IllegalArgumentException.class, () -> math.divide(10, 0));
    }
}