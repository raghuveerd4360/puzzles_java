package dr.puzzles.set2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class UtopianTreeTest {

    @Test
    public void testGetHeight() {
        UtopianTree tree = new UtopianTree();
        int height1 = tree.getHeight(0);
        int height2 = tree.getHeight(1);
        int height3 = tree.getHeight(2);
        int height4 = tree.getHeight(3);

        Assertions.assertEquals(1, height1);
        Assertions.assertEquals(2, height2);
        Assertions.assertEquals(3, height3);
        Assertions.assertEquals(6, height4);
    }

    @Test
    public void testGetHeightUsingPow() {
        UtopianTree tree = new UtopianTree();

        int height3 = tree.getHeightUsingPow(6);
        int height4 = tree.getHeightUsingPow(5);
        int height5 = tree.getHeightUsingPow(4);


        Assertions.assertEquals(15, height3);
        Assertions.assertEquals(14, height4);
        Assertions.assertEquals(7, height5);
    }
}
