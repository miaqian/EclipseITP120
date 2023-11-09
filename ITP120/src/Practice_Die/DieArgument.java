package Practice_Die;

/**
 * This program rolls a 6-sided die and a 20-sided die.
 *
 * @author huiziqian
 * @version Nov 8, 2023
 *
 */
public class DieArgument {

    /**
     * Main method
     *
     * @param args ignore
     */
    public static void main(String[] args) {
        final int SIX_SIDES = 6;
        final int TWENTY_SIDES = 20;

        // Create a 20-sided die
        Die twentyDie = new Die(TWENTY_SIDES);
        Die sixDie = new Die(SIX_SIDES);

        rollDie(twentyDie);
        rollDie(sixDie);
    }

    /**
     *
     * This method simulates a die roll, displaying the die's number of sides and value.
     *
     * @param d The Die object to roll
     *
     */
    public static void rollDie(Die d) {
        // Display the number of sides.

        System.out.println("Rolling a " + d.getSides() + " sided die.");
        d.roll();
        System.out.println("The die's value: " + d.getValue());

    }
}