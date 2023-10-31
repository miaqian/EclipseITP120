/**
 *
 */
package intro;

import java.util.Scanner;

/**
 * nothing
 * Follow it with additional details about its purpose
 * and how to use it.
 *
 * @author huiziqian
 * @version Oct 2, 2023
 *
 */
public class DescussionLoop {

    /**
     * main method
     *
     * @param args
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int itemCount = 0;

        while (true) {
            System.out.println("Enter the item name (type 'exit' to stop):");
            String item = input.next();

            if (item.equalsIgnoreCase("exit")) {
                break;  // Exit the loop if the user enters 'exit'
            }

            itemCount++;
            System.out.println("Added " + item + " to the cart. Total items: " + itemCount);
        }

        System.out.println("You have " + itemCount + " items in your cart.");

        int x = 25;
        int y = 8;
        x += y++;
        System.out.println(x);
        System.out.println(y);

        System.out.println("Enter choice");
        int choice = input.nextInt();
        do {
            System.out.println("Simple Calculator");
            System.out.println("1. Add");
            System.out.println("2. Subtract");
            System.out.println("3. Multiply");
            System.out.println("4. Divide");
        } while (choice < 0 && choice > 5);
        input.close();

    }

}
