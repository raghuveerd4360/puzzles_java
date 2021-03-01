package dr.puzzles.set1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PalindromeTest {

    @Test
    public void testSimpleTest(){
        Palindrome palindrome = new Palindrome();
        boolean out1 = palindrome.simpleTest("ABCD");
        boolean out2 = palindrome.simpleTest("AA");
        boolean out3 = palindrome.simpleTest("ABABA");
        boolean out4 = palindrome.simpleTest("DABABAD");
        Assertions.assertFalse(out1);
        Assertions.assertTrue(out2);
        Assertions.assertTrue(out3);
        Assertions.assertTrue(out4);
    }


    @Test
    public void testSimpleTest2(){
        Palindrome palindrome = new Palindrome();
        boolean out1 = palindrome.simpleTest2("ABCD");
        boolean out2 = palindrome.simpleTest2("AA");
        boolean out3 = palindrome.simpleTest2("ABABA");
        boolean out4 = palindrome.simpleTest2("DABABAD");
        Assertions.assertFalse(out1);
        Assertions.assertTrue(out2);
        Assertions.assertTrue(out3);
        Assertions.assertTrue(out4);
    }
}
