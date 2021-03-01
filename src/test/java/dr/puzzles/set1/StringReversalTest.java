package dr.puzzles.set1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StringReversalTest {

    @Test
    public void testReverseUsingArray() {
        StringReversal reversal = new StringReversal();
        String out1 = reversal.reverseUsingArray("RAGHUVEER");
        Assertions.assertEquals("REEVUHGAR", out1);
    }

    @Test
    public void testReverseWithoutUsingArray() {
        StringReversal reversal = new StringReversal();
        String out1 = reversal.reverseWithoutUsingArray("ABCD");
        Assertions.assertEquals("DCBA", out1);
    }

    @Test
    public void testReverseWithHalfLoop() {
        StringReversal reversal = new StringReversal();
        String out1 = reversal.reverseWithHalfLoop("ABCD");
        String out2 = reversal.reverseWithHalfLoop("ABCDE");

        Assertions.assertEquals("DCBA", out1);
        Assertions.assertEquals("EDCBA", out2);
    }
}
