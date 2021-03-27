package dr.puzzles.dynamic;

import java.util.ArrayList;
import java.util.List;

public class HowSum {

    private List<List<Integer>> combinations = new ArrayList<>();
    //private List<Integer> tempCombination = new ArrayList<>();

    public List<Integer> findSums(int target, int[] values) {
        if (target == 0) {
            return new ArrayList<>();
        }
        if (target < 0) {
            return null;
        }

        for (int value : values) {
            int remainder = target - value;
            List<Integer> sums = findSums(remainder, values);
            if (sums != null) {
                sums.add(value);
                combinations.add(sums);
                return sums;
            }
        }
        return null;
    }
}
