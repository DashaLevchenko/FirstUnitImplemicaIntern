import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static java.lang.Long.MAX_VALUE;
import static java.lang.Long.MIN_VALUE;
import static org.junit.jupiter.api.Assertions.assertEquals;

class Task1SwapTest {
    private static final long MAX = MAX_VALUE; //9223372036854775807
    private static final long MIN = MIN_VALUE; //-9223372036854775808

    private static final long MAX_MINUS = MAX - 1; //9223372036854775806
    private static final long MIN_PLUS = MIN + 1;  //-9223372036854775807


    @Test
    void testSwapValid() {
//-----Valid borders -9_223_372_036_854_775_808 : 9_223_372_036_854_775_807
        assertionValidSwap(-1, -1);
        assertionValidSwap(-1, 0);
        assertionValidSwap(-1, 1);
        assertionValidSwap(-1, MIN);
        assertionValidSwap(-1, MAX);
        assertionValidSwap(0, -1);
        assertionValidSwap(0, 0);
        assertionValidSwap(0, 1);
        assertionValidSwap(0, MIN);
        assertionValidSwap(0, MAX);
        assertionValidSwap(1, -1);
        assertionValidSwap(1, 0);
        assertionValidSwap(1, 1);
        assertionValidSwap(1, MIN);
        assertionValidSwap(1, MAX);
        assertionValidSwap(MIN, MIN);
        assertionValidSwap(MIN, -1);
        assertionValidSwap(MIN, 0);
        assertionValidSwap(MIN, 1);
        assertionValidSwap(MIN, MAX);
        assertionValidSwap(MAX, -1);
        assertionValidSwap(MAX, 0);
        assertionValidSwap(MAX, 1);
        assertionValidSwap(MAX, MIN);
        assertionValidSwap(MAX, MAX);

//-----Right/Left MIN+1;MAX-1
        assertionValidSwap(MIN_PLUS, MAX_MINUS);
        assertionValidSwap(MAX_MINUS, MIN_PLUS);
        assertionValidSwap(MAX_MINUS, MAX_MINUS);
        assertionValidSwap(MIN_PLUS, MIN_PLUS);

//-----Subject area
        //Arguments are positives numbers
        assertionValidSwap(1, 15);
        assertionValidSwap(2, 14);
        assertionValidSwap(3, 13);
        assertionValidSwap(4, 12);
        assertionValidSwap(5, 11);
        assertionValidSwap(6, 10);
        assertionValidSwap(7, 9);
        assertionValidSwap(8, 8);
        assertionValidSwap(9, 7);
        assertionValidSwap(10, 6);
        assertionValidSwap(11, 5);
        assertionValidSwap(12, 4);
        assertionValidSwap(13, 3);
        assertionValidSwap(14, 2);
        assertionValidSwap(15, 1);
        //Arguments are negative numbers and three-digit
        assertionValidSwap(-100, -101);
        assertionValidSwap(-111, -121);
        assertionValidSwap(-200, -202);
        assertionValidSwap(-222, -212);
        assertionValidSwap(-300, -303);
        assertionValidSwap(-333, -323);
        assertionValidSwap(-400, -404);
        assertionValidSwap(-444, -424);
        assertionValidSwap(-500, -505);
        assertionValidSwap(-555, -525);
        assertionValidSwap(-600, -606);
        assertionValidSwap(-666, -626);
        assertionValidSwap(-700, -707);
        assertionValidSwap(-777, -727);
        assertionValidSwap(-800, -808);
        assertionValidSwap(-888, -828);
        assertionValidSwap(-900, -909);
        assertionValidSwap(-999, -929);
        //First argument is positive number, second argument is negative number
        //and both are four-digit numbers
        assertionValidSwap(1000, -1222);
        assertionValidSwap(1111, -1233);
        assertionValidSwap(2000, -2333);
        assertionValidSwap(2222, -2344);
        assertionValidSwap(3000, -3444);
        assertionValidSwap(3333, -3455);
        assertionValidSwap(4000, -4555);
        assertionValidSwap(4444, -4566);
        assertionValidSwap(5000, -5666);
        assertionValidSwap(5555, -5677);
        assertionValidSwap(6000, -6777);
        assertionValidSwap(6666, -6788);
        assertionValidSwap(7000, -7888);
        assertionValidSwap(7777, -7899);
        assertionValidSwap(8000, -8999);
        assertionValidSwap(8888, -8900);
        assertionValidSwap(9000, -9888);
        assertionValidSwap(9999, -9877);
        //First argument is four-digit number, second argument is five-digit number
        //and both are negative numbers
        assertionValidSwap(-1233, -12333);
        assertionValidSwap(-1344, -13444);
        assertionValidSwap(-2244, -22444);
        assertionValidSwap(-2355, -23555);
        assertionValidSwap(-3255, -32555);
        assertionValidSwap(-3366, -33666);
        assertionValidSwap(-4266, -42666);
        assertionValidSwap(-4377, -43777);
        assertionValidSwap(-5277, -52777);
        assertionValidSwap(-5388, -53888);
        assertionValidSwap(-6288, -62888);
        assertionValidSwap(-6399, -63999);
        assertionValidSwap(-7300, -73000);
        assertionValidSwap(-8311, -83111);
        assertionValidSwap(-9312, -93122);
        //Both numbers are five-digit
        assertionValidSwap(11111, 17111);
        assertionValidSwap(11222, 26111);
        assertionValidSwap(12333, 27111);
        assertionValidSwap(13444, 28111);
        assertionValidSwap(14555, 29111);
        assertionValidSwap(15666, 30111);
        assertionValidSwap(16777, 31111);
        assertionValidSwap(22222, 18111);
        assertionValidSwap(33333, 19111);
        assertionValidSwap(44444, 20111);
        assertionValidSwap(55555, 21111);
        assertionValidSwap(66666, 22111);
        assertionValidSwap(77777, 23111);
        assertionValidSwap(88888, 24111);
        assertionValidSwap(99999, 25111);
        //First argument is negative number, second argument is positive number
        //and both are five-digit numbers
        assertionValidSwap(-15666, 456123);
        assertionValidSwap(-24666, 345612);
        assertionValidSwap(-35888, 234561);
        assertionValidSwap(-46000, 123456);
        assertionValidSwap(-51666, 12345);
        assertionValidSwap(-62888, 23451);
        assertionValidSwap(-66666, 561234);
        assertionValidSwap(-73000, 34512);
        assertionValidSwap(-84121, 45123);
        assertionValidSwap(-95141, 51234);
        assertionValidSwap(-123456, 612345);
        assertionValidSwap(-234561, 555555);
        assertionValidSwap(-345612, 777777);
        assertionValidSwap(-456123, 111111);
        assertionValidSwap(-561234, 222222);

//-----If the sum of both arguments more or less then maximum Long type
        assertionValidSwap(MIN, MIN);
        assertionValidSwap(MIN_PLUS, MIN);
        assertionValidSwap(MIN, MIN_PLUS);
//-----Random
        assertionValidSwap(-2, -78);
        assertionValidSwap(7, 18);
        assertionValidSwap(15, 18);
        assertionValidSwap(22, 784);
        assertionValidSwap(22, 7444);
        assertionValidSwap(28, 13);
        assertionValidSwap(48, 789);
        assertionValidSwap(51, 134);
        assertionValidSwap(55, 13);
        assertionValidSwap(71, 18);
        assertionValidSwap(80, 43);
        assertionValidSwap(89, -74);
        assertionValidSwap(89, 746);
        assertionValidSwap(98, -9);
        assertionValidSwap(111, 22);
        assertionValidSwap(121, 222);
        assertionValidSwap(156, 220);
        assertionValidSwap(338, 447);
        assertionValidSwap(364, 148);
        assertionValidSwap(489, 894);
        assertionValidSwap(-546, -7548);
        assertionValidSwap(688, 4478);
        assertionValidSwap(742, -2);
        assertionValidSwap(748, -204);
        assertionValidSwap(809, -7478);
        assertionValidSwap(810, 143);
        assertionValidSwap(847, 854);
        assertionValidSwap(847, 897);
        assertionValidSwap(871, 13);
        assertionValidSwap(871, 213);
        assertionValidSwap(5654, 14567);
        assertionValidSwap(5659, -946);
        assertionValidSwap(6842, 0);
        assertionValidSwap(6984, 0);
        assertionValidSwap(9223372036854775800L, 8);
        assertionValidSwap(-9223372036854775800L, -9);
        assertionValidSwap(9223372036854775800L, 9223372036854775800L);
        assertionValidSwap(-9223372036854775800L, -9223372036854775800L);
        assertionValidSwap(9223372036854775800L, 9223372036854775800L);
    }

    @org.junit.jupiter.api.Test
    void testSwapNOtValid() {
        //Invalid arguments more or less then Long type
        assertionNotValidSwap("-9223372036854775809", "9223372036854775808", "x = ", "Got: -9223372036854775809");
        assertionNotValidSwap("9223372036854775808", "-9223372036854775809", "x = ", "Got: 9223372036854775808");
        assertionNotValidSwap("9223372036854775808", "9223372036854775808", "x = ", "Got: 9223372036854775808");
        assertionNotValidSwap("-9223372036854775809", "-9223372036854775809", "x = ", "Got: -9223372036854775809");
        //Character value
        assertionNotValidSwap("-9223372036854775809", "ddddd", "x = ", "Got: -9223372036854775809");
        assertionNotValidSwap("ddddd", "-9223372036854775809", "x = ", "Got: ddddd");
        assertionNotValidSwap("9223372036854775808", "ddddd", "x = ", "Got: 9223372036854775808");
        assertionNotValidSwap("ddddd", "9223372036854775808", "x = ", "Got: ddddd");
        assertionNotValidSwap("This is number", "believe me!", "x = ", "Got: This is number");
        //Combines invalid arguments with valid arguments
        combinationNotValid(MIN_PLUS);
        combinationNotValid(MIN);
        combinationNotValid(-1);
        combinationNotValid(0);
        combinationNotValid(1);
        combinationNotValid(MAX_MINUS);
        combinationNotValid(MAX);
    }

    //------The check method for valid arguments
    void assertionValidSwap(long x, long y) {
        Swap swap = new Swap(x, y);
        swap.swap();
        assertEquals(x, swap.getY());
        assertEquals(y, swap.getX());
        assertionValidSwapMain(x, y);
    }

    //------The check method for valid arguments in main
    void assertionValidSwapMain(long x, long y) {
        String expected = "Welcome!\r\nEnter values:\r\nx = y = " +
                "Values swapped\r\nx = " + y + System.lineSeparator() + "y = " + x;

        String result = main(Long.valueOf(x).toString(), Long.valueOf(y).toString());

        assertEquals(expected, result);
    }

    //------The check method for invalid arguments
    void assertionNotValidSwap(String x, String y, String parametersWasPrinted, String error) {
        String expectedString = "Welcome!\r\nEnter values:\r\n" +
                parametersWasPrinted + "Value is illegal\r\n" +
                "Expected: from " + Swap.MIN_LEGAL_ARGUMENT + " to " + Swap.MAX_LEGAL_ARGUMENT + "\r\n" +
                error;
        String result = main(x, y);

        assertEquals(expectedString, result);
    }

    //----The method imitates console enter from user, and returns string output in console
    String main(String x, String y) {
        String inputX = x + System.lineSeparator() + y;
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(inputX.getBytes());
        System.setIn(byteArrayInputStream);

        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));
        Task1Swap.main(new String[0]);


        return outputStream.toString().trim();
    }

    //----The method combines invalid argument
    void combinationNotValid(long valid) {
        String x = Long.valueOf(valid).toString();

        assertionNotValidSwap(x, "9223372036854775808", "x = y = ", "Got: 9223372036854775808");
        assertionNotValidSwap(x, "-9223372036854775809", "x = y = ", "Got: -9223372036854775809");
        assertionNotValidSwap(x, "888888O44", "x = y = ", "Got: 888888O44");

        assertionNotValidSwap("9223372036854775808", x, "x = ", "Got: 9223372036854775808");
        assertionNotValidSwap("-9223372036854775809", x, "x = ", "Got: -9223372036854775809");
        assertionNotValidSwap("888888Of44", x, "x = ", "Got: 888888Of44");
    }
}
