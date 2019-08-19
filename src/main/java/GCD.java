import static java.lang.Integer.*;

/**
 * The class calculates the greatest common divisor of four arguments
 *
 * @author Levchenko Daria
 */
public class GCD {
    /**
     * The constant stores maximum legal value for argument
     */
    public static final int MAX_LEGAL_ARGUMENT = MAX_VALUE;

    /**
     * The constant keeps minimum legal value for argument
     */
    public static final int MIN_LEGAL_ARGUMENT = MIN_VALUE + 1;

    /**
     * The method calculates the greatest common divisor of four numbers by Euclid algorithm
     *
     * @param x First number
     * @param y Second number
     * @param i Third number
     * @param j Fourth number
     * @return The greatest common divisor of four numbers
     */
    public static int gcd(int x, int y, int i, int j) {
        checkData(x);
        checkData(y);
        checkData(i);
        checkData(j);

        int gcd;

        if (x == 0 && y == 0 && i == 0 && j == 0) {
            gcd = 1;
        } else {
            gcd = gcd(gcd(x, y), gcd(i, j));
        }

        return gcd;
    }

    /**
     * The method calculates greatest common divisor of two numbers by Euclid algorithm
     *
     * @param x First numbers
     * @param y Second numbers
     * @return The number greatest common divisor of two numbers
     */
    private static int gcd(int x, int y) {
        checkData(x);
        checkData(y);
        if (x < 0) {
            x = Math.abs(x);
        }
        if (y < 0) {
            y = Math.abs(y);
        }

        int gcd;
        if (x == 0) {
            gcd = y;
        } else if (y == 0) {
            gcd = x;
        } else {
            int mod = x % y;

            while (mod != 0) {
                x = y;
                y = mod;
                mod = x % y;
            }

            gcd = y;
        }
        return gcd;
    }

    /**
     * The method checks data
     *
     * @param input The number which needs to check
     */
    public static void checkData(int input) throws IllegalArgumentException {
        if (input < MIN_LEGAL_ARGUMENT) {
            throw new IllegalArgumentException("Expected: from " + MIN_LEGAL_ARGUMENT +
                    " to " + MAX_LEGAL_ARGUMENT + "\r\n" +
                    "Got: " + input);
        }
    }
}