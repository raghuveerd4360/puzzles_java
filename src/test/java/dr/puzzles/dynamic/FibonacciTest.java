package dr.puzzles.dynamic;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FibonacciTest {

    @Test
    public void testRecursion() {
        System.out.println(Fibonacci.viaRecursion(7));
    }

    @Test
    public void testLoop() {
        System.out.println(Fibonacci.viaLoop(7));
    }

    @Test void testAll() {
        Assertions.assertEquals(13, Fibonacci.viaRecursion(7));
        Assertions.assertEquals(13, Fibonacci.viaLoop(7));
        Assertions.assertEquals(13, Fibonacci.noLoop(7));


        Assertions.assertEquals(0, Fibonacci.viaRecursion(0));
        Assertions.assertEquals(0, Fibonacci.viaLoop(0));
        Assertions.assertEquals(0, Fibonacci.noLoop(0));

        Assertions.assertEquals(1, Fibonacci.viaRecursion(1));
        Assertions.assertEquals(1, Fibonacci.viaLoop(1));
        Assertions.assertEquals(1, Fibonacci.noLoop(1));
    }
}