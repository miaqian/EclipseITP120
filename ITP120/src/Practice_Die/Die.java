/**
 *
 */
package Practice_Die;

import java.util.Random;

/**
 * The Die class simulates a six-sided die.
 *
 * @author huiziqian
 * @version Nov 8, 2023
 *
 */
public class Die {
    private int sides; // number of sides
    private int value; // the die's value

    /**
     * The constructor performs an initial roll of the die.
     *
     * @param numSides The number of sides for this die
     */
    public Die(int numSides) {
        sides = numSides;
        roll();
    }

    /**
     *
     * The roll method simulates the rolling of the die
     *
     */
    public void roll() {
        //create a random object, and it is referenced by the rand variable.
        Random rand = new Random();
        value = rand.nextInt(sides) + 1;
        /*The nextInt(int n) is used to get a random number
         *  between 0(inclusive) and the number passed in
         *  this argument(n), exclusive.*/
    }

    /**
     *
     * getSides method
     * @return The number of sides for this die.
     */
    public int getSides() {
        return sides;
    }

    /**
     *
     * getValue method
     * @return The value of the die
     */
    public int getValue() {
        return value;
    }
}
