package dr.puzzles.set2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BeautifulDaysAtMoviesTest {
    @Test
    public void testBeautifulDays() {
        int days1 = BeautifulDaysAtMovies.beautifulDays(20, 23, 6);
        Assertions.assertEquals(2, days1);
    }
}
