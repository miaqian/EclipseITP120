/**
 *
 */
package intro;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

/**
 * This class lets the user interact with the application and calculates fuel efficiency
 * used BigDecial to display two decimal result in the output
 * escaped sequence is used for the output format
 *
 * @author huiziqian
 * @version Sep 14, 2023
 *
 */
public class FuelEfficiency {

    /**
     * main method
     *
     * @param args
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("What's your start location:");
        String locationStart = input.nextLine();

        System.out.println("Displayed Millage before the trip: ");
        int startMillage = input.nextInt();

        input.nextLine();

        System.out.println("What's your destination:");
        String destination = input.nextLine();

        System.out.println("Displayed Millage when you've arrived: ");
        int endMillage = input.nextInt();

        System.out.println("How much gasline did you use ");
        int gasUsed = input.nextInt();

        double fuelEfficiency = (double) (endMillage - startMillage) / gasUsed;

        BigDecimal bd = new BigDecimal(fuelEfficiency).setScale(2, RoundingMode.HALF_UP);
        double resultFE = bd.doubleValue();
        System.out.println("Fuel Efficiency is " + resultFE + "mpg");
        input.close();

        if (startMillage < 0 || gasUsed < 0 || endMillage < 0) {
            System.out
                .println("Error: Odometer readings and gasoline used must be positive values.");
            System.exit(0);
        }

        System.out.println();

        System.out.println("Odometer Reading");

        System.out.println("\t" + locationStart + "\t" + startMillage);

        System.out.println("\t" + destination + "\t" + endMillage);

        System.out.println("Gasoline used" + "\t\t" + gasUsed);
        System.out.println("Fuel efficiency" + "\t\t" + resultFE + "mpg");

    }

}
