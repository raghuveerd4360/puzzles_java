package dr.puzzles;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FindSecondLargestNumberTest {

    @Test
    public void testLargest() {
        FindSecondLargestNumber findSecondLargestNumber = new FindSecondLargestNumber();
        int[] input1 = {2, 4, 5, 7};
        int output1 = findSecondLargestNumber.findSecondLargestNumber(input1);
        Assertions.assertEquals(5, output1);

        int[] input2 = {4, 2, 9, 1};
        int output2 = findSecondLargestNumber.findSecondLargestNumber(input2);
        Assertions.assertEquals(4, output2);


        int[] input3 = {1, 23, 5, 6, 6};
        int output3 = findSecondLargestNumber.findSecondLargestNumber(input3);
        Assertions.assertEquals(6, output3);

        int[] input4 = {-1, -23, -5, -6, -6};
        int output4 = findSecondLargestNumber.findSecondLargestNumber(input4);
        Assertions.assertEquals(-5, output4);
    }
}
