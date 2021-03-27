package dr.puzzles.dynamic;

public class HouseRobber {

    public static int amount1(int[] money) {
        int max = 0;
        for (int i = 0; i < money.length; i++) {
            int r1 = rob1(money, i);
            if (r1 > max) {
                max = r1;
            }
        }
        return max;
    }

    private static int rob1(int[] money, int i) {
        if (i < 0)
            return 0;
        int i_robbed = rob1(money, i - 2) + money[i];
        int i_not_robbed = rob1(money, i - 1);
        return Math.max(i_robbed, i_not_robbed);
    }
}
