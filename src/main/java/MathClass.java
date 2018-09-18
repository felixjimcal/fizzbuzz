package main;

public class MathClass {

    public final static String WORD_FIZZ = "Fizz";
    public final static String WORD_BUZZ = "Buzz";
    public final static String WORD_FIZZBUZZ = "FizzBuzz";

    public boolean DivisibleBy(int number, int value) {
        boolean result = false;

        if (number % value == 0) {
            result = true;
        }

        return result;
    }

    public String CheckNumber(int number) {

        String result = "";

        if (DivisibleBy(number, 15))
        {
            result = WORD_FIZZBUZZ;
        } else if (DivisibleBy(number, 5))
        {
            result = WORD_BUZZ;
        }
        else if (DivisibleBy(number, 3))
        {
            result = WORD_FIZZ;
        }

        return result.isEmpty() ? Integer.toString(number) : result;

    }
}