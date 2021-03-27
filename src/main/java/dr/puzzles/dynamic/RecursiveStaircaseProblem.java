package dr.puzzles.dynamic;

public class RecursiveStaircaseProblem {

    public static int method1(int steps) {
        //System.out.println("s->" + steps);
        if (steps <= 1)
            return 1;
        return method1(steps - 2) + method1(steps - 1);
    }

    public static int method2(int steps) {
        int first = 1, second = 1, sum = 0;

        for (int i = 2; i <= steps; i++) {
            sum = first + second;
            first = second;
            second = sum;
        }

        return sum;
    }
}
