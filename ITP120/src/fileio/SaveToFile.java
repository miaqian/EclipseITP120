/**
 *
 */
package fileio;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * Write a one-sentence summary of your class here. Follow it with additional details about its
 * purpose and how to use it.
 *
 * @author huiziqian
 * @version Nov 17, 2023
 *
 */
public class SaveToFile {

    /**
     * main method
     *
     * @param args ignore
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        try {
            File file = new File("src/fileio/Counties.txt");
            PrintWriter pw = new PrintWriter(file);

            while (true) {
                System.out.println("Enter the name of an animal: ");
                String animal = input.nextLine();
                pw.print(animal + ",");
                System.out.println("Continue: ");
                char response = input.next().charAt(0);
                if (Character.toUpperCase(response) == 'N') {
                    break;
                }
                input.nextLine();
            }
            pw.close();
        }
        catch (FileNotFoundException e) {
            System.out.println("File IO error");
        }

        input.close();
    }

}
