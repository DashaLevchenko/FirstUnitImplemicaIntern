import java.math.BigInteger;
import java.util.Scanner;

/**
 * The class starts the process of calculating N-th Fibonacci number by N number
 *
 * @author Lechenko Daria
 */
public class Task4Fibonacci {
    /**
     * The constant keeps console line length
     */
    private static final int CHARACTERS_IN_LINE = 150;

    /**
     * The method divides a number into several lines
     *
     * @param f N-th number Fibonacci
     * @return String number Fibonacci
     */
    static String stringFibonacci(BigInteger f) {
        StringBuilder fibonacci = new StringBuilder(f.toString());
        int insertSeparator = CHARACTERS_IN_LINE;
        for (int i = 0; i < fibonacci.length(); i++) {
            if (i == insertSeparator) {
                fibonacci.insert(i, '\n');
                insertSeparator += (CHARACTERS_IN_LINE + 1);
            }
        }

        return fibonacci.toString();
    }

    /**
     * The method reads data from console and checks this data
     *
     * @param scanner Scanner
     * @return The number
     * @throws IllegalArgumentException if {@code input} is string
     * @throws NumberFormatException    If has been passed string value {@code Integer.valueOf()}
     */
    public static BigInteger inputData(Scanner scanner) throws IllegalArgumentException {
        String input = scanner.nextLine();

        try {
            return new BigInteger(input);
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("Expected: integer type " + "\r\n" + "Got: " + input);
        }
    }

    /**
     * The method prints welcome message to user, launches calculate number fibonacci programme
     * and catches exception
     *
     * @param args null
     * @throws IllegalArgumentException The method catches an invalid number value and characters value
     */
    public static void main(String[] args) {
        System.out.println("Welcome!");
        System.out.println("Enter value:");

        Scanner scanner = new Scanner(System.in);
        System.out.print("N = ");
        try {
            BigInteger n = inputData(scanner);
            BigInteger fibonacci = Fibonacci.fibonacci(n);
            System.out.print("N-th Fibonacci number = " + stringFibonacci(fibonacci));
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}
