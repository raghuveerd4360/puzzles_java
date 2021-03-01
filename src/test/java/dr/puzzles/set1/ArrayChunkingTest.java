package dr.puzzles.set1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

public class ArrayChunkingTest {
    @Test
    public void testGetChunks() {
        ArrayChunking chunking = new ArrayChunking();
        int[] input1 = {1, 2, 3, 4, 5, 6};
        List<Integer[]> chunks = chunking.getChunksUsingList(input1, 4);
        Assertions.assertEquals(2, chunks.size());
        Assertions.assertEquals(4, chunks.get(0).length);
        Assertions.assertEquals(2, chunks.get(1).length);
    }

    @Test
    public void testGetChunksUsingArrays() {
        ArrayChunking chunking = new ArrayChunking();
        int[] input1 = {1, 2, 3, 4, 5, 6};
        int[][] chunks1 = chunking.getChunksUsingArrays(input1, 4);
        Assertions.assertEquals(2, chunks1.length);
        Assertions.assertEquals(4, chunks1[0].length);
        Assertions.assertEquals(2, chunks1[1].length);

        int[] input2 = {1, 2, 3, 4, 5, 6};
        int[][] chunks2 = chunking.getChunksUsingArrays(input2, 3);
        Assertions.assertEquals(2, chunks2.length);
        Assertions.assertEquals(3, chunks2[0].length);
        Assertions.assertEquals(3, chunks2[1].length);

        int[] input3 = {1, 2, 3, 4, 5, 6, 7};
        int[][] chunks3 = chunking.getChunksUsingArrays(input3, 3);
        Assertions.assertEquals(3, chunks3.length);
        Assertions.assertEquals(3, chunks3[0].length);
        Assertions.assertEquals(3, chunks3[1].length);
        Assertions.assertEquals(1, chunks3[2].length);
    }
}
