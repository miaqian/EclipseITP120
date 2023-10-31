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
        // get user's input
        System.out.println("Double base palindromes...");
        System.out.println();
        // get lower limit
        System.out.print("lower limit:  ");
        int lower = input.nextInt();
        // check the lower limit if lower<=0
        if (lower <= 0) {
            System.out.println();
            System.out.println("Invalid value");
            System.exit(0);
        }
        // get upper limit
        System.out.print("upper limit:  ");
        int upper = input.nextInt();
        // compare lower and upper clear edge case
        if (lower > upper) {
            System.out.println();
            System.out.println("Upper limit must be greater than lower limit");
            System.exit(0);
        }
        // run the main code
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
        // iterate through the range. This titleCheck variable is used to ensure that the title
        // (header) for the list of palindromic numbers is printed only once.
        boolean titleCheck = false;
        for (int i = lower; i <= upper; i++) {
            if (isPalindromicNumber(i) && binaryIsPalindromicNum(i)) {
                // If titleCheck is false (indicating that the header has not been printed), it
                // prints the title and sets titleCheck to true to ensure that the title is printed
                // only once. because inside of if condition, titleCheckis set to true.
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

    }

    /**
     * This method checks if a number is a Palindromic Number or not
     *
     * @param number
     * @return boolean
     */
    private static boolean isPalindromicNumber(int number) {
        // reverse the number and see if the number is the same
        // assign the number to originalNumber to save the number
        int originalNumber = number;
        // get each digit
        int digit = 0;
        // put each digit into reversedNum
        int reversedNum = 0;
        // while input>0 reverse the number
        while (number > 0) {
            // use modulo to get the last digit of a number
            digit = number % 10;
            // divide by 10 to remove last digit
            number = number / 10;
            // recreated a reversed number
            reversedNum = reversedNum * 10 + digit;

        }
        // returns a boolean value
        return reversedNum == originalNumber;
    }

    /**
     * This method covert a decimal number to binary number
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
            int remainder = decimalNumber % 2; // 10/2=5-0,5/2=2-1, 2/2=1=0,1/2=0-1
            binary = remainder + binary;
            decimalNumber = decimalNumber / 2;
        }
        return binary; // return the binary string
        // check if the binary is palindormic
    }

    /**
     * This method use convertToBinary to check if a binary number is a Palindromic Number
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
