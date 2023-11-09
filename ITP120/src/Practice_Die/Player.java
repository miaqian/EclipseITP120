/**
 *
 */
package Practice_Die;

import java.util.Random;

/**
 * Player class for the game Cho-Han
 *
 * @author huiziqian
 * @version Nov 8, 2023
 *
 */
public class Player {
    //declare fields name
    private String name;
    private String guess;
    private int points;

    /**
     *
     * Constructor
     *
     * @param playerName
     */
    public Player(String playerName) {
        name = playerName;
        guess = "";
        points = 0;
    }

    /**
     *
     * causes the player to guess
     *
     */
    public void makeGuess() {
        Random rand = new Random();
        int guessNumber = rand.nextInt(2);
        if (guessNumber == 0) {
            guess = "Cho (even)";
        } else {
            guess = "Han (odd)";
        }
    }

    /**
     *
     * adds a specified number of points to the player's current banlance.
     *
     * @param newPoints the points to add
     */
    public void addPoints(int newPoints) {
        points += newPoints;
    }

    /**
     *
     * returns the player's name
     * @return the value of the name field
     *
     */
    public String getName() {
        return name;
    }

    /**
     *
     * returns the player's guess
     *
     * @return the value of the guess field
     */
    public String getGuess() {
        return guess;
    }

    /**
     *
     * returns the player's points
     *
     * @return the value of the points field
     */
    public int getPoints() {
        return points;
    }
}
