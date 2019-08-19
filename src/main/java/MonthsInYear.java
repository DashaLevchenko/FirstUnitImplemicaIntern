/**
 * Enumeration total amount days in the month for a non-leap year
 */
enum MonthsInYear {

    /**
     * The singleton instance for the month of January with 31 days.
     * This has the numeric value of {@code 0}.
     */
    January(31),
    /**
     * The singleton instance for the month of February with 28 days.
     * This has the numeric value of {@code 1}.
     */
    February(28),
    /**
     * The singleton instance for the month of March with 31 days.
     * This has the numeric value of {@code 2}.
     */
    March(31),
    /**
     * The singleton instance for the month of April with 30 days.
     * This has the numeric value of {@code 3}.
     */
    April(30),
    /**
     * The singleton instance for the month of May with 31 days.
     * This has the numeric value of {@code 4}.
     */
    May(31),
    /**
     * The singleton instance for the month of June with 30 days.
     * This has the numeric value of {@code 5}.
     */
    June(30),
    /**
     * The singleton instance for the month of July with 31 days.
     * This has the numeric value of {@code 6}.
     */
    July(31),
    /**
     * The singleton instance for the month of August with 31 days.
     * This has the numeric value of {@code 7}.
     */
    August(31),
    /**
     * The singleton instance for the month of September with 30 days.
     * This has the numeric value of {@code 8}.
     */
    September(30),
    /**
     * The singleton instance for the month of October with 31 days.
     * This has the numeric value of {@code 9}.
     */
    October(31),
    /**
     * The singleton instance for the month of November with 30 days.
     * This has the numeric value of {@code 10}.
     */
    November(30),
    /**
     * The singleton instance for the month of December with 31 days.
     * This has the numeric value of {@code 11}.
     */
    December(31);


    /**
     * Declaring variable which stores total amount days in the month
     */
    private int totalDaysInMonth;

    /**
     * The constructor sets total days in month
     *
     * @param totalDaysInMonth The number of days in month
     */
    MonthsInYear(int totalDaysInMonth) {
        this.totalDaysInMonth = totalDaysInMonth;
    }

    /**
     * Obtains an instance of {@code MonthsInYear} from an {@code int} value.
     * {@code MonthsInYear} is an enum representing the 12 months of the year.
     * This factory allows the enum to be obtained from the {@code int} value.
     *
     * @param ordinal The month-of-year to represent, from 0 (January) to 11 (December)
     * @return The month-of-year, not null
     * @throws ArrayIndexOutOfBoundsException If the index is either negative
     *                                        or greater than or equal to the size of the array.
     */
    public static MonthsInYear of(int ordinal) throws IllegalArgumentException {
        try {
            return MonthsInYear.values()[ordinal - 1];
        } catch (ArrayIndexOutOfBoundsException e) {
            throw new IllegalArgumentException("Year has 12 months\r\n" + "Expected: from " + 1 + " to " +
                    MonthsInYear.values().length + "\r\n" + "Got: " + ordinal);
        }
    }

    /**
     * The method get total amount days in the month
     *
     * @return Total amount days in the month
     */
    public int getTotalDayInMonth() {
        return totalDaysInMonth;
    }
}
