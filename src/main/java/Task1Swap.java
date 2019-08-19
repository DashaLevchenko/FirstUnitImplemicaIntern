import java.util.Scanner;

/**
 * The class starts the process of swapping value two variables without third variable
 *
 * @author Levchenko Daria
 */
public class Task1Swap {
    /**
     * The method reads data from console and checks this data
     *
     * @param title   The title which prints before user's input
     * @param scanner Scanner
     * @return The number
     * @throws IllegalArgumentException if {@code input} is string, is lower then minimum legal value
     *                                  or more then maximum legal value
     * @throws NumberFormatException    If has been passed string value {@code Long.valueOf()}
     */
    public static long inputData(String title, Scanner scanner) throws IllegalArgumentException {
        System.out.print(title);
        String input = scanner.nextLine();
        try {
            return Long.valueOf(input);
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("Value is illegal\r\n" +
                    "Expected: from " + Swap.MIN_LEGAL_ARGUMENT + " to " + Swap.MAX_LEGAL_ARGUMENT + "\r\n" +
                    "Got: " + input);
        }
    }

    /**
     * The method launches swap program and catches some exceptions
     *
     * @param args command line arguments
     * @throws IllegalArgumentException if has been passed an illegal or inappropriate argument to method
     */
    public static void main(String[] args) {
        System.out.println("Welcome!");
        System.out.println("Enter values:");

        Scanner scanner = new Scanner(System.in);

        try {
            long x = inputData("x = ", scanner);
            long y = inputData("y = ", scanner);
            Swap swap = new Swap(x, y);

            swap.swap();

            System.out.println("Values swapped");
            System.out.print("x = " + swap.getX() + System.lineSeparator() +
                    "y = " + swap.getY());
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}

