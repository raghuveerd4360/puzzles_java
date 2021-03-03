package dr.puzzles.set2;


//https://www.hackerrank.com/challenges/beautiful-days-at-the-movies/problem

public class BeautifulDaysAtMovies {
    public static int beautifulDays(int i, int j, int k) {
        int numDays = 0;
        for (int min = i; min <= j; min++) {
            int value = (min - simpleReverse(min)) % k;
            if (value == 0)
                numDays++;
        }

        return numDays;
    }

    private static int simpleReverse(int input) {
        int reverse = 0;
        while (input != 0) {
            int temp = input % 10;
            reverse = temp + (reverse * 10);
            input = input / 10;
        }
        return reverse;
    }
}
