package dr.puzzles.set1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AnagramCheckTest {

    @Test
    public void testSimpleCheck() {
        AnagramCheck anagramCheck = new AnagramCheck();
        String s1 = "Rail Safety";
        String s2 = "Fairy Tales !!";
        boolean b1 = anagramCheck.simpleCheck(s1, s2);

        Assertions.assertTrue(b1);

        String s3 = "Rail Safety";
        String s4 = "Fairy Tale !!";
        boolean b2 = anagramCheck.simpleCheck(s3, s4);

        Assertions.assertFalse(b2);
    }
}
