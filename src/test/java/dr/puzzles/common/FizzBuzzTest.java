package dr.puzzles.common;

import dr.puzzles.common.FizzBuzz;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static dr.puzzles.common.FizzBuzz.BUZZ;
import static dr.puzzles.common.FizzBuzz.FIZZ;

public class FizzBuzzTest {

    @Test
    public void testGetFizzBuzz() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        String out1 = fizzBuzz.getFizzBuzz(2);
        Assertions.assertEquals("", out1);

        String out2 = fizzBuzz.getFizzBuzz(5);
        Assertions.assertEquals(FIZZ + BUZZ, out2);

        String out3 = fizzBuzz.getFizzBuzz(4);
        Assertions.assertEquals(FIZZ, out3);

    }
}
