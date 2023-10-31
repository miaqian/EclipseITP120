/**
 *
 */
package intro;

import java.util.Scanner;

/**
 * This class indicates the four Factorions in the range of 1 to 50000 using more Java Methods to
 * generate the output
 *
 * @author huiziqian
 * @version Oct 16, 2023
 *
 */
public class FindFactorions {

    /**
     * main
     *
     * @param args
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Text factorion:");
        int trueFactorion = input.nextInt();
        int originalInput = trueFactorion;
        if (getFactorion(trueFactorion)) {
            System.out.println("The factorions in the range of 1 and 50000 are:");
            while (trueFactorion > 0) {
                int digit = trueFactorion % 10;
                System.out.print(digit + "!");
                if (trueFactorion / 10 > 0) {
                    System.out.print(" + ");
                }
                trueFactorion /= 10;
            }
            System.out.println("\t" + originalInput);
        } else {
            System.out.println("Please restart.");
        }
        input.close();
    }

    /**
     * The getFactorion method calls the calculateFactorial method for each digit in the number. *
     *
     * @param number
     * @return boolean
     */
    private static boolean getFactorion(int number) {
        int originalNumber = number;
        int sumOfFactorials = 0;
        while (number > 0) {
            int digit = number % 10;
            sumOfFactorials += calculateFactorial(digit);
            number /= 10;
        }
        return sumOfFactorials == originalNumber;
    }

    /**
     *
     * The calculateFactorial method will calculate the factorial of a given number and return the
     * factorial value to the getFactorion method
     *
     * @param number
     * @return number
     */
    private static int calculateFactorial(int number) {
        int factorial = 1;
        int count = 1;
        do {
            factorial = factorial * count;
            count++;
        }
        while (count <= number);
        return factorial;
    }
}
