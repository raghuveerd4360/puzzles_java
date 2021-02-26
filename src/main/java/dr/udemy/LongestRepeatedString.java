package dr.udemy;

public class LongestRepeatedString {

    public char get(String input) {

        int curCount = 1;
        int maxCount = 1;

        char cur = input.charAt(0);
        char largest = cur;

        for (int i = 1; i < input.length(); i++) {

            if (input.charAt(i) == cur) {
                curCount++;
                if (curCount > maxCount) {
                    maxCount = curCount;
                    largest = cur;
                }
            } else {
                curCount = 1;
            }
            cur = input.charAt(i);
        }
        return largest;
    }
}
