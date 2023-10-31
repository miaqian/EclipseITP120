/**
 *
 */
package intro;

import java.util.Scanner;

/**
 * This class checks if a given number is an exponential value of 3 using while loop
 *
 *
 * @author huiziqian
 * @version Sep 28, 2023
 *
 */
public class PowerOfThree {

    /**
     * main method
     *
     * @param args
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Input Number: ");
        int testNum = input.nextInt();
        int exponent = 0;
        int result = 1;
        if (testNum <= 0) {
            System.out.println("Invalid input");
        } else {
            while (result * 3 <= testNum) {
                exponent++;
                result = result * 3;
            }
            if (result == testNum) {
                System.out.println(testNum + " is euqal to 3 raised to "
                    + exponent);
                for (int i = 1; i <= result; i = i * 3) {
                    System.out.print(i + " ");
                }
            }
            if (result < testNum) {
                System.out.println(testNum + " is not an exponential value of 3");
            }
        }
        input.close();
    }
}
