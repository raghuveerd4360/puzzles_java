package dr.udemy;

import java.util.Arrays;

public class StringReversal {

    public String reverseUsingArray(String input) {

        char[] chars = input.toCharArray();
        StringBuilder out = new StringBuilder();

        for (int i = chars.length - 1; i >= 0; i--) {
            out.append(chars[i]);
        }

        return out.toString();
    }

    public String reverseWithoutUsingArray(String input) {

        StringBuilder out = new StringBuilder();
        int length = input.length() - 1;

        for (int i = length; i >= 0; i--) {
            out.append(input.charAt(i));
        }
        return out.toString();
    }

    public String reverseWithHalfLoop(String input) {

        char[] chars = input.toCharArray();
        int length = chars.length;
        int half = length / 2;

        for (int i = 0; i < half; i++) {
            char temp = chars[i];
            chars[i] = chars[length - 1 - i];
            chars[length - 1 - i] = temp;
        }

        return new String(chars);
    }
}
