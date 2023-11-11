/**
 *
 */
package string_character_stringbuffer;

import java.util.Arrays;

/**
 * Write a one-sentence summary of your class here. Follow it with additional details about its
 * purpose and how to use it.
 *
 * @author inClassCode
 * @version Nov 10, 2023
 *
 */
public class CharacterExamples {

    /**
     * main method
     *
     * @param args
     */
    public static void main(String[] args) {
        Character letter = 'A';
        // Character symbol = new Character('#');
        String letterStr = Character.toString(letter);

        String word = "JAVA";
        char[] letters = word.toCharArray();
        System.out.println(Arrays.toString(letters));

        if (Character.isAlphabetic(letter)) {
            System.out.println("Alphabet");
        } else if (Character.isDigit(letter)) {
            System.out.println("Digit");
        }
        String password = "z231$";
        int aCount = 0;
        int dCount = 0;
        int sCount = 0;

        for (int i = 0; i < password.length(); i++) {
            Character let = password.charAt(i);
            if (Character.isAlphabetic(let)) {
                aCount++;
            } else if (Character.isDigit(let)) {
                dCount++;
            } else if (let == '#') {
                sCount++;
            }
        }

        if (aCount > 0 && dCount > 0 && sCount > 0) {
            System.out.println("Valid password");
        }

    }

}
