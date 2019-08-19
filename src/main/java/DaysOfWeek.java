/**
 * Enumeration days of the week
 */
public enum DaysOfWeek {
    /**
     * The singleton instance for the day-of-week of Monday.
     * This has the numeric value of {@code 0}.
     */
    Monday,
    /**
     * The singleton instance for the day-of-week of Tuesday.
     * This has the numeric value of {@code 1}.
     */
    Tuesday,
    /**
     * The singleton instance for the day-of-week of Wednesday.
     * This has the numeric value of {@code 2}.
     */
    Wednesday,
    /**
     * The singleton instance for the day-of-week of Thursday.
     * This has the numeric value of {@code 3}.
     */
    Thursday,
    /**
     * The singleton instance for the day-of-week of Friday.
     * This has the numeric value of {@code 4}.
     */
    Friday,
    /**
     * The singleton instance for the day-of-week of Saturday.
     * This has the numeric value of {@code 5}.
     */
    Saturday,
    /**
     * The singleton instance for the day-of-week of Sunday.
     * This has the numeric value of {@code 6}.
     */
    Sunday;

    /**
     * Obtains an instance of {@code DayOfWeek} from an {@code int} value.
     *
     * @param ordinal The day-of-week to represent, from 0 (Monday) to 6 (Sunday)
     * @return The day-of-week singleton, not null
     * @throws ArrayIndexOutOfBoundsException If the index is either negative
     *                                        or greater than or equal to the size of the array.
     */
    public static DaysOfWeek of(int ordinal) throws IllegalArgumentException {
        try {
            return DaysOfWeek.values()[ordinal - 1];
        } catch (ArrayIndexOutOfBoundsException e) {
            throw new IllegalArgumentException("Week has 7 days\r\n" + "Expected: from " + 1 + " to " +
                    DaysOfWeek.values().length + "\r\n" + "Got: " + ordinal);
        }
    }
}

