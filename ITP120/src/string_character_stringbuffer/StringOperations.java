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
public class StringOperations {

    /**
     * Place a description of your method here.
     *
     * @param args
     */
    public static void main(String[] args) {
        // recersing every word in a string, original order of the string intact

        String sentence = "The textbook is on the table";
        String[] wordList = sentence.split(" ");

        reverseWords(wordList);

        System.out.println(Arrays.toString(wordList));
    }
/**
 *
 * Place a description of your method here.
 *
 * @param array
 */
    private static void reverseWords(String[] array) {
        for (int i = 0; i < array.length; i++) {
            String rev = "";

            for (int j = array[i].length() - 1; j >= 0; j--) {
                rev += array[i].charAt(j);
            }
            array[i] = rev;
        }
    }
}
