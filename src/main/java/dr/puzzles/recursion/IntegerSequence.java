package dr.puzzles.recursion;

public class IntegerSequence {
    //head recursion
    public static void seq1(int num) {
        if(num==0)
            return;
        seq1(num-1);
        System.out.println(num);
    }

    //tail recursion
    public static void seq2(int num) {
        if(num==0)
            return;
        System.out.println(num);
        seq2(num-1);

    }
}
