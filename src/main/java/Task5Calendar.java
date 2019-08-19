import java.util.Scanner;

/**
 * The class starts the process of calculating the day of the week
 * of a given day by the beginning of the day of the new year.
 *
 * @author Levchenko Daria
 */
public class Task5Calendar {
    /**
     * The method reads number first day from console and checks
     *
     * @param scanner Scanner which reads input from console
     * @return Day of week
     * @throws IllegalArgumentException If {@code firstDayYear} is string, more or less then number of days in week
     * @throws NumberFormatException    If has been passed string value {@code Integer.valueOf()}
     */
    private static DaysOfWeek inputFirstDayOfYear(Scanner scanner) throws IllegalArgumentException {
        System.out.print("The day of new year: ");
        String input = scanner.nextLine();
        try {
            int firstDayYear = Integer.valueOf(input);

            return DaysOfWeek.of(firstDayYear);
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("Week has 7 days\r\n" + "Expected: from " + 1 + " to " +
                    DaysOfWeek.values().length + "\r\n" + "Got: " + input);
        }
    }

    /**
     * The method reads number month from console and checks
     *
     * @param scanner Scanner which reads input from console
     * @return Month
     * @throws IllegalArgumentException If {@code searchMonth} is string, more or less then number of months in year
     * @throws NumberFormatException    If has been passed string value {@code Integer.valueOf()}
     */
    private static MonthsInYear inputSearchMonth(Scanner scanner) throws IllegalArgumentException {
        System.out.print("Month you need to find: ");
        String input = scanner.nextLine();
        try {
            int searchMonth = Integer.valueOf(input);

            return MonthsInYear.of(searchMonth);
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("Year has 12 months\r\n" + "Expected: from " + 1 + " to " +
                    MonthsInYear.values().length + "\r\n" + "Got: " + input);
        }
    }

    /**
     * The method reads number day from console and catches some exception
     *
     * @param scanner Scanner which reads input from console
     * @return The number day
     * @throws IllegalArgumentException If {@code searchMonth} is string
     * @throws NumberFormatException    If has been passed string value {@code Integer.valueOf()}
     */
    private static int inputSearchDay(Scanner scanner) throws IllegalArgumentException {
        System.out.print("Day you need to find: ");
        String input = scanner.nextLine();
        try {
            return Integer.valueOf(input);
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("Expected: from 1 to 31" + "\r\n" + "Got: " + input);
        }
    }

    /**
     * The method prints welcome message to user, launches searching day programme and catches some exceptions
     *
     * @param args null
     * @throws IllegalArgumentException The method catches an invalid value of argument
     */
    public static void main(String[] args) {
        System.out.println("Welcome!");
        System.out.println("Enter values:");

        Scanner scanner = new Scanner(System.in);
        try {
            DaysOfWeek firstDayYear = inputFirstDayOfYear(scanner);
            int searchDay = inputSearchDay(scanner);
            MonthsInYear searchMonth = inputSearchMonth(scanner);

            DaysOfWeek searchedDayOfWeek = Calendar.searchDay(firstDayYear, searchDay, searchMonth);
            System.out.println(searchedDayOfWeek);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}
