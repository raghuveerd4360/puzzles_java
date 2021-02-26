package dr.udemy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LongestRepeatedStringTest {

    @Test
    public void testGet() {
        LongestRepeatedString longestRepeatedString = new LongestRepeatedString();
        char ret1 = longestRepeatedString.get("abbbaac");
        Assertions.assertEquals('b', ret1);

        char ret2 = longestRepeatedString.get("raghuveer");
        Assertions.assertEquals('e', ret2);

        char ret3 = longestRepeatedString.get("aaaaabccccddddddda");
        Assertions.assertEquals('d', ret3);
    }
}
