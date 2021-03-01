package dr.puzzles.set1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ReverseIntegerTest {

    @Test
    public void simpleReverseTest() {
        ReverseInteger reverseInteger = new ReverseInteger();
        int i1 = reverseInteger.simpleReverse(123);
        int i2 = reverseInteger.simpleReverse(15);
        int i3 = reverseInteger.simpleReverse(981);
        int i4 = reverseInteger.simpleReverse(-34);
        int i5 = reverseInteger.simpleReverse(-9);
        Assertions.assertEquals(321, i1);
        Assertions.assertEquals(51, i2);
        Assertions.assertEquals(189, i3);
        Assertions.assertEquals(-43, i4);
        Assertions.assertEquals(-9, i5);
    }
}
