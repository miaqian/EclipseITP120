/**
 *
 */
package intro;

import java.util.Scanner;

/**
 * this class determines the input of electricity units consumed and calculate total electricity
 * bill using if else statement
 *
 *
 * @author huiziqian
 * @version Sep 17, 2023
 *
 */
public class Electricitybill {

    /**
     * main method
     *
     * @param args
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("How much unit of electricity consumed?");
        int consumedEle = input.nextInt();

        double totalBill = calculateElectricityBill(consumedEle);

        System.out.println("Total electricity bill: $" + totalBill);

        input.close();
    }

    /**
     * it's a method calculate the total bill input is the units
     *
     * @param units
     * @return total bill
     */
    public static double calculateElectricityBill(int units) {
        double totalBill = 0.0;

        if (units <= 50) {
            totalBill = units * 0.5;
        } else if (units <= 200) {
            totalBill = 50 * 0.5 + (units - 50) * 0.75;
        } else if (units <= 450) {
            totalBill = 50 * 0.5 + 150 * 0.75 + (units - 200) * 1.20;
        } else {
            totalBill = 50 * 0.5 + 150 * 0.75 + 250 * 1.2 + (units - 450) * 1.5;
        }
        return totalBill;
    }

}
