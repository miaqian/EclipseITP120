/**
 *
 */
package array;

import java.util.Scanner;

/**
 * Create a Java class called ArrayProduct that calculates the product of the values of two integer
 * arrays of the same length using their relative position
 * Get the array size from the user. The size must be in the range of 5 to 20 (both inclusive)
 *
 *
 *
 * @author huiziqian
 * @version Nov 3, 2023
 *
 */
public class ArrayProduct {
    private static Scanner scanner = new Scanner(System.in);

    /**
     * main method
     *
     * @param args ignore
     */
    public static void main(String[] args) {
        System.out.print("Enter the size of arrays (between 5 and 20): ");
        int size = scanner.nextInt();
        if (size >= 5 && size <= 20) {
            int[] array1 = createArray(size);
            int[] array2 = createArray(size);
            System.out.println("size of arrays: " + size);
            System.out.println("array_1 created from user input: " + arrayToString(array1));
            System.out.println("array_2 created from user input: " + arrayToString(array2));
            System.out.println(
                "Product of both arrays: " + arrayToString(calculateProduct(array1, array2)));
        } else {
            System.out.println("Array size is out of the specified range.");
        }
        scanner.close();
    }

    /**
     *
     * this method create array size base on the user input
     *
     * @param size user's input
     * @return array
     */
    public static int[] createArray(int size) {
        int[] array = new int[size];
        System.out.print("Enter values for the array (separated by spaces): ");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }
        return array;
    }

    /**
     *
     * this method calculate the product of each element in both arrays at the same index
     *
     * @param array1 one of two arrays
     * @param array2 one of two arrays
     * @return productArray
     */
    public static int[] calculateProduct(int[] array1, int[] array2) {
        if (array1.length != array2.length) {
            System.out.println("Arrays must be of equal length.");
            System.exit(1);
        }

        int[] productArray = new int[array1.length];

        for (int i = 0; i < array1.length; i++) {
            productArray[i] = array1[i] * array2[i];
        }

        return productArray;

    }

    /**
     *
     * change the result array to string and format the output
     *
     * @param array change array to string for output
     * @return result
     */
    public static String arrayToString(int[] array) {
        if (array.length == 0) {
            return "";
        }

        String result = Integer.toString(array[0]);

        for (int i = 1; i < array.length; i++) {
            result += ", " + Integer.toString(array[i]);
        }

        return result;
    }
}
