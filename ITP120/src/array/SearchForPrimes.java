/**
 *
 */
package array;

import java.util.Scanner;

/**
 * Create an array with user input and check if there are any prime numbers Display the count of
 * primes in the array Change all non-primes in the array to 0
 *
 * @author huiziqian
 * @version November 1, 2023
 *
 */
public class SearchForPrimes {
    private static Scanner input = new Scanner(System.in);

    /**
     *
     * main method
     *
     * @param args ignore
     */
    public static void main(String[] args) {
        System.out.println("Enter array size:");
        int size = input.nextInt();

        int[] numbers = new int[size];
        inputArrayValues(numbers);

        int count = countPrimes(numbers);
        System.out.printf("Count of primes: %d\n", count);
        input.close();
    }

    /**
     *
     * Count the number of primes in an array
     *
     * @param numValues
     * @return int
     */
    private static int countPrimes(int[] numValues) {
        int count = 0;

        for (int idx = 0; idx < numValues.length; idx++) {
            if (isPrime(numValues[idx])) {
                count++;
            }
        }

        return count;
    }

    /**
     *
     * Check if a number is prime
     *
     * @param value
     * @return boolean
     */
    private static boolean isPrime(int value) {
        if (value < 2) {
            return false;
        }

        if (value == 2) {
            return true;
        }

        for (int div = 2; div <= (value / 2) + 1; div++) {
            if (value % div == 0) {
                return false;
            }
        }
        return true;
    }

    /**
     *
     * Populate the array
     *
     * @param intValues
     */
    private static void inputArrayValues(int[] intValues) {
        for (int idx = 0; idx < intValues.length; idx++) {
            System.out.print("Enter a number: ");
            intValues[idx] = input.nextInt();
        }
    }

}
