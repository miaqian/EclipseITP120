/**
 *
 */
package intro;

import java.util.Scanner;

/**
 * this class determines the charges of late returned book use if else it construct
 *
 *
 * @author huiziqian
 * @version Sep 17, 2023
 *
 */
public class Library {

    /**
     * main method
     *
     * @param args
     */
    public static void main(String[] args) {
        // input the number of days delay in returning the book
        Scanner input = new Scanner(System.in);
        System.out.println("Days delay: ");
        int daysDelay = input.nextInt();
        if (daysDelay <= 5 && daysDelay > 0) {
            System.out.println("You will be charged a fine for 50 cents.");
        } else if (daysDelay >= 6 && daysDelay <= 10) {
            System.out.println("You will be charged a fine for $1.");
        } else if (daysDelay > 10 && daysDelay <= 30) {
            System.out.println("You will be charged a fine for $5.");
        } else if (daysDelay < 1) {
            System.out.println("Your input is wrong.");
        } else {
            System.out.println("Hi, your membership is cancelled.");
        }

        input.close();

        // display the fine or the appropriate message
        // first 5 days $0.5
        // 6-10 days $1
        // 10+ $5
        // but 30+ membership cancelled
    }

}
