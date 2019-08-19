import java.util.Scanner;

/**
 * The class starts the process of calculating the greatest common divisor of four arguments
 *
 * @author Levchenko Daria
 */
public class Task3GCD {
    /**
     * The method reads data from console and checks this data
     *
     * @param scanner Scanner
     * @return The number
     * @throws IllegalArgumentException If {@code input} is string, is lower then minimum legal value
     *                                  or more then maximum legal value
     * @throws NumberFormatException    If has been passed string value {@code Integer.valueOf()}
     */
    public static int inputData(Scanner scanner) throws IllegalArgumentException {
        String input = scanner.nextLine();
        try {
            return Integer.valueOf(input);
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("Expected: integer type " + "\r\n" + "Got: " + input);
        }
    }

    /**
     * The method prints welcome message to user, launches calculate greatest common divisor of four arguments
     * and catches some exceptions
     *
     * @param args null
     * @throws IllegalArgumentException The method catches an invalid number value
     */
    public static void main(String[] args) {
        System.out.println("Welcome!");
        System.out.println("Enter 4 values:");

        Scanner scanner = new Scanner(System.in);

        try {
            int x = inputData(scanner);
            int y = inputData(scanner);
            int i = inputData(scanner);
            int j = inputData(scanner);

            int gcd = GCD.gcd(x, y, i, j);
            System.out.print("GCD = " + gcd);
        } catch (IllegalArgumentException e) {
            System.out.print(e.getMessage());
        }
    }
}
