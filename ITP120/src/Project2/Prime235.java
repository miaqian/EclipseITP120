/**
 *
 */
package Project2;

import java.util.Scanner;

/**
 * This class uses a given range provided by the user to display all values who's only prime factors
 * are 2, 3, and 5
 *
 *
 * @author huiziqian
 * @version October 25, 2023
 *
 */
public class Prime235 {
    private static Scanner input = new Scanner(System.in);

    /**
     * main
     *
     * @param args ignore
     */
    public static void main(String[] args) {

        while (true) {
            System.out.print("Input lower limit: ");
            int lower = input.nextInt();

            System.out.print("Input upper limit: ");
            int upper = input.nextInt();
            System.out.println();
            System.out.println("The numbers with prime factors 2, 3, and 5 are");
            findSequence(lower, upper);

            if (lower >= 0 && upper >= 0 && lower < upper) {
                break;
            } else {
                System.out
                    .println("Invalid input. Please ensure lower < upper and both are positive.");
                System.out.println();
            }
        }
        input.close();
    }

    /**
     * This method uses a given range provided by the user to display all values who's only prime
     * factors are 2, 3, and 5
     *
     * @param lowerNum
     * @param upperNum
     *
     *
     */
    private static void findSequence(int lowerNum, int upperNum) {
        for (int i = lowerNum; i <= upperNum; i++) {
            if (findPrimeFactors(i)) {
                System.out.print(i + " = ");
                displayResult(i);
            }
        }
    }

    /**
     * This method check if a number's only prime factors are 2, 3, and 5
     *
     * @param num
     * @return check num == 1 is true
     *
     */
    private static boolean findPrimeFactors(int num) {
        while (num % 2 == 0) {
            num = num / 2;
        }
        while (num % 3 == 0) {
            num = num / 3;
        }
        while (num % 5 == 0) {
            num /= 5;
        }
        return num == 1;
    }

    /**
     * This method is to display all values who's only prime factors are 2, 3, and 5 in the
     * requested format
     *
     * @param num
     *
     */
    private static void displayResult(int num) {
        int exponent;
        exponent = countDivisibitly(num, 2);
        if (exponent >= 0) {
            System.out.print("2^" + exponent);
        }

        exponent = countDivisibitly(num, 3);
        if (exponent >= 0) {
            if (exponent >= 0) {
                System.out.print(" * ");
            }
            System.out.print("3^" + exponent);
        }

        exponent = countDivisibitly(num, 5);
        if (exponent >= 0) {
            if (exponent >= 0) {
                System.out.print(" * ");
            }
            System.out.print("5^" + exponent);
        }
        System.out.println();
    }

    /**
     * This method count the amount of time a number can divide a divisor and get 0 modulo
     *
     * @param num
     * @param divisor
     * @return count
     *
     */
    private static int countDivisibitly(int num, int divisor) {
        int count = 0;
        while (num % divisor == 0) {
            count++;
            num /= divisor;
        }
        return count;
    }
}
