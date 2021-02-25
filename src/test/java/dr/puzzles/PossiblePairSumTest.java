package dr.puzzles;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

public class PossiblePairSumTest {

    @Test
    public void testBruteForcePossiblePair() {
        PossiblePairSum possiblePairSum = new PossiblePairSum();
        int[] input = {5, 3, 4, 1, 2};
        List<int[]> output = possiblePairSum.bruteForcePossiblePair(input, 6);
        Assertions.assertEquals(3, output.size());

        List<int[]> output2 = possiblePairSum.bruteForcePossiblePair(input, 5);
        Assertions.assertEquals(4, output2.size());
    }

    @Test
    public void testBruteForcePossiblePairNoDuplicates() {
        PossiblePairSum possiblePairSum = new PossiblePairSum();
        int[] input = {5, 3, 4, 1, 2, 6};
        List<int[]> output = possiblePairSum.bruteForcePossiblePairWithNoDuplicates(input, 6);
        Assertions.assertEquals(2, output.size());

        List<int[]> output2 = possiblePairSum.bruteForcePossiblePairWithNoDuplicates(input, 5);
        Assertions.assertEquals(2, output2.size());

        int[] input2 = {1, 2, 3, 4, 5};
        List<int[]> output3 = possiblePairSum.bruteForcePossiblePairWithNoDuplicates(input2, 5);
        Assertions.assertEquals(2, output3.size());

        int[] input3 = {5, 4, 3, 2, 1};
        List<int[]> output4 = possiblePairSum.bruteForcePossiblePairWithNoDuplicates(input3, 5);
        Assertions.assertEquals(2, output4.size());
    }


    @Test
    public void testSortingAndClosingWithNoDuplicates() {
        PossiblePairSum possiblePairSum = new PossiblePairSum();
        int[] input = {5, 3, 4, 1, 2};
        List<int[]> output = possiblePairSum.sortingAndClosingWithNoDuplicates(input, 6);
        Assertions.assertEquals(2, output.size());

        List<int[]> output2 = possiblePairSum.sortingAndClosingWithNoDuplicates(input, 5);
        Assertions.assertEquals(2, output2.size());

        int[] input2 = {1, 2, 3, 4, 5};
        List<int[]> output3 = possiblePairSum.sortingAndClosingWithNoDuplicates(input2, 5);
        Assertions.assertEquals(2, output3.size());

        int[] input3 = {5, 4, 3, 2, 1};
        List<int[]> output4 = possiblePairSum.sortingAndClosingWithNoDuplicates(input3, 5);
        Assertions.assertEquals(2, output4.size());
    }
}
