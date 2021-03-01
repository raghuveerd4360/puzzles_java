package dr.puzzles.set1;

public class Palindrome {

    public boolean simpleTest(String input) {
        int length = input.length();
        int half = length / 2;

        for (int i = 0; i < half; i++) {
            if (input.charAt(i) != input.charAt(length - 1 - i))
                return false;
        }
        return true;
    }

    public boolean simpleTest2(String input) {

        int length = input.length();
        int i = 0;

        while (i < length) {
            if (input.charAt(i) != input.charAt(length - 1)) {
                return false;
            } else {
                i++;
                length--;
            }
        }
        return true;
    }
}
