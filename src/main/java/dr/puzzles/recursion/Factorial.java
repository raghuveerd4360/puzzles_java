package dr.puzzles.recursion;

public class Factorial {

    public int getFactorial(int n) {
        if (n == 1) {
            return n;
        }
        return n * getFactorial(n - 1);
    }
}
