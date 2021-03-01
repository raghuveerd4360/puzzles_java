package dr.puzzles.set2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

//https://www.hackerrank.com/challenges/angry-professor/problem

public class AngryProfessorTest {

    @Test
    public void testAngryProfessor() {
        int[] t1 = {-1, -3, 4, 2};
        int[] t2 = {0, -1, 2, 1};
        String s1 = AngryProfessor.angryProfessor(3, t1);
        String s2 = AngryProfessor.angryProfessor(2, t2);

        Assertions.assertEquals("YES", s1);
        Assertions.assertEquals("NO", s2);


        int[] t3 = {26, 94, -95, 34 ,67, -97, 17, 52, 1, 86};
        String s3 = AngryProfessor.angryProfessor(7, t3);
        Assertions.assertEquals("YES", s3);
    }
}
