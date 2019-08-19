import java.math.BigDecimal;

/**
 * This class calculates floor number and entrance number by number apartment
 *
 * @author Levchenko Daria
 */
public class House {

    /**
     * The constant stores maximum legal value for argument
     */
    public static final int MAX_LEGAL_ARGUMENT = Integer.MAX_VALUE;

    /**
     * The constant stores minimum legal value for argument
     */
    public static final int MIN_LEGAL_ARGUMENT = 1;

    /**
     * Declaring variable which stores the number of floors in house
     */
    private int floors;

    /**
     * Declaring variable which stores the number of apartments on floor
     */
    private int apartmentsOnFloor;

    /**
     * Declaring variable which stores the number of apartments in one entrance
     */
    private BigDecimal amountApartmentsInEntrance;

    /**
     * Initializes a new {@code House} object with arguments
     * {@code floors} and {@code apartmentsOnFloor}.
     * Also the constructor initializes {@code amountApartmentsInEntrance}
     * by call {@code amountApartmentsInEntrance()}
     *
     * @param floors            Total amount of floors in this house
     * @param apartmentsOnFloor Number of floor on one entrance
     */
    House(int floors, int apartmentsOnFloor) {
        this.floors = checkData(floors);
        this.apartmentsOnFloor = checkData(apartmentsOnFloor);
        this.amountApartmentsInEntrance = amountApartmentsInEntrance();
    }

    /**
     * Method calculates total amount apartment in entrance.
     * Returns the product of the {@code floors, apartmentsOnFloor)}
     *
     * @return Total amount of apartment in one entrance
     */
    private BigDecimal amountApartmentsInEntrance() {
        BigDecimal floorsTotalNumberBIG = BigDecimal.valueOf(floors);
        BigDecimal apartmentsOnFloorBIG = BigDecimal.valueOf(apartmentsOnFloor);

        return floorsTotalNumberBIG.multiply(apartmentsOnFloorBIG);
    }

    /**
     * Method returns the entrance number which was find by the number apartment
     *
     * @param apartmentNumber Number of apartment which needs to find
     * @return The entrance number
     */
    public int entranceNumber(int apartmentNumber) {
        checkData(apartmentNumber);
        double entranceNumber = (double) apartmentNumber / amountApartmentsInEntrance.doubleValue();

        return (int) Math.ceil(entranceNumber);
    }

    /**
     * Returns the floor number where apartment locates
     *
     * @param apartmentNumber Apartment number
     * @return Number floor
     */
    public int floorNumber(int apartmentNumber) {
        checkData(apartmentNumber);
        int entrance = entranceNumber(apartmentNumber);
        int amountApartmentsInAllPreviousEntrances = (amountApartmentsInEntrance.intValue()) * (entrance - 1);

        double floorNumber = (double) (apartmentNumber - amountApartmentsInAllPreviousEntrances) / apartmentsOnFloor;

        return (int) Math.ceil(floorNumber);
    }

    /**
     * The method checks data
     *
     * @param input The number which needs to check
     * @return The legal number
     * @throws IllegalArgumentException If entered number less then 1
     */
    public static int checkData(int input) throws IllegalArgumentException {
        if (input < MIN_LEGAL_ARGUMENT) {
            throw new IllegalArgumentException("Expected: from " + MIN_LEGAL_ARGUMENT +
                    " to " + MAX_LEGAL_ARGUMENT + "\r\n" +
                    "Got: " + input);
        } else {
            return input;
        }

    }
}
