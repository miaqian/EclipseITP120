/**
 *
 */
package Practice_Die;

/**
 * Dealer class for game of Cho-Han
 *
 * @author huiziqian
 * @version Nov 8, 2023
 *
 */
public class Dealer {
    private int die1Value;
    private int die2Value;

    /**
     *
     * Construct a new Dealer object.
     *
     */
    public Dealer() {
        die2Value = 0;
        die2Value = 0;
    }

    /**
     *
     * The rollDice method rolls the dice and saves their values.
     *
     */
    public void rollDice() {
        final int SIDES = 6;

        Die die1 = new Die(SIDES);
        Die die2 = new Die(SIDES);

        die1Value = die1.getValue();
        die2Value = die2.getValue();
    }

    /**
     *
     * getChoOrHan method returns the result of the dice roll. Cho or Han.
     *
     * @return either 'cho(even)' or 'Han(odd)'
     */
    public String getChoOrHan() {
        String result;
        int sum = die1Value + die2Value;
        if (sum % 2 == 0) {
            result = "Cho (even)";
        } else {
            result = "Han (odd)";
        }
        return result;
    }

    /**
     *
     * returns the value of die1
     *
     * @return The die1Value field
     */
    public int getDie1Value() {
        return die1Value;
    }

    /**
     *
     * returns the value of die1
     *
     * @return The die1Value field
     */
    public int getDie2Value() {
        return die2Value;
    }
}
