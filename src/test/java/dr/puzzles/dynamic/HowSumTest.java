package dr.puzzles.dynamic;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class HowSumTest {
    @Test
    public void testHowSum() {
        HowSum sum = new HowSum();
        List<Integer> sums1 = sum.findSums(7, new int[]{5, 3, 4, 7});
        List<Integer> sums2 = sum.findSums(7, new int[]{7, 5, 3});
        List<Integer> sums3 = sum.findSums(8, new int[]{4, 3, 4, 7});
        System.out.println("Done");
    }


    @Test
    public void testHowSum2() {
        HowSum sum = new HowSum();
        List<Integer> sums1 = sum.findSums(7, new int[]{5, 3, 4, 7});

        System.out.println("Done");
    }
}