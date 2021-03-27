package dr.puzzles.dynamic;

public class CanSum {

    public static boolean method1(int sum, int[] num) {

        if (sum == 0) {
            return true;
        }

        if (sum < 0) {
            return false;
        }

        for (int n : num) {
            int remainder = sum - n;
            if(method1(remainder, num)) {
                return true;
            }
        }

        return false;
    }
}
