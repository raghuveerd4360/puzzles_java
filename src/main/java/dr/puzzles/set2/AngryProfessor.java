package dr.puzzles.set2;

public class AngryProfessor {

    public static String angryProfessor(int k, int[] a) {
        int numLate = 0;
        for (int time : a) {
            if (time > 0) {
                numLate++;
                if (numLate > a.length - k) {
                    return "YES";
                }
            }
        }
        return "NO";
    }
}
