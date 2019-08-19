import java.math.BigInteger;

import static java.math.BigInteger.*;

/**
 * The class calculates N-th Fibonacci number by N number
 *
 * @author Lechenko Daria
 */
public class Fibonacci {
    /**
     * The constant stores minimum legal value for argument
     */
    public static final int MIN_LEGAL_ARGUMENT = 0;

    /**
     * The method calculates N-th number Fibonacci by raises the matrix to the power
     * source: https://en.wikipedia.org/wiki/Fibonacci_number
     *
     * @param n N number
     * @return N-th number fibonacci
     * @throws IllegalArgumentException If number argument less then minimum legal argument
     */
    public static BigInteger fibonacci(BigInteger n) throws IllegalArgumentException {
        if (n.compareTo(ZERO) < 0) {
            throw new IllegalArgumentException("Expected: from " + MIN_LEGAL_ARGUMENT + "\r\n" + "Got: " + n);
        }

        BigInteger fibonacciNumber;

        if (n.compareTo(ZERO) == 0) {
            fibonacciNumber = ZERO;
        } else if (n.compareTo(ONE) == 0) {
            fibonacciNumber = ONE;
        } else {
            BigInteger[][] Q = {{ONE, ONE},
                    {ONE, ZERO}};
            BigInteger[][] p = powMatrix(Q, n);
            fibonacciNumber = p[0][1];
        }

        return fibonacciNumber;
    }

    /**
     * The method multiplications of two matrices
     *
     * @param first  First matrix
     * @param second Second matrix
     * @return The matrix
     */
    private static BigInteger[][] multipleMatrix(BigInteger[][] first, BigInteger[][] second) {
        return new BigInteger[][]{{first[0][0].multiply(second[0][0]).add(first[0][1].multiply(second[1][0])), first[0][0].multiply(second[0][1]).add(first[0][1].multiply(second[1][1]))},
                {first[1][0].multiply(second[0][0]).add(first[1][1].multiply(second[1][0])), first[1][0].multiply(second[0][1]).add(first[1][1].multiply(second[1][1]))}};
    }

    /**
     * The method raises the matrix to the power
     *
     * @param a The matrix
     * @param n The power
     * @return The power matrix
     */
    private static BigInteger[][] powMatrix(BigInteger[][] a, BigInteger n) {
        BigInteger[][] pow;

        if (n.compareTo(ZERO) == 0) {
            pow = new BigInteger[][]{{ONE, ZERO}, {ZERO, ONE}};
        } else if (n.mod(valueOf(2)).compareTo(ZERO) == 0) {
            pow = powMatrix(multipleMatrix(a, a), n.divide(valueOf(2)));
        } else {
            pow = multipleMatrix(a, powMatrix(a, n.subtract(ONE)));
        }

        return pow;
    }

}
