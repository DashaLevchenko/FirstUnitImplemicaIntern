import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static java.lang.Integer.*;
import static org.junit.jupiter.api.Assertions.*;

class Task3GCDTest {
    private final int MAX_LEGAL_ARGUMENT = MAX_VALUE; //2147483647
    private final String ILLEGAL_ARGUMENT = "-2147483648";
    private final int MAX_MINUS = MAX_LEGAL_ARGUMENT - 1; //2147483646
    private final int MIN_LEGAL_ARGUMENT = MIN_VALUE + 1; //-2147483647
    private final int MIN_PLUS_PLUS = MIN_LEGAL_ARGUMENT + 1; //-2147483646


    @Test
    void GCDValid() {
//------Low valid border and between valid borders
        //----One of the arguments is 1
        combinationsValidGCD(0, 0, 0, 0, 1);
        combinationsValidGCD(1, 1, 1, 1, 1);
        combinationsValidGCD(1, 1, 1, -1, 1);
        combinationsValidGCD(1, 1, -1, -1, 1);
        combinationsValidGCD(1, -1, -1, -1, 1);
        combinationsValidGCD(0, 0, 0, 1, 1);
        combinationsValidGCD(0, 0, 1, 1, 1);
        combinationsValidGCD(0, 1, 1, 1, 1);
        combinationsValidGCD(-1, -1, -1, -1, 1);
        //----Random
        combinationsValidGCD(1, 20, 21, 40, 1);
        combinationsValidGCD(20, 1, 40, 21, 1);
        //----1 with: MAX_MINUS, MIN_PLUS_PLUS, MAX_LEGAL_ARGUMENT, MIN_LEGAL_ARGUMENT
        combinationsValidGCD(1, 1, 1, MAX_MINUS, 1);
        combinationsValidGCD(1, 1, MAX_MINUS, MAX_MINUS, 1);
        combinationsValidGCD(1, MAX_MINUS, MAX_MINUS, MAX_MINUS, 1);
        combinationsValidGCD(1, 1, 1, MIN_PLUS_PLUS, 1);
        combinationsValidGCD(1, 1, MIN_PLUS_PLUS, MIN_PLUS_PLUS, 1);
        combinationsValidGCD(1, MIN_PLUS_PLUS, MIN_PLUS_PLUS, MIN_PLUS_PLUS, 1);
        combinationsValidGCD(1, 1, 1, MAX_LEGAL_ARGUMENT, 1);
        combinationsValidGCD(1, 1, MAX_LEGAL_ARGUMENT, MAX_LEGAL_ARGUMENT, 1);
        combinationsValidGCD(1, MAX_LEGAL_ARGUMENT, MAX_LEGAL_ARGUMENT, MAX_LEGAL_ARGUMENT, 1);
        combinationsValidGCD(1, 1, 1, MIN_LEGAL_ARGUMENT, 1);
        combinationsValidGCD(1, 1, MIN_LEGAL_ARGUMENT, MIN_LEGAL_ARGUMENT, 1);
        combinationsValidGCD(1, MIN_LEGAL_ARGUMENT, MIN_LEGAL_ARGUMENT, MIN_LEGAL_ARGUMENT, 1);
        //------No Repeat Combinations
        combinationsValidGCD(-1, 0, 1, MAX_MINUS, 1);
        combinationsValidGCD(0, 1, MAX_MINUS, MAX_LEGAL_ARGUMENT, 1);
        combinationsValidGCD(1, MAX_MINUS, MAX_LEGAL_ARGUMENT, MIN_LEGAL_ARGUMENT, 1);

        //----One of the arguments is 0
        combinationsValidGCD(0, 0, 0, -1, 1);
        combinationsValidGCD(0, 0, -1, -1, 1);
        combinationsValidGCD(0, -1, -1, -1, 1);

        //----0 with: MAX_MINUS, MIN_PLUS_PLUS, MAX_LEGAL_ARGUMENT, MIN_LEGAL_ARGUMENT
        combinationsValidGCD(0, 0, 0, MAX_MINUS, MAX_MINUS);
        combinationsValidGCD(0, 0, MAX_MINUS, MAX_MINUS, MAX_MINUS);
        combinationsValidGCD(0, MAX_MINUS, MAX_MINUS, MAX_MINUS, MAX_MINUS);
        combinationsValidGCD(0, 0, 0, MIN_PLUS_PLUS, MAX_MINUS);
        combinationsValidGCD(0, 0, MIN_PLUS_PLUS, MIN_PLUS_PLUS, MAX_MINUS);
        combinationsValidGCD(0, MIN_PLUS_PLUS, MIN_PLUS_PLUS, MIN_PLUS_PLUS, MAX_MINUS);
        combinationsValidGCD(0, 0, 0, MAX_LEGAL_ARGUMENT, MAX_LEGAL_ARGUMENT);
        combinationsValidGCD(0, 0, MAX_LEGAL_ARGUMENT, MAX_LEGAL_ARGUMENT, MAX_LEGAL_ARGUMENT);
        combinationsValidGCD(0, MAX_LEGAL_ARGUMENT, MAX_LEGAL_ARGUMENT, MAX_LEGAL_ARGUMENT, MAX_LEGAL_ARGUMENT);
        combinationsValidGCD(0, 0, 0, MIN_LEGAL_ARGUMENT, MAX_LEGAL_ARGUMENT);
        combinationsValidGCD(0, 0, MIN_LEGAL_ARGUMENT, MIN_LEGAL_ARGUMENT, MAX_LEGAL_ARGUMENT);
        combinationsValidGCD(0, MIN_LEGAL_ARGUMENT, MIN_LEGAL_ARGUMENT, MIN_LEGAL_ARGUMENT, MAX_LEGAL_ARGUMENT);
        //------No Repeat Combinations
        combinationsValidGCD(MIN_LEGAL_ARGUMENT, MIN_PLUS_PLUS, -1, 0, 1);
        combinationsValidGCD(MIN_PLUS_PLUS, -1, 0, 1, 1);
        //------GCD 4 arguments mutually simple and not simple
        combinationsValidGCD(2, 2, 2, 2, 2);
        combinationsValidGCD(2, 3, 6, 5, 1);
        combinationsValidGCD(2, 19, 22, 39, 1);
        combinationsValidGCD(3, 18, 23, 38, 1);
        combinationsValidGCD(4, 6, 21, 9, 1);
        combinationsValidGCD(4, 17, 24, 37, 1);
        combinationsValidGCD(5, 16, 25, 36, 1);
        combinationsValidGCD(6, 15, 26, 35, 1);
        combinationsValidGCD(7, 14, 27, 34, 1);
        combinationsValidGCD(7, 693, 8, 200, 1);
        combinationsValidGCD(8, 13, 28, 33, 1);
        combinationsValidGCD(9, 12, 29, 32, 1);
        combinationsValidGCD(9, 1197, 1000, 10, 1);
        combinationsValidGCD(10, 11, 30, 31, 1);
        combinationsValidGCD(10, 1000, 2222, 11, 1);
        combinationsValidGCD(11, 10, 31, 30, 1);
        combinationsValidGCD(12, 9, 32, 29, 1);
        combinationsValidGCD(13, 8, 33, 28, 1);
        combinationsValidGCD(14, -7, 34, 27, 1);
        combinationsValidGCD(15, 6, 35, -26, 1);
        combinationsValidGCD(16, 5, 36, 25, 1);
        combinationsValidGCD(17, 4, 37, 24, 1);
        combinationsValidGCD(18, 3, -38, 23, 1);
        combinationsValidGCD(18, 6, 3, -99, 3);
        combinationsValidGCD(19, 2, 39, 22, 1);
        combinationsValidGCD(21, 9, 64, 36, 1);
        combinationsValidGCD(22, 22, 22, 22, 22);
        combinationsValidGCD(23, 49, 55, 61, 1);
        combinationsValidGCD(25, 250, 125, 25, 25);
        combinationsValidGCD(35, -40, 80, 65, 5);
        combinationsValidGCD(36, 6, 42, 54, 6);
        combinationsValidGCD(49, 63, 21, -35, 7);
        combinationsValidGCD(52, 104, 97, -26, 1);
        combinationsValidGCD(56, 112, 98, 28, 14);
        combinationsValidGCD(64, 36, 255, 5, 1);
        combinationsValidGCD(72, -45, 45, 99, 9);
        combinationsValidGCD(72, 64, -56, 48, 8);
        combinationsValidGCD(100, 225, 250, 300, 25);
        combinationsValidGCD(108, 6, 693, 7, 1);
        combinationsValidGCD(108, -216, 189, 54, 27);
        combinationsValidGCD(140, 272, 116, 996, 4);
        combinationsValidGCD(170, 190, 230, -50, 10);
        combinationsValidGCD(200, 8, 1197, 9, 1);
        combinationsValidGCD(222, 222, 222, 222, 222);
        combinationsValidGCD(225, 5, 6, 108, 1);
        combinationsValidGCD(270, 432, -486, 864, 54);
        combinationsValidGCD(297, -165, 264, 231, 33);
        combinationsValidGCD(344, 688, 602, 172, 86);
        combinationsValidGCD(392, 784, 686, -196, 98);
        combinationsValidGCD(673, 832, 747, 283, 1);
        combinationsValidGCD(2222, 2222, 2222, 2222, 2222);
        combinationsValidGCD(2438, 6739, 3781, 7681, 1);
        combinationsValidGCD(22222, 22222, 22222, 22222, 22222);
        combinationsValidGCD(28781, 51611, 68121, 73218, 1);
        combinationsValidGCD(222222, 222222, 222222, 222222, 222222);
        combinationsValidGCD(874321, 121346, 284356, 763667, 1);
        combinationsValidGCD(2222222, 2222222, 2222222, 2222222, 2222222);
        combinationsValidGCD(24785137, 12478654, 22145893, 556789647, 1);
        combinationsValidGCD(22222222, 22222222, 22222222, 22222222, 22222222);
        combinationsValidGCD(54879623, 12478965, 2364781, 3652478, 1);
        combinationsValidGCD(124786324, 1247563749, 234878965, 745864561, 1);

        //---- -1 with: MAX_MINUS, MIN_PLUS_PLUS, MAX_LEGAL_ARGUMENT, MIN_LEGAL_ARGUMENT
        combinationsValidGCD(-1, -1, -1, MAX_MINUS, 1);
        combinationsValidGCD(-1, -1, MAX_MINUS, MAX_MINUS, 1);
        combinationsValidGCD(-1, MAX_MINUS, MAX_MINUS, MAX_MINUS, 1);
        combinationsValidGCD(-1, -1, -1, MIN_PLUS_PLUS, 1);
        combinationsValidGCD(-1, -1, MIN_PLUS_PLUS, MIN_PLUS_PLUS, 1);
        combinationsValidGCD(-1, MIN_PLUS_PLUS, MIN_PLUS_PLUS, MIN_PLUS_PLUS, 1);
        combinationsValidGCD(-1, -1, -1, MAX_LEGAL_ARGUMENT, 1);
        combinationsValidGCD(-1, -1, MAX_LEGAL_ARGUMENT, MAX_LEGAL_ARGUMENT, 1);
        combinationsValidGCD(-1, MAX_LEGAL_ARGUMENT, MAX_LEGAL_ARGUMENT, MAX_LEGAL_ARGUMENT, 1);
        combinationsValidGCD(-1, -1, -1, MIN_LEGAL_ARGUMENT, 1);
        combinationsValidGCD(-1, -1, MIN_LEGAL_ARGUMENT, MIN_LEGAL_ARGUMENT, 1);
        combinationsValidGCD(-1, MIN_LEGAL_ARGUMENT, MIN_LEGAL_ARGUMENT, MIN_LEGAL_ARGUMENT, 1);
        //---- MAX_MINUS with:  MIN_PLUS_PLUS, MAX_LEGAL_ARGUMENT, MIN_LEGAL_ARGUMENT
        combinationsValidGCD(MAX_MINUS, MAX_MINUS, MAX_MINUS, MAX_MINUS, MAX_MINUS);
        combinationsValidGCD(MAX_MINUS, MAX_MINUS, MAX_MINUS, MIN_PLUS_PLUS, MAX_MINUS);
        combinationsValidGCD(MAX_MINUS, MAX_MINUS, MIN_PLUS_PLUS, MIN_PLUS_PLUS, MAX_MINUS);
        combinationsValidGCD(MAX_MINUS, MIN_PLUS_PLUS, MIN_PLUS_PLUS, MIN_PLUS_PLUS, MAX_MINUS);
        combinationsValidGCD(MAX_MINUS, MAX_MINUS, MAX_MINUS, MAX_LEGAL_ARGUMENT, 1);
        combinationsValidGCD(MAX_MINUS, MAX_MINUS, MAX_LEGAL_ARGUMENT, MAX_LEGAL_ARGUMENT, 1);
        combinationsValidGCD(MAX_MINUS, MAX_LEGAL_ARGUMENT, MAX_LEGAL_ARGUMENT, MAX_LEGAL_ARGUMENT, 1);
        combinationsValidGCD(MAX_MINUS, MAX_MINUS, MAX_MINUS, MIN_LEGAL_ARGUMENT, 1);
        combinationsValidGCD(MAX_MINUS, MAX_MINUS, MIN_LEGAL_ARGUMENT, MIN_LEGAL_ARGUMENT, 1);
        combinationsValidGCD(MAX_MINUS, MIN_LEGAL_ARGUMENT, MIN_LEGAL_ARGUMENT, MIN_LEGAL_ARGUMENT, 1);
        //------No Repeat Combinations
        combinationsValidGCD(MAX_MINUS, MAX_LEGAL_ARGUMENT, MIN_LEGAL_ARGUMENT, MIN_PLUS_PLUS, 1);
        combinationsValidGCD(MAX_MINUS, MIN_LEGAL_ARGUMENT, MIN_PLUS_PLUS, -1, 1);
        //---- MIN_PLUS_PLUS with:  MAX_LEGAL_ARGUMENT, MIN_LEGAL_ARGUMENT
        combinationsValidGCD(MIN_PLUS_PLUS, MIN_PLUS_PLUS, MIN_PLUS_PLUS, MIN_PLUS_PLUS, MAX_MINUS);
        combinationsValidGCD(MIN_PLUS_PLUS, MIN_PLUS_PLUS, MIN_PLUS_PLUS, MAX_LEGAL_ARGUMENT, 1);
        combinationsValidGCD(MIN_PLUS_PLUS, MIN_PLUS_PLUS, MAX_LEGAL_ARGUMENT, MAX_LEGAL_ARGUMENT, 1);
        combinationsValidGCD(MIN_PLUS_PLUS, MAX_LEGAL_ARGUMENT, MAX_LEGAL_ARGUMENT, MAX_LEGAL_ARGUMENT, 1);
        combinationsValidGCD(MIN_PLUS_PLUS, MIN_LEGAL_ARGUMENT, MIN_LEGAL_ARGUMENT, MIN_LEGAL_ARGUMENT, 1);
        combinationsValidGCD(MIN_PLUS_PLUS, MIN_PLUS_PLUS, MIN_LEGAL_ARGUMENT, MIN_LEGAL_ARGUMENT, 1);
        combinationsValidGCD(MIN_PLUS_PLUS, MIN_PLUS_PLUS, MIN_PLUS_PLUS, MIN_LEGAL_ARGUMENT, 1);
        //---- MAX_LEGAL_ARGUMENT with MIN_LEGAL_ARGUMENT
        combinationsValidGCD(MAX_LEGAL_ARGUMENT, MIN_LEGAL_ARGUMENT, MIN_LEGAL_ARGUMENT, MIN_LEGAL_ARGUMENT, MAX_LEGAL_ARGUMENT);
        combinationsValidGCD(MAX_LEGAL_ARGUMENT, MAX_LEGAL_ARGUMENT, MIN_LEGAL_ARGUMENT, MIN_LEGAL_ARGUMENT, MAX_LEGAL_ARGUMENT);
        combinationsValidGCD(MAX_LEGAL_ARGUMENT, MAX_LEGAL_ARGUMENT, MAX_LEGAL_ARGUMENT, MIN_LEGAL_ARGUMENT, MAX_LEGAL_ARGUMENT);
        combinationsValidGCD(MAX_LEGAL_ARGUMENT, MAX_LEGAL_ARGUMENT, MAX_LEGAL_ARGUMENT, MAX_LEGAL_ARGUMENT, MAX_LEGAL_ARGUMENT);
    }

    @Test
    void GCDNotValid() {
        //------Invalid borders
        String stringIllegalArgumentError = "Expected: from " + MIN_LEGAL_ARGUMENT + " to " + MAX_LEGAL_ARGUMENT + "\r\nGot: " + ILLEGAL_ARGUMENT;
        String stringMismatchArgumentError = "Expected: integer type \r\nGot: ";

        combinationsNotValidGCD(ILLEGAL_ARGUMENT, "-1", "-1", "-1", stringIllegalArgumentError);
        combinationsNotValidGCD(ILLEGAL_ARGUMENT, "0", "0", "0", stringIllegalArgumentError);
        combinationsNotValidGCD(ILLEGAL_ARGUMENT, "1", "1", "1", stringIllegalArgumentError);
        combinationsNotValidGCD(ILLEGAL_ARGUMENT, "-2147483646", "-2147483646", "-2147483646", stringIllegalArgumentError);
        combinationsNotValidGCD(ILLEGAL_ARGUMENT, "-2147483647", "-2147483647", "-2147483647", stringIllegalArgumentError);
        combinationsNotValidGCD(ILLEGAL_ARGUMENT, "2147483647", "2147483647", "2147483647", stringIllegalArgumentError);
        combinationsNotValidGCD(ILLEGAL_ARGUMENT, ILLEGAL_ARGUMENT, "-1", "-1", stringIllegalArgumentError);
        combinationsNotValidGCD(ILLEGAL_ARGUMENT, ILLEGAL_ARGUMENT, "0", "0", stringIllegalArgumentError);
        combinationsNotValidGCD(ILLEGAL_ARGUMENT, ILLEGAL_ARGUMENT, "1", "1", stringIllegalArgumentError);
        combinationsNotValidGCD(ILLEGAL_ARGUMENT, ILLEGAL_ARGUMENT, "-2147483646", "-2147483646", stringIllegalArgumentError);
        combinationsNotValidGCD(ILLEGAL_ARGUMENT, ILLEGAL_ARGUMENT, "-2147483647", "-2147483647", stringIllegalArgumentError);
        combinationsNotValidGCD(ILLEGAL_ARGUMENT, ILLEGAL_ARGUMENT, "2147483647", "2147483647", stringIllegalArgumentError);
        combinationsNotValidGCD(ILLEGAL_ARGUMENT, ILLEGAL_ARGUMENT, ILLEGAL_ARGUMENT, "-1", stringIllegalArgumentError);
        combinationsNotValidGCD(ILLEGAL_ARGUMENT, ILLEGAL_ARGUMENT, ILLEGAL_ARGUMENT, "0", stringIllegalArgumentError);
        combinationsNotValidGCD(ILLEGAL_ARGUMENT, ILLEGAL_ARGUMENT, ILLEGAL_ARGUMENT, "1", stringIllegalArgumentError);
        combinationsNotValidGCD(ILLEGAL_ARGUMENT, ILLEGAL_ARGUMENT, ILLEGAL_ARGUMENT, "-2147483646", stringIllegalArgumentError);
        combinationsNotValidGCD(ILLEGAL_ARGUMENT, ILLEGAL_ARGUMENT, ILLEGAL_ARGUMENT, "-2147483647", stringIllegalArgumentError);
        combinationsNotValidGCD(ILLEGAL_ARGUMENT, ILLEGAL_ARGUMENT, ILLEGAL_ARGUMENT, "2147483647", stringIllegalArgumentError);
        combinationsNotValidGCD(ILLEGAL_ARGUMENT, ILLEGAL_ARGUMENT, ILLEGAL_ARGUMENT, ILLEGAL_ARGUMENT, stringIllegalArgumentError);

//------Combinations with invalid argument
        combinationsNotValidGCD(ILLEGAL_ARGUMENT, "-2147483647", "-2147483646", "-1", stringIllegalArgumentError);
        combinationsNotValidGCD(ILLEGAL_ARGUMENT, "-2147483646", "-1", "0", stringIllegalArgumentError);
        combinationsNotValidGCD(ILLEGAL_ARGUMENT, "-1", "0", "1", stringIllegalArgumentError);
        combinationsNotValidGCD(ILLEGAL_ARGUMENT, "0", "1", "2147483646", stringIllegalArgumentError);
        combinationsNotValidGCD(ILLEGAL_ARGUMENT, "1", "2147483646", "2147483647", stringIllegalArgumentError);
        combinationsNotValidGCD(ILLEGAL_ARGUMENT, "2147483646", "2147483647", "2147483647", stringIllegalArgumentError);
        assertionNotValidNodMain("This is valid number", "2147483646", "-2147483647", "-2147483646", stringMismatchArgumentError + "This is valid number");
        assertionNotValidNodMain("2147483646", "And this is number", "-2147483647", "-2147483646", stringMismatchArgumentError + "And this is number");
        assertionNotValidNodMain("-2147483647", "2147483646", "-2147483647", "I don't lie", stringMismatchArgumentError + "I don't lie");
        assertionNotValidNodMain("believe me", "2147483646", "-2147483647", "-2147483646", stringMismatchArgumentError + "believe me");
    }

    //------The check method for valid arguments
    void assertionValidNod(int x, int y, int i, int j, int gcd) {
        assertEquals(gcd, GCD.gcd(x, y, i, j));
        assertionValidNodMain(x, y, i, j, gcd);
    }

    //------The check method for valid arguments
    void assertionValidNodMain(int x, int y, int i, int j, int gcd) {
        String input = valueOf(x).toString() + System.lineSeparator() +
                valueOf(y).toString() + System.lineSeparator() +
                valueOf(i).toString() + System.lineSeparator() +
                valueOf(j).toString();

        String result = main(input);
        String expected = "Welcome!\r\nEnter 4 values:\r\n" + "GCD = " + gcd;
        assertEquals(expected, result);
    }

    //------The check method for invalid arguments
    void assertionNotValidNod(String x, String y, String i, String j, String error) {
        try {
            GCD.gcd(Integer.valueOf(x), Integer.valueOf(y), Integer.valueOf(i), Integer.valueOf(j));
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals(error, e.getMessage());
        }
        assertionNotValidNodMain(x, y, i, j, error);
    }

    //------The check method for invalid arguments
    void assertionNotValidNodMain(String x, String y, String i, String j, String error) {
        String input = x + System.lineSeparator() +
                y + System.lineSeparator() +
                i + System.lineSeparator() + j;

        String result = main(input);

        String expected = "Welcome!\r\nEnter 4 values:\r\n" + error;
        assertEquals(expected, result);

    }

    //----The method imitates console enter from user, and returns string output in console
    String main(String input) {
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(input.getBytes());
        System.setIn(byteArrayInputStream);

        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));
        Task3GCD.main(new String[0]);

        return outputStream.toString();
    }

    //----The method combines valid values
    void combinationsValidGCD(int x, int y, int i, int j, int gcd) {
        assertionValidNod(x, y, i, j, gcd);
        assertionValidNod(x, y, j, i, gcd);
        assertionValidNod(x, i, y, j, gcd);
        assertionValidNod(x, i, j, y, gcd);
        assertionValidNod(x, j, y, i, gcd);
        assertionValidNod(x, j, i, y, gcd);

        assertionValidNod(y, x, i, j, gcd);
        assertionValidNod(y, x, j, i, gcd);
        assertionValidNod(y, i, x, j, gcd);
        assertionValidNod(y, i, j, x, gcd);
        assertionValidNod(y, j, x, i, gcd);
        assertionValidNod(y, j, i, x, gcd);

        assertionValidNod(i, x, y, j, gcd);
        assertionValidNod(i, x, j, y, gcd);
        assertionValidNod(i, y, x, j, gcd);
        assertionValidNod(i, y, j, x, gcd);
        assertionValidNod(i, j, x, y, gcd);
        assertionValidNod(i, j, y, x, gcd);

        assertionValidNod(j, x, y, i, gcd);
        assertionValidNod(j, x, i, y, gcd);
        assertionValidNod(j, y, x, i, gcd);
        assertionValidNod(j, y, i, x, gcd);
        assertionValidNod(j, i, x, y, gcd);
        assertionValidNod(j, i, y, x, gcd);
    }

    //----The method combines invalid values
    void combinationsNotValidGCD(String x, String y, String i, String j, String error) {
        assertionNotValidNod(x, y, i, j, error);
        assertionNotValidNod(x, y, j, i, error);
        assertionNotValidNod(x, i, y, j, error);
        assertionNotValidNod(x, i, j, y, error);
        assertionNotValidNod(x, j, y, i, error);
        assertionNotValidNod(x, j, i, y, error);

        assertionNotValidNod(y, x, i, j, error);
        assertionNotValidNod(y, x, j, i, error);
        assertionNotValidNod(y, i, x, j, error);
        assertionNotValidNod(y, i, j, x, error);
        assertionNotValidNod(y, j, x, i, error);
        assertionNotValidNod(y, j, i, x, error);

        assertionNotValidNod(i, x, y, j, error);
        assertionNotValidNod(i, x, j, y, error);
        assertionNotValidNod(i, y, x, j, error);
        assertionNotValidNod(i, y, j, x, error);
        assertionNotValidNod(i, j, x, y, error);
        assertionNotValidNod(i, j, y, x, error);

        assertionNotValidNod(j, x, y, i, error);
        assertionNotValidNod(j, x, i, y, error);
        assertionNotValidNod(j, y, x, i, error);
        assertionNotValidNod(j, y, i, x, error);
        assertionNotValidNod(j, i, x, y, error);
        assertionNotValidNod(j, i, y, x, error);
    }
}