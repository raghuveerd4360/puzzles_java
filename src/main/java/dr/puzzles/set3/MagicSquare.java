package dr.puzzles.set3;

//https://www.hackerrank.com/challenges/magic-square-forming/problem

import java.util.*;

public class MagicSquare {
    static int formingMagicSquare(int[][] s) {

        Set<Integer> missingIntegers = getMissingIntegers(s);
        //sum vs occurrence
        Map<Integer, Integer> sums = new HashMap<>();

        for (int[] row : s) {
            int sum = Arrays.stream(row).sum();
            sums.merge(sum, 1, Integer::sum);
        }

        for (int i = 0; i < s.length; i++) {
            int temp = 0;
            for (int[] ints : s) {
                temp = temp + ints[i];
            }
            sums.merge(temp, 1, Integer::sum);
        }
        return 0;
    }

    private static Set<Integer> getMissingIntegers(int[][] s) {
        Set<Integer> uniqueNumber = new HashSet<>();
        for (int i = 0; i < s.length; i++) {
            for (int[] ints : s) {
                uniqueNumber.add(ints[i]);
            }
        }
        Set<Integer> missingNum = new HashSet<>();
        for (int i = 1; i <= 9; i++) {
            if (!uniqueNumber.contains(i))
                missingNum.add(i);
        }
        return missingNum;
    }
}
