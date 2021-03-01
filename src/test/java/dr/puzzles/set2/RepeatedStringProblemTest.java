package dr.puzzles.set2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RepeatedStringProblemTest {
    @Test
    public void getNumATest1() {
        RepeatedStringProblem repeatedStringProblem = new RepeatedStringProblem();
        String s1 = "abc";

        long out1 = repeatedStringProblem.getNumA(s1, 10);
        Assertions.assertEquals(4, out1);

    }

    @Test
    public void getNumATest2() {
        RepeatedStringProblem repeatedStringProblem = new RepeatedStringProblem();
        String s1 = "abc";

        long out1 = repeatedStringProblem.getNumA(s1, 3);
        Assertions.assertEquals(1, out1);

    }
}
