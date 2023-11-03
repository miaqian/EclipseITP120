/**
 *
 */
package Array;

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
     * main method
     *
     * @param args ignore
     */
    public static void main(String[] args) {
        System.out.println("Enter arrya size: ");
        int size = input.nextInt();

        //create an array
        int[] numbers = new int[size];
        inputArrayValues(numbers);
        input.close();
    }

/**
 *
 * Place a description of your method here.
 *
 * @param numbers
 */
    private static void inputArrayValues(int[] numbers) {
        // TODO Auto-generated method stub

    }

}
