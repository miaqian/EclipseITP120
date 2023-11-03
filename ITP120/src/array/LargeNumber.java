/**
 *
 */
package array;

import java.util.Arrays;
import java.util.Scanner;

/**
 * This class represents Accept a large integer represented as an integer array (positive single
 * digit values only) called digits from the user, where each digits[i] is the ith digit of the
 * integer. The digits are ordered from most significant to least significant in right to left
 * order. The large integer does not contain any leading 0's. You can have zeros after the most
 * significant digit. purpose and how to use it.
 *
 * @author huiziqian
 * @version Nov 2, 2023
 *
 */
public class LargeNumber {
    private static Scanner input = new Scanner(System.in);

    /**
     * main method
     *
     * @param args ignore
     */
    public static void main(String[] args) {
        // input an array list
        System.out.print("Enter Array Size(size is bigger than 2):");
        int size = input.nextInt();
        int[] numberEachArray = new int[size];
        System.out.print(
            "Enter the digits of the large integer (from most significant to least significant):");
        for (int i = 0; i < size; i++) {
            numberEachArray[i] = input.nextInt();
        }
        System.out.println(Arrays.toString(numberEachArray));

        int[] output = addOne(numberEachArray);
        System.out.println(Arrays.toString(output));
        input.close();
    }

    /**
     *
     * This method add one to numberEachArray
     *
     * @param numberEachArray
     * @return numberEachArray
     */
    private static int[] addOne(int[] numberEachArray) {
        int addOne = 1;
        for (int i = numberEachArray.length - 1; i >= 0; i--) {
            int sum = numberEachArray[i] + addOne;
            if (sum == 10) {
                numberEachArray[i] = 0;
                addOne = 1;
            } else {
                numberEachArray[i] = sum;
                addOne = 0;
                break;
            }
        }

        if (addOne == 1) {
            int[] result = new int[numberEachArray.length + 1];
            result[0] = 1;
            for (int i = 0; i < numberEachArray.length; i++) {
                result[i + 1] = numberEachArray[i];
            }
            return result;
        } else {
            return numberEachArray;
        }
    }
}
