package string_character_stringbuffer;

import java.util.Scanner;

/**
 * This program is to check if the input sentence is a circular sentence .the last character of a
 * word is equal to the first character of the next word .the last character of the last word is
 * equal to the first character of the first word
 *
 * @author huiziqian
 * @version Nov 10, 2023
 *
 */
public class CircularString {

    /**
     * Main method
     *
     * @param args ignore
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean continueInput = true;
        while (continueInput) {
            // get an input string/sentence
            System.out.println("Input a sentence of words separated by a space: ");
            String inputSentence = input.nextLine();

            if (inputSentence.equals("0")) {
                continueInput = false;
            } else {
                if (isCircular(inputString(inputSentence))) {
                    System.out.println("The sentence is circular.");
                } else {
                    System.out.println("The sentence is not circular.");
                }
            }
        }
        input.close();
    }

    /**
     *
     * Accepts a string input from the user and converts it to an array of words
     *
     * @param sentence input
     * @return sentence is an array
     */
    public static String[] inputString(String sentence) {
        return sentence.split(" ");
    }

    /**
     *
     * uses the String array as a parameter and returns a boolean value, this method will determine
     * if the array is a circular
     *
     * @param array returned array from inputStrin method
     * @return true
     *
     */
    public static boolean isCircular(String[] array) {
        // input is an string array , iterate over each element of the array
        if (array.length == 0) {
            return false;
        }
        // iterate each digit in each element
        for (int idx = 0; idx < array.length; idx++) {
            // find the index[0] equal to index[length-1]
            char firstChar = array[idx].charAt(0);
            char lastChar = array[idx].charAt(array[idx].length() - 1);

            if (lastChar != array[(idx + 1) % array.length].charAt(0)) {
                return false;
            }
        }
        return true;
    }

}
