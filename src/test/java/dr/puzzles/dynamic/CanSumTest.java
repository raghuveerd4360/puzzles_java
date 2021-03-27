package dr.puzzles.dynamic;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CanSumTest {

    @Test
    public void testMethod1() {
        Assertions.assertTrue(CanSum.method1(7, new int[]{2, 3}));
        Assertions.assertTrue(CanSum.method1(7, new int[]{5, 3, 4, 7}));
        Assertions.assertFalse(CanSum.method1(7, new int[]{2, 4}));
        Assertions.assertTrue(CanSum.method1(8, new int[]{2, 3, 4}));
    }

}