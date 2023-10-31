/**
 *
 */
package intro;

import java.util.Scanner;

/**
 * this class calculate and shows the result of user's input about buying eggs there are
 * conventional eggs and organic eggs, calculate the taxes and print receipt
 *
 * @author huiziqian
 * @version Oct 3, 2023
 *
 */
public class EggPrices {

    /**
     * main method
     *
     * @param args
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while (true) {
            String cEgg = "Conventional Eggs";
            String oEgg = "Organic Eggs";
            double convenEgg = 4.340;
            double organicEgg = 6.50;

            System.out.println("Please enter the type of egg you want to purchase:\n"
                + "C for Conventional Eggs per Dozen: 4.340\n"
                + "O for Organic Eggs per Dozen: 6.50\n"
                + "Q to Quit the Program");
            char eggChoice = input.next().charAt(0);

            if (eggChoice == 'c' || eggChoice == 'C' || eggChoice == 'o' || eggChoice == 'O') {
                System.out.println("Enter the quantity of cartons of eggs to purchase:");
                int numOfCartons = input.nextInt();

                while (numOfCartons <= 0) {
                    System.out.println("Invalid entry. You must purchase at least 1 carton:");
                    numOfCartons = input.nextInt();
                }

                System.out.println("---------Receipt---------");

                if (eggChoice == 'c' || eggChoice == 'C') {
                    double totalBfTax = numOfCartons * convenEgg;
                    double vaTax = totalBfTax * 0.043;
                    double pwcTax = totalBfTax * 0.01;
                    double pwdSTax = totalBfTax * 0.007;
                    double totalAftTax = totalBfTax + vaTax + pwcTax + pwdSTax;
                    System.out.println("Eggs Purchased " + cEgg);
                    System.out.println("Price per Carton " + convenEgg);
                    System.out.println("Cartons Purchased " + numOfCartons);
                    System.out.printf("Total Before Taxes %.2f\n", totalBfTax);
                    System.out.printf("VA Sales Tax %.2f\n", vaTax);
                    System.out.printf("PWC Sales Tax %.2f\n", pwcTax);
                    System.out.printf("PWC Special Sales Tax %.2f\n", pwdSTax);
                    System.out.printf("Total After Taxes  %.2f\n", totalAftTax);
                    System.out.println();
                    System.out.println("----------------------");
                    System.out.println("Thanks for purchaseing eggs, do you want some more?");
                    System.out.println();
                    continue;
                } else if (eggChoice == 'o' || eggChoice == 'O') {
                    double totalBfTax = numOfCartons * organicEgg;
                    double vaTax = totalBfTax * 0.043;
                    double pwcTax = totalBfTax * 0.01;
                    double pwdSTax = totalBfTax * 0.007;
                    double totalAftTax = totalBfTax + vaTax + pwcTax + pwdSTax;
                    System.out.println("Eggs Purchased " + oEgg);
                    System.out.println("Price per Carton " + organicEgg);
                    System.out.println("Cartons Purchased " + numOfCartons);
                    System.out.printf("Total Before Taxes %.2f\n", totalBfTax);
                    System.out.printf("VA Sales Tax %.2f\n", vaTax);
                    System.out.printf("PWC Sales Tax %.2f\n", pwcTax);
                    System.out.printf("PWC Special Sales Tax %.2f\n", pwdSTax);
                    System.out.printf("Total After Taxes  %.2f\n", totalAftTax);
                    System.out.println();
                    System.out.println("----------------------");
                    System.out.println("Thanks for purchaseing eggs, do you want some more?");
                    System.out.println();
                    continue;
                }
                break;
            } else if (eggChoice == 'q' || eggChoice == 'Q') {
                System.out.println("Thanks for purchasing eggs, go scramble!");
                break;
            } else {
                System.out.println("Invalid Choice. Try again");
                System.out.println();
                continue;
            }
        }
        input.close();
    }
}
