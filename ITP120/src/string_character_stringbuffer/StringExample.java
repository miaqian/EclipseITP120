/**
 *
 */
package string_character_stringbuffer;

import java.util.Arrays;
import java.util.Scanner;

/**
 * This class demonstrates some of the string class
 *
 * @author huiziqian
 * @version Nov 10, 2023
 *
 */
public class StringExample {

    /**
     * main method
     *
     * @param args
     */
    public static void main(String[] args) {
        int num = 10;

        String city = "Boise";
        String country = new String("USA");
        int[] array1 = new int[10];
        System.out.println(array1.length);

        // interable type
        // zero indexed

        // getting a single character in the string
        String word = "diFFerence";
        System.out.println(word.charAt(0));

        // System.out.println(word.charAt(20)); Error

        int len = word.length();
        System.out.println(len);
        System.out.println(word.charAt(len - 1));

        // traverse string from left to right
        for (int idx = 0; idx < word.length(); idx++) {
            System.out.print(word.charAt(idx) + " ");
        }
        System.out.println();
        // right to left
        for (int idx = word.length() - 1; idx >= 0; idx--) {
            System.out.print(word.charAt(idx) + " ");
        }
        System.out.println();

        // change case

        System.out.println(word.toUpperCase());

        word = "DIFFERENCE";
        System.out.println(word.toLowerCase());

        // Difference

        // Wrapper class around the char type: character
//        String newWord = "";
//        for (int idx = 0; idx < word.length(); idx++) {
//            if (idx == 0) {
//                Character letter = word.charAt(idx);
//                letter = Character.toUpperCase(letter);
//                newWord += letter;
//            } else {
//                //for all other characters one by one
//            }
//
//        }
        String newWord = "";
        newWord += Character.toUpperCase(word.charAt(0));

        //sub strings

        String slice = word.substring(1);
        System.out.println(slice);
        newWord += slice.toLowerCase();
        System.out.println(newWord);

//you cannot use string class methods on a char type of value


//using String arrays
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a sentence");
        String sentence = input.nextLine();

        //where are you going today
        String[] wordList = sentence.split(" ");

        System.out.println(Arrays.toString(wordList));

        System.out.println(wordList[0]);

        System.out.println(wordList.length);










    }
}
