/**
 *
 */
package Project2;

import java.util.Scanner;

/**
 * This class demonstrate all the numbers that are palindromes in both base 10 and in binary.
 *
 *
 * @author huiziqian
 * @version Oct 26, 2023
 *
 */
public class PalindromesDoubleBase {

    private static Scanner input = new Scanner(System.in);

    /**
     * main method
     *
     * @param args ignore
     */
    public static void main(String[] args) {
        // if there is / are
        System.out.println("Double base palindromes...");
        System.out.println();
        System.out.print("lower limit:  ");
        int lower = input.nextInt();
        if (lower <= 0) {
            System.out.println();
            System.out.println("Invalid value");
            System.exit(0);
        }
        System.out.print("upper limit:  ");
        int upper = input.nextInt();
        if (lower > upper) {
            System.out.println();
            System.out.println("Upper limit must be greater than lower limit");
            System.exit(0);
        }
        listPalindromesInBothBases(lower, upper);
//        System.out.println(convertToBinary(10));
        input.close();

    }

    /**
     * This method
     *
     * @param lower
     * @param upper
     */
    private static void listPalindromesInBothBases(int lower, int upper) {
        // iterate through the range
        boolean titleCheck = false;
        for (int i = lower; i <= upper; i++) {
            if (isPalindromicNumber(i) && binaryIsPalindromicNum(i)) {
                if (!titleCheck) {
                    System.out.println("Palindromic numbers in base 10 and binary are");
                    System.out.println("Base 10" + "\t\t" + "Binary");
                    System.out.println("-------" + "\t\t" + "-------");
                    titleCheck = true;
                }

                int binaryNum = Integer.parseInt(convertToBinary(i));
                System.out.println(i + "\t\t" + binaryNum);

            }
        }
//            else
//            {
//            System.out.println();
//            System.out.println("There are no double base palindromes in this range");
//            }
    }

    /**
     * This method
     *
     * @param number
     * @return boolean
     */
    private static boolean isPalindromicNumber(int number) {
        // returns a boolean value
        // reverse the number and see if the number is the same
        int originalNumber = number;
        // get each digit
        int digit = 0;
        // put each digit into reversedNum
        int reversedNum = 0;
        // while input>0 reverse the number
        while (number > 0) {
            // get digit from the end
            digit = number % 10;
            number = number / 10;
            reversedNum = reversedNum * 10 + digit;

        }
        return reversedNum == originalNumber;
    }

    /**
     * This method
     *
     * @param decimalNumber
     * @return binary
     */

    private static String convertToBinary(int decimalNumber) {
        // returns a string (cannot use integer.toBinaryString)
        // create an empty string
        String binary = "";
        // while input number is a palindormic number
        while (decimalNumber > 0) {
            // get the string of the palindormic number in binary
            int remainder = decimalNumber % 2;
            binary = remainder + binary;
            decimalNumber = decimalNumber / 2;
        }
        return binary; // return the binary string
        // check if the binary is palindormic
    }

    /**
     * This method
     *
     * @param binaryNum
     * @return true
     */
    private static boolean binaryIsPalindromicNum(int binaryNum) {
        // check binary is palindormic
        int checkBianry = Integer.parseInt(convertToBinary(binaryNum));
        return isPalindromicNumber(checkBianry);
    }
}
