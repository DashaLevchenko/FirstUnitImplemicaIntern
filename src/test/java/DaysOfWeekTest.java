import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

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
}