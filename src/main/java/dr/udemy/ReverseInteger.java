package dr.udemy;

public class ReverseInteger {
    public int simpleReverse(int input) {
        int reverse = 0;
        while (input != 0) {
            int temp = input % 10;
            reverse = temp + (reverse * 10);
            input = input / 10;
        }
        return reverse;
    }
}
