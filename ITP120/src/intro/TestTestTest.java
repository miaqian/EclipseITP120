
/**
 *
 */
package intro;

import java.util.Scanner;

/**
 * nothing
 * Follow it with additional details about its purpose
 * and how to use it.
 *
 * @author huiziqian
 * @version Oct 2, 2023
 *
 */
public class TestTestTest {

    /**
     *
     * maing method
     *
     * @param args
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Total students number:");
        int totalStudent = input.nextInt();

        for (int i = totalStudent; i >= 1; i--) {
            System.out.println(i + " students are not in the class.");
            String studentName = input.next();
            System.out.println(studentName);
        }
        System.out.println("Great! everybody is here! let's start our class.");
    }
}
