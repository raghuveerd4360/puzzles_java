package dr.puzzles.set2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

public class CompareTheTripletsTest {
    @Test
    public void testCompareTriplets() {
        List<Integer> a1 = Arrays.asList(5, 6, 7);
        List<Integer> b1 = Arrays.asList(3, 6, 10);
        List<Integer> ret1 = CompareTheTriplets.compareTriplets(a1, b1);
        Assertions.assertEquals(1, ret1.get(0));
        Assertions.assertEquals(1, ret1.get(1));


        List<Integer> a2 = Arrays.asList(17, 28, 30);
        List<Integer> b2 = Arrays.asList(99, 16 ,8);
        List<Integer> ret2 = CompareTheTriplets.compareTriplets(a2, b2);
        Assertions.assertEquals(2, ret2.get(0));
        Assertions.assertEquals(1, ret2.get(1));
    }
}
