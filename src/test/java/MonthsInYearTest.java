import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

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

}