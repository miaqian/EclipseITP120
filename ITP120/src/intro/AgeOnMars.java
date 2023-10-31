/**
 *
 */
package intro;

import java.util.Scanner;

/**
 * This class lets user input age convert into Mars time, also calculate the the difference
 * constraint is the input age has to be positive Martian Age is a double data type keep 10 decimal
 * and how to use it.
 *
 * @author huiziqian
 * @version Sep 14, 2023
 *
 */
public class AgeOnMars {

    /**
     * main method
     *
     * @param args
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Name: ");
        String name1 = input.nextLine();

        System.out.println("Age on Earth: ");
        int ageOnEarth1 = input.nextInt();

        input.nextLine();

        System.out.println("Name: ");
        String name2 = input.nextLine();

        System.out.println("Age on Earth: ");
        int ageOnEarth2 = input.nextInt();

        if (ageOnEarth1 < 0 || ageOnEarth2 < 0) {
            System.exit(0);
        } else {
            double ageOnMars1 = ageOnEarth1 * 365.25 / 1.027 / 668.599;
            double ageOnMars2 = ageOnEarth2 * 365.25 / 1.027 / 668.599;

            System.out.println(name1 + "'s age on Mars is " + ageOnMars1);
            System.out.println(name2 + "'s age on Mars is " + ageOnMars2);

            double dif = Math.abs(ageOnMars1 - ageOnMars2);

            System.out.println();

            System.out.println("Name" + "\t" + "Age on Earth" + "\t" + "Age on Mars");
            System.out
                .println(name1 + "\t" + ageOnEarth1 + "\t\t" + String.format("%.10f", ageOnMars1));
            System.out
                .println(name2 + "\t" + ageOnEarth2 + "\t\t" + String.format("%.10f", ageOnMars2));
            System.out.println("The difference in the ages between " + name1 + " and " + name2
                + " is " + String.format("%.10f", dif) + " Martian years");

        }

        input.close();

    }

}
