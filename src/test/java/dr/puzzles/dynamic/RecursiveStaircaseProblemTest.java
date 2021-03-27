package dr.puzzles.dynamic;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


class RecursiveStaircaseProblemTest {

    @Test
    public void testRecursiveStaircaseProblemTest() {

        Assertions.assertEquals(5, RecursiveStaircaseProblem.method1(4));
        Assertions.assertEquals(5, RecursiveStaircaseProblem.method2(4));

        Assertions.assertEquals(13, RecursiveStaircaseProblem.method1(6));
        Assertions.assertEquals(13, RecursiveStaircaseProblem.method2(6));

        Assertions.assertEquals(21, RecursiveStaircaseProblem.method1(7));
        Assertions.assertEquals(21, RecursiveStaircaseProblem.method2(7));
    }


    @Test
    public void testRecursiveStaircaseProblemTest2() {
        Assertions.assertEquals(21, RecursiveStaircaseProblem.method2(7));
    }

}