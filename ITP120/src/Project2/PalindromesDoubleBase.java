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
 * @version October 26, 2023
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
        input.close();

    }

    /**
     * This method print out the requested format of the result
     *
     * @param lower
     * @param upper
     */
    private static void listPalindromesInBothBases(int lower, int upper) {
        boolean titleCheck = false;
        for (int i = lower; i <= upper; i++) {
            if (isPalindromicNumber(i) && binaryIsPalindromicNum(i)) {
                if (!titleCheck) {
                    System.out.println("Palindromic numbers in base 10 and binary are");
                    System.out.println();
                    System.out.println("Base 10" + "\t\t" + "Binary");
                    System.out.println("-------" + "\t\t" + "-------");
                    titleCheck = true;
                }
                int binaryNum = Integer.parseInt(convertToBinary(i));
                System.out.println(i + "\t\t" + binaryNum);

            }
        }

    }

    /**
     * This method checks if a number is a Palindromic Number or not
     *
     * @param number
     * @return boolean
     */
    private static boolean isPalindromicNumber(int number) {
        int originalNumber = number;
        int digit = 0;
        int reversedNum = 0;
        while (number > 0) {
            digit = number % 10;
            number = number / 10;
            reversedNum = reversedNum * 10 + digit;
        }
        return reversedNum == originalNumber;
    }

    /**
     * This method covert a decimal number to binary number
     *
     * @param decimalNumber
     * @return binary
     */
    private static String convertToBinary(int decimalNumber) {
        String binary = "";
        while (decimalNumber > 0) {
            int remainder = decimalNumber % 2;
            binary = remainder + binary;
            decimalNumber = decimalNumber / 2;
        }
        return binary;
    }

    /**
     * This method use convertToBinary to check if a binary number is a Palindromic Number
     *
     * @param binaryNum
     * @return true
     */
    private static boolean binaryIsPalindromicNum(int binaryNum) {
        int checkBianry = Integer.parseInt(convertToBinary(binaryNum));
        return isPalindromicNumber(checkBianry);
    }
}
