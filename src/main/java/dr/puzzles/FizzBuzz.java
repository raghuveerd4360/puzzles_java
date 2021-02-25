package dr.puzzles;

/**
 * Accepts an integer  and prints Fizz, Buzz or FizBuzz of numbers
 * from 1 to given integer.
 * Fizz if only divisible by 3
 * Buzz if only divisible by 5
 * FizzBuzz if divisible by both 3 and 5
 */
public class FizzBuzz {

    public static final String FIZZ = " Fizz ";
    public static final String BUZZ = " Buzz ";
    public static final String FIZZBUZZ = " FizzBuzz ";


    public String getFizzBuzz(int max) {
        StringBuilder output = new StringBuilder();

        if (max < 3) {
            System.out.println(output.toString());
            return output.toString();
        }

        int divBy3;
        int divBy5;

        for (int i = 3; i <= max; i++) {
            divBy3 = i % 3;
            divBy5 = i % 5;

            if (divBy3 == 0 && divBy5 == 0) {
                output.append(FIZZBUZZ);
            } else if (divBy3 == 0) {
                output.append(FIZZ);
            } else if (divBy5 == 0) {
                output.append(BUZZ);
            }
        }

        System.out.println(output.toString());

        return output.toString();
    }
}
