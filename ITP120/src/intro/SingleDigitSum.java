/**
 *
 */
package intro;

import java.util.Scanner;

/**
 * This class demonstrate the calculation of add all input digits until the result has only one
 * digit. the input number will be bigger than 9 and how to use it.
 *
 * @author huiziqian
 * @version Oct 20, 2023
 *
 */
public class SingleDigitSum {

    /**
     * main
     *
     * @param args
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Repeatedly adding digits of a number....");
        System.out.println("Enter a number: ");
        int inputNum = input.nextInt();
        char yesorNo = input.next().charAt(0);

        if (inputNum < 10) {
            System.out.println("Invalid number. Try again!");
        } else {
            long sum = digitsSum(inputNum);
            int result = (int) digitsSum(sum);
            System.out.println("The sum of the digits of the number input: ");
            System.out.println(digitsSum(sum));
            System.out.println("Number: " + inputNum);
            System.out.println("Sum: " + "\t" + result);
        }
        System.out.println("Do you want to try again? Y/N: ");
        if (yesorNo == 'N') {
            System.out.println("Goodbye!");
        } else {
            System.out.println("Enter a number: ");

        }
        input.close();
    }

    /**
     *
     * This method gets the sum of all the input number's digit sum
     *
     * @param number
     * @return sum
     */
    private static long digitsSum(long number) {
        int digit = 0;
        int sum = 0;
        int sum2 = 0;
        while (number > 0) {
            digit = (int) number % 10;
            sum += digit;
            number = number / 10;
        }

        while (sum >= 10) {
            digit = sum % 10;
            sum2 += digit;
            sum = sum / 10;

        }
        return sum + sum2;
    }
}
