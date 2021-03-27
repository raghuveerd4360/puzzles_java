package dr.puzzles.dynamic;

import java.util.HashMap;
import java.util.Map;

public class GridTraveller {

    private static Map<String, Long> cache1 = new HashMap<>();
    private static Map<String, Long> cache2 = new HashMap<>();

    public static long method1(int m, int n) {
        if (m == 0 || n == 0) {
            return 0;
        }
        if (m == 1 && n == 1) {
            return 1;
        }
        return method1(m - 1, n) + method1(m, n - 1);
    }


    public static long method2(int m, int n) {
        if (m == 0 || n == 0) {
            return 0;
        }
        if (m == 1 && n == 1) {
            return 1;
        }
        long lessM;
        long lessN;
        if (cache1.get((m - 1) + "_" + n) != null) {
            lessM = cache1.get((m - 1) + "_" + n);
        } else {
            lessM = method2(m - 1, n);
            cache1.put((m - 1) + "_" + n, lessM);
        }
        if (cache1.get(m + "_" + (n - 1)) != null) {
            lessN = cache1.get(m + "_" + (n - 1));
        } else {
            lessN = method2(m, n - 1);
        }
        return lessM + lessN;
    }


    public static long method3(int m, int n) {
        if (m == 0 || n == 0) {
            return 0;
        }
        if (m == 1 && n == 1) {
            return 1;
        }
        String key = m + "_" + n;
        if (cache2.get(key) != null) {
            return cache2.get(key);
        } else {
            long temp = method1(m - 1, n) + method1(m, n - 1);
            cache2.put(key, temp);
            return temp;
        }
    }
}
