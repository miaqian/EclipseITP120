/**
 *
 */

package intro;

/**
 * This class demonstrates the different primitive Data types and how to declare variable. store
 * data into different data type to save memory or for efficiency
 *
 * @author Huizi Qian
 * @version Sep 3, 2023
 *
 */
public class PlaceValue {

    /**
     * main method
     *
     * @param args
     */
    public static void main(String[] args) {
        // assign a four digits number to a integer variable
        int fourDigitNum = 6804;
        // declare four variables data types as byte
        // simple math problem get the remainder
        byte ones = (byte) (fourDigitNum % 10);
        byte tens = (byte) (fourDigitNum / 10 % 10);
        byte hundres = (byte) (fourDigitNum / 100 % 10);
        byte thousands = (byte) (fourDigitNum / 1000 % 10);
        // add all digits together assign to sum
        int sum = ones + tens + hundres + thousands;
        System.out.println("The quotient when " + fourDigitNum + " is divided by " + sum + " is "
            + fourDigitNum / sum + ".");
        System.out.println("The remainder when " + fourDigitNum + " is divided by " + sum + " is "
            + fourDigitNum % sum + ".");
    }

}
