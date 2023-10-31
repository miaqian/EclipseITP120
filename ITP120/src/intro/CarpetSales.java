/**
 *
 */
package intro;

import java.util.Scanner;

/**
 * this class name demonstrate the calculation of the cost for replacing carpet for a single room
 *
 *
 * @author huiziqian
 * @version Sep 29, 2023
 *
 */
public class CarpetSales {

    /**
     * main method
     *
     * @param args
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Order: 1");
        System.out.println("Carpet color: ");
        String carpetColor = input.next();

        System.out.println("Price per sq ft: ");
        float pricePerSqF = input.nextFloat();

        System.out.println("Room width: ");
        int roomWidth = input.nextInt();

        System.out.println("Room length: ");
        int roomLength = input.nextInt();

        int roomSize = roomWidth * roomLength;
        float carpetPrice = (float) ((roomSize * pricePerSqF) * 1.20);
        float carpetLabor = (float) (0.75 * roomSize);
        float carpetTax = (float) 0.07 * (carpetPrice + carpetLabor);
        float carpetCost = carpetPrice + carpetLabor + carpetTax;

        System.out.println("Order #1");
        System.out.print("Room: ");
        System.out.printf("%,d sq ft\n", roomSize);

        System.out.print("Carpet: ");
        System.out.printf("$%.2f\n", carpetPrice);

        System.out.print("Labor: ");
        System.out.printf("$%.2f\n", carpetLabor);

        System.out.print("Tax: ");
        System.out.printf("$%.2f\n", carpetTax);

        System.out.print("Cost: ");
        System.out.printf("$%.2f\n", carpetCost);

        System.out.println();

        System.out.println("Order: 2");
        System.out.println("Carpet color: ");
        String carpetColor2 = input.next();

        System.out.println("Price per sq ft: ");
        float pricePerSqF2 = input.nextFloat();

        System.out.println("Room width: ");
        int roomWidth2 = input.nextInt();

        System.out.println("Room length: ");
        int roomLength2 = input.nextInt();

        int roomSize2 = roomWidth2 * roomLength2;
        float carpetPrice2 = (float) ((roomSize2 * pricePerSqF2) * 1.20);
        float carpetLabor2 = (float) (0.75 * roomSize2);
        float carpetTax2 = (float) 0.07 * (carpetPrice2 + carpetLabor2);
        float carpetCost2 = carpetPrice2 + carpetLabor2 + carpetTax2;

        System.out.println("Order #2");
        System.out.print("Room: ");
        System.out.printf("%,d sq ft\n", roomSize2);

        System.out.print("Carpet: ");
        System.out.printf("$%.2f\n", carpetPrice2);

        System.out.print("Labor: ");
        System.out.printf("$%.2f\n", carpetLabor2);

        System.out.print("Tax: ");
        System.out.printf("$%.2f\n", carpetTax2);

        System.out.print("Cost: ");
        System.out.printf("$%.2f\n", carpetCost2);

        input.close();
    }

}
