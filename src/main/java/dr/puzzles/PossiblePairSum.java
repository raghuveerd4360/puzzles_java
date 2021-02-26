package dr.puzzles;

import java.util.*;

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

    public List<int[]> sortingAndClosingWithNoDuplicates(int[] input, int sum) {
        List<int[]> output = new ArrayList<>();
        Arrays.sort(input);
        int end = input.length - 1;
        int start = 0;

        while (start < end) {
            if (input[start] + input[end] == sum) {
                int[] res = {input[start], input[end]};
                output.add(res);
                start++;
                continue;
            }

            if (input[start] < input[end]) {
                end--;
            } else {
                start++;
            }
        }
        return output;
    }


    public List<int[]> findPairsUsingSet(int[] input, int sum) {
        List<int[]> output = new ArrayList<>();
        Set<Integer> temp = new HashSet<>();

        for (int cur : input) {
            int neededInt = sum-cur;
            if(temp.contains(neededInt)) {
                int[] res = {cur, neededInt};
                output.add(res);
            } else {
                temp.add(cur);
            }
        }

        return output;
    }


}
