/**
 * The class calculates the day of the week of a given day by start day new year
 *
 * @author Levchenko Daria
 */
public class Calendar {
    /**
     * Constant stores minimum days
     */
    private static final int MIN_LEGAL_ARGUMENT = 1;

    /**
     * The method calculates the day of the week of a given day by start day new year
     *
     * @param firstDayYear The start new year day
     * @param daySearch    The day which you need to find
     * @param searchMonth  The month which you need to find
     * @return Day of week
     * @throws IllegalArgumentException If day which need to search lower then 1 or more then days in month
     */
    public static DaysOfWeek searchDay(DaysOfWeek firstDayYear, int daySearch, MonthsInYear searchMonth) throws IllegalArgumentException {
        check(firstDayYear, daySearch, searchMonth);

        int daysFromStartYear = 0;
        for (int i = 0; i < searchMonth.ordinal(); i++) {
            daysFromStartYear += MonthsInYear.values()[i].getTotalDayInMonth();
        }

        int indexDayInWeek = (daysFromStartYear + daySearch + firstDayYear.ordinal()) % DaysOfWeek.values().length;

        if (indexDayInWeek == 0) {
            indexDayInWeek = DaysOfWeek.values().length;
        }

        return DaysOfWeek.values()[indexDayInWeek - 1];
    }

    public static void check(DaysOfWeek firstDayYear, int daySearch, MonthsInYear searchMonth) throws IllegalArgumentException {
        if (firstDayYear == null) {
            throw new IllegalArgumentException("Week has 7 days\r\n" + "Expected: from " + 1 + " to " +
                    DaysOfWeek.values().length + "\r\n" + "Got: " + firstDayYear);
        } else if (searchMonth == null) {
            throw new IllegalArgumentException("Year has 12 months\r\n" + "Expected: from " + 1 + " to " +
                    MonthsInYear.values().length + "\r\n" + "Got: " + searchMonth);
        } else if (daySearch > searchMonth.getTotalDayInMonth() || daySearch < MIN_LEGAL_ARGUMENT) {
            throw new IllegalArgumentException("Month #" + (searchMonth.ordinal() + 1) + " (" + searchMonth.name() + ") " +
                    "has less or more days then you entered\r\n" +
                    "Expected: from " + MIN_LEGAL_ARGUMENT + " to " +
                    searchMonth.getTotalDayInMonth() + "\r\n" + "Got: " + daySearch);
        }
    }
}
