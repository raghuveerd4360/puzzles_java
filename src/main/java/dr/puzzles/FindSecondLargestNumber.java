package dr.puzzles;

public class FindSecondLargestNumber {

    public int findSecondLargestNumber(int[] input) {

        int largest = 0;
        int secondLargest = 0;
        for (int i = 0; i < input.length; i++) {
            if (input[i] > largest) {
                secondLargest = largest;
                largest = input[i];
            }
        }

        return secondLargest;

    }
}
