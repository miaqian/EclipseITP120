package intro;

/**
 *
 */
import java.util.Scanner;

/**
 * This class calculates the number of coins needed to pay for parking
 *
 * Input the number of hours and any extra quarter hours needed for parking
 *
 * For example 2 Hours 2 extra quarter hours
 *
 * 120 minutes + 30 minutes = 150 minutes
 *
 * Convert the input hours to the number of 15 minute blocks
 *
 * 120 minutes in 15-minute blocks is 8 blocks
 *
 * Each 15 minute block costs 35 cents
 *
 * The parking meter accepts nickels, dimes and quarters
 *
 * Calculate the number of coins needed to put in an exact amount for the hours needed
 *
 * @author Huizi Qian
 * @version Exam 1
 *
 */
public class ParkingMeter {

    /**
     * main method
     *
     * @param args ignore
     */
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter number of hours: ");

        int hours = input.nextInt();

        System.out.print("Enter number of extra quarter hours: ");

        int quarterHours = input.nextInt();

        // TODO 1:
        // Convert the hours to 15 min blocks
        // Assume that the number of hours can divided into an exact number of 15 min blocks

        int blocks = hours * 4 + quarterHours;

        // TODO 2:
        // Calculate the amount to be paid

        double cost = blocks * 35;

        // TODO 3:
        // Calculate the minimum number of coins needed in nickels, dimes and quarters
        // You will have a combination of coins who's total value is equal to the cost of parking
        // You cannot use a loop or decision structure
        // Use casting where needed
        // The calculations need to be corrected below

        int quarters = (int) (cost / 25);

        int dimes = (int) (cost / 10);

        int nickels = (int) (cost / 5);

        int dollar5Bill = (int) (cost / 500);

        // TODO 4:
        // Output should be formatted and displayed
        // See the example shown below
        /*
         * Enter number of hours Quarters: 16 Dimes : 1 Nickels : 1
         */

        // TODO 5:
        // Display the approximate number of $5 bills that the customer may need as an alternative
        // method of payment
        // Hint: depending on the cost, this can be 0 or more
        // The total number of $5 bills need not cover the cost but should be at least close to that
        // value
        System.out.print("Quarters: ");
        System.out.printf("%,d\n", quarters);

        System.out.print("Dimes: ");
        System.out.printf("%,d\n", dimes);

        System.out.print("Nickels: ");
        System.out.printf("%,d\n", nickels);

        System.out.print("Estimated number of $5 bills: ");
        System.out.printf("%,d\n", dollar5Bill);

        input.close();

    }

}
