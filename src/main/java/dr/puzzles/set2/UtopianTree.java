package dr.puzzles.set2;

//https://www.hackerrank.com/challenges/utopian-tree/problem

public class UtopianTree {
    public int getHeight(int n) {
        int height = 1;

        if (n == 0)
            return 1;
        if (n == 1)
            return 2;

        height = 2;

        for (int i = 2; i <= n; i++) {
            if (i % 2 == 0) {
                height = height + 1;
            } else {
                height = height * 2;
            }
        }

        return height;
    }


    public int getHeightUsingPow(int n) {
        if (n == 0)
            return 1;
        if (n == 1)
            return 2;

        int numYears = n / 2;
        int remainder = n % 2;

        if (remainder == 0) {
            return (int) Math.pow(2, numYears + 1) - 1;
        } else {
            return ((int) Math.pow(2, numYears + 1) - 1) * 2;
        }
    }
}
