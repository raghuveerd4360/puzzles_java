package dr.puzzles.set3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MagicSquareTest {

    @Test
    public void testMagicSquare() {
        int[][] input1 = {{4, 8, 2}, {4, 5, 7}, {6, 1, 6}};
        int i = MagicSquare.formingMagicSquare(input1);
    }
}