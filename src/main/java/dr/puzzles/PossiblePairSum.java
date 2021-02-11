package dr.puzzles;

import java.util.ArrayList;
import java.util.List;

public class PossiblePairSum {

    public List<int[]> bruteForcePossiblePair(int[] input, int sum) {
        List<int[]> output = new ArrayList<>();

        for (int i = 0; i < input.length; i++) {
            for (int j = 1; j < input.length; j++) {
                if (input[i] + input[j] == sum && input[i] != input[j]) {
                    int[] result = {input[i], input[j]};
                    output.add(result);
                }
            }
        }
        return output;
    }


    public List<int[]> bruteForcePossiblePairWithNoDuplicates(int[] input, int sum) {
        List<int[]> output = new ArrayList<>();

        for (int i = 0; i < input.length; i++) {
            for (int j = i + 1; j < input.length; j++) {
                if (input[i] + input[j] == sum) {
                    int[] result = {input[i], input[j]};
                    output.add(result);
                }
            }
        }
        return output;
    }
}
