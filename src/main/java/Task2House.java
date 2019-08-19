import java.util.Scanner;

/**
 * The class starts the process of calculating the floor number and the entrance number
 * by number apartment
 *
 * @author Levchenko Daria
 */
public class Task2House {
    /**
     * The method reads data from console and checks this data
     *
     * @param title   The title which prints before user's input
     * @param scanner Scanner
     * @return The number
     * @throws IllegalArgumentException if {@code input} is string, is lower then minimum legal value
     *                                  or more then maximum legal value
     * @throws NumberFormatException    If has been passed string value {@code Integer.valueOf()}
     */
    public static int inputData(String title, Scanner scanner) throws IllegalArgumentException {
        System.out.print(title);
        String input = scanner.nextLine();
        try {
            int number = Integer.valueOf(input);

            House.checkData(number);

            return number;
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("Expected: integer type " + "\r\n" + "Got: " + input);
        }
    }

    /**
     * The method prints welcome message to user,
     * launches calculate number floor and number entrance by number apartment programme
     * and catches some exceptions
     *
     * @param args null
     * @throws IllegalArgumentException If has been passed an illegal or inappropriate argument
     *                                  {@code inputData}
     */
    public static void main(String[] args) {
        System.out.println("Welcome!");
        System.out.println("Enter values:");

        Scanner scanner = new Scanner(System.in);

        try {
            int floors = inputData("Floors = ", scanner);
            int apartmentsOnFloor = inputData("Apartments on floor = ", scanner);
            int apartmentNumber = inputData("Number apartment = ", scanner);

            House house = new House(floors, apartmentsOnFloor);

            int floor = house.floorNumber(apartmentNumber);
            int entrance = house.entranceNumber(apartmentNumber);
            System.out.println(floor + " floor, " + entrance + " entrance");
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}
