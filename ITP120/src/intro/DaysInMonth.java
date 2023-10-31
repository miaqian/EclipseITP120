/**
 *
 */
package intro;

import java.util.Scanner;

/**
 * this class determine the days of a month input are year and month ues if else if construct and
 * nested if statement
 *
 * @author huiziqian
 * @version Sep 18, 2023
 *
 */
public class DaysInMonth {

    /**
     * main method
     *
     * @param args
     */

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter year: ");
        int year = input.nextInt();

        System.out.println("Enter month: ");
        int month = input.nextInt();
        int outputDays = 0;

        if (month == 2) {
            if ((year % 100 == 0 && year % 4 == 0) || (year % 100 != 0 && year % 4 == 0)) {
                outputDays = 29;
            } else {
                outputDays = 28;
            }
        } else if (month == 1
            || month == 3
            || month == 5
            || month == 7
            || month == 8
            || month == 10
            || month == 12) {
            outputDays = 31;
        } else if (month == 4 || month == 6 || month == 9 || month == 11) {
            outputDays = 30;
        } else {
            System.out.println("Please put in a proper number.");
        }
        System.out.println();
        System.out.printf("Enter year: %d\n", year);
        System.out.printf("Enter month (1-12): %d\n", month);
        System.out.printf("You've chosen %d/%d and it has %d days.", month, year, outputDays);
        input.close();
    }

}
