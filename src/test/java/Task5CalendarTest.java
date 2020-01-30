import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

class Task5CalendarTest {
    @Test
    void searchValid() {
        //------Valid borders[7, 31, 12]
        assertionsValidSearch(1, 1, 1, "Monday");
        assertionsValidSearch(1, 1, 12, "Saturday");
        assertionsValidSearch(1, 31, 1, "Wednesday");
        assertionsValidSearch(2, 2, 2, "Saturday");
        assertionsValidSearch(2, 14, 5, "Tuesday");
        assertionsValidSearch(3, 15, 6, "Sunday");
        assertionsValidSearch(4, 16, 7, "Thursday");
        assertionsValidSearch(6, 30, 11, "Wednesday");
        assertionsValidSearch(7, 1, 1, "Sunday");
        assertionsValidSearch(7, 7, 7, "Friday");
        assertionsValidSearch(7, 31, 12, "Sunday");
        //------Special arguments
        assertionsValidSearch(1, 28, 2, "Wednesday");
        assertionsValidSearch(2, 28, 2, "Thursday");
        assertionsValidSearch(3, 28, 2, "Friday");
        assertionsValidSearch(4, 28, 2, "Saturday");
        assertionsValidSearch(5, 28, 2, "Sunday");
        assertionsValidSearch(6, 28, 2, "Monday");
        assertionsValidSearch(7, 28, 2, "Tuesday");
        //------Subject area
        //Start of the month
        //Start of new year is 1
        assertionsValidSearch(1, 1, 2, "Thursday");
        assertionsValidSearch(1, 1, 3, "Thursday");
        assertionsValidSearch(1, 1, 4, "Sunday");
        assertionsValidSearch(1, 1, 5, "Tuesday");
        assertionsValidSearch(1, 1, 6, "Friday");
        assertionsValidSearch(1, 1, 7, "Sunday");
        assertionsValidSearch(1, 1, 8, "Wednesday");
        assertionsValidSearch(1, 1, 9, "Saturday");
        assertionsValidSearch(1, 1, 10, "Monday");
        assertionsValidSearch(1, 1, 11, "Thursday");
        //Start of new year is 2
        assertionsValidSearch(2, 1, 1, "Tuesday");
        assertionsValidSearch(2, 1, 2, "Friday");
        assertionsValidSearch(2, 1, 3, "Friday");
        assertionsValidSearch(2, 1, 4, "Monday");
        assertionsValidSearch(2, 1, 5, "Wednesday");
        assertionsValidSearch(2, 1, 6, "Saturday");
        assertionsValidSearch(2, 1, 7, "Monday");
        assertionsValidSearch(2, 1, 8, "Thursday");
        assertionsValidSearch(2, 1, 9, "Sunday");
        assertionsValidSearch(2, 1, 10, "Tuesday");
        assertionsValidSearch(2, 1, 11, "Friday");
        assertionsValidSearch(2, 1, 12, "Sunday");
        //Start of new year is 3
        assertionsValidSearch(3, 1, 1, "Wednesday");
        assertionsValidSearch(3, 1, 2, "Saturday");
        assertionsValidSearch(3, 1, 3, "Saturday");
        assertionsValidSearch(3, 1, 4, "Tuesday");
        assertionsValidSearch(3, 1, 5, "Thursday");
        assertionsValidSearch(3, 1, 6, "Sunday");
        assertionsValidSearch(3, 1, 7, "Tuesday");
        assertionsValidSearch(3, 1, 8, "Friday");
        assertionsValidSearch(3, 1, 9, "Monday");
        assertionsValidSearch(3, 1, 10, "Wednesday");
        assertionsValidSearch(3, 1, 11, "Saturday");
        assertionsValidSearch(3, 1, 12, "Monday");
        //Start of new year is 4
        assertionsValidSearch(4, 1, 1, "Thursday");
        assertionsValidSearch(4, 1, 2, "Sunday");
        assertionsValidSearch(4, 1, 3, "Sunday");
        assertionsValidSearch(4, 1, 4, "Wednesday");
        assertionsValidSearch(4, 1, 5, "Friday");
        assertionsValidSearch(4, 1, 6, "Monday");
        assertionsValidSearch(4, 1, 7, "Wednesday");
        assertionsValidSearch(4, 1, 8, "Saturday");
        assertionsValidSearch(4, 1, 9, "Tuesday");
        assertionsValidSearch(4, 1, 10, "Thursday");
        assertionsValidSearch(4, 1, 11, "Sunday");
        assertionsValidSearch(4, 1, 12, "Tuesday");
        //Start of new year is 5
        assertionsValidSearch(5, 1, 1, "Friday");
        assertionsValidSearch(5, 1, 2, "Monday");
        assertionsValidSearch(5, 1, 3, "Monday");
        assertionsValidSearch(5, 1, 4, "Thursday");
        assertionsValidSearch(5, 1, 5, "Saturday");
        assertionsValidSearch(5, 1, 6, "Tuesday");
        assertionsValidSearch(5, 1, 7, "Thursday");
        assertionsValidSearch(5, 1, 8, "Sunday");
        assertionsValidSearch(5, 1, 9, "Wednesday");
        assertionsValidSearch(5, 1, 10, "Friday");
        assertionsValidSearch(5, 1, 11, "Monday");
        assertionsValidSearch(5, 1, 12, "Wednesday");
        //Start of new year is 6
        assertionsValidSearch(6, 1, 1, "Saturday");
        assertionsValidSearch(6, 1, 2, "Tuesday");
        assertionsValidSearch(6, 1, 3, "Tuesday");
        assertionsValidSearch(6, 1, 4, "Friday");
        assertionsValidSearch(6, 1, 5, "Sunday");
        assertionsValidSearch(6, 1, 6, "Wednesday");
        assertionsValidSearch(6, 1, 7, "Friday");
        assertionsValidSearch(6, 1, 8, "Monday");
        assertionsValidSearch(6, 1, 9, "Thursday");
        assertionsValidSearch(6, 1, 10, "Saturday");
        assertionsValidSearch(6, 1, 11, "Tuesday");
        assertionsValidSearch(6, 1, 12, "Thursday");
        //Start of new year is 7
        assertionsValidSearch(7, 1, 1, "Sunday");
        assertionsValidSearch(7, 1, 2, "Wednesday");
        assertionsValidSearch(7, 1, 3, "Wednesday");
        assertionsValidSearch(7, 1, 4, "Saturday");
        assertionsValidSearch(7, 1, 5, "Monday");
        assertionsValidSearch(7, 1, 6, "Thursday");
        assertionsValidSearch(7, 1, 7, "Saturday");
        assertionsValidSearch(7, 1, 8, "Tuesday");
        assertionsValidSearch(7, 1, 9, "Friday");
        assertionsValidSearch(7, 1, 10, "Sunday");
        assertionsValidSearch(7, 1, 11, "Wednesday");
        assertionsValidSearch(7, 1, 12, "Friday");
        //Middle of the month
        //Start of new year is 2
        assertionsValidSearch(1, 15, 1, "Monday");
        assertionsValidSearch(1, 15, 2, "Thursday");
        assertionsValidSearch(1, 15, 3, "Thursday");
        assertionsValidSearch(1, 15, 4, "Sunday");
        assertionsValidSearch(1, 15, 5, "Tuesday");
        assertionsValidSearch(1, 15, 6, "Friday");
        assertionsValidSearch(1, 15, 7, "Sunday");
        assertionsValidSearch(1, 15, 8, "Wednesday");
        assertionsValidSearch(1, 15, 9, "Saturday");
        assertionsValidSearch(1, 15, 10, "Monday");
        assertionsValidSearch(1, 15, 11, "Thursday");
        assertionsValidSearch(1, 15, 12, "Saturday");
        //Start of new year is 2
        assertionsValidSearch(2, 15, 1, "Tuesday");
        assertionsValidSearch(2, 15, 2, "Friday");
        assertionsValidSearch(2, 15, 3, "Friday");
        assertionsValidSearch(2, 15, 4, "Monday");
        assertionsValidSearch(2, 15, 5, "Wednesday");
        assertionsValidSearch(2, 15, 6, "Saturday");
        assertionsValidSearch(2, 15, 7, "Monday");
        assertionsValidSearch(2, 15, 8, "Thursday");
        assertionsValidSearch(2, 15, 9, "Sunday");
        assertionsValidSearch(2, 15, 10, "Tuesday");
        assertionsValidSearch(2, 15, 11, "Friday");
        assertionsValidSearch(2, 15, 12, "Sunday");
        //Start of new year is 3
        assertionsValidSearch(3, 15, 1, "Wednesday");
        assertionsValidSearch(3, 15, 2, "Saturday");
        assertionsValidSearch(3, 15, 3, "Saturday");
        assertionsValidSearch(3, 15, 4, "Tuesday");
        assertionsValidSearch(3, 15, 5, "Thursday");
        assertionsValidSearch(3, 15, 6, "Sunday");
        assertionsValidSearch(3, 15, 7, "Tuesday");
        assertionsValidSearch(3, 15, 8, "Friday");
        assertionsValidSearch(3, 15, 9, "Monday");
        assertionsValidSearch(3, 15, 10, "Wednesday");
        assertionsValidSearch(3, 15, 11, "Saturday");
        assertionsValidSearch(3, 15, 12, "Monday");
        //Start of new year is 4
        assertionsValidSearch(4, 15, 1, "Thursday");
        assertionsValidSearch(4, 15, 2, "Sunday");
        assertionsValidSearch(4, 15, 3, "Sunday");
        assertionsValidSearch(4, 15, 4, "Wednesday");
        assertionsValidSearch(4, 15, 5, "Friday");
        assertionsValidSearch(4, 15, 6, "Monday");
        assertionsValidSearch(4, 15, 7, "Wednesday");
        assertionsValidSearch(4, 15, 8, "Saturday");
        assertionsValidSearch(4, 15, 9, "Tuesday");
        assertionsValidSearch(4, 15, 10, "Thursday");
        assertionsValidSearch(4, 15, 11, "Sunday");
        assertionsValidSearch(4, 15, 12, "Tuesday");
        //Start of new year is 5
        assertionsValidSearch(5, 15, 1, "Friday");
        assertionsValidSearch(5, 15, 2, "Monday");
        assertionsValidSearch(5, 15, 3, "Monday");
        assertionsValidSearch(5, 15, 4, "Thursday");
        assertionsValidSearch(5, 15, 5, "Saturday");
        assertionsValidSearch(5, 15, 6, "Tuesday");
        assertionsValidSearch(5, 15, 7, "Thursday");
        assertionsValidSearch(5, 15, 8, "Sunday");
        assertionsValidSearch(5, 15, 9, "Wednesday");
        assertionsValidSearch(5, 15, 10, "Friday");
        assertionsValidSearch(5, 15, 11, "Monday");
        assertionsValidSearch(5, 15, 12, "Wednesday");
        //Start of new year is 6
        assertionsValidSearch(6, 15, 1, "Saturday");
        assertionsValidSearch(6, 15, 2, "Tuesday");
        assertionsValidSearch(6, 15, 3, "Tuesday");
        assertionsValidSearch(6, 15, 4, "Friday");
        assertionsValidSearch(6, 15, 5, "Sunday");
        assertionsValidSearch(6, 15, 6, "Wednesday");
        assertionsValidSearch(6, 15, 7, "Friday");
        assertionsValidSearch(6, 15, 8, "Monday");
        assertionsValidSearch(6, 15, 9, "Thursday");
        assertionsValidSearch(6, 15, 10, "Saturday");
        assertionsValidSearch(6, 15, 11, "Tuesday");
        assertionsValidSearch(6, 15, 12, "Thursday");
        //Start of new year is 7
        assertionsValidSearch(7, 15, 1, "Sunday");
        assertionsValidSearch(7, 15, 2, "Wednesday");
        assertionsValidSearch(7, 15, 3, "Wednesday");
        assertionsValidSearch(7, 15, 4, "Saturday");
        assertionsValidSearch(7, 15, 5, "Monday");
        assertionsValidSearch(7, 15, 6, "Thursday");
        assertionsValidSearch(7, 15, 7, "Saturday");
        assertionsValidSearch(7, 15, 8, "Tuesday");
        assertionsValidSearch(7, 15, 9, "Friday");
        assertionsValidSearch(7, 15, 10, "Sunday");
        assertionsValidSearch(7, 15, 11, "Wednesday");
        assertionsValidSearch(7, 15, 12, "Friday");
        //End of the month
        //Start of new year is 1
        assertionsValidSearch(1, 31, 1, "Wednesday");
        assertionsValidSearch(1, 28, 2, "Wednesday");
        assertionsValidSearch(1, 31, 3, "Saturday");
        assertionsValidSearch(1, 30, 4, "Monday");
        assertionsValidSearch(1, 31, 5, "Thursday");
        assertionsValidSearch(1, 30, 6, "Saturday");
        assertionsValidSearch(1, 31, 7, "Tuesday");
        assertionsValidSearch(1, 31, 8, "Friday");
        assertionsValidSearch(1, 30, 9, "Sunday");
        assertionsValidSearch(1, 31, 10, "Wednesday");
        assertionsValidSearch(1, 30, 11, "Friday");
        assertionsValidSearch(1, 31, 12, "Monday");
        //Start of new year is 2
        assertionsValidSearch(2, 31, 1, "Thursday");
        assertionsValidSearch(2, 28, 2, "Thursday");
        assertionsValidSearch(2, 31, 3, "Sunday");
        assertionsValidSearch(2, 30, 4, "Tuesday");
        assertionsValidSearch(2, 31, 5, "Friday");
        assertionsValidSearch(2, 30, 6, "Sunday");
        assertionsValidSearch(2, 31, 7, "Wednesday");
        assertionsValidSearch(2, 31, 8, "Saturday");
        assertionsValidSearch(2, 30, 9, "Monday");
        assertionsValidSearch(2, 31, 10, "Thursday");
        assertionsValidSearch(2, 30, 11, "Saturday");
        assertionsValidSearch(2, 31, 12, "Tuesday");
        //Start of new year is 3
        assertionsValidSearch(3, 31, 1, "Friday");
        assertionsValidSearch(3, 28, 2, "Friday");
        assertionsValidSearch(3, 31, 3, "Monday");
        assertionsValidSearch(3, 30, 4, "Wednesday");
        assertionsValidSearch(3, 31, 5, "Saturday");
        assertionsValidSearch(3, 30, 6, "Monday");
        assertionsValidSearch(3, 31, 7, "Thursday");
        assertionsValidSearch(3, 31, 8, "Sunday");
        assertionsValidSearch(3, 30, 9, "Tuesday");
        assertionsValidSearch(3, 31, 10, "Friday");
        assertionsValidSearch(3, 30, 11, "Sunday");
        assertionsValidSearch(3, 31, 12, "Wednesday");
        //Start of new year is 4
        assertionsValidSearch(4, 31, 1, "Saturday");
        assertionsValidSearch(4, 28, 2, "Saturday");
        assertionsValidSearch(4, 31, 3, "Tuesday");
        assertionsValidSearch(4, 30, 4, "Thursday");
        assertionsValidSearch(4, 31, 5, "Sunday");
        assertionsValidSearch(4, 30, 6, "Tuesday");
        assertionsValidSearch(4, 31, 7, "Friday");
        assertionsValidSearch(4, 31, 8, "Monday");
        assertionsValidSearch(4, 30, 9, "Wednesday");
        assertionsValidSearch(4, 31, 10, "Saturday");
        assertionsValidSearch(4, 30, 11, "Monday");
        assertionsValidSearch(4, 31, 12, "Thursday");
        //Start of new year is 5
        assertionsValidSearch(5, 31, 1, "Sunday");
        assertionsValidSearch(5, 28, 2, "Sunday");
        assertionsValidSearch(5, 31, 3, "Wednesday");
        assertionsValidSearch(5, 30, 4, "Friday");
        assertionsValidSearch(5, 31, 5, "Monday");
        assertionsValidSearch(5, 30, 6, "Wednesday");
        assertionsValidSearch(5, 31, 7, "Saturday");
        assertionsValidSearch(5, 31, 8, "Tuesday");
        assertionsValidSearch(5, 30, 9, "Thursday");
        assertionsValidSearch(5, 31, 10, "Sunday");
        assertionsValidSearch(5, 30, 11, "Tuesday");
        assertionsValidSearch(5, 31, 12, "Friday");
        //Start of new year is 6
        assertionsValidSearch(6, 31, 1, "Monday");
        assertionsValidSearch(6, 28, 2, "Monday");
        assertionsValidSearch(6, 31, 3, "Thursday");
        assertionsValidSearch(6, 30, 4, "Saturday");
        assertionsValidSearch(6, 31, 5, "Tuesday");
        assertionsValidSearch(6, 30, 6, "Thursday");
        assertionsValidSearch(6, 31, 7, "Sunday");
        assertionsValidSearch(6, 31, 8, "Wednesday");
        assertionsValidSearch(6, 30, 9, "Friday");
        assertionsValidSearch(6, 31, 10, "Monday");
        assertionsValidSearch(6, 30, 11, "Wednesday");
        assertionsValidSearch(6, 31, 12, "Saturday");
        //Start of new year is 7
        assertionsValidSearch(7, 31, 1, "Tuesday");
        assertionsValidSearch(7, 28, 2, "Tuesday");
        assertionsValidSearch(7, 31, 3, "Friday");
        assertionsValidSearch(7, 30, 4, "Sunday");
        assertionsValidSearch(7, 31, 5, "Wednesday");
        assertionsValidSearch(7, 30, 6, "Friday");
        assertionsValidSearch(7, 31, 7, "Monday");
        assertionsValidSearch(7, 31, 8, "Thursday");
        assertionsValidSearch(7, 30, 9, "Saturday");
        assertionsValidSearch(7, 31, 10, "Tuesday");
        assertionsValidSearch(7, 30, 11, "Thursday");
        assertionsValidSearch(7, 31, 12, "Sunday");

        //Eight March
        assertionsValidSearch(1, 8, 3, "Thursday");
        assertionsValidSearch(2, 8, 3, "Friday");
        assertionsValidSearch(3, 8, 3, "Saturday");
        assertionsValidSearch(4, 8, 3, "Sunday");
        assertionsValidSearch(5, 8, 3, "Monday");
        assertionsValidSearch(6, 8, 3, "Tuesday");
        assertionsValidSearch(7, 8, 3, "Wednesday");
        //Valentine's Day
        assertionsValidSearch(1, 14, 2, "Wednesday");
        assertionsValidSearch(2, 14, 2, "Thursday");
        assertionsValidSearch(3, 14, 2, "Friday");
        assertionsValidSearch(4, 14, 2, "Saturday");
        assertionsValidSearch(5, 14, 2, "Sunday");
        assertionsValidSearch(6, 14, 2, "Monday");
        assertionsValidSearch(7, 14, 2, "Tuesday");
        //Sunday when the start of new year is 2
        assertionsValidSearch(2, 6, 1, "Sunday");
        assertionsValidSearch(2, 13, 1, "Sunday");
        assertionsValidSearch(2, 20, 1, "Sunday");
        assertionsValidSearch(2, 27, 1, "Sunday");
        assertionsValidSearch(2, 3, 2, "Sunday");
        assertionsValidSearch(2, 10, 2, "Sunday");
        assertionsValidSearch(2, 17, 2, "Sunday");
        assertionsValidSearch(2, 24, 2, "Sunday");
        assertionsValidSearch(2, 3, 3, "Sunday");
        assertionsValidSearch(2, 10, 3, "Sunday");
        assertionsValidSearch(2, 17, 3, "Sunday");
        assertionsValidSearch(2, 24, 3, "Sunday");
        assertionsValidSearch(2, 31, 3, "Sunday");
        assertionsValidSearch(2, 7, 4, "Sunday");
        assertionsValidSearch(2, 14, 4, "Sunday");
        assertionsValidSearch(2, 21, 4, "Sunday");
        assertionsValidSearch(2, 28, 4, "Sunday");
        assertionsValidSearch(2, 5, 5, "Sunday");
        assertionsValidSearch(2, 12, 5, "Sunday");
        assertionsValidSearch(2, 19, 5, "Sunday");
        assertionsValidSearch(2, 26, 5, "Sunday");
        assertionsValidSearch(2, 2, 6, "Sunday");
        assertionsValidSearch(2, 9, 6, "Sunday");
        assertionsValidSearch(2, 16, 6, "Sunday");
        assertionsValidSearch(2, 23, 6, "Sunday");
        assertionsValidSearch(2, 30, 6, "Sunday");
        assertionsValidSearch(2, 7, 7, "Sunday");
        assertionsValidSearch(2, 14, 7, "Sunday");
        assertionsValidSearch(2, 21, 7, "Sunday");
        assertionsValidSearch(2, 28, 7, "Sunday");
        assertionsValidSearch(2, 4, 8, "Sunday");
        assertionsValidSearch(2, 11, 8, "Sunday");
        assertionsValidSearch(2, 18, 8, "Sunday");
        assertionsValidSearch(2, 25, 8, "Sunday");
        assertionsValidSearch(2, 1, 9, "Sunday");
        assertionsValidSearch(2, 8, 9, "Sunday");
        assertionsValidSearch(2, 15, 9, "Sunday");
        assertionsValidSearch(2, 22, 9, "Sunday");
        assertionsValidSearch(2, 29, 9, "Sunday");
        assertionsValidSearch(2, 6, 10, "Sunday");
        assertionsValidSearch(2, 13, 10, "Sunday");
        assertionsValidSearch(2, 20, 10, "Sunday");
        assertionsValidSearch(2, 27, 10, "Sunday");
        assertionsValidSearch(2, 3, 11, "Sunday");
        assertionsValidSearch(2, 10, 11, "Sunday");
        assertionsValidSearch(2, 17, 11, "Sunday");
        assertionsValidSearch(2, 24, 11, "Sunday");
        assertionsValidSearch(2, 1, 12, "Sunday");
        assertionsValidSearch(2, 8, 12, "Sunday");
        assertionsValidSearch(2, 15, 12, "Sunday");
        assertionsValidSearch(2, 22, 12, "Sunday");
        assertionsValidSearch(2, 29, 12, "Sunday");
        //------Random
        assertionsValidSearch(1, 3, 9, "Monday");
        assertionsValidSearch(1, 6, 2, "Tuesday");
        assertionsValidSearch(1, 7, 2, "Wednesday");
        assertionsValidSearch(1, 15, 11, "Thursday");
        assertionsValidSearch(1, 21, 12, "Friday");
        assertionsValidSearch(2, 3, 9, "Tuesday");
        assertionsValidSearch(2, 7, 5, "Tuesday");
        assertionsValidSearch(2, 7, 11, "Thursday");
        assertionsValidSearch(2, 10, 10, "Thursday");
        assertionsValidSearch(2, 14, 11, "Thursday");
        assertionsValidSearch(3, 3, 8, "Sunday");
        assertionsValidSearch(3, 4, 7, "Friday");
        assertionsValidSearch(3, 9, 6, "Monday");
        assertionsValidSearch(3, 7, 10, "Tuesday");
        assertionsValidSearch(3, 15, 4, "Tuesday");
        assertionsValidSearch(3, 15, 12, "Monday");
        assertionsValidSearch(4, 1, 10, "Thursday");
        assertionsValidSearch(4, 3, 1, "Saturday");
        assertionsValidSearch(4, 5, 9, "Saturday");
        assertionsValidSearch(4, 28, 7, "Tuesday");
        assertionsValidSearch(5, 6, 1, "Wednesday");
        assertionsValidSearch(5, 12, 3, "Friday");
        assertionsValidSearch(5, 16, 6, "Wednesday");
        assertionsValidSearch(6, 1, 4, "Friday");
        assertionsValidSearch(6, 6, 6, "Monday");
        assertionsValidSearch(6, 7, 1, "Friday");
        assertionsValidSearch(6, 11, 7, "Monday");
        assertionsValidSearch(6, 12, 8, "Friday");
        assertionsValidSearch(7, 1, 6, "Thursday");
        assertionsValidSearch(7, 8, 9, "Friday");
        assertionsValidSearch(7, 13, 5, "Saturday");
        assertionsValidSearch(7, 17, 4, "Monday");
        assertionsValidSearch(7, 22, 1, "Sunday");
        assertionsValidSearch(7, 22, 5, "Monday");

    }

    @Test
    void searchNotValid() {
        String errorInputFirstArgument = "Week has 7 days\r\nExpected: from 1 to 7\r\nGot: ";
        //-----First argument
        //-------Start of month
        assertionsNotValidFirstArgument(null, "1", "1", errorInputFirstArgument + "null");
        assertionsNotValidFirstArgument(null, "1", "2", errorInputFirstArgument + "null");
        assertionsNotValidFirstArgument(null, "1", "3", errorInputFirstArgument + "null");
        assertionsNotValidFirstArgument(null, "1", "4", errorInputFirstArgument + "null");
        assertionsNotValidFirstArgument(null, "1", "5", errorInputFirstArgument + "null");
        assertionsNotValidFirstArgument(null, "1", "6", errorInputFirstArgument + "null");
        assertionsNotValidFirstArgument(null, "1", "7", errorInputFirstArgument + "null");
        assertionsNotValidFirstArgument(null, "1", "8", errorInputFirstArgument + "null");
        assertionsNotValidFirstArgument(null, "1", "9", errorInputFirstArgument + "null");
        assertionsNotValidFirstArgument(null, "1", "10", errorInputFirstArgument + "null");
        assertionsNotValidFirstArgument(null, "1", "11", errorInputFirstArgument + "null");
        assertionsNotValidFirstArgument(null, "1", "12", errorInputFirstArgument + "null");

        //-------End of month
        assertionsNotValidFirstArgument(null, "31", "1", errorInputFirstArgument + "null");
        assertionsNotValidFirstArgument(null, "28", "2", errorInputFirstArgument + "null");
        assertionsNotValidFirstArgument(null, "31", "3", errorInputFirstArgument + "null");
        assertionsNotValidFirstArgument(null, "30", "4", errorInputFirstArgument + "null");
        assertionsNotValidFirstArgument(null, "31", "5", errorInputFirstArgument + "null");
        assertionsNotValidFirstArgument(null, "30", "6", errorInputFirstArgument + "null");
        assertionsNotValidFirstArgument(null, "31", "7", errorInputFirstArgument + "null");
        assertionsNotValidFirstArgument(null, "31", "8", errorInputFirstArgument + "null");
        assertionsNotValidFirstArgument(null, "30", "9", errorInputFirstArgument + "null");
        assertionsNotValidFirstArgument(null, "31", "10", errorInputFirstArgument + "null");
        assertionsNotValidFirstArgument(null, "30", "11", errorInputFirstArgument + "null");
        assertionsNotValidFirstArgument(null, "31", "12", errorInputFirstArgument + "null");

        //-----Second and third argument
        combinationsNotValidForSecondAndThirdArgument(1);
        combinationsNotValidForSecondAndThirdArgument(2);
        combinationsNotValidForSecondAndThirdArgument(3);
        combinationsNotValidForSecondAndThirdArgument(4);
        combinationsNotValidForSecondAndThirdArgument(5);
        combinationsNotValidForSecondAndThirdArgument(6);
        combinationsNotValidForSecondAndThirdArgument(7);

        //Character values
        String errorFirstArgumentString = "The day of new year: Week has 7 days\r\nExpected: from 1 to 7\r\nGot: ";
        String errorSecondArgumentString = "The day of new year: Day you need to find: Expected: from 1 to 31\r\nGot: ";
        String errorThirdArgumentString = "The day of new year: Day you need to find: Month you need to find: Year has 12 months\r\nExpected: from 1 to 12\r\nGot: ";

        assertionsNotValidMain("abcd", "number", "input", errorFirstArgumentString + "abcd");
        assertionsNotValidMain("number", "1", "1", errorFirstArgumentString + "number");
        assertionsNotValidMain("1", "number", "1", errorSecondArgumentString + "number");
        assertionsNotValidMain("1", "1", "number", errorThirdArgumentString + "number");
        assertionsNotValidMain("!@-", "_87", "/", errorFirstArgumentString + "!@-");
        assertionsNotValidMain("&54", "1", "1", errorFirstArgumentString + "&54");
        assertionsNotValidMain("1", "_4_", "1", errorSecondArgumentString + "_4_");
        assertionsNotValidMain("1", "1", "54_", errorThirdArgumentString + "54_");
    }

    //------The check method for valid arguments
    void assertionsValidSearch(int startYear, int searchDay, int searchMonth, String searchedDay) {
        DaysOfWeek searchedDayOfWeek = Calendar.searchDay(DaysOfWeek.values()[startYear - 1], searchDay, MonthsInYear.values()[searchMonth - 1]);

        assertEquals(DaysOfWeek.valueOf(searchedDay), searchedDayOfWeek);
        assertionsValidSearchMain(startYear, searchDay, searchMonth, searchedDay);
    }

    //------The check method for valid arguments
    void assertionsValidSearchMain(int startYear, int searchDay, int searchMonth, String searchedDay) {
        String input = startYear + System.lineSeparator() + searchDay + System.lineSeparator() + searchMonth;
        String result = main(input);
        String expected = "Welcome!\r\nEnter values:\r\n" +
                "The day of new year: Day you need to find: Month you need to find: " + searchedDay;

        assertEquals(expected, result);
    }

    //------The check method for invalid first argument for method searchDay()
    void assertionsNotValidFirstArgument(DaysOfWeek startYear, String searchDayStr, String searchMonthStr, String errorMethod) {
        int searchDay = Integer.valueOf(searchDayStr);
        MonthsInYear searchMonth = MonthsInYear.of(Integer.valueOf(searchMonthStr));

        try {
            Calendar.searchDay(startYear, searchDay, searchMonth);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals(errorMethod, e.getMessage());
        }
        String nameOfFirstParameter = "The day of new year: ";
        assertionsNotValidMain("null", searchDayStr, searchMonthStr, nameOfFirstParameter + errorMethod);
    }

    void assertionsNotValidMain(String startYear, String searchDay, String searchMonth, String error) {
        String input = startYear + System.lineSeparator() + searchDay + System.lineSeparator() + searchMonth;
        String result = main(input);
        String expected = "Welcome!\r\nEnter values:\r\n" + error;

        assertEquals(expected, result);

    }

    //------The check method for invalid second argument
    void assertionsNotForSecondArgument(String startYearStr, String searchDayStr, String searchMonthStr, String errorMethod) {
        DaysOfWeek startYear = DaysOfWeek.of(Integer.valueOf(startYearStr));
        int searchDay = Integer.valueOf(searchDayStr);
        MonthsInYear searchMonth = MonthsInYear.of(Integer.valueOf(searchMonthStr));

        String error = "Month #" + searchMonthStr + " (" + searchMonth + ") " + errorMethod;

        try {
            Calendar.searchDay(startYear, searchDay, searchMonth);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals(error, e.getMessage());
        }

        String printThreeName = "The day of new year: Day you need to find: Month you need to find: ";
        assertionsNotValidMain(startYearStr, searchDayStr, searchMonthStr, printThreeName + error);
    }

    //------The check method for invalid first argument for method searchDay()
    void assertionsNotValidThirdArgument(String startYearStr, String searchDayStr, MonthsInYear searchMonth) {
        DaysOfWeek startYear = DaysOfWeek.of(Integer.valueOf(startYearStr));
        int searchDay = Integer.valueOf(searchDayStr);
        String errorMethod = "Year has 12 months\r\nExpected: from 1 to 12\r\nGot: null";

        try {
            Calendar.searchDay(startYear, searchDay, searchMonth);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals(errorMethod, e.getMessage());
        }
        String error = "The day of new year: Day you need to find: Month you need to find: " +
                "Year has 12 months\r\nExpected: from 1 to 12\r\nGot: null";
        assertionsNotValidMain(startYearStr, searchDayStr, "null", error);
    }

    //----The method imitates console enter from user, and returns string output in console
    String main(String input) {
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(input.getBytes());
        System.setIn(byteArrayInputStream);

        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));
        Task5Calendar.main(new String[0]);

        return outputStream.toString().trim();
    }

    //----The method combines for second arguments
    void combinationsNotValidForSecondAndThirdArgument(int startYear) {
        String startYearString = Integer.valueOf(startYear).toString();
        String errorForSecondArgument = "has less or more days then you entered\r\nExpected: from 1 to ";

        //Second argument
        assertionsNotForSecondArgument(startYearString, "0", "1", errorForSecondArgument + "31\r\nGot: 0");
        assertionsNotForSecondArgument(startYearString, "0", "2", errorForSecondArgument + "28\r\nGot: 0");
        assertionsNotForSecondArgument(startYearString, "0", "3", errorForSecondArgument + "31\r\nGot: 0");
        assertionsNotForSecondArgument(startYearString, "0", "4", errorForSecondArgument + "30\r\nGot: 0");
        assertionsNotForSecondArgument(startYearString, "0", "5", errorForSecondArgument + "31\r\nGot: 0");
        assertionsNotForSecondArgument(startYearString, "0", "6", errorForSecondArgument + "30\r\nGot: 0");
        assertionsNotForSecondArgument(startYearString, "0", "7", errorForSecondArgument + "31\r\nGot: 0");
        assertionsNotForSecondArgument(startYearString, "0", "8", errorForSecondArgument + "31\r\nGot: 0");
        assertionsNotForSecondArgument(startYearString, "0", "9", errorForSecondArgument + "30\r\nGot: 0");
        assertionsNotForSecondArgument(startYearString, "0", "10", errorForSecondArgument + "31\r\nGot: 0");
        assertionsNotForSecondArgument(startYearString, "0", "11", errorForSecondArgument + "30\r\nGot: 0");
        assertionsNotForSecondArgument(startYearString, "0", "12", errorForSecondArgument + "31\r\nGot: 0");
        assertionsNotForSecondArgument(startYearString, "32", "1", errorForSecondArgument + "31\r\nGot: 32");
        assertionsNotForSecondArgument(startYearString, "29", "2", errorForSecondArgument + "28\r\nGot: 29");
        assertionsNotForSecondArgument(startYearString, "32", "3", errorForSecondArgument + "31\r\nGot: 32");
        assertionsNotForSecondArgument(startYearString, "31", "4", errorForSecondArgument + "30\r\nGot: 31");
        assertionsNotForSecondArgument(startYearString, "32", "5", errorForSecondArgument + "31\r\nGot: 32");
        assertionsNotForSecondArgument(startYearString, "31", "6", errorForSecondArgument + "30\r\nGot: 31");
        assertionsNotForSecondArgument(startYearString, "32", "7", errorForSecondArgument + "31\r\nGot: 32");
        assertionsNotForSecondArgument(startYearString, "32", "8", errorForSecondArgument + "31\r\nGot: 32");
        assertionsNotForSecondArgument(startYearString, "31", "9", errorForSecondArgument + "30\r\nGot: 31");
        assertionsNotForSecondArgument(startYearString, "32", "10", errorForSecondArgument + "31\r\nGot: 32");
        assertionsNotForSecondArgument(startYearString, "31", "11", errorForSecondArgument + "30\r\nGot: 31");
        assertionsNotForSecondArgument(startYearString, "32", "12", errorForSecondArgument + "31\r\nGot: 32");
        //Third argument
        assertionsNotValidThirdArgument(startYearString, "1", null);
        assertionsNotValidThirdArgument(startYearString, "2", null);
        assertionsNotValidThirdArgument(startYearString, "3", null);
        assertionsNotValidThirdArgument(startYearString, "4", null);
        assertionsNotValidThirdArgument(startYearString, "5", null);
        assertionsNotValidThirdArgument(startYearString, "6", null);
        assertionsNotValidThirdArgument(startYearString, "7", null);
        assertionsNotValidThirdArgument(startYearString, "8", null);
        assertionsNotValidThirdArgument(startYearString, "9", null);
        assertionsNotValidThirdArgument(startYearString, "10", null);
        assertionsNotValidThirdArgument(startYearString, "11", null);
        assertionsNotValidThirdArgument(startYearString, "12", null);
        assertionsNotValidThirdArgument(startYearString, "13", null);
        assertionsNotValidThirdArgument(startYearString, "14", null);
        assertionsNotValidThirdArgument(startYearString, "15", null);
        assertionsNotValidThirdArgument(startYearString, "16", null);
        assertionsNotValidThirdArgument(startYearString, "17", null);
        assertionsNotValidThirdArgument(startYearString, "18", null);
        assertionsNotValidThirdArgument(startYearString, "19", null);
        assertionsNotValidThirdArgument(startYearString, "20", null);
        assertionsNotValidThirdArgument(startYearString, "21", null);
        assertionsNotValidThirdArgument(startYearString, "22", null);
        assertionsNotValidThirdArgument(startYearString, "23", null);
        assertionsNotValidThirdArgument(startYearString, "24", null);
        assertionsNotValidThirdArgument(startYearString, "25", null);
        assertionsNotValidThirdArgument(startYearString, "26", null);
        assertionsNotValidThirdArgument(startYearString, "27", null);
        assertionsNotValidThirdArgument(startYearString, "28", null);
        assertionsNotValidThirdArgument(startYearString, "29", null);
        assertionsNotValidThirdArgument(startYearString, "30", null);
        assertionsNotValidThirdArgument(startYearString, "31", null);
    }

    //----The method combines for third arguments
    void combinationsNotValidForThirdArgument(int startYear) {

    }

}