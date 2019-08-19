import static java.lang.Long.MAX_VALUE;
import static java.lang.Long.MIN_VALUE;

/**
 * This class swaps value variables without third variable
 *
 * @author Levchenko Daria
 */
public class Swap {

    /**
     * The constant stores maximum valid value
     */
    public static final Long MAX_LEGAL_ARGUMENT = MAX_VALUE;

    /**
     * The constant stores minimum valid value
     */
    public static final Long MIN_LEGAL_ARGUMENT = MIN_VALUE;

    /**
     * Declaration first variable for swapping
     */
    private long x;

    /**
     * Declaration second variable for swapping
     */
    private long y;

    /**
     * Initializes a new {@code Swap} object with
     * {@code x} and {@code y}
     *
     * @param x First parameter for swapping
     * @param y Second parameter for swapping
     */
    Swap(long x, long y) {
        this.x = x;
        this.y = y;
    }

    /**
     * This method takes two parameters, swaps their value without third variable
     */
    public void swap() {
        x = x + y;
        y = x - y;
        x = x - y;
    }

    /**
     * The method returns the value of x variable
     *
     * @return The value of x variable
     */
    public long getX() {
        return x;
    }

    /**
     * The method returns the value of y variable
     *
     * @return The value of y variable
     */
    public long getY() {
        return y;
    }

}
