package dr.puzzles.recursion;

import org.junit.jupiter.api.Test;

public class RecursionTest {

    @Test
    public void testFactorial() {
        Factorial factorial = new Factorial();
        System.out.println(factorial.getFactorial(5));
    }
}
