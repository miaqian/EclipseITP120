/**
 *
 */
package string_character_stringbuffer;

/**
 * This class validate the input IP address and reformat the IP address
 *
 * @author huiziqian
 * @version Nov 10, 2023
 *
 */
public class IPAddressValidator {

    /**
     * Main method
     *
     * @param args ignore
     */
    public static void main(String[] args) {
        //accept a string from the user

        //validateAddress method
        //pass the input sring to a method called validateAddress to validate the input
        //the method will return a boolean method

            //the input input method must contain 3 dots,it not return false if fails

            //the string should have a length of at least 7 and most 15(includes 3 dots. the 3 dots are mandatory)

            // a valid IP address must be in the form of A.B.C.D and they are numbers between 0-255
                // address cannot have leading 0s, unless they are only 0

        //if validateAddress method true
        //call defangAddress method
            //replace every period "." with "[.]"
            //retrun the defanged address back to main

        //if validateAddress method false
        //display "Incorrect length and format of IP address."


    }

}