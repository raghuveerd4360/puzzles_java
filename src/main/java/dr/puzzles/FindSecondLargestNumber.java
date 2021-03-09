package dr.puzzles;

public class FindSecondLargestNumber {

    public int findSecondLargestNumber(int[] input) {

        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int j : input) {
            if (j > largest) {
                secondLargest = largest;
                largest = j;
            } else if (j > secondLargest) {
                secondLargest = j;
            }
        }
        return secondLargest;
    }
}
