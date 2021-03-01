package dr.puzzles.set1;

import java.util.ArrayList;
import java.util.List;

public class ArrayChunking {

    public List<Integer[]> getChunksUsingList(int[] input, int chunkSize) {

        int length = input.length;
        int remainder = input.length % chunkSize;

        if (remainder > 0) {
            length = length - remainder;
        }

        List<Integer[]> out = new ArrayList<>();

        Integer[] temp = new Integer[0];
        int tempChunkSize = chunkSize;

        for (int i = 0; i < length; i++) {
            if (tempChunkSize == chunkSize) {
                tempChunkSize = 0;
                temp = new Integer[chunkSize];
                out.add(temp);
            }
            temp[tempChunkSize] = input[i];
            tempChunkSize++;
        }

        if (remainder > 0) {
            temp = new Integer[remainder];
            int start = (input.length / chunkSize) * chunkSize;
            for (int i = 0; i < remainder; i++) {
                temp[i] = input[start + i];
            }
            out.add(temp);
        }
        return out;
    }


    public int[][] getChunksUsingArrays(int[] input, int chunkSize) {

        int length = input.length;
        int remainder = input.length % chunkSize;
        int numChunks = input.length / chunkSize;

        if (remainder > 0) {
            numChunks++;
            length = length - remainder;
        }

        int[][] out = new int[numChunks][];

        int tempChunkSize = chunkSize;
        int[] temp = new int[0];

        int curChunk = 0;

        for (int i = 0; i < length; i++) {
            if (tempChunkSize == chunkSize) {
                tempChunkSize = 0;
                temp = new int[chunkSize];
                out[curChunk] = temp;
                curChunk++;
            }
            temp[tempChunkSize] = input[i];
            tempChunkSize++;
        }
        if (remainder > 0) {
            temp = new int[remainder];
            int start = (input.length / chunkSize) * chunkSize;
            System.arraycopy(input, start, temp, 0, remainder);
            out[curChunk] = temp;
        }
        return out;
    }
}
