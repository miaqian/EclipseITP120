/**
 *
 */
package intro;

/**
 * this class demonstrates the use of Java Escape Sequences quote "Escape sequences allow the
 * programmer to print characters that otherwise would be unprintable" \n.\t, \b, \r, \\, \', \"
 *
 * @author huiziqian
 * @version Sep 4, 2023
 *
 */
public class CharacterPattern {

    /**
     * main method
     *
     * @param args
     */
    public static void main(String[] args) {
        char letterOne = 'M';
        char letterTwo = 'm';
        byte n = 'a';
        // \n next line
        System.out.print(letterOne + "\n");
        System.out.print(letterTwo + "\n");
        // quote"internally, char are stored as numbers Unicode"
        System.out.print((char) (letterOne + 1) + "\t" + (char) (letterTwo + 1)
            + "\n"); // \t as tab
        System.out.print((char) (letterOne + 4) + "\t\t" + (char) (letterTwo + 4));
    }

}
