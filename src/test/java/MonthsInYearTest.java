import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

class MonthsInYearTest {

    @Test
    void validValue() {
        assertEquals(MonthsInYear.January, MonthsInYear.of(1));
        assertEquals(MonthsInYear.February, MonthsInYear.of(2));
        assertEquals(MonthsInYear.March, MonthsInYear.of(3));
        assertEquals(MonthsInYear.April, MonthsInYear.of(4));
        assertEquals(MonthsInYear.May, MonthsInYear.of(5));
        assertEquals(MonthsInYear.June, MonthsInYear.of(6));
        assertEquals(MonthsInYear.July, MonthsInYear.of(7));
        assertEquals(MonthsInYear.August, MonthsInYear.of(8));
        assertEquals(MonthsInYear.September, MonthsInYear.of(9));
        assertEquals(MonthsInYear.October, MonthsInYear.of(10));
        assertEquals(MonthsInYear.November, MonthsInYear.of(11));
        assertEquals(MonthsInYear.December, MonthsInYear.of(12));
    }

    @Test
    void notValidValue() {
        String errorForThirdArgument = "Year has 12 months\r\nExpected: from 1 to 12\r\nGot: ";

        assertionsNotValidOf(0, errorForThirdArgument + "0");
        assertionsNotValidOf(13, errorForThirdArgument + "13");


        //Third argument is invalid NULL
        combination(1);
        combination(2);
        combination(3);
        combination(4);
        combination(5);
        combination(6);
        combination(7);
    }

    //------The check method for null
    void assertionsNotValidOf(int searchMonthStr, String errorMethod) {
        try {
            MonthsInYear.of(searchMonthStr);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals(errorMethod, e.getMessage());
        }
    }

    //------The check method for invalid first argument for method searchDay()
    void assertionsNotValidNULL(int startYearInt, String searchDayStr, MonthsInYear searchMonth) {
        DaysOfWeek startYear = DaysOfWeek.of(startYearInt);
        int searchDay = Integer.valueOf(searchDayStr);
        String errorMethod = "Year has 12 months\r\nExpected: from 1 to 12\r\nGot: null";

        try {
            Calendar.searchDay(startYear, searchDay, searchMonth);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals(errorMethod, e.getMessage());
        }

        assertionsNotValidMain(startYearInt, searchDayStr, null);
    }

    //------The check method for invalid first argument for method searchDay()
    void assertionsNotValidMain(int startYear, String searchDay, String searchMonth) {
        String input = startYear + System.lineSeparator() + searchDay + System.lineSeparator() + searchMonth;
        String result = main(input);
        String expected = "Welcome!\r\nEnter values:\r\n" +
                "The day of new year: Day you need to find: Month you need to find: " +
                "Year has 12 months\r\nExpected: from 1 to 12\r\nGot: null";

        assertEquals(expected, result);
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

    void combination(int startYear) {
        assertionsNotValidNULL(startYear, "1", null);
        assertionsNotValidNULL(startYear, "2", null);
        assertionsNotValidNULL(startYear, "3", null);
        assertionsNotValidNULL(startYear, "4", null);
        assertionsNotValidNULL(startYear, "5", null);
        assertionsNotValidNULL(startYear, "6", null);
        assertionsNotValidNULL(startYear, "7", null);
        assertionsNotValidNULL(startYear, "8", null);
        assertionsNotValidNULL(startYear, "9", null);
        assertionsNotValidNULL(startYear, "10", null);
        assertionsNotValidNULL(startYear, "11", null);
        assertionsNotValidNULL(startYear, "12", null);
        assertionsNotValidNULL(startYear, "13", null);
        assertionsNotValidNULL(startYear, "14", null);
        assertionsNotValidNULL(startYear, "15", null);
        assertionsNotValidNULL(startYear, "16", null);
        assertionsNotValidNULL(startYear, "17", null);
        assertionsNotValidNULL(startYear, "18", null);
        assertionsNotValidNULL(startYear, "19", null);
        assertionsNotValidNULL(startYear, "20", null);
        assertionsNotValidNULL(startYear, "21", null);
        assertionsNotValidNULL(startYear, "22", null);
        assertionsNotValidNULL(startYear, "23", null);
        assertionsNotValidNULL(startYear, "24", null);
        assertionsNotValidNULL(startYear, "25", null);
        assertionsNotValidNULL(startYear, "26", null);
        assertionsNotValidNULL(startYear, "27", null);
        assertionsNotValidNULL(startYear, "28", null);
        assertionsNotValidNULL(startYear, "29", null);
        assertionsNotValidNULL(startYear, "30", null);
        assertionsNotValidNULL(startYear, "31", null);
    }
}