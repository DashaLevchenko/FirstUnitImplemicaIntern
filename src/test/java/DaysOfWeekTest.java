import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

class DaysOfWeekTest {

    @Test
    void validValue() {
        assertEquals(DaysOfWeek.Monday, DaysOfWeek.of(1));
        assertEquals(DaysOfWeek.Tuesday, DaysOfWeek.of(2));
        assertEquals(DaysOfWeek.Wednesday, DaysOfWeek.of(3));
        assertEquals(DaysOfWeek.Thursday, DaysOfWeek.of(4));
        assertEquals(DaysOfWeek.Friday, DaysOfWeek.of(5));
        assertEquals(DaysOfWeek.Saturday, DaysOfWeek.of(6));
        assertEquals(DaysOfWeek.Sunday, DaysOfWeek.of(7));
    }

    @Test
    void notValidValue() {
        String errorInputFirstArgument = "Week has 7 days\r\nExpected: from 1 to 7\r\nGot: ";

        //------Invalid borders [7, 31, 12]
        assertionsNotValidOf("0", errorInputFirstArgument + "0");
        assertionsNotValidOf("8", errorInputFirstArgument + "8");



    }

    //------The check method for null
    void assertionsNotValidOf(String startYearStr, String errorMethod) {
        try {
            DaysOfWeek.of(Integer.valueOf(startYearStr));
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals(errorMethod, e.getMessage());
        }
    }

    //------The check method for invalid first argument for method searchDay()
    void assertionsNotValidNULL(DaysOfWeek startYear, String searchDayStr, String searchMonthStr, String errorMethod) {
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

    //------The check method for invalid first argument for method searchDay()
    void assertionsNotValidMain(String startYear, String searchDay, String searchMonth, String error) {
        String input = startYear + System.lineSeparator() + searchDay + System.lineSeparator() + searchMonth;
        String result = main(input);
        String expected = "Welcome!\r\nEnter values:\r\n" + error;

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
}