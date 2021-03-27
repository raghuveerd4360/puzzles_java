package dr.puzzles.dynamic;

import java.util.HashMap;
import java.util.Map;

public class Fibonacci {

    private static final Map<Integer, Integer> memo = new HashMap<>();

    public static int viaRecursion(int num) {

        if (memo.containsKey(num)) {
            return memo.get(num);
        } else {
            //System.out.println("->" + num);
            if (num < 2) {
                memo.put(num, num);
                return num;
            }
            int temp = viaRecursion(num - 1) + viaRecursion(num - 2);
            memo.put(num, temp);
            return temp;
        }
    }

    public static int viaLoop(int num) {

        if (num < 2)
            return num;

        int[] cache = new int[num + 1];
        cache[0] = 0;
        cache[1] = 1;

        for (int i = 2; i <= num; i++) {
            cache[i] = cache[i - 1] + cache[i - 2];
        }

        return cache[num];
    }

    public static int noLoop(int num) {

        if (num < 2)
            return num;

        int first = 0, second = 1, sum = 0;

        for (int i = 2; i <= num; i++) {
            sum = first + second;
            first = second;
            second = sum;
        }
        return sum;
    }
}
