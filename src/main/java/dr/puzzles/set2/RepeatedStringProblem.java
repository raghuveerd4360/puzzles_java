package dr.puzzles.set2;

//https://www.hackerrank.com/challenges/repeated-string/problem

public class RepeatedStringProblem {

    public long getNumA(String s, long n) {

        long remainder = n % s.length();
        long numInputs = n / s.length();

        int singleCount = getCount(s);

        if (remainder == 0) {
            return singleCount * numInputs;
        } else {
            long temp = singleCount * numInputs;
            long subCount = getSubStringCount(s, remainder);
            return temp + subCount;
        }
    }

    private int getCount(String input) {
        int i = 0;
        for (char s : input.toCharArray()) {
            if (s == 'a') {
                i++;
            }
        }
        return i;
    }

    private int getSubStringCount(String input, long numChars) {
        String subInput = input.substring(0, (int) numChars);
        return getCount(subInput);
    }
}
