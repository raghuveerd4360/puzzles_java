package dr.puzzles.dynamic;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HouseRobberTest {

    @Test
    public void testMethod1() {
        int i1 = HouseRobber.amount1(new int[]{5, 3, 4, 11, 2});
        System.out.println(i1);

        int i2 = HouseRobber.amount1(new int[]{1, 2, 3, 1});
        System.out.println(i2);

        int i3 = HouseRobber.amount1(new int[]{2, 7, 9, 3, 1});
        System.out.println(i3);
    }

}